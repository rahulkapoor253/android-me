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

public class BodyFragment extends Fragment {

    private ImageView ivBody;
    private static int i = 1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_body, container, false);

        ivBody = (ImageView) rootview.findViewById(R.id.iv_body);

        ivBody.setImageResource(AndroidImageAssets.getBodies().get(0));

        ivBody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                if(i<12) {
                    //here the body images = 12;
                    ivBody.setImageResource(AndroidImageAssets.getBodies().get(i));
                    i++;
                }
                else {
                    i = 0;
                }
            }
        });

        return rootview;
    }
}
