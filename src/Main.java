import Project.Artist;
import Project.Playlist;
import Project.Song;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Creating Playlist objects
        Playlist playlist = new Playlist("MyPLaylist");

        //Creating SongManager object
        SongManager songManager = new SongManager(playlist);

        // Creating Artist objects
//        Artist queen = new Artist("Queen", 1970,9.8);
//        Artist ladyGaga = new Artist("Lady Gaga feat. Bruno Mars ", 2024 ,  9.8);
//
//        // Creating a Song object using the constructor
//        Song song1 = createSong("Die With a Smile", queen, "4:12", "Pop");
//        Song song2 = createSong("We Are the Champions", ladyGaga, "2:18", "rock");
//        Song song3 = new Song("Shallow", ladyGaga, "2:15", "Pop");
//
//        //Adding songs to a playlist
//        playlist.addSong(song1);
//        playlist.addSong(song2);
//        playlist.addSong(song3);
//
//        playlist.sortByArtist();
//        playlist.sortByGenre();


        // Creating a scanner for user input
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Add New Song");
            System.out.println("2. Show Playlist");
            System.out.println("3. Search By Name");
            System.out.println("4. Filter By Genre");
            System.out.println("5. Remove Song by Name");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            if (choice == 1) {
                // Adding a song to a playlist
                songManager.addSongToPlaylist();
//                playlist.printPlaylistDetails();
            } else if (choice == 2) {
                // Output playlist information6

                playlist.printPlaylistDetails();
            } else if (choice == 3) {
                songManager.searchSongByName();
            } else if (choice == 4) {
                songManager.filterSongsByGenre();
            } else if (choice == 5) {
                System.out.println("Enter song name to remove: ");
                String songNameToRemove = scanner.nextLine();
                boolean removed = playlist.removeSongByName(songNameToRemove);
                if (!removed) {
                    System.out.println("Song not found!");
                }
            } else if (choice == 6) {
                // Finishing the program
                System.out.println("\nExiting the program");
                break;
            }
            else {
                System.out.println("\nInvalid choice. Please choose a valid option.");
            }


        }

        scanner.close();

//
//        playlist.printPlaylistDetails();


//        Song foundSong = playlist.searchByName("we are the champions");
//        if (foundSong != null) {
//            System.out.println("Found song: " + "\n" + foundSong.toString());
//        }
//        else{
//            System.out.println("Song not found");
//        }
//
//
//        // Filter by genre
//        ArrayList<Song> rockSongS = playlist.filterByGenre("pop");
//        System.out.println("Pop songs: ");
//        for (Song song : rockSongS) {
//            System.out.println(song.toString());
//
//        }

    }
    public static Song createSong(String songName, Artist artist, String durationInSeconds, String songGenre){
        return new Song(songName, artist, durationInSeconds, songGenre);
    }

}
