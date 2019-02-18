/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 19:56:45 GMT 2019
 */

package org.sat4j.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.core.Vec;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.MixedDataStructureDanielHT;
import org.sat4j.minisat.core.RestartStrategy;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.FixedLengthLearning;
import org.sat4j.minisat.orders.PureOrder;
import org.sat4j.specs.Constr;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.ClausalCardinalitiesDecorator;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.GateTranslator;
import org.sat4j.tools.GroupClauseSelectorSolver;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.ModelIterator;
import org.sat4j.tools.NegationDecorator;
import org.sat4j.tools.SingleSolutionDetector;
import org.sat4j.tools.StatisticsSolver;
import org.sat4j.tools.encoding.Binomial;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GateTranslator_ESTest extends GateTranslator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = mock(DimacsStringSolver.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null).when(dimacsStringSolver0).addClause(any(org.sat4j.specs.IVecInt.class));
      Binomial binomial0 = new Binomial();
      ClausalCardinalitiesDecorator<DimacsStringSolver> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<DimacsStringSolver>(dimacsStringSolver0, binomial0);
      GateTranslator gateTranslator0 = new GateTranslator(clausalCardinalitiesDecorator0);
      gateTranslator0.xor(1, (-305), (-305));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null).when(iSolver0).addClause(any(org.sat4j.specs.IVecInt.class));
      ModelIterator modelIterator0 = new ModelIterator(iSolver0, 0L);
      GateTranslator gateTranslator0 = new GateTranslator(modelIterator0);
      gateTranslator0.halfAdderSum(1480, 4, 0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      GateTranslator gateTranslator0 = new GateTranslator(dimacsOutputSolver0);
      gateTranslator0.fullAdderSum(47, 47, 50, 1284);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      GateTranslator gateTranslator0 = new GateTranslator(dimacsOutputSolver0);
      gateTranslator0.fullAdderCarry(50, (-1047), 50, 1284);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      GroupClauseSelectorSolver<DimacsOutputSolver> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<DimacsOutputSolver>(dimacsOutputSolver0);
      GateTranslator gateTranslator0 = new GateTranslator(groupClauseSelectorSolver0);
      gateTranslator0.additionalFullAdderConstraints(0, 0, 0, 47, 47);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      GateTranslator gateTranslator0 = new GateTranslator(dimacsOutputSolver0);
      gateTranslator0.not(20, 20);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null).when(iSolver0).addClause(any(org.sat4j.specs.IVecInt.class));
      ModelIterator modelIterator0 = new ModelIterator(iSolver0, 0L);
      GateTranslator gateTranslator0 = new GateTranslator(modelIterator0);
      gateTranslator0.ite(16, 946, 3615, 1480);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      GateTranslator gateTranslator0 = new GateTranslator(dimacsOutputSolver0);
      gateTranslator0.it(88, 5000, 88);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      GateTranslator gateTranslator0 = new GateTranslator(dimacsOutputSolver0);
      VecInt vecInt0 = new VecInt(50, 0);
      vecInt0.clear();
      gateTranslator0.iff(0, vecInt0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      IVecInt iVecInt0 = VecInt.EMPTY;
      GateTranslator gateTranslator0 = new GateTranslator(dimacsOutputSolver0);
      gateTranslator0.halfOr(6, iVecInt0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Constr constr0 = Constr.TAUTOLOGY;
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(constr0).when(iSolver0).addClause(any(org.sat4j.specs.IVecInt.class));
      ModelIterator modelIterator0 = new ModelIterator(iSolver0, 0L);
      GateTranslator gateTranslator0 = new GateTranslator(modelIterator0);
      gateTranslator0.gateTrue(16);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      GroupClauseSelectorSolver<DimacsOutputSolver> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<DimacsOutputSolver>(dimacsOutputSolver0);
      GateTranslator gateTranslator0 = new GateTranslator(groupClauseSelectorSolver0);
      gateTranslator0.and(6, 4416, 6);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      GateTranslator gateTranslator0 = new GateTranslator(dimacsOutputSolver0);
      VecInt vecInt0 = new VecInt(20, 20);
      // Undeclared exception!
      gateTranslator0.xor(20, (IVecInt) vecInt0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      IVecInt iVecInt0 = VecInt.EMPTY;
      GateTranslator gateTranslator0 = new GateTranslator(dimacsOutputSolver0);
      // Undeclared exception!
      try { 
        gateTranslator0.xor(104, iVecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.EmptyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GateTranslator gateTranslator0 = new GateTranslator((ISolver) null);
      int[] intArray0 = new int[1];
      VecInt vecInt0 = new VecInt(intArray0);
      vecInt0.shrinkTo(790);
      // Undeclared exception!
      try { 
        gateTranslator0.xor(1091, (IVecInt) vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IVecInt iVecInt0 = VecInt.EMPTY;
      GateTranslator gateTranslator0 = new GateTranslator((ISolver) null);
      // Undeclared exception!
      try { 
        gateTranslator0.or((-1475), iVecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = mock(StatisticsSolver.class, new ViolatedAssumptionAnswer());
      doReturn(1282, 0).when(statisticsSolver0).nVars();
      doReturn(0).when(statisticsSolver0).nextFreeVarId(anyBoolean());
      ClausalCardinalitiesDecorator<StatisticsSolver> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<StatisticsSolver>(statisticsSolver0);
      NegationDecorator<ClausalCardinalitiesDecorator<StatisticsSolver>> negationDecorator0 = new NegationDecorator<ClausalCardinalitiesDecorator<StatisticsSolver>>(clausalCardinalitiesDecorator0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(negationDecorator0);
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(minimal4CardinalityModel0);
      GateTranslator gateTranslator0 = new GateTranslator(singleSolutionDetector0);
      VecInt vecInt0 = new VecInt(20, 20);
      // Undeclared exception!
      try { 
        gateTranslator0.or(1282, vecInt0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = mock(StatisticsSolver.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(statisticsSolver0).nVars();
      doReturn(0).when(statisticsSolver0).nextFreeVarId(anyBoolean());
      ClausalCardinalitiesDecorator<StatisticsSolver> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<StatisticsSolver>(statisticsSolver0);
      NegationDecorator<ClausalCardinalitiesDecorator<StatisticsSolver>> negationDecorator0 = new NegationDecorator<ClausalCardinalitiesDecorator<StatisticsSolver>>(clausalCardinalitiesDecorator0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(negationDecorator0);
      GateTranslator gateTranslator0 = new GateTranslator(minimal4CardinalityModel0);
      // Undeclared exception!
      try { 
        gateTranslator0.not(1872, (-2205));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GateTranslator gateTranslator0 = new GateTranslator((ISolver) null);
      // Undeclared exception!
      try { 
        gateTranslator0.ite(1541, 1541, 16, 1113);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = mock(StatisticsSolver.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(statisticsSolver0).nVars();
      doReturn(0).when(statisticsSolver0).nextFreeVarId(anyBoolean());
      ClausalCardinalitiesDecorator<StatisticsSolver> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<StatisticsSolver>(statisticsSolver0);
      NegationDecorator<ClausalCardinalitiesDecorator<StatisticsSolver>> negationDecorator0 = new NegationDecorator<ClausalCardinalitiesDecorator<StatisticsSolver>>(clausalCardinalitiesDecorator0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(negationDecorator0);
      GateTranslator gateTranslator0 = new GateTranslator(minimal4CardinalityModel0);
      // Undeclared exception!
      try { 
        gateTranslator0.ite(1175, 0, 3, 732);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      IVecInt iVecInt0 = VecInt.EMPTY;
      GateTranslator gateTranslator0 = new GateTranslator(dimacsOutputSolver0);
      // Undeclared exception!
      try { 
        gateTranslator0.iff(568, iVecInt0);
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
      GateTranslator gateTranslator0 = new GateTranslator((ISolver) null);
      // Undeclared exception!
      try { 
        gateTranslator0.halfOr(109, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.GateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = mock(StatisticsSolver.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(statisticsSolver0).nVars();
      doReturn(0).when(statisticsSolver0).nextFreeVarId(anyBoolean());
      ClausalCardinalitiesDecorator<StatisticsSolver> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<StatisticsSolver>(statisticsSolver0);
      NegationDecorator<ClausalCardinalitiesDecorator<StatisticsSolver>> negationDecorator0 = new NegationDecorator<ClausalCardinalitiesDecorator<StatisticsSolver>>(clausalCardinalitiesDecorator0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(negationDecorator0);
      GateTranslator gateTranslator0 = new GateTranslator(minimal4CardinalityModel0);
      // Undeclared exception!
      try { 
        gateTranslator0.halfAdderCarry((-1490), (-1490), 0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GateTranslator gateTranslator0 = new GateTranslator((ISolver) null);
      // Undeclared exception!
      try { 
        gateTranslator0.gateTrue(5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GateTranslator gateTranslator0 = new GateTranslator((ISolver) null);
      // Undeclared exception!
      try { 
        gateTranslator0.gateFalse((-84));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GateTranslator gateTranslator0 = new GateTranslator((ISolver) null);
      // Undeclared exception!
      try { 
        gateTranslator0.fullAdderSum(47, 47, 47, 47);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GateTranslator gateTranslator0 = new GateTranslator((ISolver) null);
      // Undeclared exception!
      try { 
        gateTranslator0.and(300, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.GateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = mock(StatisticsSolver.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(statisticsSolver0).nVars();
      doReturn(0).when(statisticsSolver0).nextFreeVarId(anyBoolean());
      ClausalCardinalitiesDecorator<StatisticsSolver> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<StatisticsSolver>(statisticsSolver0);
      NegationDecorator<ClausalCardinalitiesDecorator<StatisticsSolver>> negationDecorator0 = new NegationDecorator<ClausalCardinalitiesDecorator<StatisticsSolver>>(clausalCardinalitiesDecorator0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(negationDecorator0);
      GateTranslator gateTranslator0 = new GateTranslator(minimal4CardinalityModel0);
      // Undeclared exception!
      try { 
        gateTranslator0.and(5, 0, 0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GateTranslator gateTranslator0 = new GateTranslator((ISolver) null);
      int[] intArray0 = new int[1];
      VecInt vecInt0 = new VecInt(intArray0);
      vecInt0.moveTo(intArray0);
      // Undeclared exception!
      try { 
        gateTranslator0.iff(1920, vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GateTranslator gateTranslator0 = new GateTranslator((ISolver) null);
      VecInt vecInt0 = new VecInt(20, 20);
      vecInt0.clear();
      // Undeclared exception!
      try { 
        gateTranslator0.xor(20, (IVecInt) vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GateTranslator gateTranslator0 = new GateTranslator((ISolver) null);
      // Undeclared exception!
      try { 
        gateTranslator0.xor(1091, 1091, 2522);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GateTranslator gateTranslator0 = new GateTranslator((ISolver) null);
      // Undeclared exception!
      try { 
        gateTranslator0.and(283, 5000, (-1705));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GateTranslator gateTranslator0 = new GateTranslator((ISolver) null);
      VecInt vecInt0 = new VecInt(3313, 3313);
      Vec<BigInteger> vec0 = new Vec<BigInteger>();
      BigInteger bigInteger0 = BigInteger.ONE;
      vec0.growTo(3313, bigInteger0);
      // Undeclared exception!
      try { 
        gateTranslator0.optimisationFunction(vecInt0, vec0, vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GateTranslator gateTranslator0 = new GateTranslator((ISolver) null);
      VecInt vecInt0 = new VecInt(3313, 3313);
      Vec<BigInteger> vec0 = new Vec<BigInteger>();
      BigInteger bigInteger0 = BigInteger.ONE;
      vec0.growTo(110, bigInteger0);
      // Undeclared exception!
      try { 
        gateTranslator0.optimisationFunction(vecInt0, vec0, vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GateTranslator gateTranslator0 = new GateTranslator((ISolver) null);
      VecInt vecInt0 = new VecInt(20);
      Vec<BigInteger> vec0 = new Vec<BigInteger>();
      gateTranslator0.optimisationFunction(vecInt0, vec0, vecInt0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt(20, 20);
      GateTranslator gateTranslator0 = new GateTranslator(dimacsOutputSolver0);
      // Undeclared exception!
      gateTranslator0.iff(20, vecInt0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      GateTranslator gateTranslator0 = new GateTranslator(dimacsOutputSolver0);
      VecInt vecInt0 = new VecInt(8, 20);
      IConstr[] iConstrArray0 = gateTranslator0.xor(8, (IVecInt) vecInt0);
      assertEquals((-8), vecInt0.last());
      assertEquals(256, iConstrArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      GateTranslator gateTranslator0 = new GateTranslator(dimacsOutputSolver0);
      VecInt vecInt0 = new VecInt(1, 4524);
      gateTranslator0.halfOr(20, vecInt0);
      assertFalse(vecInt0.isEmpty());
      assertEquals(1, vecInt0.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      GateTranslator gateTranslator0 = new GateTranslator(dimacsOutputSolver0);
      VecInt vecInt0 = new VecInt(8, 20);
      gateTranslator0.or(20, vecInt0);
      assertEquals(8, vecInt0.size());
      assertFalse(vecInt0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      GroupClauseSelectorSolver<DimacsOutputSolver> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<DimacsOutputSolver>(dimacsOutputSolver0);
      GateTranslator gateTranslator0 = new GateTranslator(groupClauseSelectorSolver0);
      int[] intArray0 = new int[1];
      VecInt vecInt0 = new VecInt(intArray0);
      gateTranslator0.and(1100, (IVecInt) vecInt0);
      assertEquals(1, vecInt0.size());
      assertFalse(vecInt0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = mock(DimacsStringSolver.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null, (IConstr) null).when(dimacsStringSolver0).addClause(any(org.sat4j.specs.IVecInt.class));
      Binomial binomial0 = new Binomial();
      ClausalCardinalitiesDecorator<DimacsStringSolver> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<DimacsStringSolver>(dimacsStringSolver0, binomial0);
      GateTranslator gateTranslator0 = new GateTranslator(clausalCardinalitiesDecorator0);
      gateTranslator0.halfAdderCarry(610, (-2723), 0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FixedLengthLearning<MixedDataStructureDanielHT> fixedLengthLearning0 = new FixedLengthLearning<MixedDataStructureDanielHT>();
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      PureOrder pureOrder0 = new PureOrder(0);
      Solver<MixedDataStructureDanielHT> solver0 = new Solver<MixedDataStructureDanielHT>(fixedLengthLearning0, mixedDataStructureDanielHT0, pureOrder0, (RestartStrategy) null);
      GateTranslator gateTranslator0 = new GateTranslator(solver0);
      // Undeclared exception!
      try { 
        gateTranslator0.ite(0, 171, 100, 100);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is not a valid variable identifier
         //
         verifyException("org.sat4j.minisat.core.Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      GateTranslator gateTranslator0 = new GateTranslator((ISolver) null);
      // Undeclared exception!
      try { 
        gateTranslator0.halfAdderSum((-2899), 2540, (-2899));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = mock(StatisticsSolver.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(statisticsSolver0).nVars();
      doReturn(0).when(statisticsSolver0).nextFreeVarId(anyBoolean());
      ClausalCardinalitiesDecorator<StatisticsSolver> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<StatisticsSolver>(statisticsSolver0);
      NegationDecorator<ClausalCardinalitiesDecorator<StatisticsSolver>> negationDecorator0 = new NegationDecorator<ClausalCardinalitiesDecorator<StatisticsSolver>>(clausalCardinalitiesDecorator0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(negationDecorator0);
      GateTranslator gateTranslator0 = new GateTranslator(minimal4CardinalityModel0);
      // Undeclared exception!
      try { 
        gateTranslator0.fullAdderSum(1175, 732, 732, 37);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      GateTranslator gateTranslator0 = new GateTranslator((ISolver) null);
      // Undeclared exception!
      try { 
        gateTranslator0.it(3, 27, 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      GateTranslator gateTranslator0 = new GateTranslator(dimacsOutputSolver0);
      IConstr iConstr0 = gateTranslator0.gateFalse(1236);
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      GateTranslator gateTranslator0 = new GateTranslator((ISolver) null);
      // Undeclared exception!
      try { 
        gateTranslator0.fullAdderCarry(1986, 1986, 1986, 1986);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      GateTranslator gateTranslator0 = new GateTranslator((ISolver) null);
      // Undeclared exception!
      try { 
        gateTranslator0.additionalFullAdderConstraints(0, 0, 1648, 1986, (-787));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      GateTranslator gateTranslator0 = new GateTranslator((ISolver) null);
      // Undeclared exception!
      try { 
        gateTranslator0.not((-3180), (-3180));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = mock(DimacsStringSolver.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null).when(dimacsStringSolver0).addClause(any(org.sat4j.specs.IVecInt.class));
      Binomial binomial0 = new Binomial();
      ClausalCardinalitiesDecorator<DimacsStringSolver> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<DimacsStringSolver>(dimacsStringSolver0, binomial0);
      GateTranslator gateTranslator0 = new GateTranslator(clausalCardinalitiesDecorator0);
      IConstr iConstr0 = gateTranslator0.gateTrue((-395));
      assertNull(iConstr0);
  }
}
