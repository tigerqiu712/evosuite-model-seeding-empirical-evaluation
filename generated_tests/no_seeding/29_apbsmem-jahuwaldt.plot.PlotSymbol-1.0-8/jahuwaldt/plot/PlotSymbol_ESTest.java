/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 04 18:14:35 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.BoxLLSymbol;
import jahuwaldt.plot.BoxULSymbol;
import jahuwaldt.plot.BoxURSymbol;
import jahuwaldt.plot.DiamondSymbol;
import jahuwaldt.plot.RTriangle1Symbol;
import jahuwaldt.plot.RTriangle2Symbol;
import jahuwaldt.plot.TabDSymbol;
import jahuwaldt.plot.Triangle1Symbol;
import jahuwaldt.plot.Triangle3Symbol;
import jahuwaldt.plot.Triangle4Symbol;
import jahuwaldt.plot.XSymbol;
import java.awt.Color;
import javax.swing.DebugGraphics;
import javax.swing.JList;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Element;
import javax.swing.text.LabelView;
import javax.swing.text.StyleContext;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlotSymbol_ESTest extends PlotSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BoxLLSymbol boxLLSymbol0 = new BoxLLSymbol();
      boxLLSymbol0.setSize((-375));
      int int0 = boxLLSymbol0.getSize();
      assertEquals((-375), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RTriangle1Symbol rTriangle1Symbol0 = new RTriangle1Symbol();
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Color color0 = defaultTreeCellRenderer0.getTextSelectionColor();
      rTriangle1Symbol0.setFillColor(color0);
      rTriangle1Symbol0.getFillColor();
      assertEquals(8, rTriangle1Symbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XSymbol xSymbol0 = new XSymbol();
      StyleContext styleContext0 = new StyleContext();
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument(styleContext0);
      Element element0 = defaultStyledDocument0.getDefaultRootElement();
      LabelView labelView0 = new LabelView(element0);
      Color color0 = labelView0.getForeground();
      xSymbol0.setFillColor(color0);
      xSymbol0.getFillColor();
      assertEquals(8, xSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Triangle3Symbol triangle3Symbol0 = new Triangle3Symbol();
      triangle3Symbol0.setBorderColor((Color) null);
      triangle3Symbol0.getBorderColor();
      assertEquals(8, triangle3Symbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TabDSymbol tabDSymbol0 = new TabDSymbol();
      JList<BoxULSymbol> jList0 = new JList<BoxULSymbol>();
      Color color0 = jList0.getSelectionForeground();
      tabDSymbol0.setBorderColor(color0);
      tabDSymbol0.getBorderColor();
      assertEquals(8, tabDSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BoxURSymbol boxURSymbol0 = new BoxURSymbol();
      DebugGraphics debugGraphics0 = new DebugGraphics();
      // Undeclared exception!
      try { 
        boxURSymbol0.draw(debugGraphics0, 11, 11);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.DebugGraphics", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RTriangle2Symbol rTriangle2Symbol0 = new RTriangle2Symbol();
      rTriangle2Symbol0.getFillColor();
      assertEquals(8, rTriangle2Symbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Triangle1Symbol triangle1Symbol0 = new Triangle1Symbol();
      triangle1Symbol0.getBorderColor();
      assertEquals(8, triangle1Symbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Triangle4Symbol triangle4Symbol0 = new Triangle4Symbol();
      int int0 = triangle4Symbol0.getSize();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DiamondSymbol diamondSymbol0 = new DiamondSymbol();
      DiamondSymbol diamondSymbol1 = (DiamondSymbol)diamondSymbol0.clone();
      assertEquals(8, diamondSymbol1.getSize());
      assertNotSame(diamondSymbol1, diamondSymbol0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RTriangle2Symbol rTriangle2Symbol0 = new RTriangle2Symbol();
      Color color0 = new Color(8, true);
      rTriangle2Symbol0.setFillColor(color0);
      rTriangle2Symbol0.getFillColor();
      assertEquals(8, rTriangle2Symbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Triangle4Symbol triangle4Symbol0 = new Triangle4Symbol();
      assertEquals(8, triangle4Symbol0.getSize());
      
      triangle4Symbol0.setSize(0);
      int int0 = triangle4Symbol0.getSize();
      assertEquals(0, int0);
  }
}