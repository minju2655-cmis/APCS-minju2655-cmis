import java.util.Arrays;
public class FundamentalsIII
{
    public static void main ( String args[] )
    {
        int [][] defaultInt = new int [5][5];
        int [][] literalInt = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};

        double [][] defaultDouble = new double [5][5];
        double [][] literalDouble = {{1.1, 1.2, 1.3, 1.4, 1.5},
                {2.1, 2.2, 2.3, 2.4, 2.5},
                {3.1, 3.2, 3.3, 3.4, 3.5},
                {4.1, 4.2, 4.3, 4.4, 4.5},
                {5.1, 5.2, 5.3, 5.4, 5.5}};

        String [][] literalString = {{"#", " ", "#", " ", "#", " ", "#", " "},
                {" ", "#", " ", "#", " ", "#", " ", "#"},
                {"#", " ", "#", " ", "#", " ", "#", " "},
                {" ", "#", " ", "#", " ", "#", " ", "#"},
                {"#", " ", "#", " ", "#", " ", "#", " "},
                {" ", "#", " ", "#", " ", "#", " ", "#"},
                {"#", " ", "#", " ", "#", " ", "#", " "},
                {" ", "#", " ", "#", " ", "#", " ", "#"}};

        System.out.println(returnValue(literalInt,3,4));
        System.out.println(returnValue(literalDouble,1,2));
        System.out.println(returnValue(literalString,0,6));

        System.out.print("\n");
        setValue(literalInt,3,4,100);
        print2D(literalInt);
        System.out.print("\n");
        setValue(literalDouble,1,2,100.00);
        print2D(literalDouble);
        System.out.print("\n");
        setValue(literalString,0,6,"Checkerboard");
        print2D(literalString);
        
        System.out.print("\n");
        print2DArray(literalInt,true);
        System.out.print("\n");
        print2DArray(literalInt,false);
        
