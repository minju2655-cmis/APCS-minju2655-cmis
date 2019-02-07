public class RecursionSortingQuiz
{
    public static void main(String[] args){
        System.out.println(factorial(0));
        System.out.println(factorial(5));
        System.out.println(factorial(10));
        int[] array={3,2,4};
        System.out.println(kiefferSort(array));
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        else if (n>0){  
            return (n*factorial(n-1));
        } 
        else{
            return 0;
        }
    }
    public static int[] kiefferSort(int[] array){
        boolean swapped=true;
        int r = (int)(Math.random()*(array.length-1)+1);
        while (swapped){
            int swap=0;
            for(int i=0;i<array.length-1;i++){
                if(array[i]>array[i+1]){
                    int random = array[r];
                    array[r] = array[i];
                    array[i] = random;
                    kiefferSort(array);
                    swap+=1;
                }
            }
            if (swap==0){
                swapped=false;
            }
        }
        return array;
    }
}

