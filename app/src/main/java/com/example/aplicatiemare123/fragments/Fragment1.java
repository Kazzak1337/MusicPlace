package com.example.aplicatiemare123.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.aplicatiemare123.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment1 extends Fragment {


    Button button3;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button;
    Button button5;
    Button button7;
    Button button14;
    Button button15;
    Button button13;
    Button button16;
    Button button17;
    Button button18;

    MediaPlayer snare1;
    MediaPlayer snare2;
    MediaPlayer snare3;
    MediaPlayer snare4;
    MediaPlayer snare5;
    MediaPlayer bassdrum1;
    MediaPlayer bassdrum2;
    MediaPlayer bassdrum3;
    MediaPlayer bassdrum4;
    MediaPlayer bassdrum5;
    MediaPlayer clap1;
    MediaPlayer clap2;
    MediaPlayer clap3;
    MediaPlayer clap4;
    MediaPlayer clap5;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment1.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment1 newInstance(String param1, String param2) {
        Fragment1 fragment = new Fragment1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        button3 = view.findViewById(R.id.button3);
        button8 = view.findViewById(R.id.button8);
        button9 = view.findViewById(R.id.button9);
        button10 = view.findViewById(R.id.button10);
        button11 = view.findViewById(R.id.button11);
        button12 = view.findViewById(R.id.button12);
        button = view.findViewById(R.id.button);
        button5 = view.findViewById(R.id.button5);
        button7 = view.findViewById(R.id.button7);
        button14 = view.findViewById(R.id.button14);
        button15 = view.findViewById(R.id.button15);
        button13 = view.findViewById(R.id.button13);
        button16 = view.findViewById(R.id.button16);
        button17 = view.findViewById(R.id.button17);
        button18 = view.findViewById(R.id.button18);

        snare1 = MediaPlayer.create(getActivity(), R.raw.snare1);
        snare2 = MediaPlayer.create(getActivity(), R.raw.snare2);
        snare3 = MediaPlayer.create(getActivity(), R.raw.snare3);
        snare4 = MediaPlayer.create(getActivity(), R.raw.snare4);
        snare5 = MediaPlayer.create(getActivity(), R.raw.snare5);
        bassdrum1 = MediaPlayer.create(getActivity(), R.raw.bassdrum1);
        bassdrum2 = MediaPlayer.create(getActivity(), R.raw.bassdrum2);
        bassdrum3 = MediaPlayer.create(getActivity(), R.raw.bassdrum3);
        bassdrum4 = MediaPlayer.create(getActivity(), R.raw.bassdrum4);
        bassdrum5 = MediaPlayer.create(getActivity(), R.raw.bassdrum5);
        clap1 = MediaPlayer.create(getActivity(), R.raw.clap1);
        clap2 = MediaPlayer.create(getActivity(), R.raw.clap2);
        clap3 = MediaPlayer.create(getActivity(), R.raw.clap3);
        clap4 = MediaPlayer.create(getActivity(), R.raw.clap4);
        clap5 = MediaPlayer.create(getActivity(), R.raw.clap5);

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
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

        return view;
    }

}