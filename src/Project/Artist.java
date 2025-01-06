package Project;

import java.util.Objects;

public class Artist {

    //constractors
    public Artist(String artistName, int startDay, double popularity) {
        this.artistName = artistName;
        this.startYear = startDay;
        this.popularity = popularity;
    }

    // Аттрибуты класса
    private String artistName;
    private int startYear;
    private double popularity;


    // getters and setters
    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String ArtistName) {
        this.artistName = ArtistName;
    }

    public int getStartDay() {
        return startYear;
    }

    public void setStartDay(int startDay) {
        this.startYear = startDay;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }


    // Overriding the toString() method
    @Override
    public String toString() {
        return "Artist: " + artistName + ", Started in: " + startYear + ", Popularity: " + popularity;
    }

    // Override equals() method for comparing artists
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Artist artist = (Artist) obj;
        return artistName.equals(artist.artistName);
    }

    // Overriding the hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(artistName);
    }
}
