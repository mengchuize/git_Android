package com.example.myapplications.lablayout;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplications.R;
import com.example.myapplications.bottom.MainActivity;
import com.example.myapplications.classes.class2a1Activity;
import com.example.myapplications.classes.class2a2Activity;
import com.example.myapplications.classes.class2a3Activity;
import com.example.myapplications.classes.class2a4Activity;
import com.example.myapplications.courses.course;
import com.example.myapplications.courses.courseAdapter;
import com.example.myapplications.login.LoginActivity;

import java.util.ArrayList;
import java.util.List;


public class fragment2 extends Fragment {

    private List<course> courseList=new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.page2, container, false);

        // 初始化水果数据
        initcourse();

        RecyclerView recyclerView=view.findViewById(R.id.recyclerviewpy);
        recyclerView.removeAllViews();
        // 创建一个LinearLayoutManager对象，并把它设置到RecyclerView当中
        // LayoutManager用于指定RecyclerView的布局方式，这里是线性布局的意思
        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        // 创建FruitAdapter的实例，并将水果数据传入到FruitAdapter的构造函数中
        courseAdapter adapter=new courseAdapter(courseList);

        adapter.setOnItemClickListener(new courseAdapter.OnItemClickListener() {
            @Override
            public void onClick(int position) {
                switch(position){
                    case 0:
                        Intent intent=new Intent(getActivity(), class2a1Activity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1=new Intent(getActivity(), class2a2Activity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2=new Intent(getActivity(), class2a3Activity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3=new Intent(getActivity(), class2a4Activity.class);
                        startActivity(intent3);
                        break;
                }

            }
        });
        recyclerView.setAdapter(adapter);

        return view;
    }
    private void initcourse(){
        for(int i=courseList.size()-1;i>=0;i--){
            courseList.remove(i);
        }

        for(int i=0;i<1;i++){
            course a=new course("python语言程序设计","北京交通大学",R.drawable.p2,R.drawable.school,R.drawable.free);
            courseList.add(a);
            course b=new course("零基础学python","北京交通大学",R.drawable.p3,R.drawable.school,R.drawable.free);
            courseList.add(b);
            course c=new course("Python入门","北京交通大学",R.drawable.p4,R.drawable.school,R.drawable.free);
            courseList.add(c);
            course d=new course("Python高阶","北京交通大学",R.drawable.p5,R.drawable.school,R.drawable.free);
            courseList.add(d);
        }
    }
}