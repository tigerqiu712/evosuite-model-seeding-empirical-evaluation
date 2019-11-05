/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 00:04:18 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.StartAnimationAction;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.player.Offender;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StartAnimationAction_ESTest extends StartAnimationAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StartAnimationAction startAnimationAction0 = null;
      try {
        startAnimationAction0 = new StartAnimationAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.StartAnimationAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      StartAnimationAction startAnimationAction0 = new StartAnimationAction(handballModel0);
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
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      StartAnimationAction startAnimationAction0 = new StartAnimationAction(handballModel0);
      Offender offender0 = new Offender((-1489), (-1489));
      MoveEvent moveEvent0 = new MoveEvent(offender0, (-1489));
      handballModel0.setActualMoveEvent(moveEvent0);
      ActionEvent actionEvent0 = new ActionEvent(offender0.counter, 2597, "N*,],pE&Yu;HSFu");
      startAnimationAction0.actionPerformed(actionEvent0);
      assertEquals(0L, actionEvent0.getWhen());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      HandballModel.State handballModel_State0 = HandballModel.State.FULL_ANIMATION_ENDED;
      handballModel0.setState(handballModel_State0);
      StartAnimationAction startAnimationAction0 = new StartAnimationAction(handballModel0);
      startAnimationAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      handballModel0.stopAnimation();
      StartAnimationAction startAnimationAction0 = new StartAnimationAction(handballModel0);
      startAnimationAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      HandballModel.State handballModel_State0 = HandballModel.State.ANIMATION_RUNNING;
      handballModel0.setState(handballModel_State0);
      StartAnimationAction startAnimationAction0 = new StartAnimationAction(handballModel0);
      // Undeclared exception!
      try { 
        startAnimationAction0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.model.HandballModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      StartAnimationAction startAnimationAction0 = new StartAnimationAction(handballModel0);
      Offender offender0 = new Offender((-1489), (-1489));
      ActionEvent actionEvent0 = new ActionEvent(offender0.counter, 2597, "N*,],pE&Yu;HSFu");
      // Undeclared exception!
      try { 
        startAnimationAction0.actionPerformed(actionEvent0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}