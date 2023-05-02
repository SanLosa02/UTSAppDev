package com.example.utssan;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        deklarasi var

        ImageButton btn1 = findViewById(R.id.imageButton1);
        ImageButton btn2 = findViewById(R.id.imageButton2);
        ImageButton btn3 = findViewById(R.id.imageButton3);
        ImageButton btn4 = findViewById(R.id.imageButton4);
        ImageButton btn5 = findViewById(R.id.imageButton5);
        ImageButton btn6 = findViewById(R.id.imageButton6);

//        Button 1
        btn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mp = MediaPlayer.create(MainActivity.this,R.raw.cat_sound1);
                mp.start();
                View rootView = findViewById(android.R.id.content);
                Snackbar snackbar = Snackbar.make(rootView, "Anda Menekan Button Meow 1", Snackbar.LENGTH_LONG);
                snackbar.show();

            }
        });
//        Button 2

        btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mp = MediaPlayer.create(MainActivity.this,R.raw.cat_sound2);
                mp.start();
                View rootView = findViewById(android.R.id.content);
                Snackbar snackbar = Snackbar.make(rootView, "Anda Menekan Button Meow 2", Snackbar.LENGTH_LONG);
                snackbar.show();

            }
        });

//        Button 3
        btn3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mp = MediaPlayer.create(MainActivity.this,R.raw.cat_sound3);
                mp.start();
                View rootView = findViewById(android.R.id.content);
                Snackbar snackbar = Snackbar.make(rootView, "Anda Menekan Button Meow 3", Snackbar.LENGTH_LONG);
                snackbar.show();

            }
        });
//        Button 4
        btn4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mp = MediaPlayer.create(MainActivity.this,R.raw.cat_sound4);
                mp.start();
                View rootView = findViewById(android.R.id.content);
                Snackbar snackbar = Snackbar.make(rootView, "Anda Menekan Button Meow 4", Snackbar.LENGTH_LONG);
                snackbar.show();

            }
        });
//        Button 5
        btn5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mp = MediaPlayer.create(MainActivity.this,R.raw.cat_sound5);
                mp.start();
                View rootView = findViewById(android.R.id.content);
                Snackbar snackbar = Snackbar.make(rootView, "Anda Menekan Button Meow 5", Snackbar.LENGTH_LONG);
                snackbar.show();

            }
        });
//        Button 6
        btn6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mp = MediaPlayer.create(MainActivity.this,R.raw.cat_sound6);
                mp.start();
                View rootView = findViewById(android.R.id.content);
                Snackbar snackbar = Snackbar.make(rootView, "Anda Menekan Button Meow 6", Snackbar.LENGTH_LONG);
                snackbar.show();

            }
        });

    }
}