package com.example.android.android_me.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

/**
 * Created by rahulkapoor on 21/05/17.
 */

public class LegsFragment extends Fragment {

    private ImageView ivLegs;
    private static int i = 1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_legs, container , false);

        init(view);

        ivLegs.setImageResource(AndroidImageAssets.getLegs().get(0));

        ivLegs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                if(i<12) {
                    //here the body images = 12;
                    ivLegs.setImageResource(AndroidImageAssets.getLegs().get(i));
                    i++;
                }
                else {
                    i = 0;
                }
            }
        });


        return view;
    }

    private void init(View view) {

        ivLegs = (ImageView) view.findViewById(R.id.iv_legs);

    }

}
