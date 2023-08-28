package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class jsonparsingusingorgjson 
{
	public static void jsonparse(String responsedata, String keyname)
	{
		JSONArray array=new JSONArray(responsedata);
		int l=array.length();
		for(int i=0; i<l; i++)
		{
			JSONObject j=array.getJSONObject(i);
			System.out.println(j.get(keyname));
		}
	}
	public static String jsonparse2(String keyname, String responsedata)
	{
		JSONObject j=new JSONObject(responsedata);
		return j.getString(keyname);
	}
}
