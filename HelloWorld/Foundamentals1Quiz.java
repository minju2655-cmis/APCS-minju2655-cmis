import java.util.Scanner;
public class Foundamentals1Quiz
{
    public static void main(String args[]){
        Scanner Scan = new Scanner (System.in);
        int in_1 = Scan.nextInt();
        int in_2 = Scan.nextInt();
        int in_3 = Scan.nextInt();
        System.out.println(method1(in_1, in_2, in_3));
        int in_4 = Scan.nextInt();
        int in_5 = Scan.nextInt();
        System.out.println(method2(in_4,in_5));
        int in_6 = Scan.nextInt();
        int in_7 = Scan.nextInt();
        System.out.println(method3(in_6,in_7));
    }
    public static int method1(int a, int b, int c){
        int product = 0; 
        int product1 = 0; 
        int product2 = 0; 
        if (a >= b && a >= c){
            product1 = a; 
            if (b >= c){
                product2 = b; 
            }else{
                product2 = c; 
            }
        }else if (b >= a && b >= c){
            product1 = b; 
            if (a >= c){
                product2 = a; 
            }else{
                product2 = c; 
            }
        }else if (c >= a && c >= b){
            product1 = c; 
            if (b >= a){
                product2 = b; 
            }else{
                product2 = a; 
            }
        }
        product = product1 * product2; 
        return product; 
    }
    public static int method2(int a, int b){
        int count = 0; 
        if (a > 0) {
            for (int i = 0; i <= a; i++){
                count += i * b;
            }        
        }else {
            count = 0; 
        }
        return count; 
    }
    public static String method3(int h, int w){
        String count = ""; 
        String count2 = ""; 
        if (h % 2 == 1 && w % 2 == 1){
            for (int a = 0; a < h; a++){
                if (a == (int)h/2){
                    for (int c = 0; c <= (int)h/2; c++){
                        count2 += "-";
                    }
                    count += count2 + "+" + count2; 
                }else{
                    for (int b = 0; b < w; b++){
                        if (b == (int)w/2){
                            count += "|";
                        }
                        count += " ";  
                    }                
                }
                count += "\n";
            }
        }else {
            count += "+"; 
        }
        return count; 
    }
}
