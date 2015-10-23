package Practice;

public class minus {

public int sub()
{
	int firNum=30;
	int secNum=40;
	int min=firNum-secNum;
	return min;
}
public int sub(int a, int b)
{
	return a-b;
}
public int sub(int a, int b,int s)
{
	return a-b-s;
}
public static void main(String[] args) {
	minus neg=new minus();
	int call=neg.sub();
	int call1=neg.sub(50,20 );
	int call2=neg.sub(100, 20, 10);
	System.out.println("the minus no.is: "+call);
	System.out.println("the minus no.is: "+call1);
	System.out.println("the minus no.is: "+call2);
}
}
