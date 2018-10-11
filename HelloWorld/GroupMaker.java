import java.util.Arrays;
public class GroupMaker{
    public static void main ( String args[] )
    {
        String[] myList4 = {"Jim", "Bob", "MinJu", "Pob", "Walter", "Pater", "Faiter", "Aager"};
        System.out.println(Arrays.toString(makeGroups(myList4,2)));
    } // end method main
    public static String[] makeGroups(String[] name, int groupSize){
        int size = name.length / groupSize;
        String [] result;
        int randposit = 0;
        String [] randomize =  new String [name.length];
        int [] check = new int [name.length];
        for (int integer = 0; integer < name.length; integer++){
            while (randomize [integer] == null){
                int num = (int)(Math.random() * name.length);
                if (check [num] == 0)
                {
                    randomize [integer] = name[num];
                    check [num] = 1;
                }
            }
        }
        if (name.length % groupSize != 0)
        {
            result = new String [size + 1];
            for (int length = 0; length < size; length ++)
            {
                result [length] = "";
            }
            for (int resultposit = 0; resultposit < size; resultposit ++)
            {
                int insideposit = 0;
                while (insideposit < groupSize)
                {
                    result [resultposit] += randomize [randposit];
                    randposit ++;
                    insideposit ++;
                }
            }
            int finallength = name.length % groupSize;
            String yeet = "";
            for (int finalposit = name.length - 1; finalposit > name.length - (1 + finallength); finalposit --)
            {
                yeet += randomize [finalposit];
            }
            result [result.length - 1] = yeet;
        }
        else
        {
            result = new String [size];
            for (int length = 0; length < size; length ++)
            {
                result [length] = "";
            }
            for (int resultposit = 0; resultposit < size; resultposit ++)
            {
                int insideposit = 0;
                while (insideposit < groupSize)
                {
                    result [resultposit] += randomize [randposit];
                    randposit ++;
                    insideposit ++;
                }
            }
        }
        return result;
    }
}