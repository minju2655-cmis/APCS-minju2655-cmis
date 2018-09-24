public class Arrays
{
    public static void main ( String args[] ){
        int[] myList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] myList2 = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};
        boolean[] myList3 ={true, false, false, true, true, false, false};
        String[] myList4 = {"one", "two", "three", "four", "five", "six", "seven", "eight"};
        System.out.print(myList[0]+" / ");
        System.out.print(myList2[2]+" / ");
        System.out.print(myList4[4]+" ");

        System.out.print("\n");
        printArray(myList,true);
        System.out.print("\n");
        printArray(myList2,true);
        System.out.print("\n");
        printArray(myList3,true);
        System.out.print("\n");
        printArray(myList4,true);
        System.out.print("\n");
        
        lastItem(myList);
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
        int a=0;
        for (int ctr=0;ctr<array.length;ctr++){
            a+=array.length-1;
        }
        return a;
    }
} //end class Arrays 