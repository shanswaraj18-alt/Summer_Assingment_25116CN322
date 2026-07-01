package DAY30;

public class Q119 {
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

