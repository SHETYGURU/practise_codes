package ownuse;
import java.util.*;
public class Reversingnuber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n= sc.nextLong();
		long rev =0;
		int cnt=0;
		while(n!=0)
		{
			rev=rev*10+n %10;
			n/=10;cnt++;}
			System.out.println(String.format("%0"+cnt+"d\n",rev));
			
		
		
	}

}
