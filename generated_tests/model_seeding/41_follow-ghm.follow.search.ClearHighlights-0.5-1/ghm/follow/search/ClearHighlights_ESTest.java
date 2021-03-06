/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 08:30:17 GMT 2019
 */

package ghm.follow.search;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ghm.follow.FollowApp;
import ghm.follow.search.ClearHighlights;
import java.awt.event.ActionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClearHighlights_ESTest extends ClearHighlights_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClearHighlights clearHighlights0 = new ClearHighlights((FollowApp) null);
      // Undeclared exception!
      try { 
        clearHighlights0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ghm.follow.search.ClearHighlights", e);
      }
  }
}
