package Practice;

public class MainBank {

	public static void main(String[] args) {
	/*CitiBank citi=new CitiBank();
	System.out.println(citi.getRateofInterest());
	
	ChaseBank chase=new ChaseBank();
	System.out.println(chase.getRateofInterest());*/
	
		Bank b=new CitiBank();
		System.out.println(b.getRateofInterest());
		
		Bank b1=new CitiBank();
		b1=(Bank)b1;
		System.out.println(b1.getRateofInterest());

		Bank b2=new ChaseBank();
		System.out.println(b2.getRateofInterest());
		

	}

}
