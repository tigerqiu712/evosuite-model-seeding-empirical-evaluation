/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 11:00:13 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.BoxLRSymbol;
import jahuwaldt.plot.PlotAxis;
import jahuwaldt.plot.PlotRun;
import jahuwaldt.plot.PlotRunList;
import jahuwaldt.plot.PlotSymbol;
import jahuwaldt.plot.PlotYAxis;
import jahuwaldt.plot.SimplePlotXY;
import jahuwaldt.plot.TabDSymbol;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Hashtable;
import javax.swing.Box;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimplePlotXY_ESTest extends SimplePlotXY_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      NumberFormat numberFormat0 = NumberFormat.getInstance();
      SimplePlotXY simplePlotXY0 = new SimplePlotXY(doubleArray0, doubleArray0, (String) null, (String) null, "", numberFormat0, (NumberFormat) null);
      assertNull(simplePlotXY0.getTitle());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      double[] doubleArray1 = new double[1];
      SimplePlotXY simplePlotXY0 = new SimplePlotXY(doubleArray0, doubleArray1, "`W%5<VhR", "X#<T*m^et", "X#<T*m^et", numberFormat0, numberFormat0);
      assertEquals("`W%5<VhR", simplePlotXY0.getTitle());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      NumberFormat numberFormat0 = NumberFormat.getInstance();
      BoxLRSymbol boxLRSymbol0 = new BoxLRSymbol();
      double[] doubleArray1 = new double[9];
      SimplePlotXY simplePlotXY0 = null;
      try {
        simplePlotXY0 = new SimplePlotXY(doubleArray0, doubleArray1, "})~z9[#", "})~z9[#", "0", numberFormat0, numberFormat0, boxLRSymbol0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Inconsistant array sizes.
         //
         verifyException("jahuwaldt.plot.SimplePlotXY", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      NumberFormat numberFormat0 = NumberFormat.getInstance();
      SimplePlotXY simplePlotXY0 = new SimplePlotXY(doubleArray0, doubleArray0, "jahuwaldt.plot.AxisLimitData", "jahuwaldt.plot.AxisLimitData", "ulTmf?H>-WVne-_G", numberFormat0, numberFormat0);
      PlotAxis plotAxis0 = simplePlotXY0.getVerticalAxis();
      assertEquals("jahuwaldt.plot.AxisLimitData", simplePlotXY0.getTitle());
      assertEquals(2, plotAxis0.getGridStyle());
      assertEquals("ulTmf?H>-WVne-_G", plotAxis0.getLabel());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimplePlotXY simplePlotXY0 = new SimplePlotXY();
      String string0 = simplePlotXY0.getTitle();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimplePlotXY simplePlotXY0 = new SimplePlotXY();
      PlotRunList plotRunList0 = simplePlotXY0.getRuns();
      assertEquals(0, plotRunList0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      SimplePlotXY simplePlotXY0 = new SimplePlotXY(doubleArray0, doubleArray0, "", "", "", numberFormat0, numberFormat0);
      PlotAxis plotAxis0 = simplePlotXY0.getHorizontalAxis();
      assertEquals(2, plotAxis0.getGridStyle());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimplePlotXY simplePlotXY0 = new SimplePlotXY();
      // Undeclared exception!
      try { 
        simplePlotXY0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.SimplePlotXY", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      SimplePlotXY simplePlotXY0 = null;
      try {
        simplePlotXY0 = new SimplePlotXY((double[]) null, (double[]) null, "kyR-Sk|@Nz5L", "kyR-Sk|@Nz5L", "bcfl ", numberFormat0, numberFormat0, (PlotSymbol) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.SimplePlotXY", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimplePlotXY simplePlotXY0 = null;
      try {
        simplePlotXY0 = new SimplePlotXY((double[]) null, (double[]) null, "Ion 1 CHARGE", "Ion 1 CHARGE", "Ion 1 CHARGE", (NumberFormat) null, (NumberFormat) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.SimplePlotXY", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      DecimalFormat decimalFormat0 = new DecimalFormat();
      double[] doubleArray1 = new double[1];
      SimplePlotXY simplePlotXY0 = null;
      try {
        simplePlotXY0 = new SimplePlotXY(doubleArray0, doubleArray1, "-81.77", "aPp=c2\"%Zy[]uz", "aPp=c2\"%Zy[]uz", decimalFormat0, decimalFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Inconsistant array sizes.
         //
         verifyException("jahuwaldt.plot.SimplePlotXY", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimplePlotXY simplePlotXY0 = new SimplePlotXY();
      PlotYAxis plotYAxis0 = new PlotYAxis();
      simplePlotXY0.setHorizontalAxis(plotYAxis0);
      simplePlotXY0.setVerticalAxis(plotYAxis0);
      Hashtable<SimplePlotXY, PlotRunList> hashtable0 = new Hashtable<SimplePlotXY, PlotRunList>();
      JTree jTree0 = new JTree(hashtable0);
      Box box0 = Box.createVerticalBox();
      Rectangle rectangle0 = box0.getVisibleRect();
      // Undeclared exception!
      try { 
        simplePlotXY0.draw((Graphics) null, jTree0, rectangle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.SimplePlotXY", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      PlotRunList plotRunList0 = new PlotRunList(plotRun0);
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      SimplePlotXY simplePlotXY0 = new SimplePlotXY(plotRunList0, "", "O%H:So7", "O%H:So7", numberFormat0, numberFormat0);
      JOptionPane jOptionPane0 = new JOptionPane(simplePlotXY0);
      DefaultCaret defaultCaret0 = new DefaultCaret();
      // Undeclared exception!
      try { 
        simplePlotXY0.draw((Graphics) null, jOptionPane0, defaultCaret0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.SimplePlotXY", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimplePlotXY simplePlotXY0 = new SimplePlotXY();
      PlotAxis plotAxis0 = simplePlotXY0.getHorizontalAxis();
      assertNull(plotAxis0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimplePlotXY simplePlotXY0 = new SimplePlotXY();
      simplePlotXY0.setTitle("");
      String string0 = simplePlotXY0.getTitle();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimplePlotXY simplePlotXY0 = new SimplePlotXY();
      PlotAxis plotAxis0 = simplePlotXY0.getVerticalAxis();
      assertNull(plotAxis0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      SimplePlotXY simplePlotXY0 = new SimplePlotXY(doubleArray0, doubleArray0, "E/-p", (String) null, (String) null, numberFormat0, numberFormat0);
      PlotRunList plotRunList0 = simplePlotXY0.getRuns();
      assertEquals(1, plotRunList0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      SimplePlotXY simplePlotXY0 = new SimplePlotXY(doubleArray0, doubleArray0, "E/-p", (String) null, (String) null, numberFormat0, numberFormat0);
      Object object0 = simplePlotXY0.clone();
      assertNotSame(object0, simplePlotXY0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      SimplePlotXY simplePlotXY0 = new SimplePlotXY(doubleArray0, doubleArray0, "E/-p", (String) null, (String) null, numberFormat0, numberFormat0);
      String string0 = simplePlotXY0.getTitle();
      assertEquals("E/-p", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      SimplePlotXY simplePlotXY0 = new SimplePlotXY(doubleArray0, doubleArray0, "E/-p", (String) null, (String) null, numberFormat0, numberFormat0);
      simplePlotXY0.setRuns((PlotRunList) null);
      PlotRunList plotRunList0 = simplePlotXY0.getRuns();
      assertNull(plotRunList0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      TabDSymbol tabDSymbol0 = new TabDSymbol();
      SimplePlotXY simplePlotXY0 = new SimplePlotXY(doubleArray0, doubleArray0, "0.####E0", "0.####E0", "z<hUgCg+_fwP[TIRNtF", (NumberFormat) null, (NumberFormat) null, tabDSymbol0);
      assertEquals("0.####E0", simplePlotXY0.getTitle());
  }
}