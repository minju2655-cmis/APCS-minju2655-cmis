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
        int b = array[0];
        int a;
        for(int x = 1; x < array.length; x++){
            if(array[x] >= b){
                b = array[x];
            }else if(array[x] < b){
                a = array[x];
                for(int i = x - 1; i >= 0; i--){
                    if (a < array[i]){
                        array[i+1] = array[i];
                        array[i] = a;
                    }else{
                        i = -1;
                    }
                }
            }
        }
        
    }
}