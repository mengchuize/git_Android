package com.example.myapplications.bottom.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.myapplications.R;
import com.example.myapplications.bottom.MainActivity;
import com.example.myapplications.login.LoginActivity;
import com.example.myapplications.myself.changeActivity;
import com.example.myapplications.myself.classActivity;
import com.example.myapplications.myself.messageActivity;

public class NotificationsFragment extends Fragment implements NorthernScrollView.NorthernScrollViewListener {
    View root;
    NorthernScrollView northernScrollView;
    LinearLayout title;
    ImageView view1;
    Button b1,b2,b3,b11,b12,b13;
    int height;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.activity_myself, container, false);
        //实力化控件
        initView();
        //计算控件高度
        getHetght();
        b1=root.findViewById(R.id.button5);
        b2=root.findViewById(R.id.button4);
        b3=root.findViewById(R.id.button3);
        b11=root.findViewById(R.id.button9);
        b12=root.findViewById(R.id.button8);
        b13=root.findViewById(R.id.button7);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),changeActivity.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), classActivity.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), messageActivity.class);
                startActivity(intent);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),changeActivity.class);
                startActivity(intent);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),classActivity.class);
                startActivity(intent);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),messageActivity.class);
                startActivity(intent);
            }
        });
        return root;
    }

    public void getHetght() {

        ViewTreeObserver vto = view1.getViewTreeObserver();
        vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                height = view1.getHeight();
                northernScrollView.setScrollViewListener(NotificationsFragment.this);
            }
        });
    }

    public void initView() {
        northernScrollView = root.findViewById(R.id.northernScrollView);
        title = root.findViewById(R.id.title);
        view1 = root.findViewById(R.id.view1);
        title.bringToFront();
    }
    @Override
    public void onScrollChanged(NorthernScrollView scrollView, int x, int y, int oldx, int oldy) {

        if (y <= height) {
            title.setVisibility(View.INVISIBLE);
        } else {
            title.setVisibility(View.VISIBLE);
        }
    }
}