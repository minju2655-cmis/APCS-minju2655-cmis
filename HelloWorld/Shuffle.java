import java.util.Arrays;
public class Shuffle
{
    public static void main ( String args[] )
    {
        String[] myList4 = {"Jim", "Bob", "MinJu", "Pob", "Walter", "Pater", "Faiter", "Aager"};
        System.out.println(Arrays.toString(makeGroups(myList4,2)));
    } // end method main
    public static String[] makeGroups(String[] names, int groupSize){
        String[] shuffle = new String[names.length];
        int a=(int)((Math.random()*(names.length-0))+0);
        for (int i=0;i<names.length;i++){
            int b=(int)(Math.random()*(names.length-0)+0);
            shuffle[i]=names[b];
        }
        return shuffle;
    }
} // end class HelloWorld 