public class Song
{
    private int lengthInSeconds;
    private double lengthInMinutes;
    private String artist;
    private boolean isGood;
    //characteristics of the song
    public Song(){
        this.lengthInSeconds=195;
        this.lengthInMinutes=3.15;
        this.artist="Waste It on Me";
        this.isGood=false;
    } //zero argument constructor
    public Song(int seconds, double minutes, String thename, boolean good){
        this.lengthInSeconds=seconds;
        this.lengthInMinutes=minutes;
        this.artist=thename;
        this.isGood=good;
    }
    public String toString(){
        return "Seconds: "+ lengthInSeconds +"\nMinutes: "+ lengthInMinutes +"\nName: "+ artist + "\nIs it Good?: "+ isGood;
    }
}
