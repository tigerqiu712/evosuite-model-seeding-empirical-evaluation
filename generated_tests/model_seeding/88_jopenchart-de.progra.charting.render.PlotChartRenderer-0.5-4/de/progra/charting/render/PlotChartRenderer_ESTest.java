/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 18:06:44 GMT 2019
 */

package de.progra.charting.render;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.CoordSystem;
import de.progra.charting.model.DataSet;
import de.progra.charting.model.DefaultDataSet;
import de.progra.charting.model.EditableChartDataModel;
import de.progra.charting.model.ObjectChartDataModel;
import de.progra.charting.render.PlotChartRenderer;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlotChartRenderer_ESTest extends PlotChartRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DataSet[] dataSetArray0 = new DataSet[1];
      DefaultDataSet defaultDataSet0 = new DefaultDataSet();
      dataSetArray0[0] = (DataSet) defaultDataSet0;
      Object[] objectArray0 = new Object[6];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(dataSetArray0, objectArray0);
      CoordSystem coordSystem0 = new CoordSystem(objectChartDataModel0, "om", "");
      PlotChartRenderer plotChartRenderer0 = new PlotChartRenderer(coordSystem0, objectChartDataModel0);
      plotChartRenderer0.renderChart((Graphics2D) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[][] doubleArray0 = new double[2][3];
      String[] stringArray0 = new String[5];
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(doubleArray0, doubleArray0[1], stringArray0);
      CoordSystem coordSystem0 = new CoordSystem(editableChartDataModel0);
      Rectangle rectangle0 = new Rectangle();
      coordSystem0.setBounds(rectangle0);
      PlotChartRenderer plotChartRenderer0 = new PlotChartRenderer(coordSystem0, editableChartDataModel0);
      // Undeclared exception!
      try { 
        plotChartRenderer0.renderChart((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.PlotChartRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[][] doubleArray0 = new double[2][3];
      String[] stringArray0 = new String[7];
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(doubleArray0, doubleArray0[1], stringArray0);
      CoordSystem coordSystem0 = new CoordSystem(editableChartDataModel0);
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(doubleArray0, stringArray0, stringArray0);
      PlotChartRenderer plotChartRenderer0 = new PlotChartRenderer(coordSystem0, objectChartDataModel0);
      // Undeclared exception!
      try { 
        plotChartRenderer0.renderChart((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.PlotChartRenderer", e);
      }
  }
}
