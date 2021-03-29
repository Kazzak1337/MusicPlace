package com.example.aplicatiemare123;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.aplicatiemare123.fragments.Fragment1;
import com.example.aplicatiemare123.fragments.Fragment2;
import com.example.aplicatiemare123.fragments.Fragment3;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MainActivity2 extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    Button startrecording, stoprecording, playrecording, gotoprofile;
    String pathSave="";
    MediaRecorder mediaRecorder;
    MediaPlayer mediaPlayer;
    ImageButton pozaprofil;

    public final static String USERNAME_KEY = "username";

    final int REQUEST_PERMISSION_CODE = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if(!checkPermissionFromDevice()) {
            requestPermission();
        }

        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.viewPager);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Dubstep 1");
        arrayList.add("Dubstep 2");
        arrayList.add("Dubstep 3");

        prepareViewPager(viewPager, arrayList);

        tabLayout.setupWithViewPager(viewPager);

        startrecording = (Button)findViewById(R.id.startrecording);
        stoprecording = (Button)findViewById(R.id.stoprecording);
        playrecording = (Button)findViewById(R.id.playrecording);
        gotoprofile = (Button)findViewById(R.id.gotoprofile);

        gotoprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateAlertDialog();
            }
        });

        startrecording.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkPermissionFromDevice()) {
                    pathSave = Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + UUID.randomUUID().toString() + "_audio_record.3gp";
                    setupMediaRecorder();
                    try {
                        mediaRecorder.prepare();
                        mediaRecorder.start();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    stoprecording.setEnabled(true);
                    playrecording.setEnabled(false);
                    startrecording.setEnabled(false);

                    Toast.makeText(MainActivity2.this, "Recording...", Toast.LENGTH_SHORT).show();
                } else {
                    requestPermission();
                }
            }
            });

        stoprecording.setOnClickListener(new View.OnClickListener(){
               @Override
               public void onClick(View v) {
                   startrecording.setEnabled(true);
                   stoprecording.setEnabled(false);
                   playrecording.setEnabled(true);

                    if(mediaPlayer != null){
                        mediaPlayer.stop();
                        mediaPlayer.release();
                        setupMediaRecorder();
                    }
                }
            });
        playrecording.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    stoprecording.setEnabled(false);
                    startrecording.setEnabled(true);

                    mediaPlayer = new MediaPlayer();
                    try{
                        mediaPlayer.setDataSource(pathSave);
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                    } catch(IOException e){
                        e.printStackTrace();
                    }

                    mediaPlayer.start();
                    Toast.makeText(MainActivity2.this, "Playing...", Toast.LENGTH_SHORT).show();
                }
            });
    }

    public void CreateAlertDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Your profile!")
                .setMessage("Welcome "+getIntent().getStringExtra(USERNAME_KEY))
                .setPositiveButton("Nice", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i){

                    }
                });
        builder.create();
        builder.show();
    }

    private void setupMediaRecorder(){
        mediaRecorder = new MediaRecorder();
        mediaRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
        mediaRecorder.setAudioEncoder(MediaRecorder.OutputFormat.AMR_NB);
        mediaRecorder.setOutputFile(pathSave);
    }

    private boolean checkPermissionFromDevice(){
        int write_external_storage_result = ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        int record_audio_result = ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO);
        return write_external_storage_result == PackageManager.PERMISSION_GRANTED && record_audio_result == PackageManager.PERMISSION_GRANTED;
    }

    private void requestPermission(){
        ActivityCompat.requestPermissions(this, new String[]{
                Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.RECORD_AUDIO}, REQUEST_PERMISSION_CODE);
    }

    //@Override
    private void onRequestPermissionResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults){
        switch(requestCode){
            case REQUEST_PERMISSION_CODE:{
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(this, "Permission Granted", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    private void prepareViewPager(ViewPager viewPager, ArrayList<String> arrayList) {
        MainAdapter adapter = new MainAdapter(getSupportFragmentManager());

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