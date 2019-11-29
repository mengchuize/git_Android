package com.example.myapplications.bottom.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.myapplications.R;

import com.example.myapplications.lablayout.fragment21;
import com.example.myapplications.lablayout.fragment22;

import com.example.myapplications.myself.changeActivity;
import com.example.myapplications.myself.classActivity;
import com.example.myapplications.playactivity.createActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class DashboardFragment extends Fragment {

    TabLayout tabLayout;
    ViewPager viewPager;
    List<Fragment> fragments; //定义一个列表集合(应用泛型)
    String[] table2={"推荐","关注"};  //定义一个数组存放标题内容

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.lablayouttest1, container, false);
        tabLayout=view.findViewById(R.id.tablayout1);
        viewPager=view.findViewById(R.id.viewpager1);
        fragments=new ArrayList<>();  //实例化集合
        fragments.add(new fragment21());
        fragments.add(new fragment22());
        FloatingActionButton b1;
        b1=view.findViewById(R.id.floatingActionButton);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), createActivity.class);
                startActivity(intent);
            }
        });

        lablayouttest1.Adapter adapter=new lablayouttest1.Adapter(getChildFragmentManager(),fragments); //参数1为fragment管理器
        viewPager.setAdapter(adapter); //给viewPager设置适配器
        tabLayout.setupWithViewPager(viewPager); //将tabLayout与viewPager建立匹配
        return view;
    }
}