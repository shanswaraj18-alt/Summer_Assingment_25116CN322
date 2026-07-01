package DAY30;
import java.util.*;
public class LibrarySystem {
    String Name;
    String AdmNum;
    String issueBook;
    String returnBook;
ArrayList<String> library=new ArrayList<>();
LibrarySystem(String Name,String AdmNum,String issueBook,String returnBook){
    this.Name=Name;
    this.AdmNum=AdmNum;
    this.issueBook=issueBook;
    this.returnBook=returnBook;

library.add("head first Java");
library.add("Java The Complete Reference");
library.add("Effective Java");
library.add("Java:5");}

void display(){
    System.out.println("Name: "+Name);
    System.out.println("AdmNum: "+AdmNum);
    System.out.println("issued Book: "+issueBook);
    System.out.println("returned BOOK: "+returnBook);
}
void issueBook(){
     System.out.println("enter the name of of the book to be issued");
   Scanner sc =new Scanner(System.in);
   String bookToIssue=sc.nextLine();
   boolean found =false;
   for(String book :library){
    if(book.equalsIgnoreCase(bookToIssue)){
        issueBook=bookToIssue;
        found =true;
        library.remove(issueBook);
        break;
    }}if(found!=true){
        System.out.println("book is not available");
        System.out.println("available books are:");
        System.out.println(library);
        issueBook=null;
    }
    returnBook=null;
}
void returnBook(){
System.out.println("enter the book name to be returned");
Scanner sc=new Scanner(System.in);
String returnedBook=sc.nextLine();
returnBook=returnedBook;
library.add(returnBook);
    System.out.println("available books are:");
    System.out.println(library);
    issueBook =null;
}
}

