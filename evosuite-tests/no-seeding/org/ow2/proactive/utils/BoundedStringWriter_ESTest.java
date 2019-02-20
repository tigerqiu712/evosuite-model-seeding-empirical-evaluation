/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 01:42:59 GMT 2019
 */

package org.ow2.proactive.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;
import org.ow2.proactive.utils.BoundedStringWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BoundedStringWriter_ESTest extends BoundedStringWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("The list of suffixes must not be null");
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter(mockPrintStream0, 1);
      char[] charArray0 = new char[9];
      boundedStringWriter0.write("1Q:F`");
      boundedStringWriter0.write(charArray0, 1, 1);
      assertEquals("\u0000", boundedStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, false);
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter(mockPrintStream0, 7);
      char[] charArray0 = new char[5];
      boundedStringWriter0.write(charArray0);
      // Undeclared exception!
      try { 
        boundedStringWriter0.write(charArray0, 7, (-1847));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("The list of suffixes must not be null");
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter(mockPrintStream0, 1);
      char[] charArray0 = new char[9];
      boundedStringWriter0.write(charArray0, 1, 1);
      assertEquals("\u0000", boundedStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("The list of suffixes must not be null");
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter(mockPrintStream0, 1);
      char[] charArray0 = new char[9];
      boundedStringWriter0.write(charArray0);
      boundedStringWriter0.write(charArray0);
      assertEquals("\u0000", boundedStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      File file0 = MockFile.createTempFile("?%LkD7Zrz<v`70sO", "");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter(mockPrintStream0, 0);
      StringBuilder stringBuilder0 = boundedStringWriter0.getBuilder();
      stringBuilder0.append(true);
      String string0 = boundedStringWriter0.toString();
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.ow2.proactive.utils.BoundedStringWriter", "org.ow2.proactive.utils.BoundedStringWriter");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, false);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, false);
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter(mockPrintStream0, 0);
      boundedStringWriter0.setContentBuffer((StringBuilder) null);
      StringBuilder stringBuilder0 = boundedStringWriter0.getBuilder();
      assertNull(stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.ow2.proactive.utils.BoundedStringWriter");
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter(mockPrintStream0, (-1720));
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        boundedStringWriter0.write(charArray0, 585, 585);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter((PrintStream) null, 2182);
      // Undeclared exception!
      try { 
        boundedStringWriter0.write((char[]) null, 2182, 2182);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, false);
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter(mockPrintStream0, 7);
      char[] charArray0 = new char[5];
      boundedStringWriter0.write(charArray0);
      boundedStringWriter0.write(charArray0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000", boundedStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.ow2.proactive.utils.BoundedStringWriter");
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter(mockPrintStream0, (-1720));
      boundedStringWriter0.close();
      assertEquals("", boundedStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.apache.commons.io.filefilter.AbstractFileFilter");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter(mockPrintStream0, 0);
      boundedStringWriter0.flush();
      assertEquals("", boundedStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.ow2.proactive.utils.BoundedStringWriter");
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter(mockPrintStream0, (-1720));
      boundedStringWriter0.setContentBuffer((StringBuilder) null);
      // Undeclared exception!
      try { 
        boundedStringWriter0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.utils.BoundedStringWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter((PrintStream) null, 28);
      String string0 = boundedStringWriter0.toString();
      assertEquals("", string0);
  }
}