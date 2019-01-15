public class InsertionSort
{
    public static void main(String[] args){
        int[] numbers = new int[15];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100);
        }
        print(numbers);
        sort(numbers);
        print(numbers);
    }
    public static void print(int[] array){
        for(int i : array){
            System.out.println(i);
        }
        System.out.println();
    }
    public static void sort(int[] array){
        int i=array[0];
        int swap=0;
        for(int x=1;x<array.length;x++){
            if (array[x]>array[x-1]){
                i=array[x];
            }
            else if (array[x]<array[x-1]){
                swap=array[x-1];
                array[x-1]=i;
                array[x]=swap;
            }
        }
    }
}