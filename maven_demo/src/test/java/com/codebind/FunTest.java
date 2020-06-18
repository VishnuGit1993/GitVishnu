package com.codebind;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class FunTest {
	ExtentReports extent;
	@BeforeTest
	public void config()
	{
		//ExtentSparkReporter
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentHtmlReporter reporter=new ExtentHtmlReporter(path);
		reporter.config().setReportName("TestResults");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
	}

	
	@Test
	public void test() {
		extent.createTest("test");
		System.out.println("Fun test ran");
		extent.flush();
		
	}

}
