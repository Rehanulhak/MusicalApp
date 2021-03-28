package com.example.musicalapp;

public class SongList {
    private String songTitle;
    private String artistName;

    public SongList(String title, String artist){
        songTitle = title;
        artistName = artist;
    }
    public String getSongTitle(){
        return songTitle;
    }
    public String getArtistName(){
        return artistName;
    }
}
