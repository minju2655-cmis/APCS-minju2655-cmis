public class BinarySearchII{
    public static void main(String[] args){
        int[] array2= {1,1,1,1,2,2,2};
        System.out.println(search(array2, 1, true));
    }
    public static int search(int[] array, int value, boolean position){
        int front = 0;
        int back = array.length - 1 ;
        int matchIdx = -1;
        while(front <= back){
            int mid = (front + back) / 2; 
            int middleValue = array[mid];
            if(middleValue == value){
                matchIdx = mid;
                break;
            }else if(value > middleValue){
                front = mid + 1;
            }else if(value < middleValue){
                back = mid - 1;
            }
        }
        return matchIdx;
    }
}