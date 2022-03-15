import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int rem,sum=0;
		int fin=num;
		while(num>0)
		{
		    rem=num%10;
		    num=num/10;
		    sum=sum*10+rem;
		    
		    
		}
		if(fin==sum)
		{
		    System.out.println("palindrome");
		}
		
		else {
		    System.out.println("Not palindrome");
		}
		
		
	}
	}

