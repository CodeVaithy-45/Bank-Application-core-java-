


public class BankApplication {
private int Account_number;
private String name;
private String Email;
private String Phone_number;
private double balance;
private int cibil_score;

public BankApplication(int Account_number, String name, String Email, String Phone_number, double balance, int cibil_score) {
	// TODO Auto-generated constructor stub
	this.Account_number=Account_number;
	this.name=name;
	this.Email=Email;
	this.Phone_number=Phone_number;
	this.balance=balance;
	this.cibil_score=cibil_score;
}
// Method To Deposit Money
public void depositmoney(double  money) {
	this.balance+=money;
	System.out.println(this.name+" Your Amount Is Deposited!!! And Your New Amount Is "+this.balance);
}

// MethodTo WithDraw Money
public void withdraw(double money) {
	if((this.balance-money<0)||(money>this.balance)) {
		System.out.println("Withdraw Unsuccessfull "+this.balance+" is Left");
	}
	else {
		this.balance-=money;
		System.out.println("Withdrawn Amount is "+money);
	}
}
public void setAccount_number(int Account_number) {
	this.Account_number=Account_number;
}
public int getAccount_number() {
	System.out.println(this.Account_number);
	return Account_number;
}
public String getName() {
	System.out.println(this.name);
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	System.out.println(this.name);
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPhone_number() {
	System.out.println(this.Phone_number);
	return Phone_number;
}
public void setPhone_number(String phone_number) {
	Phone_number = phone_number;
}
//   Method To Get Balance
public double getBalance() {
	System.out.println(this.name +" Your Balance Is "+this.balance);
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

   // Method to  Get Cibil Score
public int getcibil_score() {
	System.out.println("Your Cibil Score is "+this.cibil_score);
	return cibil_score;
}
public void setcibil_score(int cibil_score) {
	this.cibil_score = cibil_score;
} 
       // Method To Check Personal loan Eligible Or Not
public void  loanEligibleCheck() {
	if(cibil_score<5) {
		System.out.println("Your Not Eligible For Personal Loan !!!! Your Cibil Score is Low");
	}
	else {
		System.out.println(" Your are Eligible For Personal Loan ");
	}
}
}
class Account_acess{
public static void main(String[] args) {
	BankApplication account=new BankApplication(545452,"vaithesh","vaithy@gmail.com","8883912273",500.00,8);
	account.depositmoney(1000);
	account.withdraw(400);
	account.getBalance();
	account.getcibil_score();
	account.loanEligibleCheck();
	System.out.println("-------------------------------------------------------------------------------------------");
	System.out.println("-------------------------------------------------------------------------------------------");
	BankApplication account1=new BankApplication(5464846,"vasanth","vasanth@gmail.com","7397562616",500.00,4);
	account1.depositmoney(50000);
	account1.withdraw(400);
	account1.getBalance();
	account1.getcibil_score();
	account1.loanEligibleCheck();
	System.out.println("-------------------------------------------------------------------------------------------");
	System.out.println("-------------------------------------------------------------------------------------------");
	BankApplication account2=new BankApplication(5485485,"Arun Kumar","ArunKumar@gmail.com","73978562616",500.00,6);
	account2.depositmoney(1000);
	account2.withdraw(400);
	account2.getBalance();
	account2.getcibil_score();
	account2.loanEligibleCheck();


}
}
