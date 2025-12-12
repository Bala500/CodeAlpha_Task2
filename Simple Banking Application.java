import java.util.Scanner;
public class Task2{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        double balance=0.0;
        boolean exit = false;
        while (!exit) {
        	System.out.println("Banking Application Menu : \n1.Deposit Amount\n2.Amount Withdraw\n3.Check Balance\n4.Exit");
            System.out.print("Choose an option: ");
            int choice = s1.nextInt();
            switch (choice)
            {
            case 1: 
                System.out.print("Enter amount to deposit: ");
                double deposit = s1.nextDouble();
                if (deposit > 0) {
                    balance += deposit;
                    System.out.println("Successfully deposited:" + deposit);
                    System.out.println("----------------");
                } else {
                    System.out.println("Invalid amount. Please enter a positive number.");
                }
                break;
            	case 2:
            		System.out.println("Cash Withdraw");
            		double withdraw=s1.nextDouble();
            		if(withdraw > 0)
            			balance -= withdraw;
                	System.out.println("Cash Withdraw Succesfully");
                	System.out.println("----------------");
                	{
                		System.out.println("Invaild Amount");
                	}
                	break;
            	case 3:
                	System.out.println("Available Balance :"+balance);
                	System.out.println("----------------");
                	break;
            	case 4: 
                    exit = true;
                    System.out.println("Exiting the application...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            	
            }    
            
        }
    }
}
