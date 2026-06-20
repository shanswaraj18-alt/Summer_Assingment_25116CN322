//WAP to find column wise sum
package DAY20;
import java.util.Scanner;
public class QUESTION80 {
     public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        System.out.println("enter value in matrix");
        Scanner Sc =new Scanner(System.in); 
         for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.println("enter value at index"+i+","+j);
               matrix[i][j]=Sc.nextInt();
              }
        }
    int[] colSum=new int[matrix[1].length];
     for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
            colSum[i]+=matrix[j][i];
            }
     }
     for(int i=1;i<=matrix[1].length;i++){
        System.out.println("sum of col"+i+"is:"+colSum[i]);
     }
   Sc.close();
}
}   

