/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 19:20:20 GMT 2019
 */

package com.soops.CEN4010.JMCA.JParser.parseTest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.parseTest.JMCAParserTestApplication;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JMCAParserTestApplication_ESTest extends JMCAParserTestApplication_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JMCAParserTestApplication jMCAParserTestApplication0 = new JMCAParserTestApplication("");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        JMCAParserTestApplication.main((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.parseTest.JMCAParserTestApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("QyhX");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Kaq:i1Mm.;G");
      JMCAParserTestApplication jMCAParserTestApplication0 = null;
      try {
        jMCAParserTestApplication0 = new JMCAParserTestApplication("QyhX");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JMCAParserTestApplication jMCAParserTestApplication0 = null;
      try {
        jMCAParserTestApplication0 = new JMCAParserTestApplication((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("EKFjj/.G&L9_J][8ztW");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JMCAParserTestApplication jMCAParserTestApplication0 = null;
      try {
        jMCAParserTestApplication0 = new JMCAParserTestApplication("EKFjj/.G&L9_J][8ztW");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[2];
      JMCAParserTestApplication.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[1];
      JMCAParserTestApplication.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }
}
