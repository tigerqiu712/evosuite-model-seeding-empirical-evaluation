/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 16:12:45 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.RTriangle1Symbol;
import javax.swing.DebugGraphics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PolygonSymbol_ESTest extends PolygonSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RTriangle1Symbol rTriangle1Symbol0 = new RTriangle1Symbol();
      DebugGraphics debugGraphics0 = new DebugGraphics();
      // Undeclared exception!
      try { 
        rTriangle1Symbol0.draw(debugGraphics0, 10, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.DebugGraphics", e);
      }
  }
}
