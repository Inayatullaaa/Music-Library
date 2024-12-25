package Project;

import java.util.ArrayList;

public class Playlist {

    private String namePlaylist;
    private ArrayList<Song> songs;

    // constructors
    public Playlist(String namePlaylist) {
        this.namePlaylist = namePlaylist;
        this.songs =  new ArrayList<>(); //Initializing the song list
    }


    // Метод для добавления песни в плейлист
    public void addSong(Song song){
        songs.add(song);
    }


    // Method for displaying information about all songs in a playlist
    public void printPlaylistDetails(){
        System.out.println("Playlist: " + namePlaylist);
        for (Song song : songs) {
            song.printSongDetails(); // Display information about each song

        }
    }
}

