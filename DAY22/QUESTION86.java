//WAP to count words in a sentence
package DAY22;

public class QUESTION86 {
    public static void main(String[] args) {
        String sentence="My name is Shan"; 
        int j=0;
        int count =1;
        while(j<sentence.length()){
            if(sentence.charAt(j)==' '){
                count++;
            }
            j++;
        }
        System.out.println("total word in sentence is:"+count);
    }
}
