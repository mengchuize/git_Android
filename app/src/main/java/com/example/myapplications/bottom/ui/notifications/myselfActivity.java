package com.example.myapplications.bottom.ui.notifications;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.myapplications.R;

public class myselfActivity extends AppCompatActivity implements NorthernScrollView.NorthernScrollViewListener {

    NorthernScrollView northernScrollView;
    LinearLayout title;
    ImageView view1;

    static int height;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myself);

        //实力化控件
        initView();
        //计算控件高度
        getHetght();
    }

    public void getHetght() {

        ViewTreeObserver vto = view1.getViewTreeObserver();
        vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                height = view1.getHeight();
                northernScrollView.setScrollViewListener(myselfActivity.this);
            }
        });
    }

    public void initView() {
        northernScrollView = findViewById(R.id.northernScrollView);
        title = findViewById(R.id.title);
        view1 = findViewById(R.id.view1);
    }

    @Override
    public void onScrollChanged(NorthernScrollView scrollView, int x, int y, int oldx, int oldy) {
        if (y <= height) {
            title.setVisibility(View.GONE);
        } else {
            title.setVisibility(View.VISIBLE);
        }
    }
}
