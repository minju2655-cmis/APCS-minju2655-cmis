import java.util.Arrays;
public class FundamentalsII
{
    public static void main ( String args[] ){
        int[] myList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] myList2 = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};
        boolean[] myList3 ={true, false, false, true, true, false, false};
        String[] myList4 = {"one", "two", "three", "four", "five", "six", "seven", "eight"};
        System.out.format("myList[0]: %d\nmyList2[2]: %g\nmyList[4] %s\n", myList[0],myList2[2],myList4[4]);
        //System.out.print(myList[0]+" / ");
        //System.out.print(myList2[2]+" / ");
        //System.out.print(myList4[4]+" ");

        System.out.print("\n");
        printArray(myList,true);
        System.out.print("\n");
        printArray(myList2,true);
        System.out.print("\n");
        printArray(myList3,true);
        System.out.print("\n");
        printArray(myList4,true);
        System.out.print("\n");
        
        System.out.println("The last item is: "+ lastItem(myList));
        System.out.println("The last item is: "+ lastItem(myList2));
        System.out.println("The middle item is: "+ middleItem(myList3));
        System.out.println("The middle item is: "+ middleItem(myList4));
        
        System.out.print("\n");
        System.out.println(Arrays.toString(randomInts(10, 10, 1)));
        System.out.println(Arrays.toString(randomDoubles(10, 10, 1)));
        
        System.out.print("\n");
        System.out.println(Arrays.toString(copy(myList)));
        System.out.print("\n");
        System.out.println(Arrays.toString(copy(myList2)));
        System.out.print("\n");
        System.out.println(Arrays.toString(copy(myList3)));
        System.out.print("\n");
        System.out.println(Arrays.toString(copy(myList4)));     
        
        System.out.print("\n");
        System.out.println(Arrays.toString(pairs(8)));
    } // end method main
    public static void printArray(int[] array, boolean skip){
        if (skip==true){
            for (int ctr=0;ctr<array.length;ctr++){
                if (ctr%2==0){
                    System.out.println("Array["+ctr+"]: "+ array[ctr]);
                }
            }
        }
        else if (skip==false){ 
            for (int ctr=0;ctr<array.length;ctr++){
                System.out.println("Array["+ctr+"]: "+ array[ctr]);
            }
        }            
    }
    public static void printArray(double[] array, boolean skip){
        if (skip==true){
            for (int ctr=0;ctr<array.length;ctr++){
                if (ctr%2==0){
                    System.out.println("Array["+ctr+"]: "+ array[ctr]);
                }
            }
        }
        else if (skip==false){ 
            for (int ctr=0;ctr<array.length;ctr++){
                System.out.println("Array["+ctr+"]: "+ array[ctr]);
            }
        }   
    }
    public static void printArray(boolean[] array, boolean skip){
        if (skip==true){
            for (int ctr=0;ctr<array.length;ctr++){
                if (ctr%2==0){
                    System.out.println("Array["+ctr+"]: "+ array[ctr]);
                }
            }
        }
        else if (skip==false){ 
            for (int ctr=0;ctr<array.length;ctr++){
                System.out.println("Array["+ctr+"]: "+ array[ctr]);
            }
        }   
    }
    public static void printArray(String[] array, boolean skip){
        if (skip==true){
            for (int ctr=0;ctr<array.length;ctr++){
                if (ctr%2==0){
                    System.out.println("Array["+ctr+"]: "+ array[ctr]);
                }
            }
        }
        else if (skip==false){ 
            for (int ctr=0;ctr<array.length;ctr++){
                System.out.println("Array["+ctr+"]: "+ array[ctr]);
            }
        }   
    }
    public static int lastItem(int[] array){
        return array[array.length-1];
    }
    public static double lastItem(double[] array){
        return array[array.length-1];
    }
    public static boolean lastItem(boolean[] array){
        return array[array.length-1];
    }
    public static String lastItem(String[] array){
        return array[array.length-1];
    }
    public static int middleItem(int[] array){
        return array[array.length/2];
    }
    public static double middleItem(double[] array){
        return array[array.length/2];
    }
    public static boolean middleItem(boolean[] array){
        return array[array.length/2];
    }
    public static String middleItem(String[] array){
        return array[array.length/2];
    }
    public static int[] randomInts(int n, int min, int max){
        int[] random= new int[n];
        for (int ctr=0; ctr<n;ctr++){
            random[ctr]=(int)(Math.random()*(max-min))+min;
        }
        return random;
    }
    public static double[] randomDoubles(int n, double min, double max){
        double[] random= new double[n];
        for (int ctr=0; ctr<n;ctr++){
            random[ctr]=(Math.random()*(max-min))+min;
        }
        return random;
    }
    public static int[] copy(int[] array){
        int[] copy = new int[array.length];
        System.out.println("Original: "+Arrays.toString(array));
        System.out.print("Copy: ");
        for (int ctr=0;ctr<array.length;ctr++){
            copy[ctr]=array[ctr];
        }
        return copy;
    }
    public static double[] copy(double[] array){
        double[] copy = new double[array.length];
        System.out.println("Original: "+Arrays.toString(array));
        System.out.print("Copy: ");
        for (int ctr=0;ctr<array.length;ctr++){
            copy[ctr]=array[ctr];
        }
        return copy;
    }
    public static boolean[] copy(boolean[] array){
        boolean[] copy = new boolean[array.length];
        System.out.println("Original: "+Arrays.toString(array));
        System.out.print("Copy: ");
        for (int ctr=0;ctr<array.length;ctr++){
            copy[ctr]=array[ctr];
        }
        return copy;
    }
    public static String[] copy(String[] array){
        String[] copy = new String[array.length];
        System.out.println("Original: "+Arrays.toString(array));
        System.out.print("Copy: ");
        for (int ctr=0;ctr<array.length;ctr++){
            copy[ctr]=array[ctr];
        }
        return copy;
    }
    public static int[] pairs(int n){
        int[] pairs = new int[n];
        for (int ctr=0;ctr<n;ctr++){
           pairs[ctr]+=2;
        }
        return pairs;
    }
} //end class FundamentalsII 