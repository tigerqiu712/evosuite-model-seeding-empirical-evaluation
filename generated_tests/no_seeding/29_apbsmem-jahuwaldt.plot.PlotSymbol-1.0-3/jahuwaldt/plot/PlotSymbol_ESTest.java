/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 15:46:14 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.BoxULSymbol;
import jahuwaldt.plot.BoxURSymbol;
import jahuwaldt.plot.RTriangle3Symbol;
import jahuwaldt.plot.TabLSymbol;
import jahuwaldt.plot.TabRSymbol;
import jahuwaldt.plot.ThinRect2Symbol;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.SystemColor;
import javax.swing.text.AttributeSet;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlotSymbol_ESTest extends PlotSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BoxULSymbol boxULSymbol0 = new BoxULSymbol();
      int int0 = boxULSymbol0.getSize();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BoxURSymbol boxURSymbol0 = new BoxURSymbol();
      boxURSymbol0.setSize((-4810));
      int int0 = boxURSymbol0.getSize();
      assertEquals((-4810), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Color color0 = new Color((-5383), false);
      TabRSymbol tabRSymbol0 = new TabRSymbol();
      tabRSymbol0.setFillColor(color0);
      tabRSymbol0.getFillColor();
      assertEquals(8, tabRSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TabRSymbol tabRSymbol0 = new TabRSymbol();
      Color color0 = Color.blue;
      tabRSymbol0.setFillColor(color0);
      tabRSymbol0.getFillColor();
      assertEquals(8, tabRSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RTriangle3Symbol rTriangle3Symbol0 = new RTriangle3Symbol();
      Color color0 = new Color(0, true);
      rTriangle3Symbol0.setBorderColor(color0);
      rTriangle3Symbol0.getBorderColor();
      assertEquals(8, rTriangle3Symbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TabRSymbol tabRSymbol0 = new TabRSymbol();
      SystemColor systemColor0 = SystemColor.menu;
      tabRSymbol0.setBorderColor(systemColor0);
      tabRSymbol0.getBorderColor();
      assertEquals(8, tabRSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RTriangle3Symbol rTriangle3Symbol0 = new RTriangle3Symbol();
      Color color0 = new Color(32, true);
      rTriangle3Symbol0.setBorderColor(color0);
      rTriangle3Symbol0.getBorderColor();
      assertEquals(8, rTriangle3Symbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TabLSymbol tabLSymbol0 = new TabLSymbol();
      // Undeclared exception!
      try { 
        tabLSymbol0.draw((Graphics) null, 280, 280);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PolygonSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TabRSymbol tabRSymbol0 = new TabRSymbol();
      tabRSymbol0.getFillColor();
      assertEquals(8, tabRSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TabRSymbol tabRSymbol0 = new TabRSymbol();
      tabRSymbol0.setBorderColor((Color) null);
      tabRSymbol0.getBorderColor();
      assertEquals(8, tabRSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TabRSymbol tabRSymbol0 = new TabRSymbol();
      TabRSymbol tabRSymbol1 = (TabRSymbol)tabRSymbol0.clone();
      assertEquals(8, tabRSymbol1.getSize());
      assertNotSame(tabRSymbol1, tabRSymbol0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ThinRect2Symbol thinRect2Symbol0 = new ThinRect2Symbol();
      assertEquals(8, thinRect2Symbol0.getSize());
      
      thinRect2Symbol0.setSize(0);
      int int0 = thinRect2Symbol0.getSize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TabRSymbol tabRSymbol0 = new TabRSymbol();
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument();
      AttributeSet attributeSet0 = SimpleAttributeSet.EMPTY;
      Color color0 = defaultStyledDocument0.getBackground(attributeSet0);
      tabRSymbol0.setFillColor(color0);
      tabRSymbol0.getFillColor();
      assertEquals(8, tabRSymbol0.getSize());
  }
}