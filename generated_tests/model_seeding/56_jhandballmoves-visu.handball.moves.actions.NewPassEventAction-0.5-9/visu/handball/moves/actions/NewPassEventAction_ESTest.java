/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 21:34:12 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import javax.swing.plaf.metal.MetalComboBoxUI;
import javax.swing.plaf.synth.SynthSpinnerUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.NewPassEventAction;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.player.Defender;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NewPassEventAction_ESTest extends NewPassEventAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      newPassEventAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Defender defender0 = new Defender(11, 11);
      defender0.setHasBall(true);
      handballModel0.setMarkedPlayer(defender0);
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      MetalComboBoxUI metalComboBoxUI0 = new MetalComboBoxUI();
      PropertyChangeListener propertyChangeListener0 = metalComboBoxUI0.createPropertyChangeListener();
      newPassEventAction0.addPropertyChangeListener(propertyChangeListener0);
      ActionEvent actionEvent0 = new ActionEvent(metalComboBoxUI0, (-1795), "gjq[mT7jd7o", (-1795));
      // Undeclared exception!
      try { 
        newPassEventAction0.actionPerformed(actionEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // visu.handball.moves.actions.NewPassEventAction cannot be cast to javax.swing.JComboBox
         //
         verifyException("javax.swing.plaf.basic.BasicComboBoxUI$Handler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NewPassEventAction newPassEventAction0 = null;
      try {
        newPassEventAction0 = new NewPassEventAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.NewPassEventAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Defender defender0 = new Defender(0, 0);
      HandballModel.State handballModel_State0 = HandballModel.State.EDIT;
      handballModel0.setState(handballModel_State0);
      handballModel0.setMarkedPlayer(defender0);
      defender0.setHasBall(true);
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      newPassEventAction0.actionPerformed((ActionEvent) null);
      assertEquals(HandballModel.State.EDIT_EVENT, handballModel0.getState());
      assertEquals(1, handballModel0.getAcutalSequenceNr());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Defender defender0 = new Defender(183, 183);
      HandballModel.State handballModel_State0 = HandballModel.State.EDIT;
      handballModel0.setState(handballModel_State0);
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      defender0.setHasBall(true);
      handballModel0.setMarkedPlayer(defender0);
      assertEquals(1, Defender.counter);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Defender defender0 = new Defender(183, 183);
      HandballModel.State handballModel_State0 = HandballModel.State.EDIT;
      MoveEvent moveEvent0 = new MoveEvent(defender0, 145);
      handballModel0.addMoveEvent(moveEvent0);
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      handballModel0.setState(handballModel_State0);
      defender0.setHasBall(true);
      ActionEvent actionEvent0 = new ActionEvent(newPassEventAction0, 1, "", 1);
      // Undeclared exception!
      try { 
        newPassEventAction0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.model.MoveEvent", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      HandballModel.State handballModel_State0 = HandballModel.State.EDIT;
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      handballModel0.setState(handballModel_State0);
      assertEquals(0, handballModel0.getAcutalSequenceNr());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Defender defender0 = new Defender(183, 183);
      handballModel0.setMarkedPlayer(defender0);
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      ActionEvent actionEvent0 = new ActionEvent(newPassEventAction0, 1, "", 1);
      newPassEventAction0.actionPerformed(actionEvent0);
      assertEquals("", actionEvent0.getActionCommand());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      ActionEvent actionEvent0 = new ActionEvent(handballModel0, 0, "Verteidiger 1");
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      newPassEventAction0.actionPerformed(actionEvent0);
      assertEquals("Verteidiger 1", actionEvent0.getActionCommand());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      SynthSpinnerUI synthSpinnerUI0 = new SynthSpinnerUI();
      newPassEventAction0.addPropertyChangeListener(synthSpinnerUI0);
      // Undeclared exception!
      try { 
        newPassEventAction0.modelChanged();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // visu.handball.moves.actions.NewPassEventAction cannot be cast to javax.swing.JSpinner
         //
         verifyException("javax.swing.plaf.synth.SynthSpinnerUI", e);
      }
  }
}
