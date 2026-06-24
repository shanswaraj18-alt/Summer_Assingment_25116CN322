//WAP to remove duplicate characters
package DAY24;

public class QUESTION96 {
    public static void main(String[] args) {
        String str= "shanswaraj";
        StringBuilder sb =new StringBuilder();
        sb.append(str);
        for(int j=0;j<sb.length();j++){
        for(int i=j+1;i<sb.length();i++){
            if(sb.charAt(j)==sb.charAt(i)){
                sb.deleteCharAt(i);
                i--;
               }
           }
       }
    System.out.println("string on removing duplicate is:"+sb.toString());

    }
}
