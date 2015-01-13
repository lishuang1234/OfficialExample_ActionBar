package com.ls.actionbartabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ls on 2015/1/3 0003.
 */
public class PlaceholderFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main,container,false);//load xml file to show fragment content
    }
    public static PlaceholderFragment newInstance(){
        return new PlaceholderFragment();
    }
}
