//WAP to count set bits of a no.
package DAY6;
import java.util.Scanner;
public class QUESTION23 {
    public static void main(String[] args) {
        System.out.println("enter num to count set bits");
        Scanner Sc = new Scanner(System.in);
        int num=Sc.nextInt();
        String binary ="";
        if(num==0){
            binary ="0";
        }
        else{
            while (num>0) {
                binary+=num%2;
                num=num/2;
                 }        
        }
      int n = binary.length();
      int count =0;
      for(int i=0;i<n;i++){
        if(binary.charAt(i)=='1'){
            count++;
        }
}
System.out.println("no. of set bits:"+count);
      
      Sc.close();
    }
}

