/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 19:53:25 GMT 2019
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
import org.sat4j.LightFactory;
import org.sat4j.MUSLauncher;
import org.sat4j.core.ASolverFactory;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.MixedDataStructureDanielHT;
import org.sat4j.minisat.constraints.MixedDataStructureDanielWL;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.ClauseOnlyLearning;
import org.sat4j.minisat.learning.FixedLengthLearning;
import org.sat4j.minisat.orders.LevelBasedVarOrderHeap;
import org.sat4j.minisat.orders.RandomWalkDecorator;
import org.sat4j.minisat.orders.SubsetVarOrder;
import org.sat4j.minisat.restarts.LubyRestarts;
import org.sat4j.minisat.restarts.NoRestarts;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.specs.Constr;
import org.sat4j.specs.ILogAble;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.CheckMUSSolutionListener;
import org.sat4j.tools.ClausalCardinalitiesDecorator;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.GateTranslator;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.ModelIterator;
import org.sat4j.tools.ModelIteratorToSATAdapter;
import org.sat4j.tools.SingleSolutionDetector;
import org.sat4j.tools.SolutionFoundListener;
import org.sat4j.tools.StatisticsSolver;
import org.sat4j.tools.SubModelIterator;
import org.sat4j.tools.encoding.Ladder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ModelIterator_ESTest extends ModelIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ModelIterator modelIterator0 = new ModelIterator((ISolver) null, (-3780L));
      boolean boolean0 = modelIterator0.isSatisfiable((IVecInt) null);
      assertFalse(boolean0);
      assertEquals(0L, modelIterator0.numberOfModelsFoundSoFar());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      iSolver0.isSatisfiable();
      ModelIterator modelIterator0 = new ModelIterator(iSolver0, (-517L));
      modelIterator0.primeImplicant();
      long long0 = modelIterator0.numberOfModelsFoundSoFar();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[3];
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      VecInt vecInt0 = new VecInt(0);
      Constr constr0 = mixedDataStructureDanielWL0.createUnregisteredCardinalityConstraint(vecInt0, (-2546));
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(intArray0).when(iSolver0).model();
      doReturn(0, 1319).when(iSolver0).nVars();
      doReturn((Object) intArray0, (Object) intArray0).when(iSolver0).primeImplicant();
      doReturn(constr0, constr0).when(iSolver0).addBlockingClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(constr0).when(iSolver0).discardCurrentModel();
      ModelIterator modelIterator0 = new ModelIterator(iSolver0, 0L);
      modelIterator0.primeImplicant();
      modelIterator0.primeImplicant();
      modelIterator0.model();
      long long0 = modelIterator0.numberOfModelsFoundSoFar();
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MaxSatDecorator maxSatDecorator0 = mock(MaxSatDecorator.class, new ViolatedAssumptionAnswer());
      Ladder ladder0 = new Ladder();
      ClausalCardinalitiesDecorator<MaxSatDecorator> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<MaxSatDecorator>(maxSatDecorator0, ladder0);
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(clausalCardinalitiesDecorator0, (SolutionFoundListener) null);
      modelIteratorToSATAdapter0.model();
      assertEquals(0L, modelIteratorToSATAdapter0.numberOfModelsFoundSoFar());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      iSolver0.isSatisfiable();
      ModelIterator modelIterator0 = new ModelIterator(iSolver0, (-517L));
      modelIterator0.model();
      assertEquals(1L, modelIterator0.numberOfModelsFoundSoFar());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FixedLengthLearning<MixedDataStructureDanielHT> fixedLengthLearning0 = new FixedLengthLearning<MixedDataStructureDanielHT>();
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      SearchParams searchParams0 = new SearchParams((-182.7486791326369), 3147.0694383465393, 3147.0694383465393, 1839);
      int[] intArray0 = new int[0];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(subsetVarOrder0);
      NoRestarts noRestarts0 = new NoRestarts();
      ILogAble iLogAble0 = ILogAble.CONSOLE;
      Solver<MixedDataStructureDanielHT> solver0 = new Solver<MixedDataStructureDanielHT>(fixedLengthLearning0, mixedDataStructureDanielHT0, searchParams0, randomWalkDecorator0, noRestarts0, iLogAble0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(solver0);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(minimal4CardinalityModel0);
      IVecInt iVecInt0 = solver0.getOutLearnt();
      SubModelIterator subModelIterator0 = new SubModelIterator(maxSatDecorator0, iVecInt0);
      boolean boolean0 = subModelIterator0.isSatisfiable(true);
      assertEquals(0L, subModelIterator0.numberOfModelsFoundSoFar());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(dimacsOutputSolver0);
      ModelIterator modelIterator0 = new ModelIterator(singleSolutionDetector0, 0L);
      // Undeclared exception!
      try { 
        modelIterator0.primeImplicant();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(iSolver0).nVars();
      doReturn((int[]) null).when(iSolver0).primeImplicant();
      ModelIterator modelIterator0 = new ModelIterator(iSolver0, (-2663L));
      // Undeclared exception!
      try { 
        modelIterator0.primeImplicant();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.ModelIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ModelIterator modelIterator0 = new ModelIterator((ISolver) null, (-3780L));
      // Undeclared exception!
      try { 
        modelIterator0.model();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      ASolverFactory<GateTranslator> aSolverFactory0 = (ASolverFactory<GateTranslator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(statisticsSolver0, checkMUSSolutionListener0);
      try { 
        modelIteratorToSATAdapter0.isSatisfiable(false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // That solver only compute statistics
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(iSolver0, (SolutionFoundListener) null);
      VecInt vecInt0 = new VecInt(960);
      // Undeclared exception!
      try { 
        modelIteratorToSATAdapter0.isSatisfiable((IVecInt) vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.ModelIteratorToSATAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(iSolver0, (SolutionFoundListener) null);
      // Undeclared exception!
      try { 
        modelIteratorToSATAdapter0.isSatisfiable();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.ModelIteratorToSATAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams((-1426.69571772), 1703);
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      MUSLauncher mUSLauncher0 = new MUSLauncher();
      ClauseOnlyLearning<MixedDataStructureDanielHT> clauseOnlyLearning0 = new ClauseOnlyLearning<MixedDataStructureDanielHT>();
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      Solver<MixedDataStructureDanielHT> solver0 = new Solver<MixedDataStructureDanielHT>(clauseOnlyLearning0, mixedDataStructureDanielHT0, searchParams0, levelBasedVarOrderHeap0, lubyRestarts0, mUSLauncher0);
      ModelIterator modelIterator0 = new ModelIterator(solver0);
      boolean boolean0 = modelIterator0.isSatisfiable();
      assertEquals(32L, lubyRestarts0.nextRestartNumberOfConflict());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedLengthLearning<MixedDataStructureDanielHT> fixedLengthLearning0 = new FixedLengthLearning<MixedDataStructureDanielHT>();
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      SearchParams searchParams0 = new SearchParams((-182.7486791326369), 3147.0694383465393, 3147.0694383465393, 1839);
      int[] intArray0 = new int[0];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(subsetVarOrder0);
      NoRestarts noRestarts0 = new NoRestarts();
      ILogAble iLogAble0 = ILogAble.CONSOLE;
      Solver<MixedDataStructureDanielHT> solver0 = new Solver<MixedDataStructureDanielHT>(fixedLengthLearning0, mixedDataStructureDanielHT0, searchParams0, randomWalkDecorator0, noRestarts0, iLogAble0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(solver0);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(minimal4CardinalityModel0);
      IVecInt iVecInt0 = solver0.getOutLearnt();
      SubModelIterator subModelIterator0 = new SubModelIterator(maxSatDecorator0, iVecInt0, 0L);
      boolean boolean0 = subModelIterator0.isSatisfiable();
      assertFalse(boolean0);
      assertEquals(0L, subModelIterator0.numberOfModelsFoundSoFar());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams((-1426.69571772), 1703);
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      MUSLauncher mUSLauncher0 = new MUSLauncher();
      ClauseOnlyLearning<MixedDataStructureDanielHT> clauseOnlyLearning0 = new ClauseOnlyLearning<MixedDataStructureDanielHT>();
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      Solver<MixedDataStructureDanielHT> solver0 = new Solver<MixedDataStructureDanielHT>(clauseOnlyLearning0, mixedDataStructureDanielHT0, searchParams0, levelBasedVarOrderHeap0, lubyRestarts0, mUSLauncher0);
      IVecInt iVecInt0 = solver0.getOutLearnt();
      ModelIterator modelIterator0 = new ModelIterator(solver0);
      boolean boolean0 = modelIterator0.isSatisfiable(iVecInt0);
      assertFalse(lubyRestarts0.shouldRestart());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      VecInt vecInt0 = new VecInt(0);
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      ModelIterator modelIterator0 = new ModelIterator(iSolver0, 0L);
      boolean boolean0 = modelIterator0.isSatisfiable((IVecInt) vecInt0);
      assertFalse(boolean0);
      assertEquals(0L, modelIterator0.numberOfModelsFoundSoFar());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      iSolver0.isSatisfiable();
      ModelIterator modelIterator0 = new ModelIterator(iSolver0, 0L);
      modelIterator0.primeImplicant();
      FixedLengthLearning<MixedDataStructureDanielHT> fixedLengthLearning0 = new FixedLengthLearning<MixedDataStructureDanielHT>((-1));
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      SearchParams searchParams0 = new SearchParams(0.0, 1400);
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      MUSLauncher mUSLauncher0 = new MUSLauncher();
      Solver<MixedDataStructureDanielHT> solver0 = new Solver<MixedDataStructureDanielHT>(fixedLengthLearning0, mixedDataStructureDanielHT0, searchParams0, levelBasedVarOrderHeap0, lubyRestarts0, mUSLauncher0);
      IVecInt iVecInt0 = solver0.getOutLearnt();
      boolean boolean0 = modelIterator0.isSatisfiable(iVecInt0);
      assertEquals(1L, modelIterator0.numberOfModelsFoundSoFar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(iSolver0, (SolutionFoundListener) null);
      // Undeclared exception!
      try { 
        modelIteratorToSATAdapter0.isSatisfiable(true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.ModelIteratorToSATAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      iSolver0.isSatisfiable();
      ModelIterator modelIterator0 = new ModelIterator(iSolver0, (-517L));
      modelIterator0.primeImplicant();
      boolean boolean0 = modelIterator0.isSatisfiable();
      assertEquals(1L, modelIterator0.numberOfModelsFoundSoFar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      ModelIterator modelIterator0 = new ModelIterator(iSolver0, (-517L));
      boolean boolean0 = modelIterator0.isSatisfiable(true);
      assertFalse(boolean0);
      assertEquals(0L, modelIterator0.numberOfModelsFoundSoFar());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(766);
      ModelIterator modelIterator0 = new ModelIterator(dimacsStringSolver0);
      try { 
        modelIterator0.isSatisfiable();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // There is no real solver behind!
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      ModelIterator modelIterator0 = new ModelIterator(iSolver0, (-517L));
      long long0 = modelIterator0.numberOfModelsFoundSoFar();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      ModelIterator modelIterator0 = new ModelIterator(iSolver0, (-517L));
      modelIterator0.reset();
      assertEquals(0L, modelIterator0.numberOfModelsFoundSoFar());
  }
}
