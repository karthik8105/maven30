package com.crm.readdata;

import org.testng.annotations.Test;

public class ReadDataTest
{
@Test
public void read()
{
String BROWSER = System.getProperty("browser");
System.out.println(BROWSER);

String url = System.getProperty("url");
System.out.println(url);
	
}
}
