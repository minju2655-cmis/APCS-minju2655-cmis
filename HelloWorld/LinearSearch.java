public class LinearSearch{
    public static int linear(int[] array, int c){
        for(int x = 0; x < array.length; x++){
            if(array[x] == c){
                return x;
            }
        }
        return -1;
    }
}
