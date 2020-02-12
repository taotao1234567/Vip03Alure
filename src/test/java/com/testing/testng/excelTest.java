package com.testing.testng;

import org.testng.annotations.Test;

import com.testing.common.ExcelReader;


public class excelTest {
  @Test
  public void f() {
	  ExcelReader excel=new ExcelReader("F:\\JAVAWORK\\TestNG08\\cases\\LoginTest.xlsx");
	  Object[][] result=excel.readAsMatrix();
	  for(Object[] s:result)
	  {
		  for(Object a:s) {
			  System.out.print(" "+ a);
		  }
		  System.out.println();
	  }
	  System.out.println(excel.readAsMatrix());
  }
}
