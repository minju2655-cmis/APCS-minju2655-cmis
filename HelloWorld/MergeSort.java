import java.util.Arrays;
public class MergeSort
{
    public static void main (String args[]){
        int[] list = {1, 7, 5, 7, 9, 3, 4, 2, 1};
    }

    public static int[] MergeSort(int[] array){
        int[] merge = new int [array.length];
        return merge;
    }

    public static int[] Front(int[] array){
        int[] front = new int [array.length/2];
        for (int i=0;i<front.length;i++){
            front[i]=array[i];
        }
        return front;
    }
    public static int[] Back(int[] array){
        int[] back = new int [array.length-(array.length/2)];
        for (int i=0;i<back.length;i++){
            int a=0;
            back[i]=array[array.length-(array.length/2)+a];
            a++;
        }
        return back;
    }
}