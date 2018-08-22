package com.example.ravishankar.musicplayer;

public class Song {

    private String mSongName;
    private String mSongInfo;

    public Song(String songName,String details)
    {
        mSongName=songName;
        mSongInfo=details;
    }

    public String getSongName()
    {
        return mSongName;
    }

    public String getSongInfo() {
        return mSongInfo;
    }

    @Override
    public String toString() {
        return "Song{" +
                "mSongName='" + mSongName + '\'' +
                ", mSongInfo='" + mSongInfo + '\'' +
                '}';
    }
}


