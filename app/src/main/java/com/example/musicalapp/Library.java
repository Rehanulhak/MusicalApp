package com.example.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Library extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        Button libButton = findViewById(R.id.nowPlayingButton);
        libButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Library.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button favButton = findViewById(R.id.favoriteButton);
        favButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Library.this, Favorites.class);
                startActivity(intent);
            }
        });

        Button searchButton = findViewById(R.id.searchButton);
        searchButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Library.this, Search.class);
                startActivity(intent);
            }
        });

        ArrayList<SongList> songs = new ArrayList<SongList>();

        songs.add(new SongList("Murmaider", "Dethklok"));
        songs.add(new SongList("For Whom the Bell Tolls", "Metallica"));
        songs.add(new SongList("Sound of Silence", "Disturbed"));
        songs.add(new SongList("Darkness is Revealing", "Korn"));
        songs.add(new SongList("Nero Forte", "Slipknot"));
        songs.add(new SongList("Hero", "Skillet"));
        songs.add(new SongList("The dark of you", "Breaking Benjamin"));
        songs.add(new SongList("Alone", "Falling in Reverse"));
        songs.add(new SongList("Limits", "Bad Omens"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}