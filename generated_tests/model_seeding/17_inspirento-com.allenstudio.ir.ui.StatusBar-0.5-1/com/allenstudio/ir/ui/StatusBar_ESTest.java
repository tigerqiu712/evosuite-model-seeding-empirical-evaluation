/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 16:08:59 GMT 2019
 */

package com.allenstudio.ir.ui;

import org.junit.Test;
import static org.junit.Assert.*;
import com.allenstudio.ir.ui.StatusBar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StatusBar_ESTest extends StatusBar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StatusBar statusBar0 = new StatusBar();
      statusBar0.initComponents();
      assertFalse(statusBar0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StatusBar statusBar0 = new StatusBar();
      statusBar0.displayTooltip("$Z\u0000vD|wY-I[8o");
      assertTrue(statusBar0.getFocusTraversalKeysEnabled());
  }
}
