//WAP to find string length without strlen()
package DAY21;

public class QUESTION81 {
    public static void main(String[] args) {
        String str = "ShanSwaraj";
        int count =0;
        for(int i:str.toCharArray()){
            count ++;
        }
        System.out.println("length of array is:"+count);
    }
    
}
