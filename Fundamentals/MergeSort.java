public class MergeSort{
    public static void main(String[] args){
        int[] array = getArray(5, true);
        print(array);
        int[] sorted = sort(array);
        print(sorted);
    }
    public static int[] sort(int[] array){
        //BASE CASE
        if(array.length <= 1){
            return array;
        }
        //SPLIT STEP
        int half = array.length / 2;
        int[] front = new int[half];
        int[] back = new int[array.length - half];
        for(int i = 0; i < array.length; i++){
            if(i < half){
                front[i] = array[i];
            }else{
                back[i - half] = array[i];
            }
        }
        //MERGESORT STEP
        front  = sort(front);
        back = sort(back);
        int fi = 0;
        int bi = 0;
        //MERGE STEP
        for(int i = 0; i < array.length; i++){
            if((bi >= back.length) || (fi < front.length  &&  front[fi] < back[bi])){
                array[i] = front[fi];
                fi++;
            }else{
                array[i] = back[bi];
                bi++;
            }
        }
        return array;
    }
    
    public static int[] getArray(int w, boolean random){
        int[] array = new int[w];
        int ct = 0;
        for(int i = 0; i < w; i++){
            if(random)
                array[i] = (int)(Math.random() * 20000) - 10000;
            else
                array[i] = ct++;
        }
        return array;
    }

    public static void print(int[] array){
        String out = "{";
        for(int i = 0; i < array.length; i++){
            out += array[i];
            if( i != array.length -1)
                out+=", ";
        }
        out+= "}\n";
        System.out.println(out);
    }
}