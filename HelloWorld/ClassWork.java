import java.util.Arrays;
public class ClassWork
{
    public static void main ( String args[] )
    {
        int [][] defaultInt = new int [5][5];
        int [][] literalInt = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};
        int[][] int1={{1,2,3},{4,5,6},{7,8,9}};

        double [][] defaultDouble = new double [5][5];
        double [][] literalDouble = {{1.1, 1.2, 1.3, 1.4, 1.5},
                {2.1, 2.2, 2.3, 2.4, 2.5},
                {3.1, 3.2, 3.3, 3.4, 3.5},
                {4.1, 4.2, 4.3, 4.4, 4.5},
                {5.1, 5.2, 5.3, 5.4, 5.5}};

        String [][] defaultString = new String [5][5];
        String [][] literalString = {{"#", " ", "#", " ", "#", " ", "#", " "},
                {" ", "#", " ", "#", " ", "#", " ", "#"},
                {"#", " ", "#", " ", "#", " ", "#", " "},
                {" ", "#", " ", "#", " ", "#", " ", "#"},
                {"#", " ", "#", " ", "#", " ", "#", " "},
                {" ", "#", " ", "#", " ", "#", " ", "#"},
                {"#", " ", "#", " ", "#", " ", "#", " "},
                {" ", "#", " ", "#", " ", "#", " ", "#"}};
        System.out.print(Arrays.deepToString(shift(int1,0)));
    } // end method main
    public static int[][] shift(int[][] array, int shiftRow){
        for(int row = array.length - 1; row >= 0; row--){
            for(int col = 0; col < array[row].length; col++){
                if(row == shiftRow){
                    if(row == array.length - 1){
                        array[row][col] = (int)(Math.random() * 10);
                    } else {
                        array[row+2][col] = array[row+1][col];
                        array[row+1][col] = array[row][col];
                        array[row][col] = (int)(Math.random() * 10);
                    }
                }
            }
        }
        return array;
    }
}//end of ClassWork
