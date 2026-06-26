//WAP to create ATM simulation
package DAY26;
import java.util.*;
public class QUESTION103 {
    public static void main(String[] args) {
        int choice=0;
        int balance = 100000;
        while(choice!=4){
        Scanner Sc =new Scanner(System.in);
        System.out.println("choose:");
        System.out.println("1.check balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
        choice=Sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println(balance);
                break;
            case 2:
                System.out.println("enter deposit amount");
                int depositAmount=Sc.nextInt();
                balance+=depositAmount;
                System.out.println("amount deposited");    
                break;
            case 3:
                System.out.println("enter withdraw Amount");
                int withdrawAmount=Sc.nextInt();
                System.out.println("amount withdrawn");
                balance-=withdrawAmount;
                break;
            case 4:
                System.out.println("Thank You");
                Sc.close();
                break;        
            default:
                System.out.println("invalid option entered");
                break;}
        }
    
    }
    
}
