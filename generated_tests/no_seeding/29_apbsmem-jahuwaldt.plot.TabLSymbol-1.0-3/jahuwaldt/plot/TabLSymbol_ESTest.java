/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 15:43:35 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.TabLSymbol;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TabLSymbol_ESTest extends TabLSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TabLSymbol tabLSymbol0 = new TabLSymbol();
      int[] intArray0 = new int[4];
      tabLSymbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        tabLSymbol0.generatePoints(131, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.TabLSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TabLSymbol tabLSymbol0 = new TabLSymbol();
      tabLSymbol0.generatePoints(3458, 0);
      int[] intArray0 = new int[4];
      tabLSymbol0.yPoints = intArray0;
      // Undeclared exception!
      try { 
        tabLSymbol0.generatePoints(0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("jahuwaldt.plot.TabLSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TabLSymbol tabLSymbol0 = new TabLSymbol();
      tabLSymbol0.generatePoints(0, 7);
      tabLSymbol0.generatePoints(0, 7);
      assertEquals(8, tabLSymbol0.getSize());
  }
}