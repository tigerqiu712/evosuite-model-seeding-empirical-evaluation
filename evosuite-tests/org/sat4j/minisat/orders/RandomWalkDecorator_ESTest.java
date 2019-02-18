/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 19:47:08 GMT 2019
 */

package org.sat4j.minisat.orders;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;
import org.sat4j.minisat.constraints.cnf.Lits;
import org.sat4j.minisat.core.IPhaseSelectionStrategy;
import org.sat4j.minisat.orders.LevelBasedVarOrderHeap;
import org.sat4j.minisat.orders.PureOrder;
import org.sat4j.minisat.orders.RSATLastLearnedClausesPhaseSelectionStrategy;
import org.sat4j.minisat.orders.RandomWalkDecorator;
import org.sat4j.minisat.orders.SubsetVarOrder;
import org.sat4j.minisat.orders.VarOrderHeap;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RandomWalkDecorator_ESTest extends RandomWalkDecorator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[9];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(subsetVarOrder0, 0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.select();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder(0);
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0);
      randomWalkDecorator0.updateVarAtDecisionLevel(0);
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      Lits lits0 = new Lits();
      varOrderHeap0.setLits(lits0);
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      randomWalkDecorator0.init();
      randomWalkDecorator0.updateVar(1);
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      randomWalkDecorator0.varActivity(0);
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      Lits lits0 = new Lits();
      varOrderHeap0.setLits(lits0);
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      randomWalkDecorator0.init();
      randomWalkDecorator0.varActivity(1);
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      randomWalkDecorator0.getVariableHeuristics();
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0, 0.0);
      double double0 = randomWalkDecorator0.getProbability();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0, (-4284.9378));
      double double0 = randomWalkDecorator0.getProbability();
      assertEquals((-4284.9378), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(levelBasedVarOrderHeap0);
      randomWalkDecorator0.getPhaseSelectionStrategy();
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.varDecayActivity();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.varActivity(1056);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder(0);
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0);
      RSATLastLearnedClausesPhaseSelectionStrategy rSATLastLearnedClausesPhaseSelectionStrategy0 = new RSATLastLearnedClausesPhaseSelectionStrategy();
      rSATLastLearnedClausesPhaseSelectionStrategy0.init(1);
      randomWalkDecorator0.setPhaseSelectionStrategy(rSATLastLearnedClausesPhaseSelectionStrategy0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.updateVarAtDecisionLevel(529);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 264
         //
         verifyException("org.sat4j.minisat.orders.RSATLastLearnedClausesPhaseSelectionStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.updateVar((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      Lits lits0 = new Lits();
      varOrderHeap0.setLits(lits0);
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      randomWalkDecorator0.init();
      // Undeclared exception!
      try { 
        randomWalkDecorator0.undo(2146398950);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2146398950
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.setVarDecay((-182.14));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.setPhaseSelectionStrategy((IPhaseSelectionStrategy) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null, (-469.1546753780715));
      Lits lits0 = new Lits();
      // Undeclared exception!
      try { 
        randomWalkDecorator0.setLits(lits0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      Lits lits0 = new Lits();
      varOrderHeap0.setLits(lits0);
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      randomWalkDecorator0.init();
      randomWalkDecorator0.undo(1);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.select();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.sat4j.minisat.orders.AbstractPhaserecordingSelectionStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.printStat((PrintWriter) null, "Fake IConstr");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      Lits lits0 = new Lits();
      lits0.getFromPool(65535);
      varOrderHeap0.setLits(lits0);
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      // Undeclared exception!
      randomWalkDecorator0.init();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.init();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.getPhaseSelectionStrategy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap((IPhaseSelectionStrategy) null);
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      randomWalkDecorator0.getPhaseSelectionStrategy();
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      Lits lits0 = new Lits();
      lits0.getFromPool((-70));
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      randomWalkDecorator0.setLits(lits0);
      randomWalkDecorator0.init();
      int int0 = randomWalkDecorator0.select();
      assertEquals(141, int0);
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      Lits lits0 = new Lits();
      varOrderHeap0.setLits(lits0);
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      randomWalkDecorator0.init();
      randomWalkDecorator0.select();
      randomWalkDecorator0.select();
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(levelBasedVarOrderHeap0);
      randomWalkDecorator0.setVarDecay((-1062.269918012932));
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder(751);
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("$@ E_=");
      randomWalkDecorator0.printStat(mockPrintWriter0, "$@ E_=");
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      double double0 = randomWalkDecorator0.getProbability();
      assertEquals(0.01, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.undo(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      randomWalkDecorator0.assignLiteral((-514));
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      String string0 = randomWalkDecorator0.toString();
      assertEquals("VSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause with random walks 0.01", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null, 0.01);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.updateVarAtDecisionLevel((-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.varActivity((-2138089591));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1069044796
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(levelBasedVarOrderHeap0);
      randomWalkDecorator0.setProbability(2880.947815866);
      assertEquals(2880.947815866, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(levelBasedVarOrderHeap0);
      randomWalkDecorator0.varDecayActivity();
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.updateVar(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.PhaseInLastLearnedClauseSelectionStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.getVariableHeuristics();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }
}
