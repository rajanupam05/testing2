package org.testing.assertion;

public class softassertionforresponsedata 
{
	public static Boolean assertion(String expecteddata, String actualdata)
	{
		if(actualdata.equals(expecteddata))
		{
			System.out.println("############ data matched ############");
			return true;
		}
		else
		{
			System.out.println("########## data not matched ###########");
			return false;
		}
	}
}
