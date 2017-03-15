package com.example.shobhunshah.funfacts;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static android.R.attr.onClick;

public class Main2Activity extends AppCompatActivity
{
    private Button btn ;
    private TextView textView ;
    private RelativeLayout relativeLayout;
    private ImageView imageView ;
    private String fact ="";
    private String color ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toast.makeText(this, "Welcome User !!!!", Toast.LENGTH_SHORT).show();

        btn = (Button) findViewById(R.id.btnNextFact);
        textView = (TextView) findViewById(R.id.textviewfact);
        relativeLayout = (RelativeLayout) findViewById(R.id.activity_main2);
        imageView = (ImageView) findViewById(R.id.shareimg);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String facts[] = {
                        "Kumbh Mela gathering visible from space",
                        "Mawsynram, a village on the Khasi Hills, Meghalaya, receives the highest recorded average rainfall in the world",
                        "Bandra Worli Sealink has steel wires equal to the earth's circumference",
                        "At an altitude of 2,444 meters, the Chail Cricket Ground in Chail, Himachal Pradesh, is the highest in the world.",
                        "Shampooing is an Indian concept",
                        "The Indian national Kabaddi team has won all World Cups",
                        "Water on the moon was discovered by India",
                        "Science day in Switzerland is dedicated to Ex-Indian President, APJ Abdul Kalam\n",
                        "India's first President only took 50% of his salary",
                        "The first rocket in India was transported on a cycle",
                        "India is the world's second-largest English speaking country",
                        "Largest number of vegetarians in the world",
                        "The world's largest producer of milk",
                        "The first country to consume sugar",
                        "Rabindranath Tagore also wrote the national anthem for Bangladesh",
                        "Dhyan Chand was offered German citizenship",
                        "Diamonds were first mined in India",
                        "Snakes and Ladders originated in India",
                        "India has the world’s third largest active army, after China and USA.",
                        "India has a floating post office which is situated in kashmir",
                        "Number of births in India every year is more than the total population of Australia, and many other nations",
                        "Lonar Lake, a saltwater lake in Maharashtra, was created by a meteor hitting the Earth",
                } ;

                String colors[] = {
                        "#E52B50",
                        "#9F2B68",
                        "#F19CBB",
                        "#3B7A57",
                        "#00C4B0",
                        "#FFBF00",
                        "#FFBF00",
                        "#FF033E",
                        "#9966CC",
                        "#A4C639",
                        "#CD9575",
                        "#841B2D",
                        "#008000",
                        "#8DB600",
                        "#FBCEB1",
                        "#00FFFF",
                        "#3B444B",
                        "#FDEE00",
                        "#007FFF",
                        "#E0218A",
                        "#0000FF",
                        "#FF0800"
                };

                Random randomGenerator =new Random();
                int random = randomGenerator.nextInt(facts.length);
                int random1 = randomGenerator.nextInt(colors.length);

                fact = facts[random];
                color = colors[random1];

                textView.setText(fact);
                int colorAsInt = Color.parseColor(color);
                relativeLayout.setBackgroundColor(colorAsInt);

            }
        };
        btn.setOnClickListener(onClickListener);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT,fact);
                intent.setType("text/plain");
                startActivity(intent);
            }
        });

    }
}
