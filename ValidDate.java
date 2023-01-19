package ownuse;
import java.util.*;

public class ValidDate {

	int max =9999;
	int min =1000;
	public static boolean  IsLeap(int year)
	{    
		return((year%4==0)&&(year%100!=0)||(year%400==0));
		
	}
	public static boolean IsValid(int d,int m,int y)
	{int max =9999;
	int min =1000;
		if(y>max || y<min)
			return false;
		if(m<1||m>12)
			return false;
		if(m==2)
		{
			if(IsLeap(y))
				return (d<=29);
			else 
				return(d<=28);
			
		}
		if(m==4||m==6||m==9||m==11)
			return(d<=30);
		if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
			return(d<=31);
		return true;
			
	}
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in) ;
		ValidDate  i = new ValidDate();
		int d,m,y;
		System.out.println("enterr the date :(date,month,year)");
		d= sc.nextInt();
		m=sc.nextInt();
		y=sc.nextInt();
		if(i.IsValid(d,m,y))
			if(d>0&&m>0&&y>0)
			{
			System.out.println("valid date ");
			}
		else 
			System.out.println("not a valid date");
			
		
		
		// TODO Auto-generated method stub

	}

}
