/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 19:55:17 GMT 2019
 */

package org.sat4j.tools.encoding;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.LightFactory;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.CardinalityDataStructureYanMin;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.PercentLengthLearning;
import org.sat4j.minisat.orders.PureOrder;
import org.sat4j.minisat.restarts.FixedPeriodRestarts;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.ClausalCardinalitiesDecorator;
import org.sat4j.tools.FullClauseSelectorSolver;
import org.sat4j.tools.LexicoDecorator;
import org.sat4j.tools.ModelIteratorToSATAdapter;
import org.sat4j.tools.OptToSatAdapter;
import org.sat4j.tools.SolutionFoundListener;
import org.sat4j.tools.SubModelIterator;
import org.sat4j.tools.encoding.Sequential;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Sequential_ESTest extends Sequential_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      OptToSatAdapter optToSatAdapter0 = mock(OptToSatAdapter.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null).when(optToSatAdapter0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(0, 0, 0, 0, 0).when(optToSatAdapter0).nextFreeVarId(anyBoolean());
      LexicoDecorator<OptToSatAdapter> lexicoDecorator0 = new LexicoDecorator<OptToSatAdapter>(optToSatAdapter0);
      VecInt vecInt0 = new VecInt();
      SubModelIterator subModelIterator0 = new SubModelIterator(lexicoDecorator0, vecInt0);
      VecInt vecInt1 = new VecInt(336, 336);
      sequential0.addExactlyOne(subModelIterator0, vecInt1);
      assertEquals(336, vecInt1.size());
      assertFalse(vecInt0.equals((Object)vecInt1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      OptToSatAdapter optToSatAdapter0 = mock(OptToSatAdapter.class, new ViolatedAssumptionAnswer());
      LexicoDecorator<OptToSatAdapter> lexicoDecorator0 = new LexicoDecorator<OptToSatAdapter>(optToSatAdapter0);
      VecInt vecInt0 = new VecInt();
      IVecInt iVecInt0 = vecInt0.push((-2295));
      SubModelIterator subModelIterator0 = new SubModelIterator(lexicoDecorator0, vecInt0);
      IConstr iConstr0 = sequential0.addExactly(subModelIterator0, iVecInt0, 0);
      assertFalse(iConstr0.canBePropagatedMultipleTimes());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.lightSolver();
      PercentLengthLearning<CardinalityDataStructureYanMin> percentLengthLearning0 = new PercentLengthLearning<CardinalityDataStructureYanMin>(46);
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      PureOrder pureOrder0 = new PureOrder();
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(percentLengthLearning0, cardinalityDataStructureYanMin0, pureOrder0, fixedPeriodRestarts0);
      IVecInt iVecInt0 = solver0.createBlockingClauseForCurrentModel();
      try { 
        sequential0.addExactlyOne(iSolver0, iVecInt0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Creating Empty clause ?
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      // Undeclared exception!
      try { 
        sequential0.addExactlyOne((ISolver) null, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.EncodingStrategyAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      VecInt vecInt0 = new VecInt();
      IVecInt iVecInt0 = vecInt0.push((-2295));
      OptToSatAdapter optToSatAdapter0 = mock(OptToSatAdapter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(optToSatAdapter0).nextFreeVarId(anyBoolean());
      FullClauseSelectorSolver<OptToSatAdapter> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<OptToSatAdapter>(optToSatAdapter0, true);
      // Undeclared exception!
      try { 
        sequential0.addExactlyOne(fullClauseSelectorSolver0, iVecInt0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      OptToSatAdapter optToSatAdapter0 = mock(OptToSatAdapter.class, new ViolatedAssumptionAnswer());
      ClausalCardinalitiesDecorator<OptToSatAdapter> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<OptToSatAdapter>(optToSatAdapter0);
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(clausalCardinalitiesDecorator0, 1934L, solutionFoundListener0);
      // Undeclared exception!
      try { 
        sequential0.addExactly(modelIteratorToSATAdapter0, (IVecInt) null, (-1370));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.EncodingStrategyAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      OptToSatAdapter optToSatAdapter0 = mock(OptToSatAdapter.class, new ViolatedAssumptionAnswer());
      LexicoDecorator<OptToSatAdapter> lexicoDecorator0 = new LexicoDecorator<OptToSatAdapter>(optToSatAdapter0);
      VecInt vecInt0 = new VecInt(2, 2);
      SubModelIterator subModelIterator0 = new SubModelIterator(lexicoDecorator0, vecInt0);
      // Undeclared exception!
      try { 
        sequential0.addExactly(subModelIterator0, vecInt0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.sat4j.tools.encoding.Sequential", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      OptToSatAdapter optToSatAdapter0 = mock(OptToSatAdapter.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null).when(optToSatAdapter0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(0, 0, 0, 0, 0).when(optToSatAdapter0).nextFreeVarId(anyBoolean());
      LexicoDecorator<OptToSatAdapter> lexicoDecorator0 = new LexicoDecorator<OptToSatAdapter>(optToSatAdapter0);
      VecInt vecInt0 = new VecInt(1719, 1719);
      SubModelIterator subModelIterator0 = new SubModelIterator(lexicoDecorator0, vecInt0);
      // Undeclared exception!
      sequential0.addAtMostOne(subModelIterator0, vecInt0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      OptToSatAdapter optToSatAdapter0 = mock(OptToSatAdapter.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        sequential0.addAtMostOne(optToSatAdapter0, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Sequential", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      IVecInt iVecInt0 = VecInt.EMPTY;
      // Undeclared exception!
      try { 
        sequential0.addAtMostOne((ISolver) null, iVecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Sequential", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      // Undeclared exception!
      try { 
        sequential0.addAtMost((ISolver) null, (IVecInt) null, (-3600));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Sequential", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      OptToSatAdapter optToSatAdapter0 = mock(OptToSatAdapter.class, new ViolatedAssumptionAnswer());
      LexicoDecorator<OptToSatAdapter> lexicoDecorator0 = new LexicoDecorator<OptToSatAdapter>(optToSatAdapter0);
      VecInt vecInt0 = new VecInt();
      // Undeclared exception!
      try { 
        sequential0.addAtMost(lexicoDecorator0, vecInt0, (-3217));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Sequential", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      OptToSatAdapter optToSatAdapter0 = mock(OptToSatAdapter.class, new ViolatedAssumptionAnswer());
      LexicoDecorator<OptToSatAdapter> lexicoDecorator0 = new LexicoDecorator<OptToSatAdapter>(optToSatAdapter0);
      VecInt vecInt0 = new VecInt();
      vecInt0.insertFirst((-2295));
      IVecInt iVecInt0 = vecInt0.push(0);
      SubModelIterator subModelIterator0 = new SubModelIterator(lexicoDecorator0, iVecInt0);
      // Undeclared exception!
      try { 
        sequential0.addAtMost(subModelIterator0, iVecInt0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.sat4j.tools.encoding.Sequential", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      OptToSatAdapter optToSatAdapter0 = mock(OptToSatAdapter.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null).when(optToSatAdapter0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(0, 0, 0).when(optToSatAdapter0).nextFreeVarId(anyBoolean());
      LexicoDecorator<OptToSatAdapter> lexicoDecorator0 = new LexicoDecorator<OptToSatAdapter>(optToSatAdapter0);
      VecInt vecInt0 = new VecInt();
      vecInt0.insertFirst(290);
      IVecInt iVecInt0 = vecInt0.push(3);
      IConstr iConstr0 = sequential0.addAtMost(lexicoDecorator0, iVecInt0, 3);
      assertFalse(vecInt0.isEmpty());
      assertEquals(4, iConstr0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      OptToSatAdapter optToSatAdapter0 = mock(OptToSatAdapter.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null).when(optToSatAdapter0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(0, 0, 0, 0, 0).when(optToSatAdapter0).nextFreeVarId(anyBoolean());
      LexicoDecorator<OptToSatAdapter> lexicoDecorator0 = new LexicoDecorator<OptToSatAdapter>(optToSatAdapter0);
      VecInt vecInt0 = new VecInt(336, 336);
      // Undeclared exception!
      sequential0.addAtMost(lexicoDecorator0, vecInt0, 7);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      OptToSatAdapter optToSatAdapter0 = mock(OptToSatAdapter.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null).when(optToSatAdapter0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(0).when(optToSatAdapter0).nextFreeVarId(anyBoolean());
      LexicoDecorator<OptToSatAdapter> lexicoDecorator0 = new LexicoDecorator<OptToSatAdapter>(optToSatAdapter0);
      VecInt vecInt0 = new VecInt(2, 2);
      SubModelIterator subModelIterator0 = new SubModelIterator(lexicoDecorator0, vecInt0);
      IConstr iConstr0 = sequential0.addAtMostOne(subModelIterator0, vecInt0);
      assertEquals(2, vecInt0.size());
      assertEquals(2, iConstr0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      OptToSatAdapter optToSatAdapter0 = mock(OptToSatAdapter.class, new ViolatedAssumptionAnswer());
      LexicoDecorator<OptToSatAdapter> lexicoDecorator0 = new LexicoDecorator<OptToSatAdapter>(optToSatAdapter0);
      VecInt vecInt0 = new VecInt();
      vecInt0.push((-2295));
      IConstr iConstr0 = sequential0.addAtMost(lexicoDecorator0, vecInt0, 0);
      assertFalse(iConstr0.canBePropagatedMultipleTimes());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      OptToSatAdapter optToSatAdapter0 = mock(OptToSatAdapter.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null).when(optToSatAdapter0).addClause(any(org.sat4j.specs.IVecInt.class));
      LexicoDecorator<OptToSatAdapter> lexicoDecorator0 = new LexicoDecorator<OptToSatAdapter>(optToSatAdapter0);
      VecInt vecInt0 = new VecInt(336);
      SubModelIterator subModelIterator0 = new SubModelIterator(lexicoDecorator0, vecInt0);
      // Undeclared exception!
      try { 
        sequential0.addExactlyOne(subModelIterator0, vecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Sequential", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      OptToSatAdapter optToSatAdapter0 = mock(OptToSatAdapter.class, new ViolatedAssumptionAnswer());
      LexicoDecorator<OptToSatAdapter> lexicoDecorator0 = new LexicoDecorator<OptToSatAdapter>(optToSatAdapter0);
      VecInt vecInt0 = new VecInt();
      SubModelIterator subModelIterator0 = new SubModelIterator(lexicoDecorator0, vecInt0);
      // Undeclared exception!
      try { 
        sequential0.addExactly(subModelIterator0, vecInt0, 2);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Sequential", e);
      }
  }
}
