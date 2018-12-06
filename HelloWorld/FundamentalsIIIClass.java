import java.util.Arrays;
public class FundamentalsIIIClass{
    public static void main(String[] args){
        int[][] array1 = {{606, -11778, 14724, 19623},
                {-9474, 12334, 2791, -13518},
                {-13681, -8397, -6940, -726},
                {-2978, 7212, 2201, 6735}};

        int[][] array2 = {{-11882, -4377, 5226, -664, -1108, 7142, 2017},
                {7071, -8942, -13904, -17035, -2606, -11831, -13766},
                {-12234, -9534, -15779, 13615, 10270, -6859, 6361},
                {-6033, -549, -15958, 17019, -9666, -4876, -6368}};

        int[][] array3 = {{-5487, -18628, 3365, -14728, 10979},
                {-11403, 13387, -10335, -10113, -12000},
                {-10585, -18889, 15515, -16093, -6097},
                {-17722, 9392, -13208, -17901, -6223},
                {-14081, -10776, -6435, -13976, 2823},
                {-13029, -8753, -5213, -3666, 13910},
                {16639, -11206, -14375, 8119, -9044},
                {7253, -11243, -9436, -14244, -15883}};
        System.out.println(allGreater(array3,-100000));
        System.out.println(Arrays.deepToString(invertSign(array2,false)));
        System.out.println(Arrays.deepToString(swapColumns(array1,2,3)));

    }
    public static boolean allGreater(int[][] array, int threshold){
        for (int y=0;y<array.length;y++){
            for (int x=0;x<array[0].length;x++){
                if (array[y][x]<=threshold){
                    return false;
                }
            }
        }
        return true;
    }
    public static int[][] invertSign(int[][] array, boolean positive){
        int[][] array1= new int[array.length][array[0].length];
        for (int y=0;y<array.length;y++){
            for (int x=0;x<array[0].length;x++){
                if (positive==true && array[y][x]<0){
                    array1[y][x]=-(array[y][x]);
                }
                else if (positive==false && array[y][x]>0){
                    array1[y][x]=-(array[y][x]);
                }
                else{
                    array1[y][x]=array[y][x];
                }
            }
        }
        return array1;
    }
    public static int[][] swapColumns(int[][] array, int c1, int c2){
        int[][] output= new int[array.length][array[0].length];
        for (int y=0;y<array.length;y++){
            for (int x=0;x<array[0].length;x++){
                if (x==c1){
                    output[y][x]=array[y][c2];
                }
                else if (x==c2){
                    output[y][x]=array[y][c1];

                } 
                else{
                    output[y][x]=array[y][x];
                }
            }

        }
        return output;
    }
}// end class HelloWorld 