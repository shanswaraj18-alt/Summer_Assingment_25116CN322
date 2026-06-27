package DAY27;

import java.util.Scanner;

public class QUESTION107 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        SALARYMANG emp = new SALARYMANG(id, name, basicSalary);

        emp.calculateSalary();
        emp.display();

        sc.close();
    
}
}