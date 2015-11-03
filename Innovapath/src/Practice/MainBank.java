package Practice;

public class MainBank {

	public static void main(String[] args) {
	/*CitiBank citi=new CitiBank();
	System.out.println(citi.getRateOfInterest());
	
	ChaseBank chase=new ChaseBank();
	System.out.println(chase.getRateOfInterest());*/
	
		Bank b=new CitiBank();
	System.out.println(b.getRateofInterest());
		
		Bank b1=new CitiBank();
		b1=(CitiBank)b1;
		System.out.println(b1.getRateofInterest());



	}

}
