public class MergeSort{
    public static void main (String[] args){
        int[] list = {1, 7, 5, 7, 9, 3, 4, 2, 1};
        print(Split(list, true));
        print(Split(list, false));
        //MergeSort(list);
    }
    public static void print(int[] array){
        for(int i : array){
            System.out.println(i);
        }
        System.out.println();
    }
    public static int[] MergeSort(int[] array){
        if (array.length==1 || array.length==0){
            return array;
        }
        else{
            //****front,back=Split(array);
            //front=MergeSort(front);
            //back=MergeSort(back);
            //****array=Merge(front,back);
            //return array;
            //}
            //}
        }
        return array;
    }

    public static int[] Split(int[] array, boolean bool) {
        int[] half;
        if (array.length % 2 != 0 && bool == false){ 
            half = new int[(array.length/2) + 1];
        }
        else {
            half = new int[(array.length/2)];
        }
        if (bool == true){
            for (int i = 0; i < (array.length/2); i++) {
                half[i] = array[i];
            }
        }
        else if (bool == false) {
            int i2 = array.length/2;
            if (array.length % 2 != 0){
                for (int i = 0; i < (array.length/2) + 1; i++) {
                    half[i] = array[i2];
                    i2++;
                }
            }
            else {
                for (int i = 0; i < array.length/2; i++) {
                    half[i] = array[i2];
                    i2++;
                }
            }
        }
        return half;
    }
    public static int[] Merge(int[] array1, int[] array2) {
        int[] merge = new int[array1.length + array2.length];
        int i2 = 0;
        int i3 = 0;
        for (int i = 0; i < merge.length; i++) {
            if (!(i2 == array1.length  && i3 == array2.length )){
                if (i2 == array1.length){
                    merge[i] = array2[i3];
                    i3++;
                }
                else if (i3 == array2.length){
                    merge[i] = array1[i2];
                    i2++;
                }
                else{ 
                    if (array1[i2] <= array2[i3]){
                        merge[i] = array1[i2];
                        i2++;

                    }
                    else {
                        merge[i] = array2[i3];
                        i3++;
                    }
                }
            }
        }
        return merge;
    }
    
}