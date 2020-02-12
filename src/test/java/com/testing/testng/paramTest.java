package com.testing.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramTest {
  @Test
  @Parameters({"user","name"})
  public void f(String param1,String param2) {
	  System.out.println(param1+param2);
  }
  
}
