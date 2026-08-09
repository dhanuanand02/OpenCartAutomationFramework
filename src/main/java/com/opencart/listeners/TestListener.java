package com.opencart.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.opencart.base.BaseClass;
import com.opencart.utilities.ScreenShotUtil;

public class TestListener implements ITestListener {
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		BaseClass base = (BaseClass)result.getInstance();
		
		ScreenShotUtil.takeScreenshot(base.driver,result.getName());
		
	}

}
