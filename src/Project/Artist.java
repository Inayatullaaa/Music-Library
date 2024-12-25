package Project;

public class Artist {

    // Аттрибуты класса
    private String ArtistName;
    private int startDay;
    private double popularity;

    //constractors
    public Artist(String ArtistName, int startDay, double popularity) {
        this.ArtistName = ArtistName;
        this.startDay = startDay;
        this.popularity = popularity;
    }

    // getters and setters
    public String getArtistName() {
        return ArtistName;
    }
    public void setArtistName(String ArtistName) {
        this.ArtistName = ArtistName;
    }

    public int getStartDay() {
        return startDay;
    }
    public void setStartDay(int startDay) {
        this.startDay = startDay;
    }

    public double getPopularity() {
        return popularity;
    }
    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    // Method for outputting artist information
    public void printArtistDetails() {
        System.out.println("Artist Name: " + ArtistName + ", StartDay: " + startDay + ", Popularity: " + popularity);
    }

    public String toString(){
        return "Artist Name: " + ArtistName + ", StartDay: " + startDay + ", Popularity: " + popularity;
    }


}
