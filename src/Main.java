import Project.Artist;
import Project.Playlist;
import Project.Song;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Creating Artist objects
        Artist queen = new Artist("Queen", 1970,9.8);
        Artist ladyGaga = new Artist("Lady Gaga feat. Bruno Mars ", 2024 ,  9.8);

        // Creating a Song object using the constructor
        Song song1 = createSong("Die With a Smile", queen, "4:12", "Pop");
        Song song2 = createSong("We Are the Champions", ladyGaga, "2:18", "rock");
        Song song3 = new Song("Shallow", ladyGaga, "2:15", "Pop");

        // Creating Playlist objects
        Playlist playlist = new Playlist("MyPLaylist");

        // Adding songs to a playlist
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);

        playlist.sortByArtist();
        playlist.sortByGenre();

        playlist.printPlaylistDetails();

        Song foundSong = playlist.searchByName("we are the champions");
        if (foundSong != null) {
            System.out.println("Found song: " + "\n" + foundSong.toString());
        }
        else{
            System.out.println("Song not found");
        }


        // Filter by genre
        ArrayList<Song> rockSongS = playlist.filterByGenre("pop");
        System.out.println("Rock songs: ");
        for (Song song : rockSongS) {
            System.out.println(song.toString());

        }

    }
    public static Song createSong(String songName, Artist artist, String durationInSeconds, String songGenre){
        return new Song(songName, artist, durationInSeconds, songGenre);
    }

}
