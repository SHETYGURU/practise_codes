package ownuse;
import java.util.*;
public class pattern_matching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println();
		String str =sc.nextLine();
		int len = str.length();
		
	
		for(int i=len;i>=1;i--)
			System.out.println(String.format("%-"+len+"."+i+"s"+"%"+len+"."+i+"s\n",str,str));
		for(int i=1;i<=len;i++)
			System.out.println(String.format("%-"+len+"."+i+"s"+"%"+len+"."+i+"s\n",str,str));
		
	}
}
