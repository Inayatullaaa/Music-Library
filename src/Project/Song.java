package Project;

import java.util.Objects;

public class Song extends MusicItem {

    // constructors

    public Song(String songName, Artist artist, String songDuration, String songGenre){
        this.songName = songName;
        this.artist = artist;
        this.durationInSeconds = songDuration; //Attribute initialization
        this.songGenre = songGenre;
    }


    private String songName;                // Song title
    private String durationInSeconds;       // Song duration in seconds
    private String songGenre;               // Song genre
    private Artist artist;                  // The artist who performed the song



    //getters and setters

    public Artist getArtist(){return artist;}
    public void setArtist(Artist artist){this.artist = artist;}

    public String getSongName() {
        return songName;
    }
    public void setSongName(String songName) {
        this.songName = songName;
    }


    public String getSongDuration(){
        return durationInSeconds;
    }
    public void setSongDuration(String songDuration){
        this.durationInSeconds = songDuration;
    }


    public String getSongGenre(){
        return songGenre;
    }
    public void setSongGenre(String songGenre){
        this.songGenre = songGenre;
    }

    // Override the printDetails() method to output song information
    @Override
    public void printDetails() {
        System.out.println("Song: " + songName + ", Artist: " + artist.getArtistName() + ", Duration: " + durationInSeconds + " seconds, Genre: " + songGenre);
    }

    // Overriding the toString() method
    @Override
    public String toString(){
        return "Song: " + songName + ", Artist: " + artist.getArtistName() + ", Duration: " + durationInSeconds + ", Genre: " + songGenre;
    }


    // Override equals() method to compare songs by name and artist
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return songName.equals(song.songName) && artist.equals(song.artist);
    }


    // Overriding the hashCode() method for correct work with collections
    @Override
    public int hashCode(){
        return Objects.hash(songName, artist);
    }

    public void printSongDetails() {

    }
}
