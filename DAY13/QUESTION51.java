//WAP to find largest and smallest element
package DAY13;
public class QUESTION51 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2,6};
        System.out.println("smallest element is:");
        int minValue = Integer.MAX_VALUE;
        for(int i:arr){
            if(minValue>i){
                minValue =i;
            }
        }
        System.out.println(minValue);
        System.out.println("largest element is:");
        int maxValue =Integer.MIN_VALUE;
        for(int i :arr){
        if(maxValue<i){
            maxValue=i;
        }
        }
        System.out.println(maxValue);
}
}
