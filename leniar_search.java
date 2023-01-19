package ownuse;

import java.util.Scanner;

public class leniar_search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		String a[] = new String[n];
		a[0]=sc.nextLine();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextLine();
		}
		System.out.println("enter word");
		String s=sc.nextLine();
		for(int i=0;i<n;i++)
		{
			if(a[i].equals(s))
			{
				System.out.println("found in "+(i+1));
				System.exit(0);
			}
			else 
				System.out.println("not found");
		}
		// TODO Auto-generated method stub

	}

}
