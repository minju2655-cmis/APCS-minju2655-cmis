import java.util.Arrays;
public class FundamentalsII
{
    public static void main ( String args[] ){
        int[] myList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] example = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};
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
        System.out.println("Pairs: "+Arrays.toString(pairs(8)));

        System.out.print("\n");
        System.out.println("Concat: "+Arrays.toString(concat(myList, example)));

        System.out.print("\n");
        //System.out.println("Merge: "+Arrays.toString(merge(myList,example)));
        System.out.print("\n");
        reverse(myList);
        int[] myList8 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("\n");
        System.out.println("SubArray: "+Arrays.toString(subArray(myList8,1,8)));     
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
        int[] pairs = new int[n*2];
        int a = 1;
        for (int ctr=0;ctr<pairs.length;ctr++){    
            pairs[ctr]=a*2;          
            pairs[ctr+1]=a*2;
            a+=1;
            ctr+=1;
        }
        return pairs;
    }

    public static int[] concat(int[] a, int[] b){
        int[] concat = new int[a.length+b.length];
        for (int ctr=0;ctr<a.length;ctr++){
            concat[ctr]=a[ctr];
        }
        for (int ctr=0;ctr<b.length;ctr++){
            concat[ctr+a.length]=b[ctr];
        }
        return concat;
    }

    //public static int[] merge(int[] a, int[] b){
    //int[] merge = new int[a.length+b.length];
    //}

    public static void reverse(int[] array){
        int a = 0;
        for (int i=0;i<(array.length/2);i++){
            a=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=a;
        }
        System.out.println("Reverse: "+Arrays.toString(array));
    }
    public static int[] subArray(int[] array, int start, int stop){
        int[] subarray=new int [stop-start];
        for (int i = start; i < stop; i++){
            subarray[i-start] = array[i];
        }
        return subarray;
    }
    //public static int[] compareArrays(int[] a, int[] b){
        //int at=0;
        //int bt=0;
        //int bg=0;
        //int sl=0;
        //int[] aa;
        //int[] bb;
        //if (a.length>=b.length){
            //bg=a.length;
            //sl=b.length;
            //aa=a;
            //bb=b;
        //}
        //else {
            //bg=b.length;
            //sl=a.length;
            //aa=b;
            //bb=a;
        //}
        //return aa;
    //}
}//end class FundamentalsII 