package com.example.playvideo.enity;

public class Video {
    private String videoName;
    private String videoUri;

    public Video(String videoName, String videoUri) {
        this.videoName = videoName;
        this.videoUri = videoUri;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getVideoUri() {
        return videoUri;
    }

    public void setVideoUri(String videoUri) {
        this.videoUri = videoUri;
    }
}
