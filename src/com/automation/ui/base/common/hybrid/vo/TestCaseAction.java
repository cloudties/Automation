package com.automation.ui.base.common.hybrid.vo;

import java.util.ArrayList;
import java.util.List;

public class TestCaseAction {
	String testCaseName = null;
	List<String> testStepId = new ArrayList<String>();
	List<String> testSteps = new ArrayList<String>();
	List<String> methodType = new ArrayList<String>();
	List<String> objectNameFromPropertiesFile = new ArrayList<String>();
	List<String> actionType = new ArrayList<String>();
	String onFail = null;
	List testData = new ArrayList();

	public String getTestCaseName() {
		return testCaseName;
	}

	public void setTestCaseName(String testCaseName) {
		this.testCaseName = testCaseName;
	}

	public void addTestSteps(String steps) {
		testSteps.add(steps);
	}

	public List<String> getTestSteps() {
		return testSteps;
	}

	public void setMethodType(String methodype) {
		methodType.add(methodype);
	}

	public List<String> getMethodType() {
		return methodType;
	}

	public void setObjectNameFromPropertiesFile(String name) {
		objectNameFromPropertiesFile.add(name);
	}

	public List<String> getObjectNameFromPropertiesFile() {
		return objectNameFromPropertiesFile;
	}

	public void setActionType(String actiontype) {
		actionType.add(actiontype);
	}

	public List<String> getActionType() {
		return actionType;
	}

	public void setTestData(String testdata) {
		testData.add(testdata);
	}

	public List<String> getTestData() {
		return testData;
	}

	public List<String> getTestStepId() {
		return testStepId;
	}

	public void setTestStepId(String tststepId) {
		testStepId.add(tststepId);
	}

	public String getOnFail() {
		return onFail;
	}

	public void setOnFail(String onFail) {
		this.onFail = onFail;
	}

}
