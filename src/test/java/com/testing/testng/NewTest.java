package com.testing.testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest {
  @Test(dataProvider = "data")
  public void f(Integer n, String s) {
	  System.out.println(n+"行的值是："+s);
  }

  //返回二维数组供test方法使用
  @DataProvider
  public Object[][] data() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
