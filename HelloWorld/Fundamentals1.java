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
       
        System.out.printf("%n %n");
        Scanner userInput = new Scanner(System.in);//import java.util.Scanner
        System.out.println("Two numbers for multiplication:");
        int mulA = userInput.nextInt();
        int mulB = userInput.nextInt();
        int mulResult = multiply(mulA,mulB);
        System.out.println("The multiplication of two numbers is: " + mulResult);
        
        System.out.printf("%n %n");
        System.out.println("Two numbers for division:");
        int divA = userInput.nextInt();
        int divB = userInput.nextInt();
        int divResult = divide(divA,divB);
        System.out.println("The division of two numbers is: " + divResult);
        userInput.close();
        
        System.out.printf("%n %n");
        compare(5,7);
        System.out.printf("%n");
        compare(15,4);
        System.out.printf("%n");
        compare(9,9);
        
        System.out.printf("%n %n");
        System.out.println("evenOddZero for your number is: " + evenOddZero(5));
        System.out.println("evenOddZero for your number is: " + evenOddZero(10));
        System.out.println("evenOddZero for your number is: " + evenOddZero(0));
        
        System.out.printf("%n %n");
        sqaureTable();

        
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
        String a1="Byte data type is an 8-bit signed two's complement integer. (-128 to 127) \nThree examples - Number of students in a class / Number of fingers / Test score out of 100 ";
        String s1="Short data type is a 16-bit signed two's complement integer. (-32768 to 32767) \nExample - Anything that is - (byte < x < int and long) / ";
        String i1="Int data type is a 32-bit signed two's complement integer. (-2147483648 to 2147483647) \nExample - Anything that is (byte and short < x <int) /  ";
        String l1="Long data type is a 64-bit signed two's complement integer. (-9223372036854775808 to 9223372036854775807) \nExample - Anything that is (byte and short and int < x) ";
        String f2="Float data type is a single-precision 32-bit IEEE 754 floating point. (3.40282347 * 10^38 to 1.40239846 * 10^-45) \nThree examples - Few decimals of pi / GPA / Fraction";
        String d2="Double data type is a double-precision 64-bit IEEE 754 floating point. (1.7976931348623157 * 10^308 to 4.9406564584124654  * 10^-324) \nExamples - Anything that is (float < x) ";
        String one1="Boolean data type represents one bit of information. (0 or 1 (true or false)) \nThree examples - Sibling or no sibling / Grade 11 or not Grade 11 / Born in 2001 or not born in 2001 ";
        String letterA1="Char data type is a single 16-bit Unicode character. (0 to 65535) \nThree examples - First name / Last name / Letter grades ";
        String order="Smallest to Biggest: boolean(1bit) / byte(8bit) / short(16bit) / char (16bit) / int(32bit) / float(32bit) / long(64bit) / double(64bit)";
        System.out.format("%d %d %d %d %f %f %b %c %n %n%s %n%s %n%s %n%s %n%s %n%s %n%s %n%s %n%s",a,s,i,l,f1,d1,one,letterA,a1,s1,i1,l1,f2,d2,one1,letterA1,order); //or System.out.format
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
            System.out.printf("The value of a is %d and and it is greater than b whose value is %d", a, b);
        }
        else if (a<b){
            System.out.printf("The value of a is %d and and it is less than b whose value is %d",a , b);
        }
        else if (a==b){
            System.out.printf("The value of a is %d and and it is eqaul to b whose value is %d",a, b);
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
    public static void sqaureTable(){
        int count;
        for (count =1; count <=10; count++)
        {
            int sq=count*count;
            int random=(int)(Math.random()*((sq-count)+1))+count;
            System.out.format("%d\t%d\t%d\n",count,sq,random);
        }
    }
    public static void checkerboard(int height, int width){
        String a = "+";
        for (int w = width; w>0; w--)
        {
            a += "-";
        }
        a+="+";
        String d = "";
        int random = (int)(Math.random()*10);
        int hrandom = (int)(Math.random()/2);
        hrandom = hrandom*2+1;
        int wrandom = (int)(Math.random()/2);
        wrandom = wrandom*2+1;
        for (int h = 0; h < height; h++)
        {
            if (h%2 == 1)
            {
                d += "|";
                for (int w = 0; w < width; w++)
                {
                    if (w%2 ==1 && w == hrandom && h == hrandom)
                        d += String.format("%d",random);
                    else if (w%2 == 1)
                        d += "#";
                    else if (w%2 == 0)
                        d += " ";
                }
                d += "|\n";
            }
            if (h%2 == 0)
            {
                d += "|";
                for (int w = 0; w < width; w++)
                {
                    if (w%2 == 0 && w == hrandom && h ==hrandom)
                        d += String.format("%d",random);
                    if (w%2 == 0)
                        d += "#";
                    else if (w%2 == 1)
                        d += " ";
                }
                d += "|\n";
            }
        }
        System.out.println(a);//Top Boarder
        System.out.print(d); //Middle
        System.out.print(a);//Bottom Boarder
    }
}// end class Fundamentals1 
