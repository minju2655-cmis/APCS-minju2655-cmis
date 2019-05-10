public class SelectionSort
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
        int min=0;
        int index=0;
        int fn=0;
        for(int x=0;x<array.length;x++){
            min=array[x];
            index=x;
            for (int a=x;a<array.length;a++){
                if (min>array[a]){
                    min=array[a];
                    index=a;
                }
            }
            fn=array[x];
            array[x]=array[index];
            array[index]=fn;
        }
    }
}