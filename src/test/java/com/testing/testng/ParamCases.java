package com.testing.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamCases {
  @Test
  @Parameters({"driverPath","url","content"})
  public void f(String driverPath,String url,String content) {
	  //设置启动driver的路径
	  System.setProperty("webdriver.chrome.driver",driverPath);
	  WebDriver driver=new ChromeDriver();
	  driver.get(url);
	  driver.findElement(By.xpath("//*[@id='kw']")).sendKeys(content);
	  
  }
}
