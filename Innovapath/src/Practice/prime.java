package Practice;

public class prime {
public static void main(String[] args) {
	int i;
	int j;
	int k;
	boolean prm;
	for
	(i=3;i<=100;i++)
	{
		 prm=true;
		for 
		(j=2;j<=i-1;j++)
		{
			k=i%j;
		if (k==0) 
		{
			prm=false;
			}
		/*System.out.println("i:" + i +"j:" + j + "k:" + k + "prm:" + prm);*/
		}
		if (prm) {System.out.println("This no. is prime no."+ i);}
		}
}
}
