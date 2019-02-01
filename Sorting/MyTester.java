public class MyTester
{
    public static void main(String[] args){
        ArrayType at = ArrayType.RANDOM; //SORTED, RANDOM, or REVERSED
        int n = 100;
        int[] array = Util.getArray(n, at);
        int[] tmp = array;
        long start, stop, btime, itime, stime, mtime;
        long btotaltime=0;
        long btotalsteps=0;
        long stotaltime=0;
        long stotalsteps=0;
        long itotaltime=0;
        long itotalsteps=0;
        long mtotaltime=0;
        long mtotalsteps=0;
        int runs;
        System.out.format("%d Unsorted Integers\n", n);
        
        for (runs=0;runs<100;runs++){
            tmp=array;
            start = System.nanoTime();
            BubbleSort.sort(array);
            btime = System.nanoTime() - start;
            btotaltime+=btime;
            btotalsteps+=BubbleSort.steps;
            BubbleSort.steps=0;
            
            array=tmp;
            start = System.nanoTime();
            SelectionSort.sort(array);
            stime = System.nanoTime() - start;
            stotaltime+=stime;
            stotalsteps+=SelectionSort.steps;
            SelectionSort.steps=0;
            
            tmp=array;
            start = System.nanoTime();
            InsertionSort.sort(array);
            itime = System.nanoTime() - start;
            itotaltime+=itime;
            itotalsteps+=InsertionSort.steps;
            InsertionSort.steps=0;
            
            array=tmp;
            start = System.nanoTime();
            MergeSort.sort(array);
            mtime = System.nanoTime() - start;
            mtotaltime+=mtime;
            mtotalsteps+=MergeSort.steps;
            MergeSort.steps=0;
            
            array=Util.getArray(n,at);
        }
        long bavgtime=(long)(btotaltime/(double)runs);
        long bavgsteps=(long)(btotalsteps/(double)runs);
        System.out.println("AverageTimeBubbleSort: "+ bavgtime);
        System.out.println("AverageStepsBubbleSort: "+ bavgsteps);
        
        long savgtime=(long)(stotaltime/(double)runs);
        long savgsteps=(long)(stotalsteps/(double)runs);
        System.out.println("AverageTimeSelectionSort: "+ savgtime);
        System.out.println("AverageStepsSelectionSort: "+ savgsteps);
        
        long iavgtime=(long)(itotaltime/(double)runs);
        long iavgsteps=(long)(itotalsteps/(double)runs);
        System.out.println("AverageTimeInsertionSort: "+ iavgtime);
        System.out.println("AverageStepsInsertionSort: "+ iavgsteps);
       
        long mavgtime=(long)(mtotaltime/(double)runs);
        long mavgsteps=(long)(mtotalsteps/(double)runs);
        System.out.println("AverageTimeMergeSort: "+ mavgtime);
        System.out.println("AverageStepsMergeSort: "+ mavgsteps +"\n");
    }
}
