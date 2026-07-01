package DAY30;
    public class Employee{
    int id;
    String name;
    double salary;
    // Constructor
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Display employee details
    void display() {
        System.out.println("Employee ID : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : " + salary);
        System.out.println();
    }

    public static void main(String[] args) {
        Employee[] emp = new Employee[3];

        emp[0] = new Employee(101, "Aman", 30000);
        emp[1] = new Employee(102, "Riya", 35000);
        emp[2] = new Employee(103, "Rahul", 40000);

        for (int i = 0; i < emp.length; i++) {
            emp[i].display();
        }
    }
    }
