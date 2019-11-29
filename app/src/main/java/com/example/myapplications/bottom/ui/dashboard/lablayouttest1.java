package com.example.myapplications.bottom.ui.dashboard;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.myapplications.R;
import com.example.myapplications.lablayout.fragment21;
import com.example.myapplications.lablayout.fragment22;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


public class lablayouttest1 extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    List<Fragment> fragments; //定义一个列表集合(应用泛型)
    static String[] table2={"推荐","关注"};  //定义一个数组存放标题内容
    static int tag=1;

    Button b21;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lablayouttest1);
        tabLayout=findViewById(R.id.tablayout1);
        viewPager=findViewById(R.id.viewpager1);
        fragments=new ArrayList<>();  //实例化集合
        fragments.add(new fragment21());
        fragments.add(new fragment22());
        b21=findViewById(R.id.button21);

        Adapter adapter=new Adapter(getSupportFragmentManager(),fragments); //参数1为fragment管理器
        viewPager.setAdapter(adapter); //给viewPager设置适配器
        tabLayout.setupWithViewPager(viewPager); //将tabLayout与viewPager建立匹配
    }

    //创建一个内部类作为适配器
    public static class Adapter extends FragmentPagerAdapter {
        private List<Fragment> list;
        public Adapter(FragmentManager fm, List<Fragment> list) {
            super(fm);
            this.list=list;
        }

        @Override
        public Fragment getItem(int position) {
            return list.get(position);
        }

        @Override
        public int getCount() {
            return list.size();
        }

        //重写getPageTitle()方法，获取页标题
        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return table2[position];
        }
    }
}