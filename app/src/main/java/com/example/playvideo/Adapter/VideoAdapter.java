package com.example.playvideo.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.playvideo.PlayActivity;
import com.example.playvideo.R;
import com.example.playvideo.enity.Video;

import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.ViewHolder> {
    List<Video> list;

    public VideoAdapter(List<Video> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public VideoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        holder.videoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = holder.getAdapterPosition();
                Video video=list.get(position);
                String myVideoName = video.getVideoName();
                String myVideoSrc = video.getVideoUri();
                Intent intent =  new Intent(view.getContext(), PlayActivity.class);
                intent.putExtra("videoName",myVideoName);
                intent.putExtra("videoSrc",myVideoSrc);
                view.getContext().startActivity(intent);

            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull VideoAdapter.ViewHolder holder, int position) {
        Video video = list.get(position);
        holder.videoName.setText(video.getVideoName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView videoName;
        View videoView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            videoName = itemView.findViewById(R.id.videoName);
            videoView = itemView;
        }
    }
}
