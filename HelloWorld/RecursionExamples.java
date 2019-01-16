public class RecursionExamples{
    public static void main(String[] args){
        method(-20);
        System.out.println("\n"+multiply(4,3));
        System.out.println("\n"+divide(9,3));
    }
    public static void method(int arg){
        System.out.println(arg);
        if (arg!=0){
            method(arg+1);
        }
    }
    public static int multiply(int a, int b){
        if (b==1){
            return a;
        }
        else if (b==0 || a==0){
            return 0;
        }
        else {
            return a + multiply(a,b-1);
        }
    }
    public static int divide(int a, int b){
        if (a==0){
            return a;
        }
        else if (b==1){
            return a;
        }
        else{
            return;
        }
    }
}