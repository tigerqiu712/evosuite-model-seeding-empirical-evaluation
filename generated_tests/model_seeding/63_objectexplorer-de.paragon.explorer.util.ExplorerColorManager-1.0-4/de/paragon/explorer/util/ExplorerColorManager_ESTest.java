/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 18:58:03 GMT 2019
 */

package de.paragon.explorer.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.paragon.explorer.figure.TextBoxFigure;
import de.paragon.explorer.model.ExplorerModel;
import de.paragon.explorer.util.ExplorerColorManager;
import java.awt.Color;
import java.awt.SystemColor;
import java.text.AttributedCharacterIterator;
import java.util.Enumeration;
import javax.swing.DebugGraphics;
import javax.swing.text.AttributeSet;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExplorerColorManager_ESTest extends ExplorerColorManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExplorerColorManager explorerColorManager0 = new ExplorerColorManager();
      Color color0 = Color.gray;
      explorerColorManager0.setFocusBackground(color0);
      Color color1 = explorerColorManager0.getFocusBackground();
      assertEquals(128, color1.getGreen());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExplorerColorManager explorerColorManager0 = new ExplorerColorManager();
      SystemColor systemColor0 = SystemColor.textInactiveText;
      explorerColorManager0.setCopyBackground(systemColor0);
      Color color0 = explorerColorManager0.getCopyBackground();
      assertEquals(128, color0.getGreen());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExplorerColorManager explorerColorManager0 = new ExplorerColorManager();
      // Undeclared exception!
      try { 
        explorerColorManager0.getForeground((TextBoxFigure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.paragon.explorer.util.ExplorerColorManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExplorerColorManager explorerColorManager0 = new ExplorerColorManager();
      // Undeclared exception!
      try { 
        explorerColorManager0.getBackground((TextBoxFigure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.paragon.explorer.util.ExplorerColorManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExplorerColorManager explorerColorManager0 = new ExplorerColorManager();
      Color color0 = Color.getHSBColor(0.0F, 0.0F, 0.0F);
      explorerColorManager0.setCopyBackground(color0);
      Color color1 = explorerColorManager0.getCopyBackground();
      assertEquals((-16777216), color1.getRGB());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExplorerModel explorerModel0 = new ExplorerModel();
      ExplorerColorManager explorerColorManager0 = explorerModel0.getColorManager();
      Color color0 = explorerColorManager0.getDefaultCopyBackground();
      assertEquals(0, color0.getBlue());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExplorerColorManager explorerColorManager0 = new ExplorerColorManager();
      StyleContext styleContext0 = new StyleContext();
      SimpleAttributeSet simpleAttributeSet0 = new SimpleAttributeSet();
      AttributeSet attributeSet0 = styleContext0.addAttribute(simpleAttributeSet0, explorerColorManager0, "6'1(Aj>]");
      Color color0 = styleContext0.getBackground(attributeSet0);
      explorerColorManager0.setFocusBackground(color0);
      Color color1 = explorerColorManager0.getFocusBackground();
      assertEquals(0, color1.getRed());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExplorerColorManager explorerColorManager0 = new ExplorerColorManager();
      StyleContext styleContext0 = new StyleContext();
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument(styleContext0);
      StyleContext.NamedStyle styleContext_NamedStyle0 = styleContext0.new NamedStyle();
      Enumeration<AttributedCharacterIterator.Attribute> enumeration0 = (Enumeration<AttributedCharacterIterator.Attribute>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      AttributeSet attributeSet0 = styleContext0.removeAttributes((AttributeSet) styleContext_NamedStyle0, (Enumeration<?>) enumeration0);
      Color color0 = defaultStyledDocument0.getForeground(attributeSet0);
      explorerColorManager0.setFocusForeground(color0);
      Color color1 = explorerColorManager0.getFocusForeground();
      assertEquals(0, color1.getBlue());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExplorerColorManager.getDefaultExplorerFocusBackground();
      Color color0 = ExplorerColorManager.getDefaultExplorerFocusBackground();
      assertEquals((-13434727), color0.getRGB());
      assertNotNull(color0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExplorerColorManager explorerColorManager0 = new ExplorerColorManager();
      Color color0 = Color.magenta;
      explorerColorManager0.setObjectForeground(color0);
      assertEquals(255, color0.getBlue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExplorerColorManager.getDefaultExplorerObjectBackground();
      Color color0 = ExplorerColorManager.getDefaultExplorerObjectBackground();
      assertEquals((-6710785), color0.getRGB());
      assertNotNull(color0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExplorerColorManager explorerColorManager0 = new ExplorerColorManager();
      Color color0 = DebugGraphics.flashColor();
      explorerColorManager0.setAttributeForeground(color0);
      assertEquals(0, color0.getBlue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExplorerColorManager explorerColorManager0 = new ExplorerColorManager();
      explorerColorManager0.getFocusBackground();
      Color color0 = explorerColorManager0.getFocusBackground();
      assertEquals((-13434727), color0.getRGB());
      assertNotNull(color0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExplorerColorManager explorerColorManager0 = new ExplorerColorManager();
      Color color0 = Color.DARK_GRAY;
      explorerColorManager0.setObjectBackground(color0);
      assertEquals((-12566464), color0.getRGB());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExplorerColorManager explorerColorManager0 = new ExplorerColorManager();
      explorerColorManager0.getCopyBackground();
      Color color0 = explorerColorManager0.getCopyBackground();
      assertEquals(0, color0.getBlue());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExplorerColorManager explorerColorManager0 = new ExplorerColorManager();
      Color color0 = explorerColorManager0.getFocusForeground();
      explorerColorManager0.setAttributeBackground(color0);
      assertEquals(255, color0.getGreen());
  }
}