package Practice;

public class MethodOverloading {	
	int firstnum=6;
	int secondnum=11;
	
	public int addition(){
		int sum=firstnum+secondnum;
		return sum;		
	}
	public int addition(int a, int b){
		return a+b;
	}
	public int addition(int a, int b, int c){
		return a+b+c;
	}
	public static void main(String[] args) {
MethodOverloading m=new MethodOverloading();
int sum1=m.addition();
int sum2=m.addition(2, 3);
int sum3=m.addition(4,5,6);
System.out.println("the sum :"+sum1);
System.out.println("the sum :"+sum2);
System.out.println("the sum :"+sum3);

	}

}
