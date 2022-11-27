package com.example.playvideo;

import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.playvideo.enity.Video;

public class PlayActivity extends AppCompatActivity {
    private TextView viewVideoName;
    private VideoView videoView;
    private MediaController mediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        initView();
        initData();
    }

    private void initData() {
        String videoName = getIntent().getStringExtra("videoName");
        String videoSrc = getIntent().getStringExtra("videoSrc");
        viewVideoName.setText(videoName);
        videoView.setVideoPath(videoSrc);
        videoView.setMediaController(mediaController);
        mediaController.setMediaPlayer(videoView);
        videoView.start();
    }

    private void initView() {
        viewVideoName = findViewById(R.id.myVideoName);
        videoView = findViewById(R.id.myVideoView);
        mediaController = new MediaController(this);
    }
}