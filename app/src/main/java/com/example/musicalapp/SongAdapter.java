package com.example.musicalapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<SongList> {
    public SongAdapter(Context context, ArrayList<SongList> songList){
        super(context,0, songList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        SongList songlist = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        TextView song = convertView.findViewById(R.id.songTitle);
        TextView artist = convertView.findViewById(R.id.artistTitle);

        song.setText(songlist.getSongTitle());
        artist.setText(songlist.getArtistName());

        return convertView;
    }
}
