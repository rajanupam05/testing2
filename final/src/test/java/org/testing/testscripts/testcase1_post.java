package org.testing.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.teststeps.httpmethods;
import org.testing.utilities.jsonhandle;
import org.testing.utilities.jsonparsingusingorgjson;
import org.testing.utilities.propertieshandle;
import org.testing.utilities.replacevalue;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class testcase1_post 
{
	static String returnidvalue;
	@Test
	public void tc1() throws FileNotFoundException, IOException
	{
		Properties pr=propertieshandle.loadpropertieshandle("../final/uri.properties");
		String responsedata=jsonhandle.loadjsonfile("../final/src/test/java/org/testing/resources/request.payload.json");
		Random r=new Random();
		Integer input=r.nextInt();
		String data=replacevalue.replace("id", responsedata, input.toString());
		httpmethods http=new httpmethods(pr);
		Response res=http.post("def", data);
		returnidvalue=jsonparsingusingorgjson.jsonparse2("id", res.asString());
	}
}
