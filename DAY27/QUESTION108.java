package DAY27;

import java.util.Scanner;

public class QUESTION108 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        MARKSHEET[] m=new MARKSHEET[5];
        for(int i=0;i<5;i++){
            System.out.println("enter names");
            String name = sc.nextLine();
            System.out.println("enter roll");
            String roll =sc.nextLine();
            System.out.println("enter course");
            String course=sc.nextLine();
            m[i]=new MARKSHEET(name,roll,course);
            m[i].inputmarks();
            m[i].generateMarksheet();
        }
        sc.close();
    }
    
}
