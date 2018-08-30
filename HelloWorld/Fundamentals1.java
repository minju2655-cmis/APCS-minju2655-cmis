import java.util.Scanner;
public class Fundamentals1
{
    public static void main ( String args[] ){
        dataTypes();
        
        System.out.printf("%n %n");
        int numbers = add(3,4);
        System.out.println("The addition of two arguments is: " + numbers);
        int random = multiply(54,67);
        System.out.println("The multiplication of two arguments is: " + random);
       
        //System.out.printf("%n %n");
        //Scanner userInput=new Scanner(System.in);
        //int sub = userInput.subtract();
        //System.out.println("The multiplication of two arguments is:" +  userInput.subtract);
        //userInput.close();
        
        System.out.printf("%n %n");
        compare(5,7);
        
        System.out.printf("%n %n");
        int odd = evenOddZero(5);
        System.out.println("evenOddZero for your number is: " + odd);
        int even = evenOddZero(10);
        System.out.println("evenOddZero for your number is: " + even);
        int zero = evenOddZero(0);
        System.out.println("evenOddZero for your number is: " + zero);

        
    } // end method main
    public static void dataTypes(){
        byte a = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;
        float f1 = 234.5f;
        double d1 = 123.4;
        boolean one = true;
        char letterA = 'A';
        String a1="Byte data type is an 8-bit signed two's complement integer. Used to save space in large arrays, mainly in place of integers, since a byte is four times smaller than an integer. Three examples - ";
        String s1="Short data type is a 16-bit signed two's complement integer. Used to save memory as byte data type. A short is 2 times smaller than an integer. Three examples -";
        String i1="Int data type is a 32-bit signed two's complement integer. Used as the default data type for integral values unless there is a concern about memory. Three examples -";
        String l1="Long data type is a 64-bit signed two's complement integer. Used when a wider range than int is needed. Three examples -";
        String f2="Float data type is a single-precision 32-bit IEEE 754 floating point. Never used for precise values such as currency. Three examples - ";
        String d2="Double data type is a double-precision 64-bit IEEE 754 floating point. Never be used for precise values such as currency. Three examples - ";
        String one1="Boolean data type represents one bit of information. Used for simple flags that track true/false conditions. Three examples - ";
        String letterA1="Char data type is a single 16-bit Unicode character. Used to store any character. Three examples - ";
        System.out.format("%d %d %d %d %f %f %b %c %n %n%s %n%s %n%s %n%s %n%s %n%s %n%s %n%s",a,s,i,l,f1,d1,one,letterA,a1,s1,i1,l1,f2,d2,one1,letterA1); //or System.out.format
        //code the problems here
    }
    public static int add(int a, int b){
        int result=a+b;
        return result;
    }
    public static int subtract(int a, int b){
        int result=a-b;
        return result;
    }
    public static int multiply(int a, int b){
        int result=a*b;
        return result;
    }
    public static int divide(int a, int b){
        int result=a/b;
        return result;
    }
    public static double add(double a, double b){
        double result=a+b;
        return result;
    }
    public static double subtract(double a, double b){
        double result=a-b;
        return result;
    }
    public static double multiply(double a, double b){
        double result=a*b;
        return result;
    }
    public static double divide(double a, double b){
        double result=a/b;
        return result;
    }
    public static void compare(int a, int b){
        if (a>b){
            System.out.printf("The value of %d is this and and it is greater than %d whose value is this", a, b);
        }
        else if (a<b){
            System.out.printf("The value of %d is this and and it is less than %d whose value is this",a , b);
        }
        else if (a==b){
            System.out.printf("The value of %d is this and and it is eqaul to %d whose value is this",a, b);
        }
    }
    public static int evenOddZero(int a){
        if (a==0){
            return 0;
        }
        else if (a%2==0||a==-1){
            return -1;
        }
        else {
            return 1;
        }
    }    
   
} // end class Fundamentals1 