package Project;


// Base class for all music objects
public abstract class MusicItem {
    public abstract void printDetails();  // Method for outputting information about the object
}




















// Narration: the Track class extends the Song class
//public class Track extends Song {
//    private String narration;       // For podcasts or audiobooks, e.g.
//
//    public Track(String songName, Artist artist, String songDuration, String songGenre, String narration) {
//        super(songName, artist, songDuration, songGenre);  // Call the constructor of the parent class
//        this.narration = narration;
//    }
//
//    // Overriding the toString method to output additional information
//    @Override
//    public String toString() {
//        return super.toString() + "Narration=" + narration;
//    }
//}
