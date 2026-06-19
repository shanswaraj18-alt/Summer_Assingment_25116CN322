//WAP to find diagonal sum
package DAY19;
import java.util.Scanner;
public class QUESTION76 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the row or col len of matrix: ");
        int n =Sc.nextInt();
        int[][] matrix1=new int[n][n];
       System.out.println("enter values in matrix1:");
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.println("enter value at index:"+i+","+j);
            matrix1[i][j]=Sc.nextInt();
        }
       }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                 sum +=matrix1[i][i];
                }
                if(i+j==n-1){
                    sum+=matrix1[i][j];}
                }
            }
                   if(n%2!=0){
                         sum=sum-matrix1[n/2][n/2];
                        }
    

System.out.println("sum of both diagonal of matrix is :"+sum);
Sc.close();
    }}