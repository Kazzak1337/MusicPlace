package com.example.aplicatiemare123.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.aplicatiemare123.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment2 extends Fragment {

    Button button101;
    Button button102;
    Button button103;
    Button button104;
    Button button105;
    Button button106;
    Button button107;
    Button button108;
    Button button109;
    Button button110;
    Button button111;
    Button button112;
    Button button113;
    Button button114;
    Button button115;

    MediaPlayer bassline1;
    MediaPlayer bassline2;
    MediaPlayer bassline3;
    MediaPlayer bassline4;
    MediaPlayer bassline5;
    MediaPlayer voice1;
    MediaPlayer voice2;
    MediaPlayer voice3;
    MediaPlayer voice4;
    MediaPlayer voice5;
    MediaPlayer synth1;
    MediaPlayer synth2;
    MediaPlayer synth3;
    MediaPlayer synth4;
    MediaPlayer synth5;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment2() {
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
    public static Fragment2 newInstance(String param1, String param2) {
        Fragment2 fragment = new Fragment2();
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
        View view = inflater.inflate(R.layout.fragment_2, container, false);

        button101 = view.findViewById(R.id.button101);
        button102 = view.findViewById(R.id.button102);
        button103 = view.findViewById(R.id.button103);
        button104 = view.findViewById(R.id.button104);
        button105 = view.findViewById(R.id.button105);
        button106 = view.findViewById(R.id.button106);
        button107 = view.findViewById(R.id.button107);
        button108 = view.findViewById(R.id.button108);
        button109 = view.findViewById(R.id.button109);
        button110 = view.findViewById(R.id.button110);
        button111 = view.findViewById(R.id.button111);
        button112 = view.findViewById(R.id.button112);
        button113 = view.findViewById(R.id.button113);
        button114 = view.findViewById(R.id.button114);
        button115 = view.findViewById(R.id.button115);

        bassline1 = MediaPlayer.create(getActivity(), R.raw.bassline1);
        bassline2 = MediaPlayer.create(getActivity(), R.raw.bassline2);
        bassline3 = MediaPlayer.create(getActivity(), R.raw.bassline3);
        bassline4 = MediaPlayer.create(getActivity(), R.raw.bassline4);
        bassline5 = MediaPlayer.create(getActivity(), R.raw.bassline5);
        voice1 = MediaPlayer.create(getActivity(), R.raw.voice1);
        voice2 = MediaPlayer.create(getActivity(), R.raw.voice2);
        voice3 = MediaPlayer.create(getActivity(), R.raw.voice3);
        voice4 = MediaPlayer.create(getActivity(), R.raw.voice4);
        voice5 = MediaPlayer.create(getActivity(), R.raw.voice5);
        synth1 = MediaPlayer.create(getActivity(), R.raw.synth1);
        synth2 = MediaPlayer.create(getActivity(), R.raw.synth2);
        synth3 = MediaPlayer.create(getActivity(), R.raw.synth3);
        synth4 = MediaPlayer.create(getActivity(), R.raw.synth4);
        synth5 = MediaPlayer.create(getActivity(), R.raw.synth5);

        button101.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                bassline1.start();
            }
        });
        button102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               voice1.start();
            }
        });
        button103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                synth1.start();
            }
        });
        button104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bassline2.start();
            }
        });
        button105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voice2.start();
            }
        });
        button106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                synth2.start();
            }
        });
        button107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bassline3.start();
            }
        });
        button108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voice3.start();
            }
        });
        button109.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                synth3.start();
            }
        });
        button110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bassline4.start();
            }
        });
        button111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voice4.start();
            }
        });
        button112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                synth4.start();
            }
        });
        button113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bassline5.start();
            }
        });
        button114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voice5.start();
            }
        });
        button115.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                synth5.start();
            }
        });

        //String sTitle = getArguments().getString("title");


        return view;
    }
}