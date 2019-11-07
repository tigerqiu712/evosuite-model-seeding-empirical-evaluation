/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 22:16:36 GMT 2019
 */

package de.paragon.explorer.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.paragon.explorer.model.ExplorerModel;
import de.paragon.explorer.util.ExplorerManager;
import java.util.Collection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExplorerManager_ESTest extends ExplorerManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExplorerManager explorerManager0 = ExplorerManager.INSTANCE;
      Collection<ExplorerModel> collection0 = explorerManager0.getExistingExplorerModels();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ExplorerManager explorerManager0 = ExplorerManager.INSTANCE;
      ExplorerModel explorerModel0 = new ExplorerModel();
      // Undeclared exception!
      try { 
        explorerManager0.addExplorerModel(explorerModel0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.paragon.explorer.util.ExplorerManager", e);
      }
  }
}
