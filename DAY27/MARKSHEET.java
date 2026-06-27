//WAP for marksheet generation
package DAY27;
import java.util.*;
public class MARKSHEET {
     String name;
     String roll;
     String course;

    MARKSHEET(String name,String roll,String course){
        this.name =name;
        this.roll=roll;
        this.course =course;
    }
    ArrayList<Integer> marks=new ArrayList<>(); 
    Scanner Sc=new Scanner(System.in);  
    void inputmarks(){    
       for(int i=0;i<5;i++){
        System.out.println("enter marks of sub "+i);
        marks.add(Sc.nextInt());
       }
    }
    void generateMarksheet(){
    int total =0;
    double percentage =0;
    for(int i:marks){
        total+=i;
    }
    percentage =total/5;
    System.out.println("Name "+name);
    System.out.println("Roll "+roll);
    System.out.println("Course "+course);
    System.out.println("Toatal marks"+total);
    System.out.println("percentage"+percentage+"%");
    }


    }


