package com.example.ravishankar.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song(getString(R.string.song1),getString(R.string.singer1)));
        songs.add(new Song(getString(R.string.song2),getString(R.string.singer2)));
        songs.add(new Song(getString(R.string.song3),getString(R.string.singer3)));
        songs.add(new Song(getString(R.string.song4),getString(R.string.singer4)));
        songs.add(new Song(getString(R.string.song5),getString(R.string.singer5)));
        songs.add(new Song(getString(R.string.song6),getString(R.string.singer6)));
        songs.add(new Song(getString(R.string.song7),getString(R.string.singer7)));


        CustomSongAdapter  adapter = new CustomSongAdapter(this,songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent=new Intent(MainActivity.this,PlaySongActivity.class);
                intent.putExtra("songName",songs.get(position).getSongName());
                intent.putExtra("singer",songs.get(position).getSongInfo());
                startActivity(intent);
            }
        });
    }
}
