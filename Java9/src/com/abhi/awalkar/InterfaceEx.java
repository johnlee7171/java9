package com.abhi.awalkar;


interface util
{
	default int getNumberOfCore()
	{
		return helper();
	}
	
	static int foo()
	{
		return helper2();
	}
	
	private int helper()
	{
		return 7;
	}
	private static int helper2()
	{
		return 9;
	}
}
public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ok");
	}

}
