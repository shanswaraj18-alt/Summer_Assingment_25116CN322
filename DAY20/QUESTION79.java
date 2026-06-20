//WAP to find row wise sum
package DAY20;
import java.util.Scanner;
public class QUESTION79 {
    public static void main(String[] args) {
        int[][] matrix1 = new int[4][4];
        System.out.println("enter value in matrix1");
        Scanner Sc =new Scanner(System.in); 
         for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.println("enter value at index"+i+","+j);
               matrix1[i][j]=Sc.nextInt();
              }
        }
    int[] rowSum=new int[matrix1.length];
     for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
            rowSum[i]+=matrix1[i][j];
            }
     }
     for(int i=1;i<=matrix1.length;i++){
        System.out.println("sum of row"+i+"is:"+rowSum[i]);
     }
   Sc.close();
}
}