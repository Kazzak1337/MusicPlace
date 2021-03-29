package com.example.aplicatiemare123;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //final MediaPlayer instrumentala2 = MediaPlayer.create(this, R.raw.instrumentala_2);
        final MediaPlayer snare1 = MediaPlayer.create(this, R.raw.snare1);
        final MediaPlayer snare2 = MediaPlayer.create(this, R.raw.snare2);
        final MediaPlayer snare3 = MediaPlayer.create(this, R.raw.snare3);
        final MediaPlayer snare4 = MediaPlayer.create(this, R.raw.snare4);
        final MediaPlayer snare5 = MediaPlayer.create(this, R.raw.snare5);
        final MediaPlayer bassdrum1 = MediaPlayer.create(this, R.raw.bassdrum1);
        final MediaPlayer bassdrum2 = MediaPlayer.create(this, R.raw.bassdrum2);
        final MediaPlayer bassdrum3 = MediaPlayer.create(this, R.raw.bassdrum3);
        final MediaPlayer bassdrum4 = MediaPlayer.create(this, R.raw.bassdrum4);
        final MediaPlayer bassdrum5 = MediaPlayer.create(this, R.raw.bassdrum5);
        final MediaPlayer clap1 = MediaPlayer.create(this, R.raw.clap1);
        final MediaPlayer clap2 = MediaPlayer.create(this, R.raw.clap2);
        final MediaPlayer clap3 = MediaPlayer.create(this, R.raw.clap3);
        final MediaPlayer clap4 = MediaPlayer.create(this, R.raw.clap4);
        final MediaPlayer clap5 = MediaPlayer.create(this, R.raw.clap5);


        Button button3 = (Button) this.findViewById(R.id.button3);
        Button button8 = (Button) this.findViewById(R.id.button8);
        Button button9 = (Button) this.findViewById(R.id.button9);
        Button button10 = (Button) this.findViewById(R.id.button10);
        Button button11 = (Button) this.findViewById(R.id.button11);
        Button button12 = (Button) this.findViewById(R.id.button12);
        Button button = (Button) this.findViewById(R.id.button);
        Button button5 = (Button) this.findViewById(R.id.button5);
        Button button7 = (Button) this.findViewById(R.id.button7);
        Button button14 = (Button) this.findViewById(R.id.button14);
        Button button15 = (Button) this.findViewById(R.id.button15);
        Button button13 = (Button) this.findViewById(R.id.button13);
        Button button16 = (Button) this.findViewById(R.id.button16);
        Button button17 = (Button) this.findViewById(R.id.button17);
        Button button18 = (Button) this.findViewById(R.id.button18);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snare1.start();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bassdrum1.start();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clap1.start();
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snare2.start();
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bassdrum2.start();
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clap2.start();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snare3.start();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bassdrum3.start();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clap3.start();
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snare4.start();
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bassdrum4.start();
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clap4.start();
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snare5.start();
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bassdrum5.start();
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clap5.start();
            }
        });

    }
}