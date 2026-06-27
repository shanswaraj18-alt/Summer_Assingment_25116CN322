//WAP to create student record management system
package DAY27;
public class Student {
    String name;
    String course;
    int rollNo;
    double marks;
//costructor    
public Student(String name,String course,int rollNo,double marks){
      this.name=name;
      this.course =course;
      this.rollNo=rollNo;
      this.marks =marks;
}
void Display(){
    System.out.println("Name "+name);
    System.out.println("roll "+rollNo);
    System.out.println("course "+course);
    System.out.println("marks "+marks);
}



}
