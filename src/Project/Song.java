package Project;

public class Song {


    private String songName;
    private String songDuration;
    private String songGenre;

    // constructors

    public Song(String songName, String songDuration, String songGenre){
        this.songName = songName;
        this.songDuration = songDuration; //Attribute initialization
        this.songGenre = songGenre;
    }


    //getters and setters

    public String getSongName() {
        return songName;
    }
    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongDuration(){
        return songDuration;
    }
    public void setSongDuration(String songDuration){
        this.songDuration = songDuration;
    }

    public String getSongGenre(){
        return songGenre;
    }
    public void setSongGenre(String songGenre){
        this.songGenre = songGenre;
    }

    // Methods
    public void printSongDetails(){
        System.out.println("Song: " + songName + ", Duration: " + songDuration + ", Genre: " + songGenre );
    }
}
