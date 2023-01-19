package ownuse;

import java.util.Scanner;

public class bpattern {
	

	public static void main(String[] args) {
		int n, i, j, sp = 1;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        sp = n - 1;
        for (j = 1; j <= n; j++) 
        {
            for (i = 1; i <= sp; i++) 
            {
                System.out.print(" ");
            }
            sp--;
            for (i = 1; i <= 2 * j - 1;
            		i++) 
            {
                System.out.print(i);                
            }
            System.out.println("");
        }
        sp = 1;
        for (j = 1; j <= n - 1; j++) 
        {
            for (i = 1; i <= sp; i++) 
            {
                System.out.print(" ");
            }
            sp++;
            for (i = 1; i <= 2 * (n - j) - 1; i++) 
            {
                System.out.print(i);
            }
            System.out.println("");
	    
		// TODO Auto-generated method stub

	}
	}
}
