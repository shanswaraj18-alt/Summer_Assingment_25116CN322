package DAY30;
public class Question117 {
    public static void main(String[] args) {
        StudentRecord[] S =new StudentRecord[5];
      S[0]=new StudentRecord("goldi", "25116CN320","PG");
      S[1]=new StudentRecord("shan", "25116CN322", "Btech");
      S[2]=new StudentRecord("Rishab", "25116CN325", "Btech");
      int n=S.length;
      for(int i=0;i<n;i++){
        S[i].display();
      }
    }
    
}
