import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;
public class Shuffle
{
    public static void main ( String args[] )
    {
        String[] myList4 = {"Jim", "Bob", "MinJu", "Pob", "Walter", "Pater", "Faiter", "Aager"};
        System.out.println(Arrays.toString(makeGroups(myList4,2)));
    } // end method main
    public static String[] makeGroups(String[] names, int groupSize){
        int size = names.length / groupSize;
        String [] result;
        int randposit = 0;
        String [] randomize =  new String [names.length];
        int [] check = new int [names.length];
        for (int integer = 0; integer < names.length; integer++){
            while (randomize [integer] == null){
                int num = (int)(Math.random() * names.length);
                if (check [num] == 0)
                {
                    randomize [integer] = names[num];
                    check [num] = 1;
                }
            }
        }
        
        return randomize;
    }
} // end class HelloWorld 