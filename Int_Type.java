package ownuse;

import java.util.*;

public class Int_Type {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num= sc.nextInt();
		if(num<0)
			System.out.println("negative number");
		else if(num>0)
			System.out.println("positive number");
		else
			System.out.println("zero");
		
		
	}
	

}
