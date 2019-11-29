package com.example.myapplications.classes;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;


import com.example.myapplications.R;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

public class class2a1Activity extends AppCompatActivity {

    private JCVideoPlayerStandard jcVideoPlayerStandard;
    String s1="https://flv2.bn.netease.com/videolib1/1811/26/OqJAZ893T/HD/OqJAZ893T-mobile.mp4";
    ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class2a1);

        JCVideoPlayerStandard jcVideoPlayerStandard = findViewById(R.id.videocontroller1);

        jcVideoPlayerStandard.setUp(
                s1 , JCVideoPlayerStandard.SCREEN_LAYOUT_NORMAL,
                "111");




    }
    @Override
    public void onBackPressed() {
        if (JCVideoPlayer.backPress()) {
            return;
        }
        super.onBackPressed();
    }
    @Override
    protected void onPause() {
        super.onPause();
        JCVideoPlayer.releaseAllVideos();
    }

}
