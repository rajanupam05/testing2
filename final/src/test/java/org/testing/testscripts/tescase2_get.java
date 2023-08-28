package org.testing.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.httpmethods;
import org.testing.utilities.jsonparsingusingorgjson;
import org.testing.utilities.propertieshandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class tescase2_get 
{
	@Test
	public static void tc2() throws FileNotFoundException, IOException
	{
		Properties pr=propertieshandle.loadpropertieshandle("../final/uri.properties");
		httpmethods http=new httpmethods(pr);
		http.get("def");
	}
	@Test
	public static void tc3() throws FileNotFoundException, IOException
	{
		Properties pr=propertieshandle.loadpropertieshandle("../final/uri.properties");
		httpmethods getall=new httpmethods(pr);
		Response res=getall.getall("def");
		jsonparsingusingorgjson.jsonparse(res.asString(), "id");
	}
}
