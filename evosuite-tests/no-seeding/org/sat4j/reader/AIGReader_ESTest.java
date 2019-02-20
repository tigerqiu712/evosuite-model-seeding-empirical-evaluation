/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 01:08:15 GMT 2019
 */

package org.sat4j.reader;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PrintWriter;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;
import org.sat4j.LightFactory;
import org.sat4j.reader.AIGReader;
import org.sat4j.reader.Reader;
import org.sat4j.specs.ISolver;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.ManyCore;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AIGReader_ESTest extends AIGReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("unexpected character");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockPrintStream0, true);
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver(mockPrintWriter0);
      Locale locale0 = Locale.PRC;
      Object[] objectArray0 = new Object[6];
      mockPrintWriter0.printf(locale0, "unexpected character", objectArray0);
      AIGReader aIGReader0 = new AIGReader(dimacsOutputSolver0);
      InputStream inputStream0 = Reader.getInputStreamFromFilename("unexpected character");
      try { 
        aIGReader0.parseInstance(inputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing ErrorAIG format only!
         //
         verifyException("org.sat4j.reader.AIGReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)98;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 128);
      int int0 = AIGReader.safeGet(byteArrayInputStream0);
      assertEquals(98, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte) (-8);
      byteArray0[2] = (byte) (-8);
      byteArray0[3] = (byte) (-1);
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)43;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 128);
      AIGReader.safeGet(byteArrayInputStream0);
      int int0 = AIGReader.decode((InputStream) byteArrayInputStream0);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals((-1073742728), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        AIGReader.safeGet((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.AIGReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-985), 57);
      // Undeclared exception!
      try { 
        AIGReader.safeGet(byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      try { 
        AIGReader.safeGet(dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      AIGReader aIGReader0 = new AIGReader(dimacsOutputSolver0);
      // Undeclared exception!
      try { 
        aIGReader0.parseInt((InputStream) null, 'r');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.AIGReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AIGReader aIGReader0 = new AIGReader((ISolver) null);
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-128), 103);
      // Undeclared exception!
      try { 
        aIGReader0.parseInt(byteArrayInputStream0, 'b');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AIGReader aIGReader0 = new AIGReader((ISolver) null);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        aIGReader0.parseInt(pipedInputStream0, 'p');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AIGReader aIGReader0 = new AIGReader((ISolver) null);
      // Undeclared exception!
      try { 
        aIGReader0.parseInstance((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.AIGReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-128), 66);
      AIGReader aIGReader0 = new AIGReader((ISolver) null);
      // Undeclared exception!
      try { 
        aIGReader0.parseInstance((InputStream) byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AIGReader aIGReader0 = new AIGReader((ISolver) null);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        aIGReader0.parseInstance((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        AIGReader.decode((InputStream) sequenceInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing ErrorAIG Error, EOF met too early
         //
         verifyException("org.sat4j.reader.AIGReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        AIGReader.decode((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.AIGReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-567), 58);
      // Undeclared exception!
      try { 
        AIGReader.decode((InputStream) byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      try { 
        AIGReader.decode((InputStream) bufferedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte) (-8);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 128);
      AIGReader.safeGet(byteArrayInputStream0);
      int int0 = AIGReader.decode((InputStream) byteArrayInputStream0);
      assertEquals(3, byteArrayInputStream0.available());
      assertEquals(120, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 128);
      int int0 = AIGReader.decode((InputStream) byteArrayInputStream0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        AIGReader.safeGet(sequenceInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing ErrorAIG Error, EOF met too early
         //
         verifyException("org.sat4j.reader.AIGReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      AIGReader aIGReader0 = new AIGReader(iSolver0);
      try { 
        aIGReader0.parseInstance((InputStream) sequenceInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing ErrorAIG format only!
         //
         verifyException("org.sat4j.reader.AIGReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DimacsOutputSolver[] dimacsOutputSolverArray0 = new DimacsOutputSolver[2];
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolverArray0[0] = dimacsOutputSolver0;
      dimacsOutputSolverArray0[1] = dimacsOutputSolver0;
      ManyCore<DimacsOutputSolver> manyCore0 = new ManyCore<DimacsOutputSolver>(dimacsOutputSolverArray0);
      AIGReader aIGReader0 = new AIGReader(manyCore0);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)56;
      byteArray0[1] = (byte)56;
      byteArray0[2] = (byte) (-92);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        aIGReader0.parseInt(byteArrayInputStream0, '#');
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing Errorunexpected character
         //
         verifyException("org.sat4j.reader.AIGReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AIGReader aIGReader0 = new AIGReader((ISolver) null);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)95;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        aIGReader0.parseInt(byteArrayInputStream0, 'e');
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing Errorexpected digit
         //
         verifyException("org.sat4j.reader.AIGReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DimacsOutputSolver[] dimacsOutputSolverArray0 = new DimacsOutputSolver[2];
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolverArray0[0] = dimacsOutputSolver0;
      dimacsOutputSolverArray0[1] = dimacsOutputSolver0;
      ManyCore<DimacsOutputSolver> manyCore0 = new ManyCore<DimacsOutputSolver>(dimacsOutputSolverArray0);
      AIGReader aIGReader0 = new AIGReader(manyCore0);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)56;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        aIGReader0.parseInt(byteArrayInputStream0, '#');
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing Errorunexpected character
         //
         verifyException("org.sat4j.reader.AIGReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AIGReader aIGReader0 = new AIGReader((ISolver) null);
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        aIGReader0.parseInt(byteArrayInputStream0, '#');
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing Errorexpected digit
         //
         verifyException("org.sat4j.reader.AIGReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DimacsOutputSolver[] dimacsOutputSolverArray0 = new DimacsOutputSolver[2];
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolverArray0[0] = dimacsOutputSolver0;
      dimacsOutputSolverArray0[1] = dimacsOutputSolver0;
      ManyCore<DimacsOutputSolver> manyCore0 = new ManyCore<DimacsOutputSolver>(dimacsOutputSolverArray0);
      AIGReader aIGReader0 = new AIGReader(manyCore0);
      int[] intArray0 = new int[6];
      aIGReader0.decode(intArray0, (PrintWriter) null);
      assertEquals(6, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AIGReader aIGReader0 = new AIGReader((ISolver) null);
      int[] intArray0 = new int[1];
      String string0 = aIGReader0.decode(intArray0);
      assertEquals("", string0);
  }
}