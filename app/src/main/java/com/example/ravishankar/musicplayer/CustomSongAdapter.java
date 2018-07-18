package com.example.ravishankar.musicplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomSongAdapter extends ArrayAdapter<Song> {

    public CustomSongAdapter(Context context, ArrayList<Song> pWords ) {
        super(context,0, pWords);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Song my_word= getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.name1);
        assert my_word != null;
        miwokTextView.setText(my_word.getSongName());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.name2);
        defaultTextView.setText(my_word.getSongInfo());

        return listItemView;
    }
}
