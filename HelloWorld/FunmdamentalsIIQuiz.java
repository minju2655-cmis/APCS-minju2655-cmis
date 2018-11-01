import java.util.Arrays;
public class FunmdamentalsIIQuiz
{
    public static void main ( String args[] )
    {
        int[] array4 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print(Arrays.toString(minmax(array4)));
        int[] array5 = {3, -1, 6, 10, 4, -8, 6, 9, -3};
        System.out.println(Arrays.toString(minmax(array5)));

        int[] array0 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(filter(array0,5,7,false)));
        int[] array1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(filter(array1,5,7,true)));
        int[] array2 = {3, -1, 6, 10, 4, -8, 6, 9, -3};
        System.out.println(Arrays.toString(filter(array2,1,6,false)));
        int[] array3 = {3, -1, 6, 10, 4, -8, 6, 9, -3};
        System.out.println(Arrays.toString(filter(array3,1,6,true)));

    } // end method main
    public static int[] minmax(int[] array){
        int[] minmax= new int[2];
        int min = 0;
        int max = 0;
        for (int i =0;i<array.length; i++){
            if (array[i]>max)
            {
                max=array[i];
            }
            else if (array[i]<min)
            {
                min=array[i];
            }
        }
        minmax [0] = min;
        minmax [1] = max;
        return minmax;
    }
    public static int[] filter(int[] array, int min, int max, boolean positive){
        int a=0;
        int b=0;
        int[] c;
        if (positive == true)
        {
            for (int i = 0; i < array.length; i ++){    
                if (array [i] <= max&&min <= array [i]){        
                    a ++;
                }
            }
            c = new int [a];
            for (int i = 0; i < array.length; i ++){    
                if (array [i] <= max&&min <= array [i]){        
                    c [b] = array [i];
                    b ++;
                }
            }
        }
        else{
            for (int i = 0; i < array.length; i ++){    
                if (array [i] > max||min > array [i]){        
                    a ++;
                }
            }
            c = new int [a];
            for (int i = 0; i < array.length; i ++){    
                if (array [i] > max||min > array [i]){        
                    c [b] = array [i];
                    b ++;
                }
            }
        }
        return c;
    } 
}// end class FundamentalsIIQuiz 