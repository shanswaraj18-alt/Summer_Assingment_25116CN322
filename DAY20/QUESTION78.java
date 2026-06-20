//WAP to check symmetric matrice
package DAY20;
import java.util.Scanner;
public class QUESTION78 {
    public static void main(String[] args) {
        int[][] matrix1 =new int[4][4];
        System.out.println("enter value in matrix1");
        Scanner Sc =new Scanner(System.in);
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
              System.out.println("enter value at index:"+i+","+j);
                matrix1[i][j]= Sc.nextInt();
            }
        }
        boolean IsSymmetric =true;
         for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
            if(matrix1[i][j]!=matrix1[j][i]){
                IsSymmetric=false;
            }
            }
        }
        if(IsSymmetric==true){
            System.out.println("matrix is symmetric");
        }else{
            System.out.println("matrix is not symmetric");
        }
        Sc.close();
    }
}
