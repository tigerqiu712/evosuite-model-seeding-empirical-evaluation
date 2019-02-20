/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 17:27:12 GMT 2019
 */

package org.sat4j.minisat.constraints;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.core.ReadOnlyVecInt;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.ClausalDataStructureWL;
import org.sat4j.minisat.core.ILits;
import org.sat4j.specs.Constr;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.FullClauseSelectorSolver;
import org.sat4j.tools.GroupClauseSelectorSolver;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.SingleSolutionDetector;
import org.sat4j.tools.SolutionFoundListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClausalDataStructureWL_ESTest extends ClausalDataStructureWL_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(singleSolutionDetector0).nVars();
      GroupClauseSelectorSolver<SingleSolutionDetector> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0);
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(groupClauseSelectorSolver0, solutionFoundListener0);
      SingleSolutionDetector singleSolutionDetector1 = new SingleSolutionDetector(minimal4CardinalityModel0);
      FullClauseSelectorSolver<SingleSolutionDetector> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector1, false);
      IVecInt iVecInt0 = fullClauseSelectorSolver0.getLastClause();
      Constr constr0 = clausalDataStructureWL0.createUnregisteredClause(iVecInt0);
      assertEquals(1, constr0.requiredNumberOfSatisfiedLiterals());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      ILits iLits0 = clausalDataStructureWL0.createLits();
      assertEquals(0, iLits0.nVars());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      // Undeclared exception!
      try { 
        clausalDataStructureWL0.createUnregisteredClause((IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.WLClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      IVecInt iVecInt0 = VecInt.EMPTY;
      try { 
        clausalDataStructureWL0.createClause(iVecInt0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Creating Empty clause ?
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      VecInt vecInt0 = new VecInt();
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      // Undeclared exception!
      try { 
        clausalDataStructureWL0.createClause(readOnlyVecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ReadOnlyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      VecInt vecInt0 = new VecInt(112, 2136);
      // Undeclared exception!
      try { 
        clausalDataStructureWL0.createClause(vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2136
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      doReturn(58, 58, 58, 0).when(singleSolutionDetector0).nVars();
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(singleSolutionDetector0);
      iVecInt0.insertFirst(58);
      // Undeclared exception!
      try { 
        clausalDataStructureWL0.createClause(iVecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      doReturn(58, 58, 58, 58, 58).when(singleSolutionDetector0).nVars();
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(singleSolutionDetector0);
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      Constr constr0 = clausalDataStructureWL0.createClause(iVecInt0);
      assertNull(constr0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      doReturn(49, 49, 49, 0).when(singleSolutionDetector0).nVars();
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(singleSolutionDetector0);
      // Undeclared exception!
      try { 
        clausalDataStructureWL0.createClause(iVecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      VecInt vecInt0 = new VecInt();
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      // Undeclared exception!
      try { 
        clausalDataStructureWL0.createUnregisteredClause(readOnlyVecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ReadOnlyVecInt", e);
      }
  }
}