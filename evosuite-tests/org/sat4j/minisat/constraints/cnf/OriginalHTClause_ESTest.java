/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 19:25:44 GMT 2019
 */

package org.sat4j.minisat.constraints.cnf;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.CardinalityDataStructureYanMin;
import org.sat4j.minisat.constraints.cnf.Lits;
import org.sat4j.minisat.constraints.cnf.OriginalHTClause;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.IPhaseSelectionStrategy;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.core.WatcherBasedPrimeImplicantStrategy;
import org.sat4j.minisat.learning.ActiveLearning;
import org.sat4j.minisat.learning.FixedLengthLearning;
import org.sat4j.minisat.learning.PercentLengthLearning;
import org.sat4j.minisat.orders.LevelBasedVarOrderHeap;
import org.sat4j.minisat.orders.VarOrderHeap;
import org.sat4j.minisat.restarts.FixedPeriodRestarts;
import org.sat4j.minisat.restarts.LubyRestarts;
import org.sat4j.minisat.restarts.NoRestarts;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.UnitPropagationListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OriginalHTClause_ESTest extends OriginalHTClause_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap((IPhaseSelectionStrategy) null);
      NoRestarts noRestarts0 = new NoRestarts();
      ActiveLearning<CardinalityDataStructureYanMin> activeLearning0 = new ActiveLearning<CardinalityDataStructureYanMin>(32);
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(activeLearning0, cardinalityDataStructureYanMin0, varOrderHeap0, noRestarts0);
      ILits iLits0 = solver0.getVocabulary();
      int[] intArray0 = new int[9];
      VecInt vecInt0 = new VecInt(intArray0);
      OriginalHTClause originalHTClause0 = new OriginalHTClause(vecInt0, iLits0);
      WatcherBasedPrimeImplicantStrategy watcherBasedPrimeImplicantStrategy0 = new WatcherBasedPrimeImplicantStrategy();
      // Undeclared exception!
      try { 
        originalHTClause0.propagatePI(watcherBasedPrimeImplicantStrategy0, 0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Lits lits0 = new Lits();
      int[] intArray0 = new int[8];
      intArray0[0] = 19;
      VecInt vecInt0 = new VecInt(intArray0);
      OriginalHTClause originalHTClause0 = new OriginalHTClause(vecInt0, lits0);
      WatcherBasedPrimeImplicantStrategy watcherBasedPrimeImplicantStrategy0 = new WatcherBasedPrimeImplicantStrategy();
      // Undeclared exception!
      try { 
        originalHTClause0.propagatePI(watcherBasedPrimeImplicantStrategy0, 18);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap((IPhaseSelectionStrategy) null);
      NoRestarts noRestarts0 = new NoRestarts();
      ActiveLearning<CardinalityDataStructureYanMin> activeLearning0 = new ActiveLearning<CardinalityDataStructureYanMin>(32);
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(activeLearning0, cardinalityDataStructureYanMin0, varOrderHeap0, noRestarts0);
      ILits iLits0 = solver0.getVocabulary();
      int[] intArray0 = new int[9];
      intArray0[0] = (-612);
      VecInt vecInt0 = new VecInt(intArray0);
      OriginalHTClause originalHTClause0 = new OriginalHTClause(vecInt0, iLits0);
      WatcherBasedPrimeImplicantStrategy watcherBasedPrimeImplicantStrategy0 = new WatcherBasedPrimeImplicantStrategy();
      // Undeclared exception!
      try { 
        originalHTClause0.propagatePI(watcherBasedPrimeImplicantStrategy0, (-1));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UnitPropagationListener unitPropagationListener0 = mock(UnitPropagationListener.class, new ViolatedAssumptionAnswer());
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(iLits0).valueToString(anyInt());
      int[] intArray0 = new int[6];
      intArray0[0] = (-1413);
      VecInt vecInt0 = new VecInt(intArray0);
      OriginalHTClause originalHTClause0 = OriginalHTClause.brandNewClause(unitPropagationListener0, iLits0, vecInt0);
      assertTrue(originalHTClause0.canBeSatisfiedByCountingLiterals());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Lits lits0 = new Lits();
      int[] intArray0 = new int[7];
      intArray0[0] = (-2404);
      VecInt vecInt0 = new VecInt(intArray0);
      OriginalHTClause originalHTClause0 = new OriginalHTClause(vecInt0, lits0);
      // Undeclared exception!
      try { 
        originalHTClause0.register();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2403
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Lits lits0 = new Lits();
      int[] intArray0 = new int[8];
      intArray0[6] = (-1857);
      VecInt vecInt0 = new VecInt(intArray0);
      OriginalHTClause originalHTClause0 = new OriginalHTClause(vecInt0, lits0);
      PercentLengthLearning<CardinalityDataStructureYanMin> percentLengthLearning0 = new PercentLengthLearning<CardinalityDataStructureYanMin>((-13));
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(percentLengthLearning0, cardinalityDataStructureYanMin0, levelBasedVarOrderHeap0, fixedPeriodRestarts0);
      // Undeclared exception!
      try { 
        originalHTClause0.propagate(solver0, (-982));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1857
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Lits lits0 = new Lits();
      // Undeclared exception!
      try { 
        OriginalHTClause.brandNewClause((UnitPropagationListener) null, lits0, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.HTClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Lits lits0 = new Lits();
      int[] intArray0 = new int[1];
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        OriginalHTClause.brandNewClause((UnitPropagationListener) null, lits0, vecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.HTClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      // Undeclared exception!
      try { 
        OriginalHTClause.brandNewClause((UnitPropagationListener) null, lits0, vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IVecInt iVecInt0 = VecInt.EMPTY;
      OriginalHTClause originalHTClause0 = null;
      try {
        originalHTClause0 = new OriginalHTClause(iVecInt0, (ILits) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.EmptyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Lits lits0 = new Lits();
      OriginalHTClause originalHTClause0 = null;
      try {
        originalHTClause0 = new OriginalHTClause((IVecInt) null, lits0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.HTClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Lits lits0 = new Lits();
      int[] intArray0 = new int[1];
      VecInt vecInt0 = new VecInt(intArray0);
      OriginalHTClause originalHTClause0 = null;
      try {
        originalHTClause0 = new OriginalHTClause(vecInt0, lits0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.HTClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      OriginalHTClause originalHTClause0 = null;
      try {
        originalHTClause0 = new OriginalHTClause(vecInt0, (ILits) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Lits lits0 = new Lits();
      int[] intArray0 = new int[8];
      intArray0[0] = 19;
      VecInt vecInt0 = new VecInt(intArray0);
      OriginalHTClause originalHTClause0 = new OriginalHTClause(vecInt0, lits0);
      WatcherBasedPrimeImplicantStrategy watcherBasedPrimeImplicantStrategy0 = new WatcherBasedPrimeImplicantStrategy();
      // Undeclared exception!
      try { 
        originalHTClause0.propagatePI(watcherBasedPrimeImplicantStrategy0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      vecInt0.push(0);
      IVecInt iVecInt0 = vecInt0.push(2648);
      iVecInt0.push(1);
      iVecInt0.sort();
      OriginalHTClause originalHTClause0 = new OriginalHTClause(vecInt0, lits0);
      WatcherBasedPrimeImplicantStrategy watcherBasedPrimeImplicantStrategy0 = new WatcherBasedPrimeImplicantStrategy();
      // Undeclared exception!
      try { 
        originalHTClause0.propagatePI(watcherBasedPrimeImplicantStrategy0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      vecInt0.push(0);
      vecInt0.push(2648);
      IVecInt iVecInt0 = vecInt0.push(1);
      OriginalHTClause originalHTClause0 = new OriginalHTClause(iVecInt0, lits0);
      WatcherBasedPrimeImplicantStrategy watcherBasedPrimeImplicantStrategy0 = new WatcherBasedPrimeImplicantStrategy();
      // Undeclared exception!
      try { 
        originalHTClause0.propagatePI(watcherBasedPrimeImplicantStrategy0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2648
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      vecInt0.push(0);
      vecInt0.push(2648);
      OriginalHTClause originalHTClause0 = new OriginalHTClause(vecInt0, lits0);
      WatcherBasedPrimeImplicantStrategy watcherBasedPrimeImplicantStrategy0 = new WatcherBasedPrimeImplicantStrategy();
      // Undeclared exception!
      try { 
        originalHTClause0.propagatePI(watcherBasedPrimeImplicantStrategy0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.core.WatcherBasedPrimeImplicantStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[5];
      VecInt vecInt0 = new VecInt(intArray0);
      OriginalHTClause originalHTClause0 = new OriginalHTClause(vecInt0, (ILits) null);
      originalHTClause0.setLearnt();
      assertTrue(originalHTClause0.canBeSatisfiedByCountingLiterals());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Lits lits0 = new Lits();
      int[] intArray0 = new int[10];
      VecInt vecInt0 = new VecInt(intArray0);
      OriginalHTClause originalHTClause0 = new OriginalHTClause(vecInt0, lits0);
      originalHTClause0.forwardActivity((-753.5632));
      assertEquals((-753.5632), originalHTClause0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Lits lits0 = new Lits();
      int[] intArray0 = new int[8];
      VecInt vecInt0 = new VecInt(intArray0);
      OriginalHTClause originalHTClause0 = new OriginalHTClause(vecInt0, lits0);
      originalHTClause0.incActivity((-1634.90544519106));
      assertFalse(originalHTClause0.learnt());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FixedLengthLearning<CardinalityDataStructureYanMin> fixedLengthLearning0 = new FixedLengthLearning<CardinalityDataStructureYanMin>();
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap((IPhaseSelectionStrategy) null);
      LubyRestarts lubyRestarts0 = new LubyRestarts(0);
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(fixedLengthLearning0, cardinalityDataStructureYanMin0, varOrderHeap0, lubyRestarts0);
      ILits iLits0 = solver0.getVocabulary();
      IVecInt iVecInt0 = VecInt.EMPTY;
      // Undeclared exception!
      try { 
        OriginalHTClause.brandNewClause(solver0, iLits0, iVecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.EmptyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FixedLengthLearning<CardinalityDataStructureYanMin> fixedLengthLearning0 = new FixedLengthLearning<CardinalityDataStructureYanMin>();
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      int[] intArray0 = new int[5];
      VecInt vecInt0 = new VecInt(intArray0);
      SearchParams searchParams0 = new SearchParams(3025);
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(fixedLengthLearning0, cardinalityDataStructureYanMin0, searchParams0, levelBasedVarOrderHeap0, fixedPeriodRestarts0);
      ILits iLits0 = solver0.getVocabulary();
      OriginalHTClause originalHTClause0 = new OriginalHTClause(vecInt0, iLits0);
      originalHTClause0.setActivity((-3118.8233479463));
      assertFalse(originalHTClause0.isSatisfied());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      VecInt vecInt0 = new VecInt(2221, 42);
      OriginalHTClause originalHTClause0 = new OriginalHTClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        originalHTClause0.register();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.OriginalHTClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FixedLengthLearning<CardinalityDataStructureYanMin> fixedLengthLearning0 = new FixedLengthLearning<CardinalityDataStructureYanMin>();
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap((IPhaseSelectionStrategy) null);
      LubyRestarts lubyRestarts0 = new LubyRestarts(0);
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(fixedLengthLearning0, cardinalityDataStructureYanMin0, varOrderHeap0, lubyRestarts0);
      ILits iLits0 = solver0.getVocabulary();
      int[] intArray0 = new int[5];
      VecInt vecInt0 = new VecInt(intArray0);
      OriginalHTClause originalHTClause0 = new OriginalHTClause(vecInt0, iLits0);
      boolean boolean0 = originalHTClause0.learnt();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Lits lits0 = new Lits();
      int[] intArray0 = new int[8];
      VecInt vecInt0 = new VecInt(intArray0);
      OriginalHTClause originalHTClause0 = new OriginalHTClause(vecInt0, lits0);
      PercentLengthLearning<CardinalityDataStructureYanMin> percentLengthLearning0 = new PercentLengthLearning<CardinalityDataStructureYanMin>((-13));
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(percentLengthLearning0, cardinalityDataStructureYanMin0, levelBasedVarOrderHeap0, fixedPeriodRestarts0);
      // Undeclared exception!
      try { 
        originalHTClause0.propagate(solver0, (-982));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }
}