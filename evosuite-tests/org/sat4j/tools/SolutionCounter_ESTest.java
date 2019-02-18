/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 19:55:59 GMT 2019
 */

package org.sat4j.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.tools.ClausalCardinalitiesDecorator;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.GateTranslator;
import org.sat4j.tools.LexicoDecorator;
import org.sat4j.tools.SolutionCounter;
import org.sat4j.tools.encoding.Binomial;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SolutionCounter_ESTest extends SolutionCounter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      SolutionCounter solutionCounter0 = new SolutionCounter(dimacsStringSolver0);
      try { 
        solutionCounter0.countSolutions();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // There is no real solver behind!
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[1];
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false).when(iSolver0).isSatisfiable(anyBoolean());
      SolutionCounter solutionCounter0 = new SolutionCounter(iSolver0);
      solutionCounter0.countSolutions();
      solutionCounter0.countSolutions();
      solutionCounter0.countSolutions();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GateTranslator gateTranslator0 = mock(GateTranslator.class, new ViolatedAssumptionAnswer());
      doReturn(false, true).when(gateTranslator0).isSatisfiable(anyBoolean());
      doReturn((int[]) null).when(gateTranslator0).model();
      Binomial binomial0 = new Binomial();
      ClausalCardinalitiesDecorator<GateTranslator> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<GateTranslator>(gateTranslator0, binomial0);
      SolutionCounter solutionCounter0 = new SolutionCounter(clausalCardinalitiesDecorator0);
      solutionCounter0.countSolutions();
      // Undeclared exception!
      try { 
        solutionCounter0.countSolutions();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolutionCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[1];
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(iSolver0).isSatisfiable(anyBoolean());
      doReturn(intArray0).when(iSolver0).model();
      doReturn((IConstr) null).when(iSolver0).addClause(any(org.sat4j.specs.IVecInt.class));
      SolutionCounter solutionCounter0 = new SolutionCounter(iSolver0);
      solutionCounter0.countSolutions();
      int int0 = solutionCounter0.lowerBound();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      LexicoDecorator<DimacsOutputSolver> lexicoDecorator0 = new LexicoDecorator<DimacsOutputSolver>(dimacsOutputSolver0);
      SolutionCounter solutionCounter0 = new SolutionCounter(lexicoDecorator0);
      int int0 = solutionCounter0.lowerBound();
      assertEquals(0, int0);
  }
}