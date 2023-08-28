package org.testing.utilities;

import java.util.regex.Pattern;

import io.restassured.response.Response;

public class replacevalue 
{
	public static String replace(String variablename, String responsedata, String variablevalue)
	{
		return responsedata.replaceAll(Pattern.quote("{{"+variablename+"}}"), variablevalue);
	}
}
