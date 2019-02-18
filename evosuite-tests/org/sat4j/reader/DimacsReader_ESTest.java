/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 19:51:40 GMT 2019
 */

package org.sat4j.reader;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;
import org.sat4j.LightFactory;
import org.sat4j.core.ASolverFactory;
import org.sat4j.core.VecInt;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.reader.DimacsReader;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.OptToSatAdapter;
import org.sat4j.tools.StatisticsSolver;
import org.sat4j.tools.SubModelIterator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DimacsReader_ESTest extends DimacsReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null, "LIz];{tQ=Wp;<4W");
      int[] intArray0 = new int[9];
      intArray0[0] = (-1295);
      MockFile mockFile0 = new MockFile("org.sat4j.minisat.core.MemoryBasedConflictTimer", "org.sat4j.minisat.core.MemoryBasedConflictTimer");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, false);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockPrintStream0);
      dimacsReader0.decode(intArray0, (PrintWriter) mockPrintWriter0);
      assertFalse(dimacsReader0.hasAMapping());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null, "LIz];{tQ=Wp;<4W");
      int[] intArray0 = new int[9];
      intArray0[0] = (-1295);
      String string0 = dimacsReader0.decode(intArray0);
      assertEquals("-1295 0 0 0 0 0 0 0 0 0", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Minimal4CardinalityModel minimal4CardinalityModel0 = mock(Minimal4CardinalityModel.class, new ViolatedAssumptionAnswer());
      DimacsReader dimacsReader0 = new DimacsReader(minimal4CardinalityModel0);
      try { 
        dimacsReader0.parseInstance((InputStream) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.io.IOException: Stream closed
         //
         verifyException("org.sat4j.reader.DimacsReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      DimacsReader dimacsReader0 = new DimacsReader(dimacsStringSolver0);
      dimacsReader0.flushConstraint();
      assertFalse(dimacsReader0.isUsingMapping());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null, "");
      ISolver iSolver0 = dimacsReader0.getSolver();
      assertNull(iSolver0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      // Undeclared exception!
      try { 
        dimacsReader0.readProblemLine();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.DimacsReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      // Undeclared exception!
      try { 
        dimacsReader0.handleLine();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.DimacsReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.lightSolver();
      DimacsReader dimacsReader0 = new DimacsReader(iSolver0);
      try { 
        dimacsReader0.flushConstraint();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Creating Empty clause ?
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(statisticsSolver0);
      OptToSatAdapter optToSatAdapter0 = new OptToSatAdapter(maxSatDecorator0);
      IVecInt iVecInt0 = VecInt.EMPTY;
      SubModelIterator subModelIterator0 = new SubModelIterator(optToSatAdapter0, iVecInt0, 1072L);
      DimacsReader dimacsReader0 = new DimacsReader(subModelIterator0);
      // Undeclared exception!
      try { 
        dimacsReader0.flushConstraint();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      // Undeclared exception!
      try { 
        dimacsReader0.flushConstraint();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.DimacsReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      // Undeclared exception!
      try { 
        dimacsReader0.decode((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.DimacsReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Minimal4CardinalityModel minimal4CardinalityModel0 = mock(Minimal4CardinalityModel.class, new ViolatedAssumptionAnswer());
      DimacsReader dimacsReader0 = new DimacsReader(minimal4CardinalityModel0);
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        dimacsReader0.decode(intArray0, (PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.DimacsReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      // Undeclared exception!
      try { 
        dimacsReader0.readConstrs();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.DimacsReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      DimacsReader dimacsReader0 = new DimacsReader(statisticsSolver0);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        dimacsReader0.parseInstance((InputStream) sequenceInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing Errorproblem line expected (p cnf ...)
         //
         verifyException("org.sat4j.reader.DimacsReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(iSolver0);
      AbstractMinimalModel.negativeLiterals(iSolver0);
      ASolverFactory<Minimal4CardinalityModel> aSolverFactory0 = (ASolverFactory<Minimal4CardinalityModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(minimal4CardinalityModel0, (ISolver) null).when(aSolverFactory0).createSolverByName(anyString());
      String[] stringArray0 = new String[7];
      stringArray0[0] = ",";
      stringArray0[1] = "HN'YJ7d";
      stringArray0[2] = "0";
      stringArray0[3] = ".J_/i+LK#B%";
      stringArray0[4] = "";
      stringArray0[5] = "|%*";
      stringArray0[6] = "]  ";
      ManyCore<Minimal4CardinalityModel> manyCore0 = null;
      try {
        manyCore0 = new ManyCore<Minimal4CardinalityModel>(aSolverFactory0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      // Undeclared exception!
      try { 
        dimacsReader0.parseInstance((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.DimacsReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      // Undeclared exception!
      try { 
        dimacsReader0.skipComments();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.DimacsReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      dimacsReader0.disableNumberOfConstraintCheck();
      assertFalse(dimacsReader0.isUsingMapping());
  }
}