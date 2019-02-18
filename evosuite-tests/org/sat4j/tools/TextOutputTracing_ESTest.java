/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 19:51:41 GMT 2019
 */

package org.sat4j.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.minisat.constraints.CardinalityDataStructureYanMax;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolverService;
import org.sat4j.specs.Lbool;
import org.sat4j.specs.RandomAccessModel;
import org.sat4j.tools.TextOutputTracing;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TextOutputTracing_ESTest extends TextOutputTracing_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      TextOutputTracing<String> textOutputTracing0 = new TextOutputTracing<String>(hashMap0);
      Integer integer0 = new Integer(0);
      hashMap0.putIfAbsent(integer0, "XgEX_^");
      textOutputTracing0.assuming(0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      hashMap0.put((Integer) 1, "Q=%<");
      TextOutputTracing<String> textOutputTracing0 = new TextOutputTracing<String>(hashMap0);
      textOutputTracing0.assuming((-1));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      TextOutputTracing<Object> textOutputTracing0 = new TextOutputTracing<Object>(hashMap0);
      Integer integer0 = Integer.valueOf(1);
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      hashMap0.put(integer0, cardinalityDataStructureYanMax0);
      textOutputTracing0.assuming(1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TextOutputTracing<String> textOutputTracing0 = new TextOutputTracing<String>((Map<Integer, String>) null);
      textOutputTracing0.assuming(0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      TextOutputTracing<Integer> textOutputTracing0 = new TextOutputTracing<Integer>(hashMap0);
      textOutputTracing0.learnUnit((-1313));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      TextOutputTracing<Object> textOutputTracing0 = new TextOutputTracing<Object>(hashMap0);
      textOutputTracing0.delete((IConstr) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TextOutputTracing<Object> textOutputTracing0 = new TextOutputTracing<Object>((Map<Integer, Object>) null);
      textOutputTracing0.restarting();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      TextOutputTracing<Object> textOutputTracing0 = new TextOutputTracing<Object>(hashMap0);
      Lbool lbool0 = Lbool.TRUE;
      textOutputTracing0.end(lbool0);
      assertEquals("T", lbool0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<Integer, CardinalityDataStructureYanMax> hashMap0 = new HashMap<Integer, CardinalityDataStructureYanMax>();
      TextOutputTracing<CardinalityDataStructureYanMax> textOutputTracing0 = new TextOutputTracing<CardinalityDataStructureYanMax>(hashMap0);
      textOutputTracing0.backtracking(3753);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      TextOutputTracing<String> textOutputTracing0 = new TextOutputTracing<String>(hashMap0);
      textOutputTracing0.solutionFound((int[]) null, (RandomAccessModel) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      TextOutputTracing<String> textOutputTracing0 = new TextOutputTracing<String>(hashMap0);
      textOutputTracing0.enqueueing(0, (IConstr) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      TextOutputTracing<Object> textOutputTracing0 = new TextOutputTracing<Object>(hashMap0);
      textOutputTracing0.init((ISolverService) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      TextOutputTracing<String> textOutputTracing0 = new TextOutputTracing<String>(hashMap0);
      textOutputTracing0.conflictFound(0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TextOutputTracing<Object> textOutputTracing0 = new TextOutputTracing<Object>((Map<Integer, Object>) null);
      textOutputTracing0.start();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      TextOutputTracing<String> textOutputTracing0 = new TextOutputTracing<String>(hashMap0);
      textOutputTracing0.beginLoop();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      TextOutputTracing<Object> textOutputTracing0 = new TextOutputTracing<Object>(hashMap0);
      textOutputTracing0.conflictFound((IConstr) null, (-1390), 1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      TextOutputTracing<Object> textOutputTracing0 = new TextOutputTracing<Object>(hashMap0);
      textOutputTracing0.learn((IConstr) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<Integer, CardinalityDataStructureYanMax> hashMap0 = new HashMap<Integer, CardinalityDataStructureYanMax>();
      TextOutputTracing<CardinalityDataStructureYanMax> textOutputTracing0 = new TextOutputTracing<CardinalityDataStructureYanMax>(hashMap0);
      textOutputTracing0.cleaning();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      TextOutputTracing<Object> textOutputTracing0 = new TextOutputTracing<Object>(hashMap0);
      textOutputTracing0.adding((-1708));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      TextOutputTracing<Object> textOutputTracing0 = new TextOutputTracing<Object>(hashMap0);
      textOutputTracing0.backjump(0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      TextOutputTracing<Object> textOutputTracing0 = new TextOutputTracing<Object>(hashMap0);
      textOutputTracing0.propagating((-1708));
  }
}
