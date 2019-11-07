/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 07 12:52:37 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.AxisLimitData;
import jahuwaldt.plot.BoxLRSymbol;
import jahuwaldt.plot.LinearAxisScale;
import jahuwaldt.plot.PlotDatum;
import jahuwaldt.plot.PlotSymbol;
import jahuwaldt.plot.TickMarkData;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinearAxisScale_ESTest extends LinearAxisScale_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      
      PlotSymbol plotSymbol0 = mock(PlotSymbol.class, new ViolatedAssumptionAnswer());
      PlotDatum plotDatum0 = new PlotDatum(2336.542, 2336.542, true, plotSymbol0);
      assertEquals(2336.542, plotDatum0.y, 0.01);
      assertEquals(2336.542, plotDatum0.x, 0.01);
      assertNotNull(plotDatum0);
      assertTrue(plotDatum0.connected());
      assertEquals(0.0, plotDatum0.getYError(), 0.01);
      assertFalse(plotDatum0.hasErrorBar());
      assertEquals(2336.542, plotDatum0.getY(), 0.01);
      assertEquals(2336.542, plotDatum0.getX(), 0.01);
      
      AxisLimitData axisLimitData0 = new AxisLimitData();
      assertNotNull(axisLimitData0);
      
      linearAxisScale0.adjustForErrorBars(plotDatum0, 2336.542, 2336.542, axisLimitData0);
      assertEquals(2336.542, plotDatum0.y, 0.01);
      assertEquals(2336.542, plotDatum0.x, 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertTrue(plotDatum0.connected());
      assertEquals(0.0, plotDatum0.getYError(), 0.01);
      assertFalse(plotDatum0.hasErrorBar());
      assertEquals(2336.542, plotDatum0.getY(), 0.01);
      assertEquals(2336.542, plotDatum0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      
      BoxLRSymbol boxLRSymbol0 = new BoxLRSymbol();
      assertNotNull(boxLRSymbol0);
      assertEquals(8, boxLRSymbol0.getSize());
      
      PlotDatum plotDatum0 = new PlotDatum((-794.95), (-4396.176), true, boxLRSymbol0);
      assertEquals((-794.95), plotDatum0.x, 0.01);
      assertEquals((-4396.176), plotDatum0.y, 0.01);
      assertNotNull(plotDatum0);
      assertEquals(8, boxLRSymbol0.getSize());
      assertEquals(0.0, plotDatum0.getYError(), 0.01);
      assertEquals((-794.95), plotDatum0.getX(), 0.01);
      assertEquals((-4396.176), plotDatum0.getY(), 0.01);
      assertTrue(plotDatum0.connected());
      assertFalse(plotDatum0.hasErrorBar());
      
      plotDatum0.setYError(4228.624);
      assertEquals((-794.95), plotDatum0.x, 0.01);
      assertEquals((-4396.176), plotDatum0.y, 0.01);
      assertEquals(8, boxLRSymbol0.getSize());
      assertEquals(4228.624, plotDatum0.getYError(), 0.01);
      assertEquals((-794.95), plotDatum0.getX(), 0.01);
      assertEquals((-4396.176), plotDatum0.getY(), 0.01);
      assertTrue(plotDatum0.hasErrorBar());
      assertTrue(plotDatum0.connected());
      
      // Undeclared exception!
      try { 
        linearAxisScale0.adjustForErrorBars(plotDatum0, 1.0, 624.8, (AxisLimitData) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.LinearAxisScale", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      
      TickMarkData tickMarkData0 = linearAxisScale0.calcTickMarks(912.9442977938103, 0.0, 912.9442977938103, 0.0, 5.0);
      assertNotNull(tickMarkData0);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      
      TickMarkData tickMarkData0 = linearAxisScale0.calcTickMarks(0.0, 0.0, (-3869.430428340872), (-3869.430428340872), (-3869.430428340872));
      assertNotNull(tickMarkData0);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      
      AxisLimitData axisLimitData0 = linearAxisScale0.findGoodLimits(5.0, 5.0);
      assertNotNull(axisLimitData0);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      
      double double0 = linearAxisScale0.func(0.0);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      
      double double0 = linearAxisScale0.func(1.0);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      
      // Undeclared exception!
      linearAxisScale0.findGoodLimits(5.0, (-8.000000000000002E273));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      
      double double0 = linearAxisScale0.lowerBounds();
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      
      TickMarkData tickMarkData0 = linearAxisScale0.calcTickMarks((-1321.026706638729), 10.0, (-2265.3), (-2265.3), 10.0);
      assertNotNull(tickMarkData0);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      
      // Undeclared exception!
      linearAxisScale0.calcTickMarks((-1.0), (-3.853687682111742E259), (-3.853687682111742E259), 1596.27848569786, 1476.0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      
      TickMarkData tickMarkData0 = linearAxisScale0.calcTickMarks(830.3122880000045, 479.02632000000506, 479.02632000000506, 830.3122880000045, 479.02632000000506);
      assertNotNull(tickMarkData0);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      
      // Undeclared exception!
      try { 
        linearAxisScale0.calcTickMarks((-176.2447), (-176.2447), 50.0, 50.0, (-176.2447));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.LinearAxisScale", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      assertNotNull(linearAxisScale0);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
      
      AxisLimitData axisLimitData0 = linearAxisScale0.findGoodLimits((-4076.50788837), (-1819.8905695));
      assertNotNull(axisLimitData0);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      AxisLimitData axisLimitData0 = linearAxisScale0.findGoodLimits((-176.2447), (-100.0));
      assertNotNull(axisLimitData0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      AxisLimitData axisLimitData0 = linearAxisScale0.findGoodLimits(773.5703007485712, 2662.0);
      assertNotNull(axisLimitData0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      AxisLimitData axisLimitData0 = linearAxisScale0.findGoodLimits(96.627648489504, 196.0);
      assertNotNull(axisLimitData0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      linearAxisScale0.findGoodLimits(0.0, 0.0);
      assertEquals((-1.0), linearAxisScale0.lowerBounds(), 0.01);
      assertEquals(1.0, linearAxisScale0.upperBounds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      double double0 = linearAxisScale0.upperBounds();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      double double0 = linearAxisScale0.func((-176.2447));
      assertEquals((-176.2447), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      AxisLimitData axisLimitData0 = linearAxisScale0.findGoodLimits((-176.2447), (-176.2447));
      assertNotNull(axisLimitData0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      PlotDatum plotDatum0 = new PlotDatum(0.0, 0.0, false);
      AxisLimitData axisLimitData0 = new AxisLimitData();
      linearAxisScale0.adjustForErrorBars(plotDatum0, (-1935.433), (-3.853687682111742E259), axisLimitData0);
      assertEquals(0.0, plotDatum0.x, 0.01);
  }
}
