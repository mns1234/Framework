package Practice;



public class Calc {
	public int addition()
	{
		int firstNum=6;
		int secNum=7;
		int addition=firstNum+secNum;
		return addition;		
	}
	
	public int newone(int i, int s)
	{
		return i + s;
	}
	
	public int newone(int a, int b, int c)
	{
		return a+b+c;
	}
	
	public double newone(int w, double q)
	{
		return w+q;
	}
	
	
	
	public static void main(String[] args) {
		Calc sum=new Calc();
		double newone1=sum.newone(2, 3);
		double newone2=sum.newone(3, 3.3);
		double newone3=sum.newone(22, 8, 9);	
		//int well=sum.addition();
		System.out.println("the addtion : "+newone1);
		System.out.println("the addtion is: "+newone2);
		System.out.println(" addtion is: "+newone3);
		
		
		
		
		
		
}
}