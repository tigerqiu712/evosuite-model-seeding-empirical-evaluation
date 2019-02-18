/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 19:47:19 GMT 2019
 */

package org.sat4j.minisat.orders;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.minisat.constraints.CardinalityDataStructure;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.IPhaseSelectionStrategy;
import org.sat4j.minisat.orders.NaturalStaticOrder;
import org.sat4j.minisat.orders.NegativeLiteralSelectionStrategy;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NaturalStaticOrder_ESTest extends NaturalStaticOrder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iLits0).belongsToPool(anyInt());
      doReturn(true).when(iLits0).isUnassigned(anyInt());
      naturalStaticOrder0.setLits(iLits0);
      IPhaseSelectionStrategy iPhaseSelectionStrategy0 = mock(IPhaseSelectionStrategy.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(iPhaseSelectionStrategy0).select(anyInt());
      naturalStaticOrder0.setPhaseSelectionStrategy(iPhaseSelectionStrategy0);
      int int0 = naturalStaticOrder0.select();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      naturalStaticOrder0.setPhaseSelectionStrategy((IPhaseSelectionStrategy) null);
      IPhaseSelectionStrategy iPhaseSelectionStrategy0 = naturalStaticOrder0.getPhaseSelectionStrategy();
      assertNull(iPhaseSelectionStrategy0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      // Undeclared exception!
      try { 
        naturalStaticOrder0.select();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.NaturalStaticOrder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      naturalStaticOrder0.index = (-1);
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      naturalStaticOrder0.setLits(iLits0);
      // Undeclared exception!
      try { 
        naturalStaticOrder0.select();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iLits0).belongsToPool(anyInt());
      doReturn(true, false).when(iLits0).isUnassigned(anyInt());
      doReturn(2, 0).when(iLits0).nVars();
      naturalStaticOrder0.setLits(iLits0);
      int int0 = naturalStaticOrder0.select();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iLits0).belongsToPool(anyInt());
      doReturn(true).when(iLits0).isUnassigned(anyInt());
      naturalStaticOrder0.setLits(iLits0);
      int int0 = naturalStaticOrder0.select();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      double[] doubleArray0 = naturalStaticOrder0.getVariableHeuristics();
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      naturalStaticOrder0.varDecayActivity();
      assertEquals("Natural static ordering", naturalStaticOrder0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      naturalStaticOrder0.init();
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iLits0).belongsToPool(anyInt());
      doReturn(true, false).when(iLits0).isUnassigned(anyInt());
      doReturn(2, 0).when(iLits0).nVars();
      naturalStaticOrder0.setLits(iLits0);
      int int0 = naturalStaticOrder0.select();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      naturalStaticOrder0.printStat((PrintWriter) null, "BZ]-LJr L@bEj");
      assertEquals("Natural static ordering", naturalStaticOrder0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      naturalStaticOrder0.assignLiteral(433);
      assertEquals("Natural static ordering", naturalStaticOrder0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      naturalStaticOrder0.setVarDecay((-540));
      assertEquals("Natural static ordering", naturalStaticOrder0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      NegativeLiteralSelectionStrategy negativeLiteralSelectionStrategy0 = (NegativeLiteralSelectionStrategy)naturalStaticOrder0.getPhaseSelectionStrategy();
      assertEquals("negative phase selection", negativeLiteralSelectionStrategy0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      naturalStaticOrder0.updateVarAtDecisionLevel(1920);
      assertEquals("Natural static ordering", naturalStaticOrder0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      String string0 = naturalStaticOrder0.toString();
      assertEquals("Natural static ordering", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      naturalStaticOrder0.updateVar(935);
      assertEquals("Natural static ordering", naturalStaticOrder0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      naturalStaticOrder0.undo(341);
      assertEquals("Natural static ordering", naturalStaticOrder0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      double double0 = naturalStaticOrder0.varActivity((-621));
      assertEquals(0.0, double0, 0.01);
  }
}
