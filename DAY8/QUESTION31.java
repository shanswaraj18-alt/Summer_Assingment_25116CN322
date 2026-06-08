//WAP to print character triangle
package DAY8;
public class QUESTION31 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=65;j<65+i;j++){
                char d =(char)j; 
                System.out.print(d);
            }
            System.out.println();
        }
    }
}
