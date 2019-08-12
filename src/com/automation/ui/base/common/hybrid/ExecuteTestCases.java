package com.automation.ui.base.common.hybrid;

import java.awt.event.WindowEvent;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.BaseTestMethod;

import com.automation.ui.base.common.hybrid.vo.*;
import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import  com.automation.ui.base.common.utils.*;

public class ExecuteTestCases implements ITest {

	private static Logger logger = Logger
			.getLogger(ExecuteTestCases.class);

	ExcelUtil lib = new ExcelUtil();

	static WebDriver driver = null;
	static ExecuteAction  act = new ExecuteAction();

	static List list;
	protected String mTestCaseName = "";
	/**
	 * In this class, this is the first method to be executed.
	 * Reading testsuite , test case sheet and data sheet and storing the values in Hashmap
	 **/
	@BeforeClass
	public void setup() {
		logger.info(ExecuteTestCases.class.getName()
				+ "   setup() method called");


		//act.readTestSuite();
		act.readTestCaseInExcel();
		//act.readTestDataSheet();
		act.readCapturedObjectProperties();

	}
	/**
	 * To override the test case name in the report
	 */
	@BeforeMethod(alwaysRun = true)
	public void testData(Object[] testData) {
		String testCase = "";
		if (testData != null && testData.length > 0) {
			String testName = null;
			// Check if test method has actually received required parameters
			for (Object tstname : testData) {
				if (tstname instanceof String) {
					testName = (String) tstname;
					break;
				}
			}
			testCase = testName;
		}
		this.mTestCaseName = testCase;

	}

	public String getTestName() {
		return this.mTestCaseName;
	}

	public void setTestName(String name) {

		this.mTestCaseName = name;

	}

	/**
	 * All the test cases execution will start from here, which will take the input from the data provider
	 */
	@Test(dataProvider = "dp")
	public void testSample1(String testName) {
		logger.info(ExecuteTestCases.class.getName()
				+ "  @Test method called" + "    " + testName);

		try {
			this.setTestName(testName);
			logger.info("testSuiteIterate() calling");
			act.testSuiteIterate(testName);
			Reporter.log("ex" + getTestName());

		} catch (Exception ex) {
			Assert.fail();
			stack(ex);

			Reporter.log("exception in execute testCase====" + ex);

		}
	}

	@AfterMethod
	public void setResultTestName(ITestResult result) {
		try {
			BaseTestMethod bm = (BaseTestMethod) result.getMethod();
			Field f = bm.getClass().getSuperclass()
					.getDeclaredField("m_methodName");
			f.setAccessible(true);
			f.set(bm, mTestCaseName);
			Reporter.log(bm.getMethodName());
			this.mTestCaseName = " ";

		} catch (Exception ex) {
			stack(ex);
			Reporter.log("ex" + ex.getMessage());
		}
	}

	/**
	 * Parameterization in testng
	 */
	@DataProvider(name = "dp")
	public Object[][] regression() {
		List list = (ArrayList) ExecuteAction.listOfTestCases;
		Object[][] data = new Object[list.size()][1];
		logger.info(ExecuteTestCases.class.getName()
				+ " TestCases to be executed" + "    " + data);
		for (int i = 0; i < data.length; i++) {
			data[i][0] = (String) list.get(i);
		}
		return data;
	}

	@AfterClass
	public void cleanup() {
		act.clean();
		lib.clean();


	}

	public static void stack(Exception e) {
		e.printStackTrace();
		logger.info(ExecuteTestCases.class.getName()
				+ " Exception occured" + "    " + e.getCause());
	}
}
