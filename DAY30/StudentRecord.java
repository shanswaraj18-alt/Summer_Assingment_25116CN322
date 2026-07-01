package DAY30;
public class StudentRecord {
    String name;
    String AdmNum;
    String Course;
 StudentRecord(String name,String AdmNum,String Course){
    this.name=name;
    this.AdmNum=AdmNum;
    this.Course=Course;
 }
void display(){
       System.out.println("name: "+name);
       System.out.println("AdmNum: "+AdmNum);
       System.out.println("course: "+Course);
       System.out.println();}
}
