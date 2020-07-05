package com.test.testRunner;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.util.Browserfactory;

//import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


/*@CucumberOptions(features= {"src/test/resources"},
glue = {"stepsDef"},
tags = {"@test"})*/

public class TestRunner extends AbstractTestNGCucumberTests {
	
	 @Test public void f() {
	  
	 //public void loginTo (String username ) {}
}
	
	/*
	 * @BeforeTest public void setUp() { Browserfactory test = new Browserfactory();
	 * test.initialization(); }
	 * 
	 * 
	 * 
	 * @AfterTest public void tearDown() { Browserfactory test = new
	 * Browserfactory(); test.driver.quit(); //test.quit(); }
	 */	 
}
