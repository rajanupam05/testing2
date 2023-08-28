package org.testing.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.httpmethods;
import org.testing.utilities.propertieshandle;
import org.testng.annotations.Test;

public class testcase3_getparticular {
	@Test
	public void tc3() throws FileNotFoundException, IOException
	{
		Properties pr=propertieshandle.loadpropertieshandle("../final/uri.properties");
		httpmethods getparticular=new httpmethods(pr);
		getparticular.getparticular("def", "-1830022570");
	}
}
