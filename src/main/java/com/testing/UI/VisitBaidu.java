package com.testing.UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class VisitBaidu {
	//需要执行的测试方法
  @Test
  @Parameters({"webdriver","url"})
  public void f(String webdriver,String url) {
	  System.setProperty("webdriver.chrome.driver", webdriver);
	  WebDriver driver=new ChromeDriver();
	  driver.get(url);
  }
  
}
