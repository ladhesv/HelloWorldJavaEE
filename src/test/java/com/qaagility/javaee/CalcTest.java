package com.qaagility.javaee;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.assertEquals;

public class CalcTest{
  public void testSlow(){
    System.out.println("Slow");
  }
  
  @Before
  public void testSlower(){
    System.out.println("Before");
  }
  
  @After
  public void testFast(){
    System.out.println("After");
  }
  
  @Test
  public void testCalc(){
    //assertEquals("Result",9,9);
    assertEquals("Result",18,new calc().mul());
    //System.out.println("TestCalc =" +9*9);
  }
  
  @Test
  public void testCalcFail(){
    //assertEquals("Result",9,9);
    assertEquals("Result",18,new Calc().mul());
    //System.out.println("TestCalc =" +9*9);
}
}
