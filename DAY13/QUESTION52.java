//WAP to count even and odd element
package DAY13;
public class QUESTION52 {
    public static void main(String[] args){
    int[] arr={2,5,6,4,7,8,12,45,36};
    int evenCount=0;
    int oddCount=0;
    for(int i:arr){
        if(i%2==0){
            evenCount++; 
        } 
        else{
            oddCount++;
        }
    }
    System.out.println("no. of even elements in array:"+evenCount);
    System.out.println("no. of odd elements in array:"+oddCount);
    } 

    }
    

