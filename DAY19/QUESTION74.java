//WAP for subtraction of matrix;
package DAY19;
import java.util.Scanner;
public class QUESTION74{
    public static void main(String[] args) {
        int[][] mat1 =new int[4][4];
        int[][] mat2=new int[4][4];
        int[][] result =new int[4][4];
    System.out.println("enter value in matrix1");
    Scanner Sc =new Scanner(System.in);
    for(int i=1;i<=3;i++){
        for(int j=1;j<=3;j++){
            System.out.println("AT INDEX: "+i+","+j);
            mat1[i][j] =Sc.nextInt();
        }
    }
    System.out.println("enter value in matrix2");
    for(int i=1;i<=3;i++){
        for(int j=1;j<=3;j++){
            System.out.println("AT INDEX: "+i+","+j);
            mat2[i][j] =Sc.nextInt();
      
    }
}
     System.out.println("resultant matrix is:");
     for(int i=1;i<=3;i++){
        for(int j=1;j<=3;j++){
         result[i][j] = mat1[i][j] - mat2[i][j];
         System.out.print(result[i][j]+" ");
        }
        System.out.println();
    }
    Sc.close();
}}
    
