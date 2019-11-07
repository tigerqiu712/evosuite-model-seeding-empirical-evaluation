/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 21:10:06 GMT 2019
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.Newzgrabber;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Newzgrabber_ESTest extends Newzgrabber_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "Calling quit method on ";
      stringArray0[1] = "-debug";
      stringArray0[2] = "QuQ3gK1S";
      Newzgrabber.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[10];
      stringArray0[0] = "-debug";
      Newzgrabber.main(stringArray0);
      Newzgrabber.setupBasicSystem();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Newzgrabber newzgrabber0 = null;
      try {
        newzgrabber0 = new Newzgrabber();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = Newzgrabber.findDirectory("leF9KZm@H");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-batch";
      stringArray0[1] = "-batch";
      stringArray0[2] = "-batch";
      stringArray0[3] = "-batch";
      stringArray0[4] = "-batch";
      // Undeclared exception!
      try { 
        Newzgrabber.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-verbose";
      Newzgrabber.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Newzgrabber.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String string0 = Newzgrabber.findDirectory("EvoSuite_pathingJar224408208949849382.jar");
      assertEquals("/tmp", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/EvoSuite_pathingJar224408208949849382.jar");
      FileSystemHandling.createFolder(evoSuiteFile0);
      String string0 = Newzgrabber.findDirectory("EvoSuite_pathingJar224408208549849382.jar");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Newzgrabber newzgrabber0 = null;
      try {
        newzgrabber0 = new Newzgrabber("center");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
