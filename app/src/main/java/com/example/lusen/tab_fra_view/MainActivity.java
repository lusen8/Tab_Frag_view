package com.example.lusen.tab_fra_view;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Fragment> list;
    ArrayList<String> titles = new ArrayList<String>();
    ViewPager mViewpager;
    TabLayout mTabLayout;
    MyAdapter_F_V myadapt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //设置标题数据
        titles.add("first_tab");
        titles.add("second_tab");
        titles.add("third_tab");
        titles.add("fourth_tab");
        titles.add("fifth_tab");
        titles.add("six_tab");
        titles.add("seven_tab");
        titles.add("eight_tab");
        titles.add("nineth_tab");
        titles.add("tenth_tab");
        titles.add("eleven_tab");

        //实例化viewpager和tablayout
        mViewpager = (ViewPager) findViewById(R.id.second_viewpager);
        mTabLayout=  (TabLayout)findViewById(R.id.tab_layout);
        //获取到fragmentmanger
        myadapt = new MyAdapter_F_V(getSupportFragmentManager());
        //传入标题
        myadapt.setTitle(titles);

        list = new ArrayList<>();
        //设置fragment
        for(int i=0;i<titles.size();i++){
            list.add(new Fragment_1(titles.get(i)));
        }
        //设置要显示的fragment
        myadapt.setFragments(list);
        //设置TabLayout的模式    fix：固定tab的位置    scrollable：卷动tab
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        //将FragmentPager的适配器传给viewpager，即设置viewpager的适配器
        mViewpager.setAdapter(myadapt);
        //绑定viewpager和TabLayout
        mTabLayout.setupWithViewPager(mViewpager);

    }
}
