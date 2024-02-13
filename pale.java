package inter;

import java.util.Scanner;

public class pale
{
static Scanner d=new Scanner(System.in);
public static void main(String[] args) {
	String rev="";
	System.out.println("enter the string");
	String s=d.nextLine();
	for(int i=s.length()-1;i>=0;i--)
	{
		    rev=rev+s.charAt(i);                               
	}
	System.out.println(rev);
	//System.out.println(rev.equalsIgnoreCase(s));
	if((rev).equals(s))
	{
		System.out.println("It is a palondrome");
	}else
		System.out.println("It is not a palondrome");
}
}
