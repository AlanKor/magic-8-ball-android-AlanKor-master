package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = findViewById(R.id.image_eightBall);

        final int [] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };


        Button myButton = findViewById(R.id.askButton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("magiceightball", "The button works greta!");

                //Creating a random Number Generator
                Random randomNumberGenerator = new Random();

                //Using the Number Generator
                int number = randomNumberGenerator.nextInt(5);

                //Using the random number to pull a specific resource from the ballArray
                int imageResourceId = ballArray[number];

                //Displaying the ImageResource in the imageView
                ballDisplay.setImageResource (imageResourceId);

                // I can use tis to save up the two code lines!
                // ballDisplay.setImageResource(ballArray[number]);
            }
        });




    }
}
