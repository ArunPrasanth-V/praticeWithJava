giimport java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int rem;
		while(num>0)
		{
		rem=num%10;
		System.out.print(rem);
		num=num/10;
		}
		
}
}

