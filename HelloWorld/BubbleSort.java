public class BubbleSort
{
    public static void main(String[] args){
        int[] array = getArray(20, true);
        print(array);
        sort(array);
        print(array);
    }
    public static int[] sort(int[] array){
        int[] array1 = new int[array.length];
        boolean swapped=true;
        for(int s = 0; s < array.length; s++){
            if (swapped){
                if (array[s]>array[s+1]){
                    array1[s]=array[s+1];
                }
                else{
                    s++;
                }
            }
            else{
                s++;
            }
        }
        return array1; 
    }
    public static int[] getArray(int w, boolean random){
        int[] array = new int[w];
        int ct = 0;
        for(int i = 0; i < w; i++){
            if(random)
                array[i] = (int)(Math.random() * 20000) * (Math.random() > 0.4 ? -1 : 1);
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