        System.out.print("\n");
        snakePrint(literalInt);
    } // end method main
    //public int[][] array(int h, int w){
    //int [][] array2d = new int[h][w];
    //for (int y=0; y<h;y++){
    //for (int x=0; x<w;x++){
    //int v = array2d[y][x];
    //System.out.print(v + " ");
    //} 
    //System.out.println();
    //}
    //return array2d;
    //}
    public static void print2D(int[][] array)
    {
        {
            for (int y = 0; y < array.length; y ++)
            {     
                for (int x = 0; x < array[y].length; x ++)
                {
                    System.out.print(array[y][x] + " ");
                }
                System.out.println("");
            }
        }
    }
    public static void print2D(double[][] array)
    {
        {
            for (int y = 0; y < array.length; y ++)
            {     
                for (int x = 0; x < array[y].length; x ++)
                {
                    System.out.print(array[y][x] + " ");
                }
                System.out.println("");
            }
        }
    }
    public static void print2D(String[][] array)
    {
        {
            for (int y = 0; y < array.length; y ++)
            {     
                for (int x = 0; x < array[y].length; x ++)
                {
                    System.out.print(array[y][x] + " ");
                }
                System.out.println("");
            }
        }
    }
    public static int returnValue (int [][] intArray, int y, int x)
    {
        return intArray [y][x];
    }
    public static double returnValue (double [][] doubleArray, int y, int x)
    {
        return doubleArray [y][x];
    }
    public static String returnValue (String [][] StringArray, int y, int x)
    {
        return StringArray [y][x];
    }
    public static void setValue (int[][] arr, int y, int x, int v)
    {
        arr [y][x] = v;
    }
    public static void setValue (double[][] arr, int y, int x, double v)
    {
        arr [y][x] = v;
    }
    public static void setValue (String[][] arr, int y, int x, String v)
    {
        arr [y][x] = v;
    }
    public static void print2DArray(int[][] array, boolean rowMajor)
    {
        if (rowMajor == true)
        {
            for (int y = 0; y < array.length; y ++)
            {     
                for (int x = 0; x < array[y].length; x ++)
                {
                    System.out.print(array[y][x] + " ");
                }
                System.out.println("");
            }
        }
        else
        {
            for (int y = 0; y < array.length; y ++)
            {     
                for (int x = 0; x < array[y].length; x ++)
                {
                    System.out.print(array[x][y] + " ");
                }
                System.out.println("");
            }
        }
    }
    public static void snakePrint(int[][] arr)
    {
        for (int y = 0; y < arr.length; y ++)
        {
            if (y % 2 == 0)
            {
                for (int x = 0; x < arr[y].length; x ++)
                {
                    System.out.print(arr[y][x] + " ");
                }
            }
            else
            {
                for (int x = arr[y].length - 1; x >= 0 ; x --)
                {
                    System.out.print(arr[y][x] + " ");
                }
            }
        }
        System.out.println("");
    } 
    public static String[][] locate(String[][] arr)
    {
        int randInt = (int)(Math.random() * 9);
        int randX = (int)(Math.random() * arr.length);
        int randY = (int)(Math.random() * arr[0].length);
        String [][] result = new String [arr.length][arr[0].length];
        for (int y = 0; y < arr.length; y ++)
        {
            for (int x = 0; x < arr[y].length ; x ++)
            {
                if (x == randX && y == randY){
                    result [x][y] = String.format("%d",randInt);
                }
                else{
                    result [x][y] = "#";
                }
            }
        }
        return result;
    } 
    public static int[][] replace(int[][] array, int threshold, int newValue)
    {
        int [][] result = new int [array.length][array[0].length];
        for (int y = 0; y < array.length; y ++)
        {
            for (int x = 0; x < array[y].length; x ++)
            {
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
    public static double[][] shift(double[][] arr, int row)
    {
        double result [][] = new double [arr.length][arr[0].length];
        for (int y = 0; y < arr.length; y ++)
        {
            if (y > row)
            {
                result[y] = arr[y - 1];
            }
            else if (y == row)
            {
                for (int x = 0; x < arr[0].length; x ++)
                {
                    result[y][x] = Math.random() * 10;
                }
            }
            else
            {
                result[y] = arr[y];
            }
        }
        return result;
    }
    public static double [][] tilt (double [][] arr)
    {
        double [][] result = new double [arr[0].length][arr.length];
        for (int y = 0; y < arr.length; y ++)
        {
            for (int x = 0; x < arr[0].length; x ++)
            {
                result[x][y] = arr[y][x];
            }
        }
        return result;
    } 
    public static void greatest (int [][] arr, boolean greatestRow)
    {
        int resultSum = 0;
        int result = 0;
        if (greatestRow)
        {
            for (int y = 0; y < arr.length; y ++)
            {
                int check = 0;
                for (int x = 0; x < arr[0].length; x ++)
                {
                    check += arr[y][x];
                }
                if (check > resultSum)
                {
                    result = y;
                    resultSum = check;
                }
            }
            System.out.format("Row %d has the greatest sum, %d.",result + 1, resultSum);
        }
        else
        {
            for (int x = 0; x < arr.length; x ++)
            {
                int check = 0;
                for (int y = 0; y < arr[0].length; y ++)
                {
                    check += arr[y][x];
                }
                if (check > resultSum)
                {
                    result = x;
                    resultSum = check;
                }
            }            
            System.out.format("Column %d has the greatest sum, %d.",result + 1, resultSum);
        }
    } 
    public static int greatestSub (int [][] arr, int h, int w)
    {
        int result = 0;
        for (int hPosition = 0; hPosition < arr.length - 1; hPosition ++)
        {
            for (int wPosition = 0; wPosition < arr[0].length - 1; wPosition ++)
            {   
                int temporarySum = 0;
                for (int hCurrentLength = 0; hCurrentLength < h; hCurrentLength ++)
                {
                    for (int wCurrentLength = 0; wCurrentLength < w; wCurrentLength ++)
                    {
                        if (hPosition + hCurrentLength < arr.length && wPosition + wCurrentLength < arr[0].length)
                        {
                            temporarySum += arr[hPosition + hCurrentLength][wPosition + wCurrentLength];
                            if (temporarySum > result)
                                result = temporarySum;
                        }
                    }
                }
            }
        }
        return result;
    } 
    public static int greatestRing (int [][] arr)
    {
        int result = 0;
        for (int posit = 0; posit <= arr.length/2; posit ++)
        {
            int temp = 0;
            for (int h = posit; h < arr.length - posit; h++)
            {
                if (h == posit || h == arr.length - (1 + posit))
                {
                    for (int w = posit; w < arr[0].length - posit; w ++)
                    {
                        temp += arr[h][w];
                    }
                }

                else if (h > posit || h < arr[0].length - (1 + posit))
                {
                    if (posit == arr[0].length - (1 + posit))
                        temp += arr[h][posit];
                    else
                    {
                        temp += arr[h][posit];
                        temp += arr[h][arr[0].length - (1 + posit)];
                    }
                }
            }
            if (temp > result)
            {
                result = temp;
            }
        }
        return result;
    }
} // end class HelloWorld 