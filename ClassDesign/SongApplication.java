public class SongApplication{
    public static void main(String args[]){
        Song song1 = new Song();
        System.out.println(song1);
        Song song2 = new Song(294, 4.54, "Hello", true);
        System.out.println(song2);
    }
}