//WAP to linear search
package DAY14;
import java.util.Scanner;
public class QUESTION53 {
    public static void main(String[] args) {
        int[] arr={1,4,3,5,7,6,9,8};
        System.out.println("enter the element to search:");
        Scanner Sc =new Scanner(System.in);
        int searchElement=Sc.nextInt();
        if(linearSearch(searchElement, arr)){
            System.out.println("search element is present in array");
        }
        else{
            System.out.println("search element is not present in array");
        }
        Sc.close();
    }
    static boolean linearSearch(int searchElement,int[] arr){    
        int count=-1;
        for(int i:arr){
            count++;
            if(i==searchElement){
                count++;
                return true;
            }
            }
            return false;
    }
}
