package org.testing.responsevalidation;

import org.testing.assertion.softassertionresponsecode;

import io.restassured.response.Response;
import junit.framework.Assert;

public class responsecodesoftvalidate 
{
	public static void response(Response res,int expectedvalue)
	{
		Boolean response=softassertionresponsecode.assertion(expectedvalue, res.statusCode());
		Assert.assertTrue(response);
	}
}
