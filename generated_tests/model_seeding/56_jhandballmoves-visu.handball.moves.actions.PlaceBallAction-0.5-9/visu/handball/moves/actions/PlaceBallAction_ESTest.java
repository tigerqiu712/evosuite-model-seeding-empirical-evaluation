/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 17:26:21 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import javax.swing.plaf.metal.MetalComboBoxUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.PlaceBallAction;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.HandballModelListener;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.player.Offender;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlaceBallAction_ESTest extends PlaceBallAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Offender offender0 = new Offender(0, 0);
      MoveEvent moveEvent0 = new MoveEvent(offender0, 1, 1);
      handballModel0.setActualMoveEvent(moveEvent0);
      PlaceBallAction placeBallAction0 = new PlaceBallAction(handballModel0);
      MetalComboBoxUI metalComboBoxUI0 = new MetalComboBoxUI();
      PropertyChangeListener propertyChangeListener0 = metalComboBoxUI0.createPropertyChangeListener();
      placeBallAction0.addPropertyChangeListener(propertyChangeListener0);
      // Undeclared exception!
      try { 
        placeBallAction0.modelChanged();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // visu.handball.moves.actions.PlaceBallAction cannot be cast to javax.swing.JComboBox
         //
         verifyException("javax.swing.plaf.basic.BasicComboBoxUI$Handler", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      handballModel0.addListener((HandballModelListener) null);
      PlaceBallAction placeBallAction0 = new PlaceBallAction(handballModel0);
      // Undeclared exception!
      try { 
        placeBallAction0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.model.HandballModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PlaceBallAction placeBallAction0 = null;
      try {
        placeBallAction0 = new PlaceBallAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.PlaceBallAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceBallAction placeBallAction0 = new PlaceBallAction(handballModel0);
      placeBallAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      HandballModel.State handballModel_State0 = HandballModel.State.EDIT_EVENT;
      handballModel0.setState(handballModel_State0);
      PlaceBallAction placeBallAction0 = new PlaceBallAction(handballModel0);
      placeBallAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceBallAction placeBallAction0 = new PlaceBallAction(handballModel0);
      // Undeclared exception!
      try { 
        handballModel0.startAnimation(false);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceBallAction placeBallAction0 = new PlaceBallAction(handballModel0);
      placeBallAction0.actionPerformed((ActionEvent) null);
  }
}