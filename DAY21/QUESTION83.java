//WAP to program to count vowel and consonants
package DAY21;

public class QUESTION83 {
    public static void main(String[] args) {
        String str = "ShanSwaraj";
        int n=str.length();
        int countVowel =0;
        int countConsonant=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                countVowel++;
            }
            else{
                countConsonant++;
            }
        }
        System.out.println("total vowel count:"+countVowel);
        System.out.println("total consonant count:"+countConsonant);
    }
    
}
