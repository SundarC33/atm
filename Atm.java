package atmProject;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int balance =10000,withdraw,deposit;//initialize
     
    Scanner sc= new Scanner(System.in);
    
    while(true)
    {
    	System.out.println("Automated Teller Machine");
    	System.out.println("Choose 1 for Withdraw");
    	System.out.println("Choose 2 for deposit");
    	System.out.println("Choose 3 for check Balance");
    	System.out.println("Choose 4 for Exit");
    	System.out.println("choose the operation you want to perform");
    	
    	int choice = sc.nextInt();//get choice from user
    		switch(choice)	
    		{
    		case 1:
    			System.out.println("Enter money to be withdraw");
    			withdraw = sc.nextInt();//get withdraw money from user
    			
    			if(balance>=withdraw)
    			{
    				balance = balance-withdraw;
    				System.out.println("Please collect your money");
    			}
    			else
    			{
    				System.out.println("insufficient Balance");
    			}
    			System.out.println("");
    			break;
    			
    		case 2:
    			System.out.println("Enter money to be deposit");
    			deposit = sc.nextInt();
    			balance = balance+deposit;
    			System.out.println("your money has been successfully deposited");
    			System.out.println("");
    			break;
    			
    		case 3:
    			System.out.println("Balance:"+balance);
    			System.out.println("");
    			break;
    		case 4:
    			System.exit(0);
    		}
    		
    }
    
	}
}
