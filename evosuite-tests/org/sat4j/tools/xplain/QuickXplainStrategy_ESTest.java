/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 19:37:29 GMT 2019
 */

package org.sat4j.tools.xplain;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.core.ASolverFactory;
import org.sat4j.core.ReadOnlyVecInt;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.CardinalityDataStructure;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.IVisualizationTool;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.ModelIterator;
import org.sat4j.tools.SolutionFoundListener;
import org.sat4j.tools.StatisticsSolver;
import org.sat4j.tools.xplain.QuickXplainStrategy;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QuickXplainStrategy_ESTest extends QuickXplainStrategy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      VecInt vecInt0 = new VecInt(1, 1);
      IVecInt iVecInt0 = vecInt0.clone();
      iVecInt0.clear();
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(iVecInt0).when(iSolver0).unsatExplanation();
      vecInt0.moveTo(iVecInt0);
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(iSolver0, vecInt0, (SolutionFoundListener) null);
      quickXplainStrategy0.explain(minimal4CardinalityModel0, hashMap0, vecInt0);
      assertEquals(1, iVecInt0.size());
      assertTrue(vecInt0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      VecInt vecInt0 = new VecInt(33, 33);
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn("|").when(iSolver0).getLogPrefix();
      doReturn(true).when(iSolver0).isVerbose();
      doReturn(vecInt0).when(iSolver0).unsatExplanation();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      IVecInt iVecInt0 = VecInt.EMPTY;
      Integer integer0 = new Integer(33);
      hashMap0.put(integer0, "|");
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(iSolver0, vecInt0, solutionFoundListener0);
      // Undeclared exception!
      try { 
        quickXplainStrategy0.explain(minimal4CardinalityModel0, hashMap0, iVecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      VecInt vecInt0 = new VecInt(18, 18);
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn("|").when(iSolver0).getLogPrefix();
      doReturn(true).when(iSolver0).isVerbose();
      doReturn(vecInt0).when(iSolver0).unsatExplanation();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      IVecInt iVecInt0 = VecInt.EMPTY;
      Integer integer0 = IVisualizationTool.NOTGOOD;
      Object object0 = hashMap0.put(integer0, iVecInt0);
      Integer integer1 = new Integer(28);
      Integer integer2 = new Integer((-3318));
      hashMap0.put(integer2, object0);
      hashMap0.put(integer1, (Object) null);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(iSolver0, vecInt0, (SolutionFoundListener) null);
      // Undeclared exception!
      try { 
        quickXplainStrategy0.explain(minimal4CardinalityModel0, hashMap0, iVecInt0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      HashMap<Integer, CardinalityDataStructure> hashMap0 = new HashMap<Integer, CardinalityDataStructure>();
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(statisticsSolver0);
      // Undeclared exception!
      try { 
        quickXplainStrategy0.explain(statisticsSolver0, hashMap0, iVecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      // Undeclared exception!
      try { 
        quickXplainStrategy0.explain((ISolver) null, hashMap0, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.xplain.QuickXplainStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      VecInt vecInt0 = new VecInt(1);
      vecInt0.pop();
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      // Undeclared exception!
      try { 
        quickXplainStrategy0.explain(iSolver0, hashMap0, vecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      ASolverFactory<ManyCore<ModelIterator>> aSolverFactory0 = (ASolverFactory<ManyCore<ModelIterator>>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[0];
      ManyCore<ManyCore<ModelIterator>> manyCore0 = new ManyCore<ManyCore<ModelIterator>>(aSolverFactory0, stringArray0);
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      VecInt vecInt0 = new VecInt(1);
      // Undeclared exception!
      try { 
        quickXplainStrategy0.explain(manyCore0, hashMap0, vecInt0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      VecInt vecInt0 = new VecInt();
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(true, true).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn("=IkXQ<&m", "=IkXQ<&m", "=IkXQ<&m").when(iSolver0).getLogPrefix();
      doReturn(true, true, true, false).when(iSolver0).isVerbose();
      doReturn(vecInt0).when(iSolver0).unsatExplanation();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Integer integer0 = IVisualizationTool.NOTGOOD;
      hashMap0.put(integer0, quickXplainStrategy0);
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(iSolver0, readOnlyVecInt0, (SolutionFoundListener) null);
      IVecInt iVecInt0 = quickXplainStrategy0.explain(minimal4CardinalityModel0, hashMap0, vecInt0);
      assertEquals(1, iVecInt0.size());
      assertEquals(Integer.MIN_VALUE, iVecInt0.last());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      VecInt vecInt0 = new VecInt(33, 33);
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(true, false, false).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn("|", "|").when(iSolver0).getLogPrefix();
      doReturn(true, true, false, false).when(iSolver0).isVerbose();
      doReturn(vecInt0).when(iSolver0).unsatExplanation();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Integer integer0 = IVisualizationTool.NOTGOOD;
      hashMap0.put(integer0, (Object) null);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(iSolver0, vecInt0, (SolutionFoundListener) null);
      IVecInt iVecInt0 = quickXplainStrategy0.explain(minimal4CardinalityModel0, hashMap0, vecInt0);
      assertTrue(vecInt0.isEmpty());
      assertTrue(iVecInt0.equals((Object)vecInt0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      VecInt vecInt0 = new VecInt();
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(false, true).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn("org.sat4j.minisat.orders.TabuListDecorator", "org.sat4j.minisat.orders.TabuListDecorator").when(iSolver0).getLogPrefix();
      doReturn(true, false, false, true).when(iSolver0).isVerbose();
      doReturn(vecInt0, vecInt0).when(iSolver0).unsatExplanation();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(iSolver0, vecInt0, (SolutionFoundListener) null);
      quickXplainStrategy0.explain(minimal4CardinalityModel0, hashMap0, vecInt0);
      // Undeclared exception!
      try { 
        quickXplainStrategy0.explain(minimal4CardinalityModel0, hashMap0, vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      String string0 = quickXplainStrategy0.toString();
      assertEquals("QuickXplain (AAAI 2004 version) minimization strategy", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      quickXplainStrategy0.cancelExplanationComputation();
      VecInt vecInt0 = new VecInt(33, 33);
      IVecInt iVecInt0 = vecInt0.clone();
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn("|", "|", (String) null).when(iSolver0).getLogPrefix();
      doReturn(true, true, true, false).when(iSolver0).isVerbose();
      doReturn(iVecInt0, vecInt0).when(iSolver0).unsatExplanation();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(iSolver0, iVecInt0, (SolutionFoundListener) null);
      IVecInt iVecInt1 = quickXplainStrategy0.explain(minimal4CardinalityModel0, hashMap0, vecInt0);
      quickXplainStrategy0.explain(minimal4CardinalityModel0, hashMap0, vecInt0);
      assertTrue(iVecInt0.isEmpty());
      assertTrue(vecInt0.equals((Object)iVecInt1));
  }
}
