import Project.Artist;
import Project.Playlist;
import Project.Song;

public class Main {
    public static void main(String[] args) {

        // Creating a Song object using the constructor
        Song song1 = new Song("Die With a Smile", "4:12", "Pop Rock");
        Song song2 = new Song("We Are the Champions", "2:20", "rock");

        // Creating Artist objects
        Artist artist1 = new Artist("Lady Gaga feat. Bruno Mars ", 2024 ,  9.8);
        Artist artist2 = new Artist("Queen", 1970, 8.2);

        // Creating Playlist objects
        Playlist playlist = new Playlist("MyPLaylist");

        // Adding songs to a playlist
        playlist.addSong(song1);
        playlist.addSong(song2);

        playlist.printPlaylistDetails();

        artist1.printArtistDetails();
        artist2.printArtistDetails();



    }
}
