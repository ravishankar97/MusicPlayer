package com.example.ravishankar.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class PlaySongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song);

        TextView name=findViewById(R.id.song_name);
        TextView singer=findViewById(R.id.singer);
        Intent intent=getIntent();
        String nameOfSong=intent.getExtras().getString("songName");
        String nameOfSinger=intent.getExtras().getString("singer");
        name.setText(nameOfSong);
        singer.setText(nameOfSinger);
    }
}
