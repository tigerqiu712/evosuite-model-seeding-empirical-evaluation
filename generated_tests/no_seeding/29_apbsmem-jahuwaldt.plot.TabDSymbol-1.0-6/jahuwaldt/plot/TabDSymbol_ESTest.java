/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 19:27:32 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.TabDSymbol;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TabDSymbol_ESTest extends TabDSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TabDSymbol tabDSymbol0 = new TabDSymbol();
      int[] intArray0 = new int[2];
      tabDSymbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        tabDSymbol0.generatePoints(1929, 611);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.TabDSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TabDSymbol tabDSymbol0 = new TabDSymbol();
      tabDSymbol0.generatePoints(341, 341);
      tabDSymbol0.generatePoints((-133), 4971);
      assertEquals(8, tabDSymbol0.getSize());
  }
}