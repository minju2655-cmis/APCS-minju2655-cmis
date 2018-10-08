import java.util.Arrays;
public class MakeGroups
{
    public static void main ( String args[] )
    {
        String[] myList4 = {"one", "two", "three", "four", "five", "six", "seven", "eight"};
        System.out.println(Arrays.toString(makeGroups(myList4,2)));
    } // end method main
    public static String[] makeGroups(String[] names, int groupSize){
        String[] makeGroups = new String[names.length/groupSize];  
        int c = names.length;
        for (int i=0;i<names.length/groupSize;i++){
            int a=(int)((Math.random()*(names.length-i))+i);
            if (a==0){
                a=0;
            }
            if (groupSize%2==0){
                for (int x=0;x<groupSize;x++){
                    makeGroups[i]=names[a];
                }
            }
            else if (groupSize%2==1){

            }
            
            
        }
        
        return makeGroups;

    }
} // end class HelloWorld 