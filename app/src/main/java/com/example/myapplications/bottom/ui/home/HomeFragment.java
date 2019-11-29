package com.example.myapplications.bottom.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.myapplications.R;
import com.example.myapplications.classes.class2a1Activity;
import com.example.myapplications.classes.class2a2Activity;
import com.example.myapplications.courses.course;
import com.example.myapplications.lablayout.fragment1;
import com.example.myapplications.lablayout.fragment2;
import com.example.myapplications.lablayout.fragment3;
import com.example.myapplications.lablayout.fragment4;
import com.example.myapplications.lablayout.fragment5;
import com.example.myapplications.myself.changeActivity;
import com.example.myapplications.myself.classActivity;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    TabLayout tabLayout;
    ViewPager viewPager;
    RecyclerView recyclerView;
    List<Fragment> fragments; //定义一个列表集合(应用泛型)
    String[] table={"推荐","Python","Java","数据库","前端开发"};  //定义一个数组存放标题内容

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.lablayouttest, container, false);
        tabLayout=view.findViewById(R.id.tablayout);
        viewPager=view.findViewById(R.id.viewpager);
        fragments=new ArrayList<>();  //实例化集合
        fragments.add(new fragment1());
        fragments.add(new fragment2());
        fragments.add(new fragment3());
        fragments.add(new fragment4());
        fragments.add(new fragment5());

        lablayouttest.Adapter adapter=new lablayouttest.Adapter(getChildFragmentManager(),fragments); //参数1为fragment管理器
        viewPager.setAdapter(adapter); //给viewPager设置适配器
        tabLayout.setupWithViewPager(viewPager); //将tabLayout与viewPager建立匹配

        return view;
    }


}