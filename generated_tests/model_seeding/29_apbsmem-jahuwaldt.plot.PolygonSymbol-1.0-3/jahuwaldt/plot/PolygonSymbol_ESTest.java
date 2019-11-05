/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 17:30:29 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.TabDSymbol;
import jahuwaldt.plot.TabRSymbol;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PolygonSymbol_ESTest extends PolygonSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TabDSymbol tabDSymbol0 = new TabDSymbol();
      // Undeclared exception!
      try { 
        tabDSymbol0.draw((Graphics) null, 1230, 1230);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PolygonSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TabRSymbol tabRSymbol0 = new TabRSymbol();
      int[] intArray0 = new int[0];
      tabRSymbol0.xPoints = intArray0;
      Graphics graphics0 = mock(Graphics.class, new ViolatedAssumptionAnswer());
      doReturn((Color) null).when(graphics0).getColor();
      // Undeclared exception!
      try { 
        tabRSymbol0.draw(graphics0, 51, 51);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jahuwaldt.plot.TabRSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TabRSymbol tabRSymbol0 = new TabRSymbol();
      tabRSymbol0.setBorderColor((Color) null);
      Graphics graphics0 = mock(Graphics.class, new ViolatedAssumptionAnswer());
      doReturn((Color) null).when(graphics0).getColor();
      tabRSymbol0.draw(graphics0, 51, 51);
      assertEquals(8, tabRSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TabRSymbol tabRSymbol0 = new TabRSymbol();
      Color color0 = new Color(422);
      tabRSymbol0.setFillColor(color0);
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      Graphics graphics0 = mock(Graphics.class, new ViolatedAssumptionAnswer());
      doReturn((Color) null).when(graphics0).getColor();
      tabRSymbol0.draw(graphics0, (int) integer0, 51);
      assertEquals(8, tabRSymbol0.getSize());
  }
}