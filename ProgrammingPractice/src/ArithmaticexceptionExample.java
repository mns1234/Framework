
/*b. Write a program containing a function which is expected to throw any
 kind of exception say NullPointerException or ArithmeticException etc 
 and then handle this function in the parent function which calls this function.*/
public class ArithmaticexceptionExample {
	static int d;
	static int s;

	public static void calc () throws ArithmeticException {
		 d=50;
		 s=0;
	 int f=d/s;

		
	
	}

	public static void main(String[] args) {

		try{
			ArithmaticexceptionExample.calc();
		}
catch(ArithmeticException e){
	e.printStackTrace();
	}
		catch(Exception e){
			
		}

}
}