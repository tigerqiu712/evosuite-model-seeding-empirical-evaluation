/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 19:43:38 GMT 2019
 */

package org.sat4j.minisat.constraints;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.core.ReadOnlyVecInt;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.MixedDataStructureDanielWLConciseBinary;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.FixedLengthLearning;
import org.sat4j.minisat.orders.PureOrder;
import org.sat4j.minisat.orders.RandomWalkDecorator;
import org.sat4j.minisat.restarts.LubyRestarts;
import org.sat4j.specs.Constr;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.FullClauseSelectorSolver;
import org.sat4j.tools.Minimal4InclusionModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MixedDataStructureDanielWLConciseBinary_ESTest extends MixedDataStructureDanielWLConciseBinary_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      int[] intArray0 = new int[2];
      intArray0[0] = 19;
      intArray0[1] = 1;
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWLConciseBinary0.createClause(vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      ILits iLits0 = mixedDataStructureDanielWLConciseBinary0.createLits();
      assertEquals(0, iLits0.nVars());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      VecInt vecInt0 = new VecInt();
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWLConciseBinary0.createUnregisteredClause(readOnlyVecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ReadOnlyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWLConciseBinary0.createUnregisteredClause((IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.MixedDataStructureDanielWLConciseBinary", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      VecInt vecInt0 = new VecInt();
      IVecInt iVecInt0 = vecInt0.pop();
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWLConciseBinary0.createUnregisteredClause(iVecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.WLClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      VecInt vecInt0 = new VecInt(32);
      vecInt0.shrinkTo(128);
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWLConciseBinary0.createUnregisteredClause(vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      int[] intArray0 = new int[0];
      VecInt vecInt0 = new VecInt(intArray0);
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWLConciseBinary0.createUnregisteredCardinalityConstraint(readOnlyVecInt0, 512);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ReadOnlyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWLConciseBinary0.createUnregisteredCardinalityConstraint((IVecInt) null, (-2080));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      VecInt vecInt0 = new VecInt(32, 32);
      IVecInt iVecInt0 = vecInt0.pop();
      iVecInt0.shrink(32);
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWLConciseBinary0.createUnregisteredCardinalityConstraint(iVecInt0, 32);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWLConciseBinary0.createUnregisteredCardinalityConstraint((IVecInt) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cards with degree 1 are clauses!!!!
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      FullClauseSelectorSolver<Minimal4InclusionModel> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<Minimal4InclusionModel>((Minimal4InclusionModel) null, true);
      IVecInt iVecInt0 = fullClauseSelectorSolver0.getLastClause();
      iVecInt0.shrinkTo(30);
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWLConciseBinary0.createUnregisteredCardinalityConstraint(iVecInt0, 128);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      VecInt vecInt0 = new VecInt();
      try { 
        mixedDataStructureDanielWLConciseBinary0.createClause(vecInt0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Creating Empty clause ?
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      VecInt vecInt0 = new VecInt(1555, 32);
      // Undeclared exception!
      mixedDataStructureDanielWLConciseBinary0.createClause(vecInt0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      VecInt vecInt0 = new VecInt(32);
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWLConciseBinary0.createClause(readOnlyVecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ReadOnlyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      VecInt vecInt0 = new VecInt(43, 489);
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWLConciseBinary0.createClause(vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      try { 
        mixedDataStructureDanielWLConciseBinary0.createCardinalityConstraint(vecInt0, 384);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      VecInt vecInt0 = new VecInt(2360, 45);
      // Undeclared exception!
      mixedDataStructureDanielWLConciseBinary0.createCardinalityConstraint(vecInt0, 1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      VecInt vecInt0 = new VecInt(32);
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWLConciseBinary0.createCardinalityConstraint(readOnlyVecInt0, (-617));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ReadOnlyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWLConciseBinary0.createCardinalityConstraint((IVecInt) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      VecInt vecInt0 = new VecInt(8);
      IVecInt iVecInt0 = vecInt0.push((-612));
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWLConciseBinary0.createCardinalityConstraint(iVecInt0, (-11));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      VecInt vecInt0 = new VecInt(1, 1);
      mixedDataStructureDanielWLConciseBinary0.createUnregisteredClause(vecInt0);
      assertFalse(vecInt0.isEmpty());
      assertEquals(1, vecInt0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      int[] intArray0 = new int[4];
      intArray0[0] = 19;
      intArray0[1] = 4;
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        mixedDataStructureDanielWLConciseBinary0.createClause(vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      FullClauseSelectorSolver<Minimal4InclusionModel> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<Minimal4InclusionModel>((Minimal4InclusionModel) null, true);
      IVecInt iVecInt0 = fullClauseSelectorSolver0.getLastClause();
      FixedLengthLearning<MixedDataStructureDanielWLConciseBinary> fixedLengthLearning0 = new FixedLengthLearning<MixedDataStructureDanielWLConciseBinary>();
      PureOrder pureOrder0 = new PureOrder(0);
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0, 0);
      LubyRestarts lubyRestarts0 = new LubyRestarts(128);
      Solver<MixedDataStructureDanielWLConciseBinary> solver0 = new Solver<MixedDataStructureDanielWLConciseBinary>(fixedLengthLearning0, mixedDataStructureDanielWLConciseBinary0, randomWalkDecorator0, lubyRestarts0);
      IVecInt iVecInt1 = iVecInt0.pop();
      mixedDataStructureDanielWLConciseBinary0.createClause(iVecInt0);
      iVecInt1.push((-310));
      mixedDataStructureDanielWLConciseBinary0.createUnregisteredClause(iVecInt0);
      assertEquals(2, iVecInt0.size());
      assertFalse(iVecInt0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      int[] intArray0 = new int[2];
      intArray0[1] = 1;
      VecInt vecInt0 = new VecInt(intArray0);
      Constr constr0 = mixedDataStructureDanielWLConciseBinary0.createClause(vecInt0);
      assertNull(constr0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      FullClauseSelectorSolver<Minimal4InclusionModel> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<Minimal4InclusionModel>((Minimal4InclusionModel) null, true);
      IVecInt iVecInt0 = fullClauseSelectorSolver0.getLastClause();
      Constr constr0 = mixedDataStructureDanielWLConciseBinary0.createCardinalityConstraint(iVecInt0, 0);
      assertTrue(constr0.isSatisfied());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      FullClauseSelectorSolver<Minimal4InclusionModel> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<Minimal4InclusionModel>((Minimal4InclusionModel) null, true);
      IVecInt iVecInt0 = fullClauseSelectorSolver0.getLastClause();
      Constr constr0 = mixedDataStructureDanielWLConciseBinary0.createUnregisteredCardinalityConstraint(iVecInt0, 128);
      assertEquals(128, constr0.requiredNumberOfSatisfiedLiterals());
  }
}
