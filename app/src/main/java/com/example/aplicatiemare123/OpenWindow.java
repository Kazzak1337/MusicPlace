package com.example.aplicatiemare123;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class OpenWindow extends AppCompatActivity {

    ImageView iv_logo;
    TextView text_view1;
    CharSequence charSequence;
    int index;
    long delay = 200;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_window);


        iv_logo = findViewById(R.id.iv_logo);
        text_view1 = findViewById(R.id.text_view1);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ObjectAnimator objectAnimator = ObjectAnimator.ofPropertyValuesHolder(iv_logo, PropertyValuesHolder.ofFloat("scaleX", 1.2f), PropertyValuesHolder.ofFloat("scaleY", 1.2f));

        objectAnimator.setDuration(500);

        objectAnimator.setRepeatCount(ValueAnimator.INFINITE);
        objectAnimator.setRepeatMode(ValueAnimator.REVERSE);
        objectAnimator.start();

        animatText("Music Place");

        new Handler().postDelayed(new Runnable() {
            @Override
                    public void run(){
                startActivity(new Intent(OpenWindow.this, MainActivity3.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
                finish();
            }
        }, 4000);
    }

    Runnable runnable = new Runnable(){
        @Override
        public void run(){
            text_view1.setText(charSequence.subSequence(0,index++));

            if(index<=charSequence.length()){
                handler.postDelayed(runnable, delay);
            }
        }
    };

    public void animatText(CharSequence cs){
        charSequence = cs;
        index = 0;
        text_view1.setText("");
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, delay);
    }
}