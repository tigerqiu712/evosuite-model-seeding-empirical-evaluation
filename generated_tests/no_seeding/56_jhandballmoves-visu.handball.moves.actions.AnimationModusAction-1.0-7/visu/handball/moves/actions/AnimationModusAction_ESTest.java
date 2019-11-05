/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 20:56:22 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JRadioButton;
import javax.swing.plaf.metal.MetalComboBoxUI;
import javax.swing.plaf.synth.SynthSpinnerUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.AnimationModusAction;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.HandballModelListener;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.player.Defender;
import visu.handball.moves.model.player.Offender;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AnimationModusAction_ESTest extends AnimationModusAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      AnimationModusAction animationModusAction0 = new AnimationModusAction(handballModel0);
      SynthSpinnerUI synthSpinnerUI0 = new SynthSpinnerUI();
      animationModusAction0.addPropertyChangeListener(synthSpinnerUI0);
      // Undeclared exception!
      try { 
        animationModusAction0.modelChanged();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // visu.handball.moves.actions.AnimationModusAction cannot be cast to javax.swing.JSpinner
         //
         verifyException("javax.swing.plaf.synth.SynthSpinnerUI", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      handballModel0.addListener((HandballModelListener) null);
      AnimationModusAction animationModusAction0 = new AnimationModusAction(handballModel0);
      // Undeclared exception!
      try { 
        animationModusAction0.actionPerformed((ActionEvent) null);
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
      HandballModel handballModel0 = new HandballModel();
      AnimationModusAction animationModusAction0 = new AnimationModusAction(handballModel0);
      JRadioButton jRadioButton0 = new JRadioButton("Animieren einschalten", true);
      MetalComboBoxUI metalComboBoxUI0 = new MetalComboBoxUI();
      PropertyChangeListener propertyChangeListener0 = metalComboBoxUI0.createPropertyChangeListener();
      animationModusAction0.addPropertyChangeListener(propertyChangeListener0);
      ActionEvent actionEvent0 = new ActionEvent(jRadioButton0, (-1678), "Animieren einschalten", (-1678));
      // Undeclared exception!
      try { 
        animationModusAction0.actionPerformed(actionEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // visu.handball.moves.actions.AnimationModusAction cannot be cast to javax.swing.JComboBox
         //
         verifyException("javax.swing.plaf.basic.BasicComboBoxUI$Handler", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AnimationModusAction animationModusAction0 = null;
      try {
        animationModusAction0 = new AnimationModusAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.AnimationModusAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      AnimationModusAction animationModusAction0 = new AnimationModusAction(handballModel0);
      Offender offender0 = new Offender(0, 0);
      MoveEvent moveEvent0 = new MoveEvent(offender0, 1);
      handballModel0.setActualMoveEvent(moveEvent0);
      assertFalse(handballModel0.isBallSet());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Defender defender0 = new Defender((byte)0, (byte) (-4));
      MoveEvent moveEvent0 = new MoveEvent(defender0, 1, (byte) (-4));
      handballModel0.addMoveEvent(moveEvent0);
      AnimationModusAction animationModusAction0 = new AnimationModusAction(handballModel0);
      // Undeclared exception!
      try { 
        handballModel0.startAnimation(true);
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
      Defender defender0 = new Defender((byte)0, (byte) (-4));
      MoveEvent moveEvent0 = new MoveEvent(defender0, 1, (byte) (-4));
      handballModel0.addMoveEvent(moveEvent0);
      AnimationModusAction animationModusAction0 = new AnimationModusAction(handballModel0);
      animationModusAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      AnimationModusAction animationModusAction0 = new AnimationModusAction(handballModel0);
      animationModusAction0.actionPerformed((ActionEvent) null);
  }
}