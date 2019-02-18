/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 19:17:08 GMT 2019
 */

package org.sat4j.tools.xplain;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.LightFactory;
import org.sat4j.core.ReadOnlyVecInt;
import org.sat4j.core.VecInt;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.ClausalCardinalitiesDecorator;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.IVisualizationTool;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.Minimal4InclusionModel;
import org.sat4j.tools.SingleSolutionDetector;
import org.sat4j.tools.SolutionFoundListener;
import org.sat4j.tools.SubModelIterator;
import org.sat4j.tools.encoding.EncodingStrategyAdapter;
import org.sat4j.tools.encoding.Policy;
import org.sat4j.tools.xplain.InsertionStrategy;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InsertionStrategy_ESTest extends InsertionStrategy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InsertionStrategy insertionStrategy0 = new InsertionStrategy();
      VecInt vecInt0 = new VecInt();
      SubModelIterator subModelIterator0 = mock(SubModelIterator.class, new ViolatedAssumptionAnswer());
      doReturn("8H`)6lkLVT=@9JX+").when(subModelIterator0).getLogPrefix();
      doReturn(true).when(subModelIterator0).isVerbose();
      doReturn(1, 1, 0).when(subModelIterator0).nVars();
      doReturn(vecInt0).when(subModelIterator0).unsatExplanation();
      ClausalCardinalitiesDecorator<SubModelIterator> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<SubModelIterator>(subModelIterator0, (EncodingStrategyAdapter) null);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      IVecInt iVecInt0 = vecInt0.pop();
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      Minimal4InclusionModel minimal4InclusionModel0 = new Minimal4InclusionModel(clausalCardinalitiesDecorator0, iVecInt0, solutionFoundListener0);
      IVecInt iVecInt1 = AbstractMinimalModel.negativeLiterals(minimal4InclusionModel0);
      // Undeclared exception!
      try { 
        insertionStrategy0.explain(clausalCardinalitiesDecorator0, hashMap0, iVecInt1);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InsertionStrategy insertionStrategy0 = new InsertionStrategy();
      VecInt vecInt0 = new VecInt();
      SubModelIterator subModelIterator0 = mock(SubModelIterator.class, new ViolatedAssumptionAnswer());
      doReturn(vecInt0).when(subModelIterator0).unsatExplanation();
      Policy policy0 = new Policy();
      ClausalCardinalitiesDecorator<SubModelIterator> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<SubModelIterator>(subModelIterator0, policy0);
      VecInt vecInt1 = new VecInt();
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(clausalCardinalitiesDecorator0);
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      vecInt0.push((-3080));
      insertionStrategy0.explain(singleSolutionDetector0, hashMap0, vecInt1);
      assertEquals(1, vecInt0.size());
      assertEquals(0, vecInt1.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InsertionStrategy insertionStrategy0 = new InsertionStrategy();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(0);
      VecInt vecInt0 = new VecInt();
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(dimacsStringSolver0, vecInt0);
      HashMap<Integer, InsertionStrategy> hashMap0 = new HashMap<Integer, InsertionStrategy>();
      // Undeclared exception!
      try { 
        insertionStrategy0.explain(minimal4CardinalityModel0, hashMap0, vecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InsertionStrategy insertionStrategy0 = new InsertionStrategy();
      HashMap<Integer, InsertionStrategy> hashMap0 = new HashMap<Integer, InsertionStrategy>();
      // Undeclared exception!
      try { 
        insertionStrategy0.explain((ISolver) null, hashMap0, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.xplain.InsertionStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InsertionStrategy insertionStrategy0 = new InsertionStrategy();
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(iSolver0);
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(abstractMinimalModel0);
      iVecInt0.shrinkTo((-1));
      // Undeclared exception!
      try { 
        insertionStrategy0.explain((ISolver) null, hashMap0, iVecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InsertionStrategy insertionStrategy0 = new InsertionStrategy();
      VecInt vecInt0 = new VecInt();
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      SubModelIterator[] subModelIteratorArray0 = new SubModelIterator[0];
      ManyCore<SubModelIterator> manyCore0 = new ManyCore<SubModelIterator>(subModelIteratorArray0);
      // Undeclared exception!
      try { 
        insertionStrategy0.explain(manyCore0, hashMap0, readOnlyVecInt0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InsertionStrategy insertionStrategy0 = new InsertionStrategy();
      VecInt vecInt0 = new VecInt();
      SubModelIterator subModelIterator0 = mock(SubModelIterator.class, new ViolatedAssumptionAnswer());
      doReturn(true, false, false, true, false).when(subModelIterator0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn("Aq3D1U~", "Aq3D1U~").when(subModelIterator0).getLogPrefix();
      doReturn(true, true).when(subModelIterator0).isVerbose();
      doReturn(vecInt0).when(subModelIterator0).unsatExplanation();
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Integer integer0 = Integer.valueOf(271);
      Integer integer1 = IVisualizationTool.NOTGOOD;
      hashMap0.put(integer1, "");
      hashMap0.put(integer0, "IwR^YHbR@^");
      IVecInt iVecInt0 = insertionStrategy0.explain(subModelIterator0, hashMap0, vecInt0);
      assertEquals(Integer.MIN_VALUE, iVecInt0.last());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InsertionStrategy insertionStrategy0 = new InsertionStrategy();
      VecInt vecInt0 = new VecInt();
      SubModelIterator subModelIterator0 = mock(SubModelIterator.class, new ViolatedAssumptionAnswer());
      doReturn(true, false, true).when(subModelIterator0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn("Aq3D1U~").when(subModelIterator0).getLogPrefix();
      doReturn(true).when(subModelIterator0).isVerbose();
      doReturn(vecInt0).when(subModelIterator0).unsatExplanation();
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Integer integer0 = Integer.valueOf(271);
      Integer integer1 = IVisualizationTool.NOTGOOD;
      hashMap0.put(integer1, "");
      hashMap0.put(integer0, "IwR^YHbR@^");
      // Undeclared exception!
      try { 
        insertionStrategy0.explain(subModelIterator0, hashMap0, vecInt0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InsertionStrategy insertionStrategy0 = new InsertionStrategy();
      VecInt vecInt0 = new VecInt();
      SubModelIterator subModelIterator0 = mock(SubModelIterator.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(subModelIterator0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(false).when(subModelIterator0).isVerbose();
      doReturn(vecInt0).when(subModelIterator0).unsatExplanation();
      Integer integer0 = Integer.valueOf(1);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      hashMap0.put(integer0, ",fdYoj84-|BD");
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      IVecInt iVecInt0 = insertionStrategy0.explain(subModelIterator0, hashMap0, readOnlyVecInt0);
      assertEquals(1, iVecInt0.last());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InsertionStrategy insertionStrategy0 = new InsertionStrategy();
      VecInt vecInt0 = new VecInt();
      SubModelIterator subModelIterator0 = mock(SubModelIterator.class, new ViolatedAssumptionAnswer());
      doReturn(true, false, false, false).when(subModelIterator0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn("Aq3D1U~").when(subModelIterator0).getLogPrefix();
      doReturn(true, false).when(subModelIterator0).isVerbose();
      doReturn(0, 0).when(subModelIterator0).nVars();
      doReturn(vecInt0).when(subModelIterator0).unsatExplanation();
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Integer integer0 = Integer.valueOf(271);
      Integer integer1 = IVisualizationTool.NOTGOOD;
      hashMap0.put(integer1, "");
      hashMap0.put(integer0, "IwR^YHbR@^");
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(subModelIterator0);
      IVecInt iVecInt0 = insertionStrategy0.explain(minimal4CardinalityModel0, hashMap0, readOnlyVecInt0);
      assertEquals(271, iVecInt0.last());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InsertionStrategy insertionStrategy0 = new InsertionStrategy();
      VecInt vecInt0 = new VecInt();
      SubModelIterator subModelIterator0 = mock(SubModelIterator.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(subModelIterator0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn("Aq3D1U~").when(subModelIterator0).getLogPrefix();
      doReturn(true).when(subModelIterator0).isVerbose();
      doReturn(0, 0).when(subModelIterator0).nVars();
      doReturn(vecInt0).when(subModelIterator0).unsatExplanation();
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Integer integer0 = Integer.valueOf(271);
      hashMap0.put(integer0, "");
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(subModelIterator0);
      // Undeclared exception!
      try { 
        insertionStrategy0.explain(minimal4CardinalityModel0, hashMap0, readOnlyVecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InsertionStrategy insertionStrategy0 = new InsertionStrategy();
      String string0 = insertionStrategy0.toString();
      assertEquals("Replay (Insertion-based) minimization strategy", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InsertionStrategy insertionStrategy0 = new InsertionStrategy();
      insertionStrategy0.cancelExplanationComputation();
      VecInt vecInt0 = new VecInt();
      SubModelIterator subModelIterator0 = mock(SubModelIterator.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(subModelIterator0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn("Aq3D1U~").when(subModelIterator0).getLogPrefix();
      doReturn(true).when(subModelIterator0).isVerbose();
      doReturn(4645, 4645, 0).when(subModelIterator0).nVars();
      doReturn(vecInt0).when(subModelIterator0).unsatExplanation();
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Integer integer0 = Integer.valueOf(271);
      hashMap0.put(integer0, "");
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      Minimal4InclusionModel minimal4InclusionModel0 = new Minimal4InclusionModel(subModelIterator0, readOnlyVecInt0, (SolutionFoundListener) null);
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(minimal4InclusionModel0);
      // Undeclared exception!
      try { 
        insertionStrategy0.explain(minimal4InclusionModel0, hashMap0, iVecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }
}