package com;

public class Demo 
{
public static void main(String[] args)
{System.out.println("stsart");
	int a= 10;
	int b= 0;
	try
	{
	System.out.println(a/b);
	}
	catch(Exception e)
	{
		System.out.println("invalid denominator");
	}
	System.out.println("end");
}
}
