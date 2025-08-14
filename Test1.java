class BankAccount
{
	int accountNumber;
	String accountHolderName;
	double balance=0.0;
	
	BankAccount(int actno, String actName)
	{
		this.accountNumber=actno;
		this.accountHolderName=actName;
	}
	
	public void display()
	{
		System.out.println("Account Number : "+ accountNumber +" & accountHolder is "+ accountHolderName +" has balance "+ balance);
	}
	
	public void deposit(double money)
		{
			if(money>0)
			{
				balance+=money;
				System.out.println("Balance increased : "+ balance);
			}
			System.out.println("Balance is Normal :"+ balance);
		}
		
		public void withdrawn(double money)
		{
			if(money>0 )
			{
				balance-=money;
				System.out.println("Balance decreased : "+ balance);
			}
			System.out.println("Balance is Normal :"+ balance);
		}
		
		public static BankAccount search(BankAccount[] b, int accountNumber)
		{
			for(BankAccount bala : b)
			{
				if(bala != null && bala.accountNumber==accountNumber)
				{
					return bala;
				}
			}
			return null;
		}
		
}