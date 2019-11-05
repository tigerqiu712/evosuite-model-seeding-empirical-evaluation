/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 15:04:49 GMT 2019
 */

package de.progra.charting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.Title;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.text.AttributedCharacterIterator;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Title_ESTest extends Title_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Title title0 = new Title();
      title0.setText((String) null);
      String string0 = title0.getText();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Title title0 = new Title();
      assertEquals("Chart Title", title0.getText());
      
      title0.setText("");
      title0.getText();
      assertEquals("", title0.getText());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Font font0 = Font.decode("s{'4P8h'}/r$X/{+a>");
      Font font1 = font0.deriveFont(2830, 0.0F);
      Title title0 = new Title("s{'4P8h'}/r$X/{+a>", font1);
      Dimension dimension0 = title0.getPreferredSize();
      assertEquals("s{'4P8h'}/r$X/{+a>", title0.getText());
      assertEquals(1, dimension0.height);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Font font0 = new Font("y", (-678), (-678));
      Title title0 = new Title("y");
      title0.setFont(font0);
      Dimension dimension0 = title0.getPreferredSize();
      assertEquals((-400), dimension0.width);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Title title0 = new Title("k60*,$ocX4SZF", (Font) null);
      Font font0 = title0.getFont();
      assertNull(font0);
      assertEquals("k60*,$ocX4SZF", title0.getText());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Title title0 = new Title();
      HashMap<AttributedCharacterIterator.Attribute, Object> hashMap0 = new HashMap<AttributedCharacterIterator.Attribute, Object>();
      Font font0 = new Font(hashMap0);
      AffineTransform affineTransform0 = AffineTransform.getScaleInstance((-871), (-871));
      Font font1 = font0.deriveFont((-871), affineTransform0);
      title0.font = font1;
      title0.getFont();
      assertEquals("Chart Title", title0.getText());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Font font0 = Font.decode("s{'4P8h'}/r$X/{+a>");
      HashMap<AttributedCharacterIterator.Attribute, String> hashMap0 = new HashMap<AttributedCharacterIterator.Attribute, String>();
      Font font1 = font0.deriveFont((Map<? extends AttributedCharacterIterator.Attribute, ?>) hashMap0);
      Font font2 = font1.deriveFont(2830, 0.0F);
      Title title0 = new Title("s{'4P8h'}/r$X/{+a>", font2);
      Font font3 = title0.getFont();
      assertEquals("s{'4P8h'}/r$X/{+a>", title0.getText());
      assertFalse(font3.isPlain());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Font font0 = Font.decode("s{'4P8h'}/r$X/{+a>");
      Font font1 = font0.deriveFont(2830, 0.0F);
      Title title0 = new Title("s{'4P8h'}/r$X/{+a>", font1);
      Font font2 = title0.getFont();
      assertEquals("s{'4P8h'}/r$X/{+a>", title0.getText());
      assertEquals(0, font2.getSize());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Title title0 = new Title();
      // Undeclared exception!
      try { 
        title0.paintDefault((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.Title", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Title title0 = new Title("");
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        title0.paintDefault(graphics2D0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Zero length string passed to TextLayout constructor.
         //
         verifyException("java.awt.font.TextLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Title title0 = new Title();
      title0.setText((String) null);
      // Undeclared exception!
      try { 
        title0.getPreferredSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.Font", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Font font0 = Font.decode("");
      AffineTransform affineTransform0 = AffineTransform.getRotateInstance((double) (-1.0F), (double) 486);
      Font font1 = font0.deriveFont(affineTransform0);
      Title title0 = new Title("", font1);
      // Undeclared exception!
      try { 
        title0.getPreferredSize();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Zero length string passed to TextLayout constructor.
         //
         verifyException("java.awt.font.TextLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Title title0 = new Title();
      Dimension dimension0 = title0.getPreferredSize();
      assertEquals(115, dimension0.width);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Title title0 = new Title();
      String string0 = title0.getText();
      assertEquals("Chart Title", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Title title0 = new Title("y");
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      title0.paintDefault(graphics2D0);
      assertEquals("y", title0.getText());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Font font0 = new Font("y", (-678), (-678));
      Title title0 = new Title("y");
      title0.setFont(font0);
      Font font1 = title0.getFont();
      assertEquals("y", title0.getText());
      assertEquals((-678.0F), font1.getSize2D(), 0.01F);
  }
}