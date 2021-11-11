package praticeWithJava;
import java.util.Scanner;

public class Lattery
{
    public static void main (String args[])
    {
    getNumber();	
    }
  public static void getNumber()
  {
	  Scanner sc=new Scanner(System.in);
	  int a,b;
	  a=sc.nextInt();
	  b=sc.nextInt();
	  if(a+b<=10)
	  {
		  System.out.println("flase");
	  }
	  else
	  {
		  System.out.println("true");
	  }
  }
      
}
