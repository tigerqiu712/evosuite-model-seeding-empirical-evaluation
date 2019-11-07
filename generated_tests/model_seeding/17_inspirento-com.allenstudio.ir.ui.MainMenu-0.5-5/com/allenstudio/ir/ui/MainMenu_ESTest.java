/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 18:31:04 GMT 2019
 */

package com.allenstudio.ir.ui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.allenstudio.ir.core.InspirentoMediator;
import com.allenstudio.ir.ui.MainMenu;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MainMenu_ESTest extends MainMenu_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InspirentoMediator inspirentoMediator0 = mock(InspirentoMediator.class, new ViolatedAssumptionAnswer());
      MainMenu mainMenu0 = new MainMenu(inspirentoMediator0);
      mainMenu0.changed();
      assertFalse(mainMenu0.isFocusTraversalPolicyProvider());
  }
}
