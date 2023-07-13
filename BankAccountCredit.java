class BankAccountCredit{
public static void main(String args[]){
	BankAccount.credit(10000);
	double currentBalance1=BankAccount.getBalance();
	System.out.println(currentBalance1);
	BankAccount.debit(300);
	double currentBalance=BankAccount.getBalance();
	System.out.println(currentBalance);
	BankAccount.getBalance();
	BankAccount.credit(2000);
	BankAccount.credit(2000);
	BankAccount.credit(400);
	System.out.println(BankAccount.getBalance());



}


}