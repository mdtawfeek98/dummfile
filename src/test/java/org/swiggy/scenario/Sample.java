package org.swiggy.scenario;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Date;

import org.adacitin.baseclass.CommonUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Sample extends CommonUtils {

	

	@Test(priority = 0, groups = { "smoke" })
	public void me() {
		logger = extentreport.createTest("me");
	}

	
}
