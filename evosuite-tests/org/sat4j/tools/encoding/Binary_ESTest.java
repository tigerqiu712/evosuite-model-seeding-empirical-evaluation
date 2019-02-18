/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 19:54:59 GMT 2019
 */

package org.sat4j.tools.encoding;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.core.VecInt;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.StatisticsSolver;
import org.sat4j.tools.encoding.Binary;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Binary_ESTest extends Binary_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Binary binary0 = new Binary();
      assertNotNull(binary0);
      
      // Undeclared exception!
      try { 
        binary0.addExactlyOne((ISolver) null, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.EncodingStrategyAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Binary binary0 = new Binary();
      assertNotNull(binary0);
      
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      assertNotNull(dimacsStringSolver0);
      assertEquals(0, dimacsStringSolver0.newVar());
      assertEquals(0L, dimacsStringSolver0.getTimeoutMs());
      assertFalse(dimacsStringSolver0.isDBSimplificationAllowed());
      assertEquals(0, dimacsStringSolver0.nVars());
      assertFalse(dimacsStringSolver0.isVerbose());
      assertEquals("", dimacsStringSolver0.getLogPrefix());
      assertEquals(0, dimacsStringSolver0.nConstraints());
      assertFalse(dimacsStringSolver0.isSolverKeptHot());
      assertEquals(0, dimacsStringSolver0.realNumberOfVariables());
      assertEquals(0, dimacsStringSolver0.getTimeout());
      
      VecInt vecInt0 = new VecInt(233, 233);
      assertNotNull(vecInt0);
      assertEquals(233, vecInt0.size());
      assertFalse(vecInt0.isEmpty());
      assertEquals(233, vecInt0.last());
      
      vecInt0.clear();
      assertTrue(vecInt0.isEmpty());
      assertEquals(0, vecInt0.size());
      
      // Undeclared exception!
      try { 
        binary0.addExactlyOne(dimacsStringSolver0, vecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Binary", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Binary binary0 = new Binary();
      assertNotNull(binary0);
      
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      assertNotNull(dimacsStringSolver0);
      assertEquals(0, dimacsStringSolver0.realNumberOfVariables());
      assertEquals(0, dimacsStringSolver0.nVars());
      assertEquals(0, dimacsStringSolver0.nConstraints());
      assertEquals(0, dimacsStringSolver0.getTimeout());
      assertEquals("", dimacsStringSolver0.getLogPrefix());
      assertFalse(dimacsStringSolver0.isDBSimplificationAllowed());
      assertFalse(dimacsStringSolver0.isSolverKeptHot());
      assertEquals(0, dimacsStringSolver0.newVar());
      assertEquals(0L, dimacsStringSolver0.getTimeoutMs());
      assertFalse(dimacsStringSolver0.isVerbose());
      
      VecInt vecInt0 = new VecInt(2215, 2215);
      assertNotNull(vecInt0);
      assertEquals(2215, vecInt0.last());
      assertFalse(vecInt0.isEmpty());
      assertEquals(2215, vecInt0.size());
      
      // Undeclared exception!
      binary0.addExactly(dimacsStringSolver0, vecInt0, 131);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Binary binary0 = new Binary();
      assertNotNull(binary0);
      
      VecInt vecInt0 = new VecInt(2215, 2215);
      assertNotNull(vecInt0);
      assertEquals(2215, vecInt0.last());
      assertFalse(vecInt0.isEmpty());
      assertEquals(2215, vecInt0.size());
      
      // Undeclared exception!
      try { 
        binary0.addExactly((ISolver) null, vecInt0, 2215);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Binary", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Binary binary0 = new Binary();
      assertNotNull(binary0);
      
      VecInt vecInt0 = new VecInt(233, 233);
      assertNotNull(vecInt0);
      assertFalse(vecInt0.isEmpty());
      assertEquals(233, vecInt0.last());
      assertEquals(233, vecInt0.size());
      
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      assertNotNull(statisticsSolver0);
      assertEquals(0, statisticsSolver0.nVars());
      assertEquals(0, statisticsSolver0.nConstraints());
      assertEquals(0, statisticsSolver0.realNumberOfVariables());
      
      // Undeclared exception!
      try { 
        binary0.addAtMostOne(statisticsSolver0, vecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Binary binary0 = new Binary();
      assertNotNull(binary0);
      
      VecInt vecInt0 = new VecInt(2215, 2215);
      assertNotNull(vecInt0);
      assertFalse(vecInt0.isEmpty());
      assertEquals(2215, vecInt0.last());
      assertEquals(2215, vecInt0.size());
      
      // Undeclared exception!
      try { 
        binary0.addAtMostOne((ISolver) null, vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Binary binary0 = new Binary();
      assertNotNull(binary0);
      
      VecInt vecInt0 = new VecInt();
      assertNotNull(vecInt0);
      assertEquals(0, vecInt0.size());
      assertTrue(vecInt0.isEmpty());
      
      // Undeclared exception!
      try { 
        binary0.addAtMostOne((ISolver) null, vecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Binary", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Binary binary0 = new Binary();
      assertNotNull(binary0);
      
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      assertNotNull(dimacsStringSolver0);
      assertEquals(0, dimacsStringSolver0.newVar());
      assertEquals(0L, dimacsStringSolver0.getTimeoutMs());
      assertEquals(0, dimacsStringSolver0.nVars());
      assertEquals("", dimacsStringSolver0.getLogPrefix());
      assertFalse(dimacsStringSolver0.isDBSimplificationAllowed());
      assertFalse(dimacsStringSolver0.isSolverKeptHot());
      assertFalse(dimacsStringSolver0.isVerbose());
      assertEquals(0, dimacsStringSolver0.getTimeout());
      assertEquals(0, dimacsStringSolver0.realNumberOfVariables());
      assertEquals(0, dimacsStringSolver0.nConstraints());
      
      // Undeclared exception!
      try { 
        binary0.addAtMost(dimacsStringSolver0, (IVecInt) null, 2998);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Binary", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Binary binary0 = new Binary();
      assertNotNull(binary0);
      
      VecInt vecInt0 = new VecInt(1621, (-2145));
      assertNotNull(vecInt0);
      assertFalse(vecInt0.isEmpty());
      assertEquals(1621, vecInt0.size());
      assertEquals((-2145), vecInt0.last());
      
      Integer integer0 = new Integer((-2145));
      assertNotNull(integer0);
      assertEquals((-2145), (int)integer0);
      
      // Undeclared exception!
      try { 
        binary0.addAtMost((ISolver) null, vecInt0, (int) integer0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Binary", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Binary binary0 = new Binary();
      assertNotNull(binary0);
      
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      assertNotNull(dimacsStringSolver0);
      assertEquals(0, dimacsStringSolver0.newVar());
      assertEquals(0L, dimacsStringSolver0.getTimeoutMs());
      assertEquals(0, dimacsStringSolver0.nVars());
      assertFalse(dimacsStringSolver0.isVerbose());
      assertEquals("", dimacsStringSolver0.getLogPrefix());
      assertFalse(dimacsStringSolver0.isSolverKeptHot());
      assertEquals(0, dimacsStringSolver0.realNumberOfVariables());
      assertEquals(0, dimacsStringSolver0.nConstraints());
      assertFalse(dimacsStringSolver0.isDBSimplificationAllowed());
      assertEquals(0, dimacsStringSolver0.getTimeout());
      
      VecInt vecInt0 = new VecInt(233, 233);
      assertNotNull(vecInt0);
      assertEquals(233, vecInt0.size());
      assertFalse(vecInt0.isEmpty());
      assertEquals(233, vecInt0.last());
      
      // Undeclared exception!
      binary0.addAtMost(dimacsStringSolver0, vecInt0, 8);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Binary binary0 = new Binary();
      assertNotNull(binary0);
      
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      assertNotNull(dimacsStringSolver0);
      assertFalse(dimacsStringSolver0.isSolverKeptHot());
      assertFalse(dimacsStringSolver0.isDBSimplificationAllowed());
      assertEquals(0L, dimacsStringSolver0.getTimeoutMs());
      assertEquals(0, dimacsStringSolver0.nVars());
      assertEquals(0, dimacsStringSolver0.newVar());
      assertEquals("", dimacsStringSolver0.getLogPrefix());
      assertEquals(0, dimacsStringSolver0.realNumberOfVariables());
      assertEquals(0, dimacsStringSolver0.nConstraints());
      assertEquals(0, dimacsStringSolver0.getTimeout());
      assertFalse(dimacsStringSolver0.isVerbose());
      
      VecInt vecInt0 = new VecInt(233, 233);
      assertNotNull(vecInt0);
      assertEquals(233, vecInt0.last());
      assertFalse(vecInt0.isEmpty());
      assertEquals(233, vecInt0.size());
      
      IConstr iConstr0 = binary0.addAtMostOne(dimacsStringSolver0, vecInt0);
      assertNotNull(iConstr0);
      assertFalse(dimacsStringSolver0.isSolverKeptHot());
      assertEquals(8, dimacsStringSolver0.realNumberOfVariables());
      assertFalse(dimacsStringSolver0.isDBSimplificationAllowed());
      assertEquals(0L, dimacsStringSolver0.getTimeoutMs());
      assertEquals(0, dimacsStringSolver0.newVar());
      assertEquals("", dimacsStringSolver0.getLogPrefix());
      assertEquals(0, dimacsStringSolver0.getTimeout());
      assertEquals(8, dimacsStringSolver0.nVars());
      assertEquals(1841, dimacsStringSolver0.nConstraints());
      assertFalse(dimacsStringSolver0.isVerbose());
      assertEquals(233, vecInt0.last());
      assertFalse(vecInt0.isEmpty());
      assertEquals(233, vecInt0.size());
      assertEquals(1841, iConstr0.size());
      assertFalse(iConstr0.canBePropagatedMultipleTimes());
      assertEquals(0.0, iConstr0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Binary binary0 = new Binary();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      VecInt vecInt0 = new VecInt(48, 48);
      binary0.addExactly(dimacsStringSolver0, vecInt0, 48);
      assertEquals(384, dimacsStringSolver0.nConstraints());
      assertEquals(2592, dimacsStringSolver0.realNumberOfVariables());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Binary binary0 = new Binary();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      VecInt vecInt0 = new VecInt();
      vecInt0.push(1544);
      vecInt0.insertFirst((-3048));
      binary0.addAtMost(dimacsStringSolver0, vecInt0, 179);
      assertEquals(2, dimacsStringSolver0.nConstraints());
      assertEquals(537, dimacsStringSolver0.realNumberOfVariables());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Binary binary0 = new Binary();
      VecInt vecInt0 = new VecInt(1, 233);
      IConstr iConstr0 = binary0.addAtMostOne((ISolver) null, vecInt0);
      assertEquals(0, iConstr0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Binary binary0 = new Binary();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      VecInt vecInt0 = new VecInt(233, 233);
      binary0.addExactlyOne(dimacsStringSolver0, vecInt0);
      // Undeclared exception!
      binary0.addAtMostOne(dimacsStringSolver0, vecInt0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Binary binary0 = new Binary();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      VecInt vecInt0 = new VecInt();
      // Undeclared exception!
      try { 
        binary0.addExactly(dimacsStringSolver0, vecInt0, 798);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Binary", e);
      }
  }
}
