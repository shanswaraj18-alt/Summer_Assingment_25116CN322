package DAY10;
public class QUESTION40 {
   public static void main(String[] args) {
    for(int i=1;i<=5;i++){
        for(int j=5;j>i;j--){
           System.out.print(" ");
        }
        for(int k=65;k<65+i;k++){
            char a =(char)k;
            System.out.print(a);
        }
        for(int s=64+i-1;s>=65;s--){
            char b =(char)s;
           System.out.print(b);
        }
        System.out.println();
    }
   }    
}
