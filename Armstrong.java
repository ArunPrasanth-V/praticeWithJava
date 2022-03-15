import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int value=s.nextInt();
		int rem,sum=0;
		int fin=value;
		while(value>0)
		{
		    rem=value%10;
		    value=value/10;
		    sum=sum+rem*rem*rem;
		}
	   if(fin==sum)
	   {
	       System.out.println("Armstrong number");
	   }
	   else{
	       System.out.println("Not a Armstrong number");
	   }
	}
}
