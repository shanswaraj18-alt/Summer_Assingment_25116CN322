package DAY30;

import java.util.Scanner;

public class Q118 {
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        System.out.println("enter Name :");
        String name =Sc.nextLine();
        System.out.println("Admission number:");
        String admNum =Sc.nextLine();
System.out.println("choose the following optiion:");
    System.out.println("1.issueBook");
    System.out.println("2.returnBook");
    System.out.println("3.exit");
    String choose=Sc.nextLine();
LibrarySystem lib= new LibrarySystem(name, admNum, "","");
switch (choose){
    case "1": 
         lib.issueBook();
         lib.display();
    break;
    case "2":
         lib.returnBook();
         lib.display();
    break;
    case "3":
          System.out.println("exit");
    break;
    default:System.out.println("invalid choice");
}
Sc.close();
    }
}