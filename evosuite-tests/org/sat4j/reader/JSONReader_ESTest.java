/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 19:32:57 GMT 2019
 */

package org.sat4j.reader;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.minisat.constraints.CardinalityDataStructureYanMax;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.NoLearningButHeuristics;
import org.sat4j.minisat.orders.UserFixedPhaseSelectionStrategy;
import org.sat4j.minisat.orders.VarOrderHeap;
import org.sat4j.minisat.restarts.LubyRestarts;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.opt.MinOneDecorator;
import org.sat4j.reader.JSONReader;
import org.sat4j.specs.ILogAble;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.ClausalCardinalitiesDecorator;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.GateTranslator;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.ModelIterator;
import org.sat4j.tools.ModelIteratorToSATAdapter;
import org.sat4j.tools.SingleSolutionDetector;
import org.sat4j.tools.SolutionCounter;
import org.sat4j.tools.StatisticsSolver;
import org.sat4j.tools.encoding.EncodingStrategyAdapter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONReader_ESTest extends JSONReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(0);
      JSONReader<DimacsStringSolver> jSONReader0 = new JSONReader<DimacsStringSolver>(dimacsStringSolver0);
      // Undeclared exception!
      try { 
        jSONReader0.getLiterals("([(-?(d+)(,-?(d+))*)?])");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"[(-?(d+)(\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      SolutionCounter solutionCounter0 = new SolutionCounter(statisticsSolver0);
      JSONReader<SolutionCounter> jSONReader0 = new JSONReader<SolutionCounter>(solutionCounter0);
      IVecInt iVecInt0 = jSONReader0.getLiterals("<=");
      assertTrue(iVecInt0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ManyCore<SingleSolutionDetector> manyCore0 = (ManyCore<SingleSolutionDetector>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      JSONReader<ManyCore<SingleSolutionDetector>> jSONReader0 = new JSONReader<ManyCore<SingleSolutionDetector>>(manyCore0);
      String string0 = jSONReader0.constraintRegexp();
      assertEquals("((\\[(-?(\\d+)(,-?(\\d+))*)?\\])|(\\[(\\[(-?(\\d+)(,-?(\\d+))*)?\\]),'[=<>]=?',-?\\d+\\]))", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      GateTranslator gateTranslator0 = new GateTranslator(statisticsSolver0);
      JSONReader<GateTranslator> jSONReader0 = new JSONReader<GateTranslator>(gateTranslator0);
      // Undeclared exception!
      try { 
        jSONReader0.parseString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClausalCardinalitiesDecorator<SolutionCounter> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<SolutionCounter>((SolutionCounter) null, (EncodingStrategyAdapter) null);
      JSONReader<ClausalCardinalitiesDecorator<SolutionCounter>> jSONReader0 = new JSONReader<ClausalCardinalitiesDecorator<SolutionCounter>>(clausalCardinalitiesDecorator0);
      // Undeclared exception!
      try { 
        jSONReader0.parseInstance((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONReader<GateTranslator> jSONReader0 = new JSONReader<GateTranslator>((GateTranslator) null);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        jSONReader0.parseInstance((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONReader<DimacsStringSolver> jSONReader0 = new JSONReader<DimacsStringSolver>((DimacsStringSolver) null);
      // Undeclared exception!
      try { 
        jSONReader0.handleCard("");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONReader<ModelIterator> jSONReader0 = new JSONReader<ModelIterator>((ModelIterator) null);
      // Undeclared exception!
      try { 
        jSONReader0.handleCard((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      JSONReader<DimacsStringSolver> jSONReader0 = new JSONReader<DimacsStringSolver>(dimacsStringSolver0);
      // Undeclared exception!
      try { 
        jSONReader0.handleCard("[[]'',0]");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.sat4j.reader.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      JSONReader<DimacsStringSolver> jSONReader0 = new JSONReader<DimacsStringSolver>(dimacsStringSolver0);
      // Undeclared exception!
      try { 
        jSONReader0.getLiterals("=");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      JSONReader<DimacsStringSolver> jSONReader0 = new JSONReader<DimacsStringSolver>(dimacsStringSolver0);
      // Undeclared exception!
      try { 
        jSONReader0.getLiterals((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NoLearningButHeuristics<CardinalityDataStructureYanMax> noLearningButHeuristics0 = new NoLearningButHeuristics<CardinalityDataStructureYanMax>();
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      SearchParams searchParams0 = new SearchParams(244.24201204635, (-1198.0), 0.0, 0);
      UserFixedPhaseSelectionStrategy userFixedPhaseSelectionStrategy0 = new UserFixedPhaseSelectionStrategy();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap(userFixedPhaseSelectionStrategy0);
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      ILogAble iLogAble0 = ILogAble.CONSOLE;
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(noLearningButHeuristics0, cardinalityDataStructureYanMax0, searchParams0, varOrderHeap0, lubyRestarts0, iLogAble0);
      JSONReader<Solver<CardinalityDataStructureYanMax>> jSONReader0 = new JSONReader<Solver<CardinalityDataStructureYanMax>>(solver0);
      int[] intArray0 = new int[9];
      // Undeclared exception!
      try { 
        jSONReader0.decode(intArray0, (PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONReader<Minimal4CardinalityModel> jSONReader0 = new JSONReader<Minimal4CardinalityModel>((Minimal4CardinalityModel) null);
      // Undeclared exception!
      try { 
        jSONReader0.decode((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONReader<GateTranslator> jSONReader0 = new JSONReader<GateTranslator>((GateTranslator) null);
      try { 
        jSONReader0.parseString("([(-?(d+)(,-?(d+))*)?])");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing ErrorWrong input ([(-?(d+)(,-?(d+))*)?])
         //
         verifyException("org.sat4j.reader.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ModelIteratorToSATAdapter[] modelIteratorToSATAdapterArray0 = new ModelIteratorToSATAdapter[5];
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = mock(ModelIteratorToSATAdapter.class, new ViolatedAssumptionAnswer());
      modelIteratorToSATAdapterArray0[0] = modelIteratorToSATAdapter0;
      modelIteratorToSATAdapterArray0[1] = modelIteratorToSATAdapter0;
      modelIteratorToSATAdapterArray0[2] = modelIteratorToSATAdapter0;
      modelIteratorToSATAdapterArray0[3] = modelIteratorToSATAdapter0;
      modelIteratorToSATAdapterArray0[4] = modelIteratorToSATAdapter0;
      ManyCore<ModelIteratorToSATAdapter> manyCore0 = new ManyCore<ModelIteratorToSATAdapter>(false, stringArray0, modelIteratorToSATAdapterArray0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(manyCore0);
      JSONReader<MinOneDecorator> jSONReader0 = new JSONReader<MinOneDecorator>(minOneDecorator0);
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        jSONReader0.parseInstance((InputStream) byteArrayInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing ErrorWrong input \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000
         //
         verifyException("org.sat4j.reader.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      JSONReader<DimacsStringSolver> jSONReader0 = new JSONReader<DimacsStringSolver>(dimacsStringSolver0);
      jSONReader0.handleCard("[[],'<',0]");
      assertFalse(jSONReader0.isVerbose());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      JSONReader<DimacsStringSolver> jSONReader0 = new JSONReader<DimacsStringSolver>(dimacsStringSolver0);
      jSONReader0.handleCard("[[],*'<',0]");
      assertEquals(0, dimacsStringSolver0.nConstraints());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      JSONReader<DimacsStringSolver> jSONReader0 = new JSONReader<DimacsStringSolver>(dimacsStringSolver0);
      jSONReader0.handleCard("^[((([(-?(d+)(,-?(d+))*)?])|([([(-?(d+)(,-?(d+))*)?]),'[=<>]=?',-?d+]))(,(([(-?(d+)(,-?(d+))*)?])|([([(-?(d+)(,-?(d+))*)?]),'[=<>]=?',-?d+])))*)?]$");
      assertFalse(jSONReader0.isUsingMapping());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      GateTranslator gateTranslator0 = new GateTranslator(statisticsSolver0);
      JSONReader<GateTranslator> jSONReader0 = new JSONReader<GateTranslator>(gateTranslator0);
      ISolver iSolver0 = jSONReader0.parseString("[]");
      assertSame(iSolver0, gateTranslator0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SolutionCounter solutionCounter0 = new SolutionCounter((ISolver) null);
      JSONReader<SolutionCounter> jSONReader0 = new JSONReader<SolutionCounter>(solutionCounter0);
      int[] intArray0 = new int[2];
      String string0 = jSONReader0.decode(intArray0);
      assertEquals("[0,0]", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      JSONReader<StatisticsSolver> jSONReader0 = new JSONReader<StatisticsSolver>(statisticsSolver0);
      int[] intArray0 = new int[7];
      StringWriter stringWriter0 = new StringWriter(2377);
      PrintWriter printWriter0 = new PrintWriter(stringWriter0);
      jSONReader0.decode(intArray0, printWriter0);
      assertEquals("[0,0,0,0,0,0,0]", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(statisticsSolver0);
      JSONReader<MaxSatDecorator> jSONReader0 = new JSONReader<MaxSatDecorator>(maxSatDecorator0);
      try { 
        jSONReader0.handleNotHandled("org.sat4j.tools.LBDTracing");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing ErrorUnknown constraint: org.sat4j.tools.LBDTracing
         //
         verifyException("org.sat4j.reader.JSONReader", e);
      }
  }
}
