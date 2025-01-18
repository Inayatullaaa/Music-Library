package Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Playlist {

    // constructors
    public Playlist(String namePlaylist) {
        this.namePlaylist = namePlaylist;
        this.songs =  new ArrayList<>(); //Initializing the song list
    }

    private final String namePlaylist;
    private final ArrayList<Song> songs;



    // Method for adding a song
    public void addSong(Song song){
        songs.add(song);
    }

    // Method for displaying information about all songs in a playlist
    public void printPlaylistDetails(){
        if (songs.isEmpty()) {
            System.out.println("Playlist is empty");
        } else {
            System.out.println("Playlist: " + namePlaylist);
            for (Song song : songs) {
                song.printDetails(); // Display information about each song
            }
        }
    }

    // Search for a song by title
    public Song searchByName(String name){
        for (Song song : songs){
            if (song.getSongName().equalsIgnoreCase(name)){
                return song;
            }
        }
        return null;    // If the song is not found
    }

    // Filter songs by genre
    public ArrayList<Song> filterByGenre(String genre) {
        ArrayList<Song> filteredSongs = new ArrayList<>();
        for (Song song : songs) {
            if (song.getSongGenre().equalsIgnoreCase(genre)){
                filteredSongs.add(song);
            }
        }
        return filteredSongs;
    }


    public boolean removeSongByName(String songName){
        for (Song song : songs){
            if (song.getSongName().equalsIgnoreCase(songName)){
                songs.remove(song);
                System.out.println("Song removed: " + song.toString());
                return true; // Song deleted
            }
        }
        return false;// Song not found
    }



    // Sort songs by artist
    public void sortByArtist(){
        songs.sort(Comparator.comparing(song -> song.getArtist().getArtistName()));
    }

    public void sortByGenre(){
        songs.sort(Comparator.comparing(Song::getSongGenre));
    }





}

