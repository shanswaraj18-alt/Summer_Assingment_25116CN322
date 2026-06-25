//WAP to find common characters in strings
package DAY25;

public class QUESTION98 {
    public static void main(String[] args) {
        String str1 ="shan";
        String str2="swaraj";
        int[] freqArr1 =new int[26];
        int[] freqArr2 =new int[26];
        for(int i=0;i<str1.length();i++){
            char ch1 = str1.charAt(i);
            int index1=ch1-'a';
            freqArr1[index1]++;}
        for(int i=0;i<str2.length();i++){   
            char ch2 = str2.charAt(i);
            int index2 = ch2-'a'; 
            freqArr2[index2]++;
        }
        for(int i=0;i<26;i++){
            if(freqArr1[i]>0&&freqArr2[i]>0){
                char commonChar=(char)(i+97);
                System.out.println("common character: "+commonChar);
            }
        }
    }
    
}
