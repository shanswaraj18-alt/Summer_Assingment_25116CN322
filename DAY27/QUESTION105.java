//WAP to create student record management system
package DAY27;
import java.util.*;
public class QUESTION105{  
    public static void main(String[] args) {
       Scanner Sc =new Scanner(System.in);
       ArrayList<Student> list =new ArrayList<>();
       System.out.println("enter name");
       String name=Sc.nextLine();
       System.out.println("enter course");
       String course =Sc.nextLine();
       System.out.println("enter rolll no.");
       int rollNo = Sc.nextInt();
       System.out.println("enter marks");
       double marks = Sc.nextInt();
       Student s1=new Student(name, course, rollNo, marks);
       list.add(s1);
       System.out.println("student record");
       for(Student s :list){
        s.Display();
        Sc.close();
       }
    }
    
    
}
