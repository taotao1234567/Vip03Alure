package com.testing.testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class dataproviderTest {
  @Test(dataProvider = "dp")
  public void run(Integer n, String s,String str) {
	  System.out.println(""+n+":"+s+str);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" ,"青鸿"},
      new Object[] { 2, "b" ,"吃肉"},
    };
  }
}
