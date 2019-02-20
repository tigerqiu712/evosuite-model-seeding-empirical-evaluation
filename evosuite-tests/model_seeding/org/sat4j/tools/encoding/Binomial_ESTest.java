/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 17:17:41 GMT 2019
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
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.SolutionCounter;
import org.sat4j.tools.StatisticsSolver;
import org.sat4j.tools.encoding.Binomial;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Binomial_ESTest extends Binomial_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      // Undeclared exception!
      try { 
        binomial0.addExactlyOne(iSolver0, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      VecInt vecInt0 = new VecInt(50, 50);
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      binomial0.addAtMostOne(iSolver0, vecInt0);
      try { 
        binomial0.addExactly(iSolver0, vecInt0, 50);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Creating Empty clause ?
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      VecInt vecInt0 = new VecInt(50, 50);
      // Undeclared exception!
      try { 
        binomial0.addExactly((ISolver) null, vecInt0, 50);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Binomial", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      VecInt vecInt0 = new VecInt(0, 0);
      vecInt0.pop();
      // Undeclared exception!
      try { 
        binomial0.addExactly(iSolver0, vecInt0, 416);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      VecInt vecInt0 = new VecInt();
      vecInt0.shrink((-1901));
      // Undeclared exception!
      try { 
        binomial0.addExactly((ISolver) null, vecInt0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      VecInt vecInt0 = new VecInt(50, 50);
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      SolutionCounter solutionCounter0 = new SolutionCounter(dimacsOutputSolver0);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(solutionCounter0);
      binomial0.addAtMostOne(dimacsOutputSolver0, vecInt0);
      // Undeclared exception!
      binomial0.addExactlyOne(maxSatDecorator0, vecInt0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      VecInt vecInt0 = new VecInt(20, 20);
      // Undeclared exception!
      try { 
        binomial0.addAtMostOne((ISolver) null, vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      StatisticsSolver[] statisticsSolverArray0 = new StatisticsSolver[2];
      VecInt vecInt0 = new VecInt(50, 50);
      StatisticsSolver statisticsSolver0 = mock(StatisticsSolver.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null).when(statisticsSolver0).addClause(any(org.sat4j.specs.IVecInt.class));
      statisticsSolverArray0[0] = statisticsSolver0;
      statisticsSolverArray0[1] = statisticsSolver0;
      ManyCore<StatisticsSolver> manyCore0 = new ManyCore<StatisticsSolver>(statisticsSolverArray0);
      vecInt0.shrinkTo(2905);
      // Undeclared exception!
      try { 
        binomial0.addAtMostOne(manyCore0, vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      VecInt vecInt0 = new VecInt(31, 31);
      // Undeclared exception!
      binomial0.addAtMost((ISolver) null, vecInt0, 31);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      VecInt vecInt0 = new VecInt(50, 50);
      StatisticsSolver statisticsSolver0 = mock(StatisticsSolver.class, new ViolatedAssumptionAnswer());
      vecInt0.shrinkTo(2905);
      // Undeclared exception!
      try { 
        binomial0.addAtMost(statisticsSolver0, vecInt0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      VecInt vecInt0 = new VecInt(50, 50);
      int[] intArray0 = new int[2];
      vecInt0.moveTo(50, intArray0);
      IConstr iConstr0 = binomial0.addAtMost((ISolver) null, vecInt0, 0);
      assertEquals(0.0, iConstr0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      VecInt vecInt0 = new VecInt(50, 50);
      // Undeclared exception!
      try { 
        binomial0.addAtMost((ISolver) null, vecInt0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Binomial", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      VecInt vecInt0 = new VecInt(50, 50);
      // Undeclared exception!
      try { 
        binomial0.addAtMost((ISolver) null, vecInt0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      VecInt vecInt0 = new VecInt();
      IConstr iConstr0 = binomial0.addExactly((ISolver) null, vecInt0, 1);
      assertEquals(0.0, iConstr0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      VecInt vecInt0 = new VecInt(50, 423);
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      try { 
        binomial0.addExactlyOne(iSolver0, vecInt0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Creating Empty clause ?
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      VecInt vecInt0 = new VecInt(50, 50);
      StatisticsSolver statisticsSolver0 = mock(StatisticsSolver.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null).when(statisticsSolver0).addClause(any(org.sat4j.specs.IVecInt.class));
      // Undeclared exception!
      binomial0.addExactly(statisticsSolver0, vecInt0, 50);
  }
}