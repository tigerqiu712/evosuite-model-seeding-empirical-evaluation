/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 19:57:06 GMT 2019
 */

package org.sat4j.tools;

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
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.ClausalCardinalitiesDecorator;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.FullClauseSelectorSolver;
import org.sat4j.tools.GateTranslator;
import org.sat4j.tools.GroupClauseSelectorSolver;
import org.sat4j.tools.LexicoDecorator;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.Minimal4InclusionModel;
import org.sat4j.tools.ModelIterator;
import org.sat4j.tools.ModelIteratorToSATAdapter;
import org.sat4j.tools.NegationDecorator;
import org.sat4j.tools.OptToSatAdapter;
import org.sat4j.tools.SingleSolutionDetector;
import org.sat4j.tools.SolutionCounter;
import org.sat4j.tools.SolutionFoundListener;
import org.sat4j.tools.StatisticsSolver;
import org.sat4j.tools.SubModelIterator;
import org.sat4j.tools.encoding.EncodingStrategy;
import org.sat4j.tools.encoding.EncodingStrategyAdapter;
import org.sat4j.tools.encoding.Policy;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractClauseSelectorSolver_ESTest extends AbstractClauseSelectorSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[2] = 1;
      VecInt vecInt0 = new VecInt(intArray0);
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(dimacsStringSolver0, 0, solutionFoundListener0);
      FullClauseSelectorSolver<ModelIterator> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<ModelIterator>(modelIteratorToSATAdapter0, true);
      fullClauseSelectorSolver0.addClause(vecInt0);
      assertEquals(1, dimacsStringSolver0.realNumberOfVariables());
      assertEquals(1, vecInt0.last());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GateTranslator gateTranslator0 = mock(GateTranslator.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(gateTranslator0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      ClausalCardinalitiesDecorator<GateTranslator> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<GateTranslator>(gateTranslator0);
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(clausalCardinalitiesDecorator0, 1L, solutionFoundListener0);
      GroupClauseSelectorSolver<ModelIteratorToSATAdapter> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<ModelIteratorToSATAdapter>(modelIteratorToSATAdapter0);
      boolean boolean0 = groupClauseSelectorSolver0.isSatisfiable(true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.lightSolver();
      int[] intArray0 = new int[8];
      VecInt vecInt0 = new VecInt(intArray0);
      SubModelIterator subModelIterator0 = new SubModelIterator(iSolver0, vecInt0, 324L);
      FullClauseSelectorSolver<SubModelIterator> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<SubModelIterator>(subModelIterator0, true);
      fullClauseSelectorSolver0.isSatisfiable((IVecInt) vecInt0);
      assertEquals(8, vecInt0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.lightSolver();
      int[] intArray0 = new int[8];
      intArray0[2] = (-1);
      intArray0[7] = 1;
      VecInt vecInt0 = new VecInt(intArray0);
      SubModelIterator subModelIterator0 = new SubModelIterator(iSolver0, vecInt0, 324L);
      LexicoDecorator<SubModelIterator> lexicoDecorator0 = new LexicoDecorator<SubModelIterator>(subModelIterator0);
      IVecInt iVecInt0 = subModelIterator0.createBlockingClauseForCurrentModel();
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(subModelIterator0);
      NegationDecorator<SingleSolutionDetector> negationDecorator0 = new NegationDecorator<SingleSolutionDetector>(singleSolutionDetector0);
      negationDecorator0.addClause(iVecInt0);
      OptToSatAdapter optToSatAdapter0 = new OptToSatAdapter(lexicoDecorator0, (SolutionFoundListener) null);
      NegationDecorator<OptToSatAdapter> negationDecorator1 = new NegationDecorator<OptToSatAdapter>(optToSatAdapter0);
      boolean boolean0 = negationDecorator1.isSatisfiable((IVecInt) vecInt0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GateTranslator gateTranslator0 = mock(GateTranslator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(gateTranslator0).nextFreeVarId(anyBoolean());
      ClausalCardinalitiesDecorator<GateTranslator> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<GateTranslator>(gateTranslator0);
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      IVecInt iVecInt0 = VecInt.EMPTY;
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(clausalCardinalitiesDecorator0, 1L, solutionFoundListener0);
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(modelIteratorToSATAdapter0, iVecInt0);
      GroupClauseSelectorSolver<AbstractMinimalModel> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<AbstractMinimalModel>(abstractMinimalModel0);
      int int0 = groupClauseSelectorSolver0.createNewVar(iVecInt0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.lightSolver();
      int[] intArray0 = new int[8];
      VecInt vecInt0 = new VecInt(intArray0);
      SubModelIterator subModelIterator0 = new SubModelIterator(iSolver0, vecInt0, 324L);
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(subModelIterator0);
      NegationDecorator<SingleSolutionDetector> negationDecorator0 = new NegationDecorator<SingleSolutionDetector>(singleSolutionDetector0);
      int int0 = negationDecorator0.createNewVar(vecInt0);
      assertEquals(1, iSolver0.nVars());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EncodingStrategy encodingStrategy0 = EncodingStrategy.COMMANDER;
      EncodingStrategyAdapter encodingStrategyAdapter0 = Policy.getAdapterFromEncodingName(encodingStrategy0);
      ClausalCardinalitiesDecorator<GroupClauseSelectorSolver<AbstractMinimalModel>> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<GroupClauseSelectorSolver<AbstractMinimalModel>>((GroupClauseSelectorSolver<AbstractMinimalModel>) null, encodingStrategyAdapter0);
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(clausalCardinalitiesDecorator0);
      FullClauseSelectorSolver<SingleSolutionDetector> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0, false);
      // Undeclared exception!
      try { 
        fullClauseSelectorSolver0.isSatisfiable(true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      IVecInt iVecInt0 = VecInt.EMPTY;
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(statisticsSolver0, (SolutionFoundListener) null);
      GroupClauseSelectorSolver<Minimal4CardinalityModel> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<Minimal4CardinalityModel>(minimal4CardinalityModel0);
      // Undeclared exception!
      try { 
        groupClauseSelectorSolver0.createNewVar(iVecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[3] = (-3743);
      VecInt vecInt0 = new VecInt(intArray0);
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(dimacsStringSolver0, 0, solutionFoundListener0);
      FullClauseSelectorSolver<ModelIterator> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<ModelIterator>(modelIteratorToSATAdapter0, true);
      // Undeclared exception!
      try { 
        fullClauseSelectorSolver0.addClause(vecInt0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IVecInt iVecInt0 = VecInt.EMPTY;
      FullClauseSelectorSolver<DimacsOutputSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsOutputSolver>((DimacsOutputSolver) null, false);
      // Undeclared exception!
      try { 
        fullClauseSelectorSolver0.createNewVar(iVecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IVecInt iVecInt0 = VecInt.EMPTY;
      FullClauseSelectorSolver<GateTranslator> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<GateTranslator>((GateTranslator) null, false);
      fullClauseSelectorSolver0.internalState();
      // Undeclared exception!
      try { 
        fullClauseSelectorSolver0.isSatisfiable(iVecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver$2", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      NegationDecorator<StatisticsSolver> negationDecorator0 = new NegationDecorator<StatisticsSolver>(statisticsSolver0);
      try { 
        negationDecorator0.isSatisfiable();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // That solver only compute statistics
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      IVecInt iVecInt0 = VecInt.EMPTY;
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(dimacsOutputSolver0, solutionFoundListener0);
      NegationDecorator<ModelIterator> negationDecorator0 = new NegationDecorator<ModelIterator>(modelIteratorToSATAdapter0);
      // Undeclared exception!
      try { 
        negationDecorator0.isSatisfiable(iVecInt0, true);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FullClauseSelectorSolver<MaxSatDecorator> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<MaxSatDecorator>((MaxSatDecorator) null, false);
      fullClauseSelectorSolver0.externalState();
      assertFalse(fullClauseSelectorSolver0.isSkipDuplicatedEntries());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GroupClauseSelectorSolver<OptToSatAdapter> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<OptToSatAdapter>((OptToSatAdapter) null);
      groupClauseSelectorSolver0.discardLastestVar();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GateTranslator gateTranslator0 = mock(GateTranslator.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(gateTranslator0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      ClausalCardinalitiesDecorator<GateTranslator> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<GateTranslator>(gateTranslator0);
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(clausalCardinalitiesDecorator0, 4955, solutionFoundListener0);
      GroupClauseSelectorSolver<ModelIteratorToSATAdapter> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<ModelIteratorToSATAdapter>(modelIteratorToSATAdapter0);
      SolutionCounter solutionCounter0 = new SolutionCounter(groupClauseSelectorSolver0);
      GroupClauseSelectorSolver<SolutionCounter> groupClauseSelectorSolver1 = new GroupClauseSelectorSolver<SolutionCounter>(solutionCounter0);
      boolean boolean0 = groupClauseSelectorSolver1.isSatisfiable(true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GateTranslator gateTranslator0 = mock(GateTranslator.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(gateTranslator0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      ClausalCardinalitiesDecorator<GateTranslator> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<GateTranslator>(gateTranslator0);
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(clausalCardinalitiesDecorator0, 4955, solutionFoundListener0);
      GroupClauseSelectorSolver<ModelIteratorToSATAdapter> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<ModelIteratorToSATAdapter>(modelIteratorToSATAdapter0);
      boolean boolean0 = groupClauseSelectorSolver0.isSatisfiable(false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ManyCore<Minimal4InclusionModel> manyCore0 = (ManyCore<Minimal4InclusionModel>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(manyCore0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      GroupClauseSelectorSolver<ManyCore<Minimal4InclusionModel>> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<ManyCore<Minimal4InclusionModel>>(manyCore0);
      boolean boolean0 = groupClauseSelectorSolver0.isSatisfiable();
      assertFalse(boolean0);
  }
}
