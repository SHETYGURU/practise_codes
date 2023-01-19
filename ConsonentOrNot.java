package ownuse;

import java.util.Scanner;

public class ConsonentOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a charecter");
		char ch ,ch1 ;
		Scanner sc =  new Scanner(System.in) ;
		ch1= sc.next().charAt(0);
	     ch= Character.toLowerCase(ch1);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			System.out.println("not consonent");
		else 
			System.out.println(" consonent");

	}

}
