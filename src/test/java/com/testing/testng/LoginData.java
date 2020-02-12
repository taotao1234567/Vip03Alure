package com.testing.testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class LoginData {
	//方法通过dataProvider参数指定是用哪一个数据提供器。
  @Test(dataProvider = "dp")
  public void f(String user, String password) {
	  //用两个不同的账号来测试登录流程
	  System.setProperty("webdriver.chrome.driver", "F:\\DnTest\\chromedriver243\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://www.testingedu.com.cn:8000/");
	  //点击登录的按钮
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/a[1]")).click();
	  //输入用户名密码点击登录
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user);
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	  driver.findElement(By.xpath("//input[@id=\"verify_code\"]")).sendKeys("1");
	  driver.findElement(By.xpath("//*[@id=\"loginform\"]/div/div[6]/a")).click();
	  //等待5秒
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  driver.quit();
	  
  }

  //用于生成读取数据传递给指定的方法使用
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"1508353980@qq.com", "123456"},
      new Object[] { "1234567", "吃肉" },
    };
  }
}
