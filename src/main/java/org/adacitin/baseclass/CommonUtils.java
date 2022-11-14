package org.adacitin.baseclass;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class CommonUtils  {
	protected static ExtentReports extentreport = new ExtentReports();
	protected static ExtentHtmlReporter extenthtmlreport;
	protected static ExtentTest logger;
	
	
	
	

	
	@BeforeSuite
	public void beforeSuite() {
		extenthtmlreport = new ExtentHtmlReporter("./batch56report.html");
		extentreport.attachReporter(extenthtmlreport);
		System.out.println("befor suite");
	}
	

	

	
	@AfterSuite
	public void endReport() {
		extentreport.flush();
//        log.info("The given test is completed in the given browser:"+ System.getProperty("browser"));
	}
	

	

}
