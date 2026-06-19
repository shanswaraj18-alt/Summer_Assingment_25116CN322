//WAP FOR TRANSPOSE OF A MATRIX
package DAY19;
import java.util.Scanner;
public class QUESTION75 {
    public static void main(String[] args) {
        int[][] matrix1=new int[4][4];
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter value in matrix:");
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.println("enter value at index:"+i+","+j);
                matrix1[i][j] = Sc.nextInt();
            }
        }
        //inplace transpose
        for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
           int temp=matrix1[i][j];
           matrix1[i][j]=matrix1[j][i];
           matrix1[j][i]=temp;
            }
        }
         // print 
         System.out.println("transpose of give matrix is:");
         for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.print(" "+matrix1[i][j]);
            }
            System.out.println();
         } 
         Sc.close();
    }
    
}
