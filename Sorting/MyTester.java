public class MyTester
{
    public static void main(String[] args){
        ArrayType at = ArrayType.RANDOM; //SORTED, RANDOM, or REVERSED
        int n = 100000;
        int[] array = Util.getArray(n, at);
        int[] tmp = array;
        long start, stop, btime, itime, stime, mtime;
        long totaltime=0;
        int runs;
        System.out.format("%d Unsorted Integers\n", n);
        for (runs=0;runs<100;runs++){
            start = System.nanoTime();
            SelectionSort.sort(array);
            btime = System.nanoTime() - start;
            totaltime+=btime;
            array=tmp;
        }
        long avgtime=(long)(totaltime/(double)runs);
        System.out.println("AverageTime: "+ avgtime+"\n");
    }
}
