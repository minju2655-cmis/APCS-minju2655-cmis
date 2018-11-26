import java.util.Arrays;
public class ClassWork
{
    public static void main ( String args[] )
    {
        int[][] array = {{0,1,2},{3,4,5},{6,7,8}}; 
        print2DArray(array, true);
        print2DArray(array, false);

        snakePrint(array);

        print2DArray(array, true);

        int[][] sarray = shift(array, 0);
        print2DArray(array, true);
    } // end method main
    public static void print2DArray(int[][] array, boolean rowMajor){
        if(rowMajor == true){
            for(int row = 0; row < array.length; row++){
                for(int col = 0; col < array[row].length; col++){
                    System.out.print(array[row][col] + " ");
                }
                System.out.println();
            }
        }else{
            for(int col = 0; col < array[0].length; col++){
                for(int row = 0; row < array.length; row++){
                    System.out.print(array[row][col] + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }
    public static void snakePrint(int[][] array){
        for(int row = 0; row < array.length; row++){
            if(row % 2 == 0){
                for(int col = 0; col < array[0].length; col++){
                    System.out.print(array[row][col]+ " ");
                }
            }else{
                for(int col = array[0].length - 1; col >= 0; col--){
                    System.out.print(array[row][col]+ " ");
                }
            }
        }
        System.out.println();
    }
    public static String[][] locate(String[][] array){
        double ct = ((double)array[0].length * (double)array.length)/2.0;
        int target = (int)(Math.random() * ct);
        ct = 0;
        System.out.println(target);
        for(int y = 0; y < array.length; y++){
            for(int x = 0; x < array[y].length; x++){
                System.out.println(ct + " " + target);
                if(array[y][x].equals("#")){
                    if(ct == target){
                        array[y][x] = "" + (int)(Math.random() * 10);
                        x = array[y].length-1;
                        y = array.length - 1;
                    }else{
                        ct++;
                    }
                }
            }
        }
        return array;
    }
    public static int[][] replace(int[][] array, int threshold, int newValue)
    {
        int [][] result = new int [array.length][array[0].length];
        for (int y = 0; y < array.length; y ++){
            for (int x = 0; x < array[y].length; x ++){
                if (array [y][x] <= threshold){
                    result [y][x] = array [y][x];
                }
                else {
                    result [y][x] = newValue;
                }
            }
        }
        return result;
    }
    public static int[][] shift(int[][] array, int shiftRow){
        for(int row = array.length - 1; row >= 0; row--){
            for(int col = 0; col < array[row].length; col++){
                if(row == shiftRow){
                    if(row == array.length - 1){
                        array[row][col] = (int)(Math.random() * 10);
                    } else {
                        array[row + 2][col] = array[row+1][col]; // WRONG
                        array[row + 1][col] = array[row][col];
                        array[row][col] = (int)(Math.random() * 10);  
                    }
                }
            }
        }
        return array;
    }
    public static int[][] tilt(int[][] array){
        int[][] result = new int[array.length][array[0].length];
        for(int y = 0; y < array.length; y++){
            for(int x = 0; x < array[y].length; x++){
                result[x][y] = array[y][x];
            }
        }
        return result;
    }
}//end of ClassWork
