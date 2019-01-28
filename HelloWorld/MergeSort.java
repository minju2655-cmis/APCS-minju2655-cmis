public class MergeSort{
    public static void main (String[] args){
        int[] list = {1, 7, 5, 7, 9, 3, 4, 2, 1};
        int[] a = Split(list,true);
        print(Split(list, true));
        int[] b= Split(list,false);
        print(Split(list, false));
        print(Merge(a,b));
        //MergeSort(list);
    }

    public static void print(int[] array){
        for(int i : array){
            System.out.println(i);
        }
        System.out.println();
    }

    public static int[] Split(int[] array, boolean bool) {
        int[] half;
        if(array.length % 2 != 0 && bool == false){ 
            half = new int[(array.length/2) + 1];
        }
        else{
            half = new int[(array.length/2)];
        }
        if(bool == true){
            for (int i = 0; i < (array.length/2); i++) {
                half[i] = array[i];
            }
        }
        else if (bool == false){
            int x = array.length/2;
            if(array.length % 2 != 0){
                for (int i = 0; i < (array.length/2) + 1; i++) {
                    half[i] = array[x];
                    x++;
                }
            }
            else{
                for (int i = 0; i < array.length/2; i++) {
                    half[i] = array[x];
                    x++;
                }
            }
        }
        return half;
    }

    public static int[] Merge(int[] arr1, int[] arr2) {
        int[] sorted = new int[arr1.length + arr2.length];
        int x = 0;
        int y = 0;
        int xy=0;
        int a=arr1.length;
        int b=arr2.length;
        for (int i = 0; i < sorted.length; i++) {     
            if (arr1[x] <= arr2[y]) {
                sorted[i] = arr1[x];
                x++;
                sorted[xy]=arr1[x];;
                xy++;
            }
            else  {
                sorted[i] = arr2[y];
                y++;
                sorted[xy]=arr2[y];;
                xy++;
            }
        }
        return sorted;
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
    
}

