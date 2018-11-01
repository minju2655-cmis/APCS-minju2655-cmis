public class Sdf
{
    public static void main ( String args[] )
    {
        System.out.println( "Hello everyone out there!");

    } // end method main
    public static int[] merge(int[] a, int[] b){
        int s = 0;
        int l = 0;
        int[] ab;
        int[] out = new int[a.length + b.length];
        if (a.length <= b.length){
            s = a.length;
            l = b.length;
            ab = b;
        }else {
            s = b.length;
            l = a.length;
            ab = a;
        }
        for (int i = 0; i < s * 2; i++){
            if (i % 2 == 0){
                out[i] = a[i / 2];
            }else {
                out[i] = b[i/2];
            }
        }
        for (int i = s * 2; i < out.length; i++){
            int k = i - s;
            out[i] = ab[k];
        }
        return out;
    }

    public static int[] merge2(int[] a, int[] b)
    {
        int [] result = new int [a.length + b.length];
        int aPosit = 0;
        int bPosit = 0;
        int mid;
        if (a.length <= b.length)
            mid = a.length;
        else 
            mid = b.length;
        for (int resultPosit = 0; resultPosit < mid * 2; resultPosit += 2)
        {
            result [resultPosit] = a [aPosit];
            result [resultPosit + 1] = b [bPosit];
            aPosit ++;
            bPosit ++;
        }
        int jay = mid * 2;
        if (a.length <= b.length)
            for (int bP = mid; bP < b.length; bP ++)
            {
                result [jay] = b[bP];
                jay ++;
            }
        else
            for (int aP = mid; aP < a.length; aP ++)
            {
                result [jay] = a[aP];
                jay ++;
            }

        return result;
    }
} // end class HelloWorld 