/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,temp;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.print(a);
		System.out.print(" ");
		System.out.print(b);
	}
}
