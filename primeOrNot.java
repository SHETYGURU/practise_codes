package ownuse;
import java.util.*;
public class primeOrNot {

	public static void main(String[] args) {
		boolean t= false;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		num =sc.nextInt();
		
		for (int i = 2; i <(num / 2)+1; i++) 
		{
			if(num%i==0)
			{
				t=true;
				break;
			}
		/*	'''else {'
				't=false;''*/
				
			}
		
			if(!t)
			{
				System.out.println("prime");
			}
			else
				System.out.println("not prime");
		
		// TODO Auto-generated method stub

	}

}
