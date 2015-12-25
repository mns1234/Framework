// a. Write a program that is expected to throw a null pointer exception and in turn handles
//it using try catch and finally.
public class ExceptionHandling {

	public static void main(String[] args) {
		try{String s=null;
		System.out.println(s.concat("Keya"));
		}
		catch(NullPointerException e){
		//	e.printStackTrace();
			System.out.println("really?");
		}
		finally{
			System.out.println("It is ok now");
		}
		
	}

}
