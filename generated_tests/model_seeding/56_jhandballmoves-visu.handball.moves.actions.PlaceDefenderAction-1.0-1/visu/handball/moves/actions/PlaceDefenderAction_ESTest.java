/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 11:07:45 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.PlaceDefenderAction;
import visu.handball.moves.model.HandballModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlaceDefenderAction_ESTest extends PlaceDefenderAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PlaceDefenderAction placeDefenderAction0 = null;
      try {
        placeDefenderAction0 = new PlaceDefenderAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.PlaceDefenderAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceDefenderAction placeDefenderAction0 = new PlaceDefenderAction(handballModel0);
      placeDefenderAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      HandballModel.State handballModel_State0 = HandballModel.State.EDIT_EVENT;
      handballModel0.setState(handballModel_State0);
      PlaceDefenderAction placeDefenderAction0 = new PlaceDefenderAction(handballModel0);
      placeDefenderAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      HandballModel.State handballModel_State0 = HandballModel.State.ANIMATION_RUNNING;
      handballModel0.setState(handballModel_State0);
      PlaceDefenderAction placeDefenderAction0 = new PlaceDefenderAction(handballModel0);
      placeDefenderAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceDefenderAction placeDefenderAction0 = new PlaceDefenderAction(handballModel0);
      ActionEvent actionEvent0 = new ActionEvent(handballModel0, (-3244), "ballDrawer.outline");
      placeDefenderAction0.actionPerformed(actionEvent0);
      assertEquals("ballDrawer.outline", actionEvent0.getActionCommand());
  }
}
