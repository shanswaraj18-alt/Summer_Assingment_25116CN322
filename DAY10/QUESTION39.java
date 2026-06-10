package DAY10;
public class QUESTION39 {
  public static void main(String[] args) {
    for(int i=1;i<=5;i++){
        for(int j=5;j>i;j--){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
           System.out.print(k);
        }
        for(int s=i-1;s>=1;s--){
            System.out.print(s);
        }
        System.out.println();
    }
  }    
}
