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
 * Use the {@link Fragment3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment3 extends Fragment {

    Button button1011;
    Button button1021;
    Button button1031;
    Button button1041;
    Button button1051;
    Button button1061;
    Button button1071;
    Button button1081;
    Button button1091;
    Button button1101;
    Button button1111;
    Button button1121;
    Button button1131;
    Button button1141;
    Button button1151;

    MediaPlayer fx1;
    MediaPlayer fx2;
    MediaPlayer fx3;
    MediaPlayer fx4;
    MediaPlayer fx5;
    MediaPlayer hat1;
    MediaPlayer hat2;
    MediaPlayer hat3;
    MediaPlayer hat4;
    MediaPlayer hat5;
    MediaPlayer perc1;
    MediaPlayer perc2;
    MediaPlayer perc3;
    MediaPlayer perc4;
    MediaPlayer perc5;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment3() {
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
    public static Fragment3 newInstance(String param1, String param2) {
        Fragment3 fragment = new Fragment3();
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
        View view = inflater.inflate(R.layout.fragment_3, container, false);

        button1011 = view.findViewById(R.id.button1011);
        button1021 = view.findViewById(R.id.button1021);
        button1031 = view.findViewById(R.id.button1031);
        button1041 = view.findViewById(R.id.button1041);
        button1051 = view.findViewById(R.id.button1051);
        button1061 = view.findViewById(R.id.button1061);
        button1071 = view.findViewById(R.id.button1071);
        button1081 = view.findViewById(R.id.button1081);
        button1091 = view.findViewById(R.id.button1091);
        button1101 = view.findViewById(R.id.button1101);
        button1111 = view.findViewById(R.id.button1111);
        button1121 = view.findViewById(R.id.button1121);
        button1131 = view.findViewById(R.id.button1131);
        button1141 = view.findViewById(R.id.button1141);
        button1151 = view.findViewById(R.id.button1151);

        fx1 = MediaPlayer.create(getActivity(), R.raw.fx1);
        fx2 = MediaPlayer.create(getActivity(), R.raw.fx2);
        fx3 = MediaPlayer.create(getActivity(), R.raw.fx3);
        fx4 = MediaPlayer.create(getActivity(), R.raw.fx4);
        fx5 = MediaPlayer.create(getActivity(), R.raw.fx5);
        hat1 = MediaPlayer.create(getActivity(), R.raw.hat1);
        hat2 = MediaPlayer.create(getActivity(), R.raw.hat2);
        hat3 = MediaPlayer.create(getActivity(), R.raw.hat3);
        hat4 = MediaPlayer.create(getActivity(), R.raw.hat4);
        hat5 = MediaPlayer.create(getActivity(), R.raw.hat5);
        perc1 = MediaPlayer.create(getActivity(), R.raw.perc1);
        perc2 = MediaPlayer.create(getActivity(), R.raw.perc2);
        perc3 = MediaPlayer.create(getActivity(), R.raw.perc3);
        perc4 = MediaPlayer.create(getActivity(), R.raw.perc4);
        perc5 = MediaPlayer.create(getActivity(), R.raw.perc5);

        //String sTitle = getArguments().getString("title");

        button1011.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                fx1.start();
            }
        });
        button1021.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hat1.start();
            }
        });
        button1031.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perc1.start();
            }
        });
        button1041.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fx2.start();
            }
        });
        button1051.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hat2.start();
            }
        });
        button1061.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perc2.start();
            }
        });
        button1071.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fx3.start();
            }
        });
        button1081.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hat3.start();
            }
        });
        button1091.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perc3.start();
            }
        });
        button1101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fx4.start();
            }
        });
        button1111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hat4.start();
            }
        });
        button1121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perc4.start();
            }
        });
        button1131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fx5.start();
            }
        });
        button1141.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hat5.start();
            }
        });
        button1151.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perc5.start();
            }
        });


        return view;
    }
}