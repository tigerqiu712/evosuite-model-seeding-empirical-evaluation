/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 08:16:41 GMT 2019
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
      JMCAParserTestApplication jMCAParserTestApplication0 = new JMCAParserTestApplication("m0Euj|Nv4.d+m");
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
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("#");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      JMCAParserTestApplication jMCAParserTestApplication0 = null;
      try {
        jMCAParserTestApplication0 = new JMCAParserTestApplication("#");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[13];
      JMCAParserTestApplication jMCAParserTestApplication0 = null;
      try {
        jMCAParserTestApplication0 = new JMCAParserTestApplication(stringArray0[0]);
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
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("test.txt");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      JMCAParserTestApplication jMCAParserTestApplication0 = null;
      try {
        jMCAParserTestApplication0 = new JMCAParserTestApplication("test.txt");
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
      String[] stringArray0 = new String[1];
      JMCAParserTestApplication.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JMCAParserTestApplication.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }
}