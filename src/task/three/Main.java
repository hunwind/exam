package task.three;

public class Main {
    public static void main(String[] args) {
        Song song = new Song("Niyameddin Musayev", "Dunya Senin Dunya menim", 652);

        System.out.println("Title: " + song.getTitle());
        System.out.println("Artist: " + song.getArtist());
        System.out.println("Duration: " + song.getDurationInMinutesAndSeconds());

        // Modify the attributes
        song.setTitle("Gul ki gul ki, ureyin gulsun");
        song.setArtist("Seyyad Elizade");
        song.setDuration(320);

        System.out.println("Modified Title: " + song.getTitle());
        System.out.println("Modified Artist: " + song.getArtist());
        System.out.println("Modified Duration: " + song.getDurationInMinutesAndSeconds());
    }
}