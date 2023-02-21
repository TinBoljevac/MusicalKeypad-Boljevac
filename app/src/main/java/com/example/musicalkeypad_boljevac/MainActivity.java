package com.example.musicalkeypad_boljevac;// ime aplikacije

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;//prenošenje jedne aktivnosti na drugu
import android.view.View;//omogućuje stvaranje grafičkog sučelja
import android.widget.Button;//omogućuje korištenje gumba

import android.media.MediaPlayer;// pohrana zvuka

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MediaPlayer Game = MediaPlayer.create(this, R.raw.game);// zvuk game
        MediaPlayer PAC = MediaPlayer.create(this, R.raw.pacman);// zvuk pacman
        MediaPlayer Shot = MediaPlayer.create(this, R.raw.shotgun);// zvuk shotgun
        MediaPlayer Truck = MediaPlayer.create(this, R.raw.truck);// zvuk truck
        MediaPlayer Thunder = MediaPlayer.create(this, R.raw.thunder1);// thunder1
        MediaPlayer Punch = MediaPlayer.create(this, R.raw.punch);// zvuk punch

        Button playGame = (Button) this.findViewById(R.id.playGame);// gumb playGame
        Button playPac =  (Button) this.findViewById(R.id.playPac);// gumb playPac
        Button playShot =  (Button) this.findViewById(R.id.playShot);// gumb playShot
        Button playTruck =  (Button) this.findViewById(R.id.playTruck);// gumb playTruck
        Button playThunder =  (Button) this.findViewById(R.id.playThunder);// gumb playThunder
        Button playPunch =  (Button) this.findViewById(R.id.playPunch );// gumb playPunch



        playGame.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Game.start(); //pokretanje zvuka

            }


        });


        playPac.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                PAC.start();//pokretanje zvuka

            }


        });
        playShot.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Shot.start();//pokretanje zvuka

            }


        });
        playTruck.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Truck.start();//pokretanje zvuka

            }


        });
        playThunder.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Thunder.start();//pokretanje zvuka

            }


        });
        playPunch.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Punch.start();//pokretanje zvuka

            }


        });


    }}