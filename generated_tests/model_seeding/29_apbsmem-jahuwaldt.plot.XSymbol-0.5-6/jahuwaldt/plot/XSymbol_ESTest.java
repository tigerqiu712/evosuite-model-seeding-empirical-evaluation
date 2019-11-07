/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 19:22:29 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.XSymbol;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.SystemColor;
import javax.swing.DebugGraphics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XSymbol_ESTest extends XSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XSymbol xSymbol0 = new XSymbol();
      SystemColor systemColor0 = SystemColor.control;
      xSymbol0.setFillColor(systemColor0);
      Graphics graphics0 = mock(Graphics.class, new ViolatedAssumptionAnswer());
      doReturn(systemColor0).when(graphics0).getColor();
      xSymbol0.draw(graphics0, (-2), (-918));
      assertEquals(8, xSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XSymbol xSymbol0 = new XSymbol();
      SystemColor systemColor0 = SystemColor.control;
      xSymbol0.setFillColor(systemColor0);
      Graphics graphics0 = mock(Graphics.class, new ViolatedAssumptionAnswer());
      doReturn((Color) null).when(graphics0).getColor();
      xSymbol0.draw(graphics0, (-918), (-918));
      assertEquals(8, xSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XSymbol xSymbol0 = new XSymbol();
      DebugGraphics debugGraphics0 = new DebugGraphics();
      // Undeclared exception!
      try { 
        xSymbol0.draw(debugGraphics0, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.DebugGraphics", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XSymbol xSymbol0 = new XSymbol();
      Graphics graphics0 = mock(Graphics.class, new ViolatedAssumptionAnswer());
      doReturn((Color) null).when(graphics0).getColor();
      xSymbol0.setBorderColor((Color) null);
      xSymbol0.draw(graphics0, (-1642), (-762));
      assertEquals(8, xSymbol0.getSize());
  }
}
