/*Title: Bank Account Management System using Arrays in Core Java

Problem Statement:
Write a Java program to manage bank accounts using arrays. The program should allow the user to:

Create new bank accounts.

View all bank accounts.

Deposit money into an account.

Withdraw money from an account (if balance is sufficient).

Search for an account by account number.

The system should store a maximum of 100 accounts using arrays (no collections or database).

Requirements:

Use a BankAccount class with:

accountNumber (int)

accountHolderName (String)

balance (double)

Use an array of BankAccount objects in the main program.

Implement a simple menu-driven interface.

*/



import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		int n,choice;
		Double amt;
		String h;
		Scanner sc=new Scanner(System.in);
		BankAccount[] b =new BankAccount[100];
		int count=0;
		while (true) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Search Account");
            System.out.println("5. Display All");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				System.out.println("Enter the Bank details :--->>");
				System.out.println("Account Number :");
				n=sc.nextInt();
				sc.nextLine();
				System.out.println("Account Holder ");
				h=sc.nextLine();
				b[count]=new BankAccount(n,h);
				count++;
				System.out.println("Act Created !!!");
				break;
				
				case 2:
				System.out.println("Enter the act No :");
				n=sc.nextInt();
				BankAccount actdep=BankAccount.search(b,n);
				if(actdep==null)
				{
					System.out.println("No account is found");
				}
				else
				{
					System.out.println("Enter the amount :");
					amt=sc.nextDouble();
					actdep.deposit(amt);
					System.out.println("Deposit sussecfully !!!");
				}
				break;
				
				case 3:
				System.out.println("Enter the act No :");
				n=sc.nextInt();
				BankAccount actwith=BankAccount.search(b,n);
				if(actwith==null)
				{
					System.out.println("No account is found");
				}
				else
				{
					System.out.println("Enter the amount :");
					amt=sc.nextDouble();
					actwith.withdrawn(amt);
					System.out.println("Withdrawn sussecfully !!!");
				}
				break;
				
				case 4:
				System.out.println("Enter the act No :");
				n=sc.nextInt();
				BankAccount s=BankAccount.search(b,n);
				if(s==null)
				{
					System.out.println("Not found ");
				}
				else 
				{
					s.display();
				}
				break;
				
				case 5 :
				for(int i=0;i<count;i++)
				{
					b[i].display();
				}
				break;
				
				case 6:
				System.out.println("EXITTTTT !!!!!!!!! ");
				sc.close();
				return ;
								
				default:
				System.out.println("Invalid choice !!!!");
				break;
				
			}
		}
	}
}