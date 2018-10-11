import java.util.Arrays;
import java.util.Collections;
public class MakeGroups
{
    public static void main ( String args[] )
    {
        String[] myList4 = {"","Jim", "Bob", "MinJu", "Pob", "Walter", "Pater", "Faiter", "Aager"};
        System.out.println(Arrays.toString(makeGroups(myList4,2)));
    } // end method main
    public static String[] makeGroups(String[] names, int groupSize){
        String[] makeGroups = new String[names.length/groupSize];  
        String[] random = new String[names.length];
        int[] c = new int [names.length];
        for (int i=0;i<names.length/groupSize;i++){
            int a=(int)((Math.random()*(names.length-i))+i);
            makeGroups[i]=names[0];
            for (int integer = 0; integer < names.length; integer++){
                while (random [integer] == null){
                    int num = (int)(Math.random() * names.length);
                    if (c [num] == 0)
                    {
                        random [integer] = names[num];
                        c [num] = 1;
                    }
                }
            }
            if (a==0){
                a=0;
            }
            if (groupSize%2==0){
                for (int x=0;x<groupSize;x++){
                    makeGroups[i]+=names[a];
                    if(x<groupSize-1){
                        makeGroups[i]+=" & ";
                    }
                }
            }
            else if (groupSize%2==1){
            }
        }
        return makeGroups;
    }
} // end class HelloWorld 