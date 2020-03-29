package com.luminousinc.videodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView mainVideo;
    MediaController mainMediaController;
    View decorView;
    int uiOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mainVideo = (VideoView) findViewById(R.id.videoView);
        mainVideo.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.epictrailer);

        mainMediaController = new MediaController(this);
        mainMediaController.setAnchorView(mainVideo);
        mainVideo.setMediaController(mainMediaController);

        mainVideo.start();
    }
}
