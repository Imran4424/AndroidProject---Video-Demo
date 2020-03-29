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

        decorView = getWindow().getDecorView();
        // Hide the status bar.
        uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        mainVideo = (VideoView) findViewById(R.id.videoView);
        mainVideo.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.epictrailer);

        mainMediaController = new MediaController(this);
        mainMediaController.setAnchorView(mainVideo);
        mainVideo.setMediaController(mainMediaController);

        mainVideo.start();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        decorView = getWindow().getDecorView();
        // Hide the status bar.
        uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }
}
