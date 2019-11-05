/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 05 17:13:06 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.BoxLLSymbol;
import jahuwaldt.plot.BoxURSymbol;
import jahuwaldt.plot.CircleSymbol;
import jahuwaldt.plot.TabLSymbol;
import jahuwaldt.plot.Triangle4Symbol;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.SystemColor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlotSymbol_ESTest extends PlotSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Triangle4Symbol triangle4Symbol0 = new Triangle4Symbol();
      assertEquals(8, triangle4Symbol0.getSize());
      
      triangle4Symbol0.setSize(0);
      int int0 = triangle4Symbol0.getSize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CircleSymbol circleSymbol0 = new CircleSymbol();
      assertEquals(8, circleSymbol0.getSize());
      
      circleSymbol0.setSize((-1));
      int int0 = circleSymbol0.getSize();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TabLSymbol tabLSymbol0 = new TabLSymbol();
      SystemColor systemColor0 = SystemColor.text;
      tabLSymbol0.setFillColor(systemColor0);
      tabLSymbol0.getFillColor();
      assertEquals(8, tabLSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BoxURSymbol boxURSymbol0 = new BoxURSymbol();
      boxURSymbol0.setBorderColor((Color) null);
      boxURSymbol0.getBorderColor();
      assertEquals(8, boxURSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TabLSymbol tabLSymbol0 = new TabLSymbol();
      // Undeclared exception!
      try { 
        tabLSymbol0.draw((Graphics) null, 5, 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PolygonSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TabLSymbol tabLSymbol0 = new TabLSymbol();
      tabLSymbol0.getFillColor();
      assertEquals(8, tabLSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BoxLLSymbol boxLLSymbol0 = new BoxLLSymbol();
      boxLLSymbol0.getBorderColor();
      assertEquals(8, boxLLSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TabLSymbol tabLSymbol0 = new TabLSymbol();
      int int0 = tabLSymbol0.getSize();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BoxLLSymbol boxLLSymbol0 = new BoxLLSymbol();
      Color color0 = new Color((-1));
      boxLLSymbol0.setBorderColor(color0);
      boxLLSymbol0.getBorderColor();
      assertEquals(8, boxLLSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TabLSymbol tabLSymbol0 = new TabLSymbol();
      TabLSymbol tabLSymbol1 = (TabLSymbol)tabLSymbol0.clone();
      assertNotSame(tabLSymbol1, tabLSymbol0);
      assertEquals(8, tabLSymbol1.getSize());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TabLSymbol tabLSymbol0 = new TabLSymbol();
      SystemColor systemColor0 = SystemColor.infoText;
      tabLSymbol0.setFillColor(systemColor0);
      tabLSymbol0.getFillColor();
      assertEquals(8, tabLSymbol0.getSize());
  }
}