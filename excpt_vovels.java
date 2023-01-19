package ownuse;
import java.util.*;
//import java.util.Scanner;

public class excpt_vovels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		str=sc.next();
		//outer :
			for(int j=1;j<=str.length();j++) {
		for(int i=0;i<str.length();i++)
			
		{
		if("aeiouAEIOU".contains(""+str.charAt(i)))
			continue ;//outer;
		
		
		 System.out.print(str.charAt(i));
		}
			}
	}

}
