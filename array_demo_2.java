package ownuse;

import java.util.Scanner;

public class array_demo_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		
		int n,temp;
		
	//	int []b1,b2,b3;
		//int c1[],c2,c3;
		n=sc.nextInt();
		int  a1[] = new int[n];
		//a1[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a1[i]=sc.nextInt();
		
		}
		
		
		for(int i=0;i<n/2;i++)
		{
			
		
			a1[i]=(a1[i]+a1[n-i-1])-(a1[n-i-1]=a1[i]);
	}
		for(int i=0;i<n;i++)
		{
			 System.out.println(a1[i]);
		}
		
		// TODO Auto-generated method stub

	}

}
