/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 19:48:15 GMT 2019
 */

package org.sat4j.opt;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.LightFactory;
import org.sat4j.core.VecInt;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.opt.MinOneDecorator;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.FullClauseSelectorSolver;
import org.sat4j.tools.GateTranslator;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.NegationDecorator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MinOneDecorator_ESTest extends MinOneDecorator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(dimacsStringSolver0);
      minOneDecorator0.discardCurrentSolution();
      assertTrue(minOneDecorator0.nonOptimalMeansSatisfiable());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      FullClauseSelectorSolver<DimacsStringSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsStringSolver>(dimacsStringSolver0, false);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(fullClauseSelectorSolver0);
      minOneDecorator0.discard();
      assertFalse(minOneDecorator0.hasNoObjectiveFunction());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(iSolver0);
      minOneDecorator0.admitABetterSolution();
      Number number0 = minOneDecorator0.calculateObjective();
      assertFalse(minOneDecorator0.isOptimal());
      assertEquals(0, number0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(iSolver0);
      VecInt vecInt0 = new VecInt(2151, (-3152));
      minOneDecorator0.addParity(vecInt0, true);
      minOneDecorator0.admitABetterSolution();
      minOneDecorator0.modelWithInternalVariables();
      assertFalse(minOneDecorator0.isOptimal());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(iSolver0);
      minOneDecorator0.admitABetterSolution();
      minOneDecorator0.modelWithInternalVariables();
      assertFalse(minOneDecorator0.isOptimal());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(iSolver0);
      VecInt vecInt0 = new VecInt(2151, 1715);
      minOneDecorator0.addParity(vecInt0, true);
      minOneDecorator0.admitABetterSolution();
      minOneDecorator0.model();
      assertFalse(minOneDecorator0.isOptimal());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GateTranslator gateTranslator0 = mock(GateTranslator.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(gateTranslator0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn(0, 0).when(gateTranslator0).nVars();
      FullClauseSelectorSolver<GateTranslator> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<GateTranslator>(gateTranslator0, true);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(fullClauseSelectorSolver0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(minimal4CardinalityModel0);
      minOneDecorator0.admitABetterSolution();
      assertTrue(minOneDecorator0.isOptimal());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MinOneDecorator minOneDecorator0 = new MinOneDecorator((ISolver) null);
      // Undeclared exception!
      try { 
        minOneDecorator0.reset();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(iSolver0);
      try { 
        minOneDecorator0.forceObjectiveValueTo((-96));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver((PrintWriter) null);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(dimacsOutputSolver0);
      // Undeclared exception!
      try { 
        minOneDecorator0.forceObjectiveValueTo(353);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not a clausal problem! degree 353
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MinOneDecorator minOneDecorator0 = new MinOneDecorator((ISolver) null);
      // Undeclared exception!
      try { 
        minOneDecorator0.forceObjectiveValueTo((-1500));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(iSolver0);
      VecInt vecInt0 = new VecInt(2151, 1715);
      minOneDecorator0.admitABetterSolution((IVecInt) vecInt0);
      // Undeclared exception!
      minOneDecorator0.discardCurrentSolution();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      NegationDecorator<DimacsStringSolver> negationDecorator0 = new NegationDecorator<DimacsStringSolver>(dimacsStringSolver0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(negationDecorator0);
      // Undeclared exception!
      try { 
        minOneDecorator0.discardCurrentSolution();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.NegationDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MinOneDecorator minOneDecorator0 = new MinOneDecorator((ISolver) null);
      // Undeclared exception!
      try { 
        minOneDecorator0.discardCurrentSolution();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MinOneDecorator minOneDecorator0 = new MinOneDecorator((ISolver) null);
      // Undeclared exception!
      try { 
        minOneDecorator0.discard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(iSolver0);
      VecInt vecInt0 = new VecInt(2151, 1715);
      minOneDecorator0.addParity(vecInt0, true);
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(minOneDecorator0);
      // Undeclared exception!
      minOneDecorator0.admitABetterSolution(iVecInt0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MinOneDecorator minOneDecorator0 = new MinOneDecorator((ISolver) null);
      // Undeclared exception!
      try { 
        minOneDecorator0.admitABetterSolution((IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(dimacsStringSolver0);
      try { 
        minOneDecorator0.admitABetterSolution();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // There is no real solver behind!
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(iSolver0);
      VecInt vecInt0 = new VecInt(2151, (-3152));
      minOneDecorator0.addParity(vecInt0, true);
      minOneDecorator0.admitABetterSolution();
      // Undeclared exception!
      minOneDecorator0.admitABetterSolution();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MinOneDecorator minOneDecorator0 = new MinOneDecorator((ISolver) null);
      // Undeclared exception!
      try { 
        minOneDecorator0.admitABetterSolution();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(iSolver0);
      minOneDecorator0.newVar((-860));
      // Undeclared exception!
      try { 
        minOneDecorator0.admitABetterSolution();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(iSolver0);
      VecInt vecInt0 = new VecInt(2151, 1715);
      minOneDecorator0.addParity(vecInt0, false);
      try { 
        minOneDecorator0.discardCurrentSolution();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MaxSatDecorator maxSatDecorator0 = mock(MaxSatDecorator.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null).when(maxSatDecorator0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(false).when(maxSatDecorator0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn(false).when(maxSatDecorator0).removeConstr(any(org.sat4j.specs.IConstr.class));
      NegationDecorator<MaxSatDecorator> negationDecorator0 = new NegationDecorator<MaxSatDecorator>(maxSatDecorator0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(negationDecorator0);
      minOneDecorator0.admitABetterSolution((IVecInt) null);
      assertTrue(minOneDecorator0.isOptimal());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(iSolver0);
      boolean boolean0 = minOneDecorator0.isOptimal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(iSolver0);
      int[] intArray0 = minOneDecorator0.modelWithInternalVariables();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(iSolver0);
      minOneDecorator0.reset();
      assertFalse(minOneDecorator0.hasNoObjectiveFunction());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GateTranslator gateTranslator0 = mock(GateTranslator.class, new ViolatedAssumptionAnswer());
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(gateTranslator0);
      // Undeclared exception!
      try { 
        minOneDecorator0.calculateObjective();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.opt.MinOneDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MinOneDecorator minOneDecorator0 = new MinOneDecorator((ISolver) null);
      int[] intArray0 = minOneDecorator0.model();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(iSolver0);
      try { 
        minOneDecorator0.discard();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(dimacsOutputSolver0);
      // Undeclared exception!
      try { 
        minOneDecorator0.setTimeoutForFindingBetterSolution(1542);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // No implemented yet
         //
         verifyException("org.sat4j.opt.MinOneDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(iSolver0);
      Number number0 = minOneDecorator0.getObjectiveValue();
      minOneDecorator0.forceObjectiveValueTo(number0);
      assertTrue(minOneDecorator0.nonOptimalMeansSatisfiable());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MinOneDecorator minOneDecorator0 = new MinOneDecorator((ISolver) null);
      boolean boolean0 = minOneDecorator0.nonOptimalMeansSatisfiable();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(iSolver0);
      boolean boolean0 = minOneDecorator0.hasNoObjectiveFunction();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(iSolver0);
      minOneDecorator0.admitABetterSolution();
      minOneDecorator0.model();
      assertFalse(minOneDecorator0.isOptimal());
  }
}