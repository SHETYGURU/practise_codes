package ownuse;

import java.util.Scanner;
import java.lang.*;
public class leniar_search2 {
	public boolean contains(CharSequence sequence)
	{
	   return indexOf(sequence.toString()) >-1;
	}

	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		String s,s1;
		s= sc.nextLine();
		System.out.println("enter word");
		s1=sc.nextLine();
		 System.out.println(s.contains(s1));
		
		// TODO Auto-generated method stub

	}

}
