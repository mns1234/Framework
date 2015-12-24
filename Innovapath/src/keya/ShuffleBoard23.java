package keya;


import java.util.Scanner;                                                    //import Scanner
public class ShuffleBoard23                                                    //class header
{
  String name;                                                        //field variables
  int score=0;
  int score1=0;
  int score2=0;
  int position;
  int cycle;
  
  public static void main(String [] args)                                    //main method header
  {
      ShuffleBoard23 sb2 = new ShuffleBoard23();                                //instantiate ShuffleBoard class
      ShufflePlayer sp1 = new ShufflePlayer("A");                            //instantiate and call on                                 //ShufflePlayer class and constructor
      ShufflePlayer sp2 = new ShufflePlayer("B");                            //instantiate and call on                                 //ShufflePlayer class and constructor
      sb2.playingSurface1();                                                //call playingSurface1() method
      sb2.pushBiscuit();                                                    //call pushBiscuit() method
  }
  
  public void playingSurface1()                                            //playingSurface1 method header
  {
      System.out.print("A");                                                //print out the board using for loop
      for(cycle= 1; cycle<=10; cycle++)
      {
          if(cycle<=6)
          System.out.print("\t-");
          else if(cycle==7)
          System.out.print("\t10");
          else if(cycle==8)
          System.out.print("\t8");
          else if(cycle==9)
          System.out.print("\t7");
          else if(cycle==10)
          System.out.print("\t-10");
      }
  }
  public void pushBiscuit()                                                //pushBiscuit method header
  {
      Scanner userInput = new Scanner(System.in);                            //make a new Scanner
      System.out.println("\nA's score is "+score1+".");                    //print out score //before game which is 0
      System.out.println("B's score is "+score2+".");                    //print out score before //game which is 0

	if(score1==score2)
	System.out.println("No one is winning");
	else if(score1>score2)
	System.out.println("A is winning");
	else if(score2>score1)
	System.out.println("B is winning");
	for(int odd=1; odd<=6; odd++)
	{
    if(odd%2==1)
	{
	name = "A";
	}
    else
    {
    	name = "B";
    }

      System.out.println("" + name +" press enter to push your biscuit.");            //prompt user //to press enter
      userInput.nextLine();                                                //use Scanner to read next line
      position = (int)(Math.random()*10 + 1);                                //generate a random number
	System.out.println("\nRandom number is "+position+".");            //print out the random //number
	
	String v0 = "-";
	String v1 = "-";
	String v2 = "-";
	String v3 = "-";
	String v4 = "-";
	String v5 = "-";
	String v6 = "-";
	String v7 = "10";
	String v8 = "8";
	String v9 = "7";
	String v10 = "-10";
	
	if(position==1)
	v1=name;
	else if(position==2)
	v2=name;
	else if(position==3)
	v3=name;
	else if(position==4)
	v4=name;
	else if(position==5)
	v5=name;
	else if(position==6)
	v6=name;
	else if(position==7)
	v7=name;
	else if(position==8)
	v8=name;
	else if(position==9)
	v9=name;
	else if(position==10)
	v10=name;
	System.out.print("-");
	System.out.print("\t"+v1);
	System.out.print("\t"+v2);
	System.out.print("\t"+v3);
	System.out.print("\t"+v4);
	System.out.print("\t"+v5);
	System.out.print("\t"+v6);
	System.out.print("\t"+v7);
	System.out.print("\t"+v8);
	System.out.print("\t"+v9);
	System.out.print("\t"+v10);
	
ShuffleBoard23 sb2 = new ShuffleBoard23();                                
sb2.updateScore(odd);      
      }

}
	public void updateScore(int x)
	{
	if(1<=position && position<=6)                                        //use if else to determine the score
      score = 0;
      else if(position==7)
      score = 10;
      else if(position==8)
      score = 8;
      else if(position==9)
      score = 7;
      else if(position==10)
      score = -10;
	if(x%2==1)
	score1 += score;
	else
	score2 += score;

      System.out.println("\nA's score is "+score1+".");                //print score
      System.out.println("B's score is "+score2+".");                  

		if(score1==score2)
		System.out.println("No one is winning");
		else if(score1>score2)
		System.out.println("A is winning");
		else if(score2>score1)
		System.out.println("B is winning");
		}		
}