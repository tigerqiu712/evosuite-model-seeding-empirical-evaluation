/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 19:20:59 GMT 2019
 */

package org.sat4j.minisat.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.minisat.core.CircularBuffer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CircularBuffer_ESTest extends CircularBuffer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(5);
      circularBuffer0.push(5);
      circularBuffer0.push(5);
      long long0 = circularBuffer0.average();
      assertEquals(5L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(1);
      circularBuffer0.push(1);
      boolean boolean0 = circularBuffer0.isFull();
      assertEquals(1L, circularBuffer0.average());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(5);
      circularBuffer0.push((-1585));
      long long0 = circularBuffer0.average();
      assertEquals((-1585L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(0);
      // Undeclared exception!
      try { 
        circularBuffer0.push(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.sat4j.minisat.core.CircularBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CircularBuffer circularBuffer0 = null;
      try {
        circularBuffer0 = new CircularBuffer((-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.core.CircularBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(5);
      circularBuffer0.push(5);
      circularBuffer0.push(5);
      circularBuffer0.push(5);
      circularBuffer0.push(0);
      circularBuffer0.push(0);
      long long0 = circularBuffer0.average();
      assertEquals(3L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(5);
      long long0 = circularBuffer0.average();
      assertEquals(0L, long0);
      assertFalse(circularBuffer0.isFull());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(1);
      circularBuffer0.push(1);
      circularBuffer0.push(1);
      circularBuffer0.push(1);
      assertEquals(1L, circularBuffer0.average());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(5);
      circularBuffer0.push(5);
      circularBuffer0.push(5);
      circularBuffer0.push(5);
      circularBuffer0.push(0);
      circularBuffer0.push(0);
      circularBuffer0.push(1428);
      assertEquals(287L, circularBuffer0.average());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(0);
      boolean boolean0 = circularBuffer0.isFull();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(5);
      circularBuffer0.clear();
      assertFalse(circularBuffer0.isFull());
  }
}