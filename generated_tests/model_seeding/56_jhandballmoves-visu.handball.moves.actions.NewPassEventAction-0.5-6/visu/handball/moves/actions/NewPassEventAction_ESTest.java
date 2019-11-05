/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 14:10:18 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import javax.swing.plaf.synth.SynthSpinnerUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.NewPassEventAction;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.player.Defender;
import visu.handball.moves.model.player.Player;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NewPassEventAction_ESTest extends NewPassEventAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
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
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Defender defender0 = new Defender(537, 537);
      defender0.setHasBall(true);
      MoveEvent moveEvent0 = new MoveEvent(defender0, 537, 1);
      moveEvent0.setDestinationPoint(1, 1, false);
      handballModel0.setActualMoveEvent(moveEvent0);
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      newPassEventAction0.actionPerformed((ActionEvent) null);
      assertEquals(HandballModel.State.EDIT_EVENT, handballModel0.getState());
      assertEquals(538, handballModel0.getAcutalSequenceNr());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Defender defender0 = new Defender(537, 537);
      defender0.setHasBall(true);
      MoveEvent moveEvent0 = new MoveEvent(defender0, 537, 1);
      moveEvent0.setDestinationPoint(1, 1, false);
      handballModel0.setActualMoveEvent(moveEvent0);
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      newPassEventAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Defender defender0 = new Defender(483, 483);
      MoveEvent moveEvent0 = new MoveEvent(defender0, 483, 1);
      moveEvent0.setPlayer((Player) null);
      moveEvent0.setDestinationPoint(1, 483, false);
      handballModel0.setActualMoveEvent(moveEvent0);
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      newPassEventAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Defender defender0 = new Defender(537, 537);
      MoveEvent moveEvent0 = new MoveEvent(defender0, 537, 1);
      moveEvent0.setDestinationPoint(1, 1, false);
      handballModel0.setActualMoveEvent(moveEvent0);
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      newPassEventAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      Defender defender0 = new Defender(537, 537);
      MoveEvent moveEvent0 = new MoveEvent(defender0, (-715), (-237));
      handballModel0.setActualMoveEvent(moveEvent0);
      newPassEventAction0.actionPerformed((ActionEvent) null);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      newPassEventAction0.actionPerformed((ActionEvent) null);
  }
}