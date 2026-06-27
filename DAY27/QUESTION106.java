package DAY27;

import java.util.Scanner;

public class QUESTION106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        // Create Employee object
        Employee emp = new Employee(id, name, salary);

        // Display details
        emp.display();

        sc.close();
    }
}
    
