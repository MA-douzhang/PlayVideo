package com.example.playvideo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.example.playvideo.Adapter.VideoAdapter;
import com.example.playvideo.enity.Video;

import java.util.ArrayList;
import java.util.List;

public class VideoActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Video> list;
    VideoAdapter videoAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        initView();
        initData();
    }

    private void initData() {
        list = new ArrayList<Video>();
        Video chacha = new Video("chachca",
                "android.resource://"+getPackageName()+"/"+R.raw.chacha);
        list.add(chacha);
        Video latinrumba = new Video("latinrumba",
                "android.resource://"+getPackageName()+"/"+R.raw.latinrumba);
        list.add(latinrumba);
        Video luo = new Video("luo",
                "android.resource://"+getPackageName()+"/"+R.raw.luo);
        list.add(luo);
        Video men = new Video("men",
                "android.resource://"+getPackageName()+"/"+R.raw.men);
        list.add(men);
        videoAdapter = new VideoAdapter(list);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(1,
                StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(videoAdapter);
    }

    private void initView() {
        recyclerView = findViewById(R.id.recyclerview);

    }
}