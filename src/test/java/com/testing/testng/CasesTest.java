package com.testing.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class CasesTest {
  @Test(enabled=false)//(priority=2)
  public void f1() {
	  System.out.println("CaseTest类中@Test方法1被执行");
  }
  @Test//(priority=1)
  public void f2() {
	  System.out.println("CaseTest类中@Test方法2被执行");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("CaseTest类中@BeforeMethod方法被执行");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("CaseTest类中@AfterMethod方法被执行");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("CaseTest类中@beforeClass方法被执行");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("CaseTest类中@afterClass方法被执行");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("CaseTest类中@beforeTest方法被执行");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("CaseTest类中@afterTest方法被执行");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("CaseTest类中@beforeSuite方法被执行");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("CaseTest类中@afterSuite方法被执行");
  }
  
//  @BeforeGroups("Roy")
//  public void beforeGroup() {
//	  System.out.println("@beforeGroup方法被执行");
//  }
//  
//  @AfterGroups("Roy")
//  public void afterGroup() {
//	  System.out.println("@afterGroup方法被执行");
//  }

}
