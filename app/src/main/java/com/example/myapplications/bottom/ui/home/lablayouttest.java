package com.example.myapplications.bottom.ui.home;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.myapplications.R;
import com.example.myapplications.lablayout.fragment1;
import com.example.myapplications.lablayout.fragment2;
import com.example.myapplications.lablayout.fragment3;
import com.example.myapplications.lablayout.fragment4;
import com.example.myapplications.lablayout.fragment5;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


public class lablayouttest extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    List<Fragment> fragments; //定义一个列表集合(应用泛型)
    static String[] table={"推荐","Python","Java","数据库","前端开发"};  //定义一个数组存放标题内容

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lablayouttest);
        tabLayout=findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.viewpager);
        fragments=new ArrayList<>();  //实例化集合
        fragments.add(new fragment1());
        fragments.add(new fragment2());
        fragments.add(new fragment3());
        fragments.add(new fragment4());
        fragments.add(new fragment5());

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
            return table[position];
        }
    }
}