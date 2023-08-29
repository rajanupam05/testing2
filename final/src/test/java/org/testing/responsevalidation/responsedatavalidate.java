package org.testing.responsevalidation;

import org.testing.assertion.softassertionforresponsedata;
import org.testing.utilities.jsonparsingusingjsonpath;
import org.testing.utilities.jsonparsingusingorgjson;

import io.restassured.response.Response;
import junit.framework.Assert;

public class responsedatavalidate 
{
	public static void responsevalidate(String jsonpath, Response res, String expecteddata)
	{
		String actualvalue=jsonparsingusingjsonpath.jsonparse(jsonpath, res);
		Boolean response=softassertionforresponsedata.assertion(expecteddata, actualvalue);
		Assert.assertTrue(response);
	}
}
