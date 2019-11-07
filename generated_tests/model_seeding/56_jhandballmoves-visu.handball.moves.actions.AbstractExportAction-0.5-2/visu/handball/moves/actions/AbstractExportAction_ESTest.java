/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 16:46:55 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.DebugGraphics;
import javax.swing.text.StyleContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.CreateMovePdfAction;
import visu.handball.moves.actions.PrintActualSequenzAction;
import visu.handball.moves.model.HandballModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractExportAction_ESTest extends AbstractExportAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      CreateMovePdfAction createMovePdfAction0 = new CreateMovePdfAction(handballModel0);
      // Undeclared exception!
      try { 
        createMovePdfAction0.drawHeader((Graphics) null, 0.0, 570.0, 2209.6050482923);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.AbstractExportAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PrintActualSequenzAction printActualSequenzAction0 = new PrintActualSequenzAction(handballModel0);
      DebugGraphics debugGraphics0 = new DebugGraphics();
      // Undeclared exception!
      try { 
        printActualSequenzAction0.drawHeader(debugGraphics0, 0.0, 0.0, 0.0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.swing.DebugGraphics cannot be cast to java.awt.Graphics2D
         //
         verifyException("visu.handball.moves.actions.AbstractExportAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PrintActualSequenzAction printActualSequenzAction0 = new PrintActualSequenzAction(handballModel0);
      StyleContext styleContext0 = StyleContext.getDefaultStyleContext();
      Font font0 = new Font("jSUVC}c", 1639, (-463));
      FontMetrics fontMetrics0 = styleContext0.getFontMetrics(font0);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(fontMetrics0).when(graphics2D0).getFontMetrics();
      doReturn("i%t41QH6XwUb2i]]M9*").when(graphics2D0).toString();
      Graphics2D graphics2D1 = printActualSequenzAction0.drawHeader(graphics2D0, 0.0, 0.0, (-3191.875));
      CreateMovePdfAction createMovePdfAction0 = new CreateMovePdfAction(handballModel0);
      createMovePdfAction0.createCopy();
      // Undeclared exception!
      try { 
        createMovePdfAction0.drawSequence(graphics2D1, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.views.FieldDrawer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CreateMovePdfAction createMovePdfAction0 = new CreateMovePdfAction((HandballModel) null);
      // Undeclared exception!
      try { 
        createMovePdfAction0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
