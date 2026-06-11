///WAP to write function to find sum of two number
package DAY11;
import java.util.Scanner;
public class QUESTION41 {
    static int sumOfTwo(int x,int y){
        int sum = x +y;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("enter the two no. to get sum of:");
        Scanner Sc = new Scanner(System.in);
        int x =Sc.nextInt();
        int y = Sc.nextInt();
        System.out.println("sum of two no. is");
        System.out.println(sumOfTwo(x, y));
        Sc.close();
    }
    
}
