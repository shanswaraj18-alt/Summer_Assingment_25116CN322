package DAY27;
public class SALARYMANG {
    int id;
    String name;
    double basicSalary, hra, da, grossSalary;
    SALARYMANG(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;}
    void calculateSalary() {
        hra = basicSalary * 0.20;  
        da = basicSalary * 0.10;    
        grossSalary = basicSalary + hra + da;
    }

    // Display Details
    void display() {
        System.out.println(" Salary Details ");
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }
}


    

