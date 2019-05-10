import java.util.Arrays;
public class MakeGroups
{
    public static void main ( String args[] )
    {
        String[] myList4 = {"Jim", "Bob", "MinJu", "Pob", "Walter", "Pater", "Faiter", "Aager"};
        System.out.println(Arrays.toString(makeGroups(myList4,2)));
    } // end method main
    public static String[] makeGroups(String[] names, int groupSize){
        String[] random = new String[names.length];
        String[] makeGroups = new String[names.length/groupSize];  
        String test = "";
        int m = (int)(Math.random()*names.length-0)+0;
        for (int i=0;i<names.length;i++){
            while (random[m]!=null){
                m = (int)(Math.random()*names.length-0)+0;
            }
            if (random[m]==null){
                random[m]=names[i];
            }
            else if(random[m]!=null){
                m = (int)(Math.random()*names.length-0)+0;
            }       
        }
        for (int a=0;a<names.length/groupSize;a++){
            for (int b=0;b<groupSize;b++){
                if (makeGroups[a]==null){
                    makeGroups[a]=random[a];
                }
            }
        }
        return makeGroups;
    }
} // end class HelloWorld 