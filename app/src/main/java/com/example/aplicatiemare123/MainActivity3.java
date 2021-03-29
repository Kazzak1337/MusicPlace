package com.example.aplicatiemare123;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.aplicatiemare123.fragments.Fragment1;
import com.example.aplicatiemare123.fragments.Fragment2;
import com.example.aplicatiemare123.fragments.Fragment3;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    Button buttonSignup2, buttonProfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.viewPager);
        buttonProfil = findViewById(R.id.buttonProfile);
        buttonSignup2 = findViewById(R.id.buttonSignup2);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Dubstep 1");
        arrayList.add("Dubstep 2");
        arrayList.add("Dubstep 3");

        prepareViewPager(viewPager, arrayList);

        tabLayout.setupWithViewPager(viewPager);

        buttonProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity3.this, "You need to login first", Toast.LENGTH_SHORT).show();
            }
        });

        buttonSignup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), com.example.aplicatiemare123.SignupScreen.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        });

    }


    private void prepareViewPager(ViewPager viewPager, ArrayList<String> arrayList) {
        MainActivity3.MainAdapter adapter = new MainActivity3.MainAdapter(getSupportFragmentManager());

        Fragment1 fragment1 = new Fragment1();

        for(int i=0; i<arrayList.size(); i++){

            Bundle bundle = new Bundle();

            bundle.putString("title", arrayList.get(i));

            fragment1.setArguments(bundle);

            adapter.addFragment(fragment1, arrayList.get(i));

            fragment1 = new Fragment1();

        }

        viewPager.setAdapter(adapter);
    }

    private class MainAdapter extends FragmentPagerAdapter {

        ArrayList<String> arrayList = new ArrayList<>();
        List<Fragment> fragmentList = new ArrayList<>();

        public void addFragment(Fragment fragment, String title){
            arrayList.add(title);

            fragmentList.add(fragment);

        }

        public MainAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            //return fragmentList.get(position);
            Fragment frag = null;
            switch(position){
                case 0:
                    frag = new Fragment1();
                    break;
                case 1:
                    frag = new Fragment2();
                    break;
                case 2:
                    frag=new Fragment3();
                    break;
            }
            return frag;

        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return arrayList.get(position);
        }
    }
}