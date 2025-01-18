import Project.Artist;
import Project.Playlist;
import Project.Song;

import java.util.ArrayList;
import java.util.Scanner;

public class SongManager {


    public SongManager(Playlist playlist) {
        this.playlist = playlist;
        this.scanner = new Scanner(System.in);
    }

    private Playlist playlist;
    private Scanner scanner;

    public void addSongToPlaylist() {
        System.out.println("Enter song name(or type 'exit' to finish): ");
        String songName = scanner.nextLine();

        if (songName.equals("exit")) {
            System.out.println("Exiting song addition");
            return;
        }

        System.out.println("Enter artist name: ");
        String artistName = scanner.nextLine();

        System.out.println("Enter genre: ");
        String genre = scanner.nextLine();

        System.out.println("Enter duration: ");
        String durationInSeconds = scanner.nextLine();

        Artist artist = new Artist(artistName, 2024, 8.5);

        Song song = new Song(songName, artist, durationInSeconds, genre);
        playlist.addSong(song);

        System.out.println("Song added to playlist: " + song.toString() + "\n");

    }

    public void searchSongByName() {
        System.out.println("Enter song name: ");
        String songName = scanner.nextLine();
        Song foundSong = playlist.searchByName(songName);

        if (foundSong != null) {
            System.out.println("Song found: " + foundSong.toString());
        } else {
            System.out.println("Song not found");
        }
    }

    public void filterSongsByGenre() {
        System.out.println("Enter genre: ");
        String genre = scanner.nextLine();
        ArrayList<Song> filteredSongs = playlist.filterByGenre(genre);

        if (!filteredSongs.isEmpty()) {
            System.out.println(genre + "songs: ");
            for (Song song : filteredSongs) {
                System.out.println(song.toString());
            }
        } else {
            System.out.println("No songs found for this genre");
        }
    }
}

