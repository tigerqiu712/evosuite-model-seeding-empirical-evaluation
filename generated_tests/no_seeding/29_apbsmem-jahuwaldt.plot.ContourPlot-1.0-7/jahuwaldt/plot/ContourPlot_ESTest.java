/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 20:45:56 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.ContourPlot;
import jahuwaldt.plot.PlotRunList;
import java.awt.Color;
import java.awt.SystemColor;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ContourPlot_ESTest extends ContourPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[3][9];
      double[] doubleArray1 = new double[3];
      doubleArray1[1] = (-2357.832);
      doubleArray1[2] = (-3992.2);
      doubleArray0[0] = doubleArray1;
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Color color0 = defaultTreeCellRenderer0.getBackgroundNonSelectionColor();
      ContourPlot contourPlot0 = new ContourPlot(doubleArray0, doubleArray0, doubleArray0, 538, false, "", "", "", (NumberFormat) null, (NumberFormat) null);
      SystemColor systemColor0 = SystemColor.controlShadow;
      contourPlot0.colorizeContours(systemColor0, color0);
      assertEquals(128, systemColor0.getRed());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[7][2];
      double[][] doubleArray1 = new double[7][6];
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      ContourPlot contourPlot0 = null;
      try {
        contourPlot0 = new ContourPlot(doubleArray0, doubleArray0, doubleArray1, 0, false, "r9DJ]%Wbh\"G~*l|", "", "", numberFormat0, numberFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Inconsistant array sizes.
         //
         verifyException("jahuwaldt.plot.ContourGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[][] doubleArray0 = new double[8][6];
      double[][] doubleArray1 = new double[6][4];
      Locale locale0 = Locale.US;
      NumberFormat numberFormat0 = NumberFormat.getInstance(locale0);
      ContourPlot contourPlot0 = null;
      try {
        contourPlot0 = new ContourPlot(doubleArray0, doubleArray1, doubleArray0, 25, true, "'LsGG", "", (String) null, numberFormat0, numberFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Inconsistant array sizes.
         //
         verifyException("jahuwaldt.plot.ContourGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ContourPlot contourPlot0 = new ContourPlot();
      // Undeclared exception!
      try { 
        contourPlot0.colorizeContours((Color) null, (Color) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.ContourPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getInstance();
      double[][] doubleArray0 = new double[3][9];
      double[] doubleArray1 = new double[3];
      doubleArray1[1] = (-2357.832);
      doubleArray1[2] = (-3992.2);
      doubleArray0[0] = doubleArray1;
      ContourPlot contourPlot0 = new ContourPlot(doubleArray0, doubleArray0, doubleArray0, 370, false, "", "", "cYh&::_5", numberFormat0, numberFormat0);
      PlotRunList plotRunList0 = new PlotRunList();
      contourPlot0.setRuns(plotRunList0);
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Color color0 = defaultTreeCellRenderer0.getBackgroundNonSelectionColor();
      // Undeclared exception!
      try { 
        contourPlot0.colorizeContours(color0, color0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 185, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DecimalFormat decimalFormat0 = new DecimalFormat();
      ContourPlot contourPlot0 = null;
      try {
        contourPlot0 = new ContourPlot((double[][]) null, (double[][]) null, (double[][]) null, 10, false, "idie ", "idie ", "idie ", decimalFormat0, decimalFormat0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.ContourGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[][] doubleArray0 = new double[5][4];
      ContourPlot contourPlot0 = null;
      try {
        contourPlot0 = new ContourPlot(doubleArray0, doubleArray0, doubleArray0, (-1), false, "mg-dummy\n", "mg-dummy\n", "mg-dummy\n", (NumberFormat) null, (NumberFormat) null);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.ContourGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[0][0];
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      ContourPlot contourPlot0 = null;
      try {
        contourPlot0 = new ContourPlot(doubleArray0, doubleArray0, doubleArray0, 0, false, "", "", "", numberFormat0, numberFormat0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jahuwaldt.plot.ContourGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[3][9];
      double[] doubleArray1 = new double[3];
      doubleArray1[1] = (-2357.832);
      doubleArray1[2] = (-3992.2);
      doubleArray0[0] = doubleArray1;
      ContourPlot contourPlot0 = new ContourPlot(doubleArray0, doubleArray0, doubleArray0, 538, false, "", "", "", (NumberFormat) null, (NumberFormat) null);
      Object object0 = contourPlot0.clone();
      assertNotSame(object0, contourPlot0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[][] doubleArray0 = new double[3][9];
      ContourPlot contourPlot0 = new ContourPlot(doubleArray0, doubleArray0, doubleArray0, 538, false, "", "", "", (NumberFormat) null, (NumberFormat) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ContourPlot contourPlot0 = new ContourPlot();
      // Undeclared exception!
      try { 
        contourPlot0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.SimplePlotXY", e);
      }
  }
}