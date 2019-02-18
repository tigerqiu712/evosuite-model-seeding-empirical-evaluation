/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 19:52:27 GMT 2019
 */

package org.sat4j.reader;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PrintWriter;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.BasicLauncher;
import org.sat4j.core.ASolverFactory;
import org.sat4j.reader.LecteurDimacs;
import org.sat4j.specs.ISolver;
import org.sat4j.tools.ModelIterator;
import org.sat4j.tools.NegationDecorator;
import org.sat4j.tools.SolutionCounter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LecteurDimacs_ESTest extends LecteurDimacs_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ModelIterator modelIterator0 = mock(ModelIterator.class, new ViolatedAssumptionAnswer());
      NegationDecorator<ModelIterator> negationDecorator0 = new NegationDecorator<ModelIterator>(modelIterator0);
      SolutionCounter solutionCounter0 = new SolutionCounter(negationDecorator0);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)32;
      byteArray0[1] = (byte)10;
      byteArray0[2] = (byte) (-122);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 9);
      LecteurDimacs lecteurDimacs0 = new LecteurDimacs(solutionCounter0);
      try { 
        lecteurDimacs0.parseInstance((InputStream) byteArrayInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing ErrorDIMACS error: wrong max number of variables
         //
         verifyException("org.sat4j.reader.LecteurDimacs", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LecteurDimacs lecteurDimacs0 = new LecteurDimacs((ISolver) null);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        lecteurDimacs0.parseInstance((InputStream) pipedInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.LecteurDimacs", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ModelIterator modelIterator0 = mock(ModelIterator.class, new ViolatedAssumptionAnswer());
      NegationDecorator<ModelIterator> negationDecorator0 = new NegationDecorator<ModelIterator>(modelIterator0);
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1720), (byte)19);
      LecteurDimacs lecteurDimacs0 = new LecteurDimacs(negationDecorator0);
      // Undeclared exception!
      try { 
        lecteurDimacs0.parseInstance((InputStream) byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ModelIterator modelIterator0 = mock(ModelIterator.class, new ViolatedAssumptionAnswer());
      NegationDecorator<ModelIterator> negationDecorator0 = new NegationDecorator<ModelIterator>(modelIterator0);
      LecteurDimacs lecteurDimacs0 = new LecteurDimacs(negationDecorator0);
      try { 
        lecteurDimacs0.parseInstance((InputStream) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[8];
      ModelIterator modelIterator0 = mock(ModelIterator.class, new ViolatedAssumptionAnswer());
      NegationDecorator<ModelIterator> negationDecorator0 = new NegationDecorator<ModelIterator>(modelIterator0);
      LecteurDimacs lecteurDimacs0 = new LecteurDimacs(negationDecorator0);
      // Undeclared exception!
      try { 
        lecteurDimacs0.decode(intArray0, (PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.LecteurDimacs", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ModelIterator modelIterator0 = mock(ModelIterator.class, new ViolatedAssumptionAnswer());
      NegationDecorator<ModelIterator> negationDecorator0 = new NegationDecorator<ModelIterator>(modelIterator0);
      LecteurDimacs lecteurDimacs0 = new LecteurDimacs(negationDecorator0);
      // Undeclared exception!
      try { 
        lecteurDimacs0.decode((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.LecteurDimacs", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ModelIterator modelIterator0 = mock(ModelIterator.class, new ViolatedAssumptionAnswer());
      NegationDecorator<ModelIterator> negationDecorator0 = new NegationDecorator<ModelIterator>(modelIterator0);
      LecteurDimacs lecteurDimacs0 = new LecteurDimacs(negationDecorator0);
      boolean boolean0 = lecteurDimacs0.hasAMapping();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[1];
      ModelIterator modelIterator0 = mock(ModelIterator.class, new ViolatedAssumptionAnswer());
      NegationDecorator<ModelIterator> negationDecorator0 = new NegationDecorator<ModelIterator>(modelIterator0);
      SolutionCounter solutionCounter0 = new SolutionCounter(negationDecorator0);
      LecteurDimacs lecteurDimacs0 = new LecteurDimacs(solutionCounter0);
      ASolverFactory<ModelIterator> aSolverFactory0 = (ASolverFactory<ModelIterator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<ModelIterator> basicLauncher0 = new BasicLauncher<ModelIterator>(aSolverFactory0);
      PrintWriter printWriter0 = basicLauncher0.getLogWriter();
      lecteurDimacs0.decode(intArray0, printWriter0);
      assertFalse(lecteurDimacs0.isVerbose());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[1];
      ModelIterator modelIterator0 = mock(ModelIterator.class, new ViolatedAssumptionAnswer());
      NegationDecorator<ModelIterator> negationDecorator0 = new NegationDecorator<ModelIterator>(modelIterator0);
      LecteurDimacs lecteurDimacs0 = new LecteurDimacs(negationDecorator0);
      String string0 = lecteurDimacs0.decode(intArray0);
      assertEquals("0 0", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ModelIterator modelIterator0 = mock(ModelIterator.class, new ViolatedAssumptionAnswer());
      NegationDecorator<ModelIterator> negationDecorator0 = new NegationDecorator<ModelIterator>(modelIterator0);
      SolutionCounter solutionCounter0 = new SolutionCounter(negationDecorator0);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)32;
      byteArray0[1] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 9);
      LecteurDimacs lecteurDimacs0 = new LecteurDimacs(solutionCounter0);
      try { 
        lecteurDimacs0.parseInstance((InputStream) byteArrayInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing ErrorDIMACS error: wrong max number of variables
         //
         verifyException("org.sat4j.reader.LecteurDimacs", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ModelIterator modelIterator0 = mock(ModelIterator.class, new ViolatedAssumptionAnswer());
      NegationDecorator<ModelIterator> negationDecorator0 = new NegationDecorator<ModelIterator>(modelIterator0);
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte)112;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 3, (byte)112);
      LecteurDimacs lecteurDimacs0 = new LecteurDimacs(negationDecorator0);
      try { 
        lecteurDimacs0.parseInstance((InputStream) byteArrayInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing ErrorExpecting file in cnf format.
         //
         verifyException("org.sat4j.reader.LecteurDimacs", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ModelIterator modelIterator0 = mock(ModelIterator.class, new ViolatedAssumptionAnswer());
      NegationDecorator<ModelIterator> negationDecorator0 = new NegationDecorator<ModelIterator>(modelIterator0);
      LecteurDimacs lecteurDimacs0 = new LecteurDimacs(negationDecorator0);
      Map<Integer, String> map0 = lecteurDimacs0.getMapping();
      assertNull(map0);
  }
}
