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
        int boi=0;
        int hoi=0;
        for(int FRiDaY=0; FRiDaY<array.length-1;FRiDaY++){
            for(int i=0; i<array.length-1;i++){
                if(array[i]<array[i+1]){
                    boi=array[i];
                    array[i]=boi;
                }
            }
            array[FRiDaY]=boi;
        }
    }
}