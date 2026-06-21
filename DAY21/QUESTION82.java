//WAP to reverse a string
package DAY21;

public class QUESTION82 {
    public static void main(String[] args) {
        String str = "Shan";
        StringBuilder sb = new StringBuilder();
        int n= str.length();
        for(int i=0;i<n;i++){
            char temp =str.charAt(n-1-i);
            sb.append(temp);
        }
        System.out.println(sb.toString());
    }
    
}
