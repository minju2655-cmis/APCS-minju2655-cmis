import java.util.Arrays;
public class Ft
{
    public static void main ( String args[] )
    {
        String[] myList4 = {"one", "two", "three", "four", "five", "six", "seven", "eight"};
        System.out.println(Arrays.toString(makeGroups(myList4,2)));
    } // end method main
    public static String[] makeGroups(String[] names, int groupSize){
        String[] makeGroups = new String[names.length/groupSize];  
        int c = names.length;
        int a  = (int)(Math.random()*(c-0))+0;
        String b = "";
        for (int x = 0; x < names.length/groupSize; x++){
            if (groupSize%2==0){
                for (int i = 0; i < groupSize; i++){
                    b+= names[a];
                }
            }
            else if (groupSize%2==1){
                for (int i = 0; i < groupSize; i++){
                    
                }
            }
        }
        return makeGroups;
        
    }
} // end class HelloWorld 