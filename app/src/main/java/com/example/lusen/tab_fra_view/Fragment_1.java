package com.example.lusen.tab_fra_view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by lusen on 2016/12/7.
 */

public class Fragment_1 extends Fragment {
    private String string;
    public Fragment_1(String string){
        super();
        this.string=string;
    }
    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_1,container,false);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView textView= (TextView) view.findViewById(R.id.fragment_tv);
        textView.setText(string);
    }
}
