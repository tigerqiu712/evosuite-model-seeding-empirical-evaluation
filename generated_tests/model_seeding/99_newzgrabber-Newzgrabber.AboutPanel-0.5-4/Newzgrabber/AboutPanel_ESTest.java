/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 18:09:51 GMT 2019
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import Newzgrabber.AboutPanel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AboutPanel_ESTest extends AboutPanel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AboutPanel aboutPanel0 = new AboutPanel();
      assertFalse(aboutPanel0.isFocusTraversalPolicyProvider());
  }
}
