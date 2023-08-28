package org.testing.teststeps;

import java.util.Properties;

import org.testing.utilities.propertieshandle;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class httpmethods 
{
	static Properties pr;
	public httpmethods(Properties pr)
	{
		this.pr=pr;
	}
	public static Response post(String urikeyname, String responsedata)
	{
		String urivalue=pr.getProperty(urikeyname);
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(responsedata)
				.when()
				.post(urivalue);
		
		///////////System.out.println(res.statusCode());
		System.out.println(res.asString());
		return res;
	}
	public static Response get(String urikeyname)
	{
		String urivalue=pr.getProperty(urikeyname);
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(urivalue);
		
		////////System.out.println(res.statusCode());
		System.out.println(res.asString());
		return res;
	}
	public static Response getall(String urikeyname)
	{
		String urivalue=pr.getProperty(urikeyname);
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(urivalue);
		
		///System.out.println(res.statusCode());
		///System.out.println(res.asString());
		return res;
	}
	public static void getparticular(String urikeyname, String endpoint)
	{
		String urivalue=pr.getProperty(urikeyname)+"/"+endpoint;
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(urivalue);
		
		System.out.println(res.asString());
	}
}
