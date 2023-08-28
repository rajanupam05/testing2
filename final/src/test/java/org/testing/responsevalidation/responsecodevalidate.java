package org.testing.responsevalidation;

import junit.framework.Assert;

public class responsecodevalidate 
{
	public static void responsevalidate(int expectedvalue, int actualvalue)
	{
		Assert.assertEquals("******code not matched********", expectedvalue, actualvalue);
		System.out.println("*********code matched*******");
	}
}
