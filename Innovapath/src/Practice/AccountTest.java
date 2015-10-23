package Practice;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Account a1=new Account();
Account a2=new Account();



a1.deposit(200);
System.out.println(a1.getaccountBalance());
a2.deposit(500);
System.out.println(a2.getaccountBalance());
a1.withdraw(180);
System.out.println(a1.getaccountBalance());


	}

}
