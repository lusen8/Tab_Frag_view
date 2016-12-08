package com.example.lusen.tab_fra_view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lusen on 2016/12/7.
 */

public class MyAdapter_F_V extends FragmentStatePagerAdapter{
    Fragment mFragments;
    List<Fragment> list;
    ArrayList<String> titles;

    public MyAdapter_F_V(FragmentManager fm) {
        super(fm);
    }
    //设置标题
    public void setTitle(ArrayList<String> title){
        titles=title;
    }
    //传入fragment容器
    public void setFragments(List<Fragment> fragments){
        list = fragments;
    }
    @Override
    //获取到fragment
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    //获取数量
    public int getCount() {
        return list.size();
    }

    @Override
    //获取到标题
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}
