import java.util.Arrays;
public class FundamentalsIII
{
    public static void main ( String args[] )
    {
        //System.out.println(Arrays.toString(array(10,10)));
    } // end method main
    public int[][] array(int h, int w){
        int [][] array2d = new int[h][w];
        for (int y=0; y<h;y++){
            for (int x=0; x<w;x++){
                int v = array2d[y][x];
                System.out.print(v + " ");
            } 
            System.out.println();
        }
        return array2d;
    }

} // end class HelloWorld 