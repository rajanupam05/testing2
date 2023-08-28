package org.testing.assertion;

public class softassertionresponsecode 
{
	public static Boolean assertion(int expectedvalue, int actualvalue)
	{
		if(expectedvalue==actualvalue)
		{
			System.out.println("**********code matched**********");
			return true;
			
		}
		else
		{
			System.out.println("**********code not matched*********");
			return false;
		}
		
	}
}
