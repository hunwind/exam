package task.three;

public class Song {
    private String title;
    private String artist;
    private int duration;

    // Constructor
    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Method to convert duration to minutes and seconds
    public String getDurationInMinutesAndSeconds() {
        int minutes = duration / 60;
        int seconds = duration % 60;
        return minutes + " minutes, " + seconds + " seconds";
    }
}