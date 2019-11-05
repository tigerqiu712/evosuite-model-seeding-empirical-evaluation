/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 10:12:59 GMT 2019
 */

package jigl.image.types;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jigl.image.ColorModel;
import jigl.image.InterpolationMethod;
import jigl.image.ROI;
import jigl.image.types.ColorImage;
import jigl.image.types.GrayImage;
import jigl.image.types.InterpolatedColorImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ColorImage_ESTest extends ColorImage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(0, 0);
      ColorImage colorImage1 = new ColorImage(colorImage0);
      assertEquals(0, colorImage1.Y());
      assertEquals(0, colorImage1.X());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(2, 2);
      String string0 = colorImage0.toString();
      assertEquals("2:2\nnull null \nnull null \n2:2\nnull null \nnull null \n2:2\nnull null \nnull null \n", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(0, 40);
      ColorImage colorImage1 = colorImage0.subtract((-513), 0, 9);
      assertEquals(ColorModel.RGB, colorImage1.getColorModel());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(194, 0);
      ColorImage colorImage0 = interpolatedColorImage0.subtract(0, 0, 715);
      assertEquals(0, colorImage0.Y());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      ColorImage colorImage0 = interpolatedColorImage0.subtract(0, 0);
      assertSame(colorImage0, interpolatedColorImage0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(6, 0);
      long[] longArray0 = interpolatedColorImage0.sqrSum();
      assertEquals(3, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      GrayImage grayImage0 = interpolatedColorImage0.plane(0);
      assertNull(grayImage0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(6, 0);
      GrayImage grayImage0 = interpolatedColorImage0.plane(0);
      assertEquals(0, grayImage0.absSum());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      InterpolatedColorImage interpolatedColorImage1 = (InterpolatedColorImage)interpolatedColorImage0.multiply((ColorImage) interpolatedColorImage0);
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedColorImage1.getInterpolationMethod());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      InterpolatedColorImage interpolatedColorImage1 = new InterpolatedColorImage(3, 0);
      ColorImage colorImage0 = interpolatedColorImage1.multiply((ColorImage) interpolatedColorImage0);
      assertEquals(0, colorImage0.Y());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(0, 0);
      ColorImage colorImage1 = colorImage0.multiply(6, 0, 0);
      assertEquals(0, colorImage1.X());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(6, 0);
      Integer integer0 = interpolatedColorImage0.minComponent();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(0, 16);
      Integer integer0 = colorImage0.maxComponent();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(0, 16);
      Integer[] integerArray0 = colorImage0.max();
      assertEquals(3, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(6, 0);
      ColorImage colorImage0 = interpolatedColorImage0.divide((-866), 128, 0);
      assertEquals(6, colorImage0.X());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(255, 255);
      ROI rOI0 = new ROI();
      ColorImage colorImage0 = interpolatedColorImage0.copy(rOI0);
      assertEquals(1, colorImage0.Y());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      ColorImage colorImage0 = interpolatedColorImage0.copy();
      Integer[] integerArray0 = colorImage0.min();
      assertEquals(3, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(6, 0);
      ColorImage colorImage0 = interpolatedColorImage0.clear();
      assertEquals(ColorModel.RGB, colorImage0.getColorModel());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(0, 0);
      int[] intArray0 = new int[6];
      ColorImage colorImage1 = colorImage0.addbuffer(0, 0, intArray0);
      assertNotSame(colorImage1, colorImage0);
      assertEquals(0, colorImage1.Y());
      assertEquals(0, colorImage1.X());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      int int0 = interpolatedColorImage0.Y();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(0, 16);
      int int0 = colorImage0.X();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ROI rOI0 = new ROI();
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(255, 0);
      // Undeclared exception!
      try { 
        interpolatedColorImage0.toString(rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.GrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(32767, 0);
      // Undeclared exception!
      interpolatedColorImage0.toString();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage();
      // Undeclared exception!
      try { 
        colorImage0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(0, 16);
      ROI rOI0 = new ROI((-908), (-572), 16, 760);
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        colorImage0.subtract(intArray0, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -572
         //
         verifyException("jigl.image.types.GrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(21, 0);
      ROI rOI0 = new ROI();
      // Undeclared exception!
      try { 
        interpolatedColorImage0.subtract((ColorImage) interpolatedColorImage0, rOI0, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.GrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        interpolatedColorImage0.subtract(0, 4454, intArray0, (ROI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        interpolatedColorImage0.subtract(222, 1174, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage();
      ROI rOI0 = new ROI(0, 9, 1, 0);
      // Undeclared exception!
      try { 
        colorImage0.subtract(0, 0, rOI0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(0, 40);
      ROI rOI0 = new ROI();
      // Undeclared exception!
      try { 
        colorImage0.subtract((-513), 40, (-513), rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.GrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      // Undeclared exception!
      try { 
        interpolatedColorImage0.subtract((-17), 586);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -17
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      ROI rOI0 = new ROI();
      Integer[] integerArray0 = new Integer[0];
      // Undeclared exception!
      try { 
        interpolatedColorImage0.set(421, 1, integerArray0, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(6, 128);
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(colorImage0);
      // Undeclared exception!
      try { 
        interpolatedColorImage0.plane(128);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 128
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ROI rOI0 = new ROI();
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        interpolatedColorImage0.multiply(16, 2148, intArray0, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(0, 40);
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(colorImage0);
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        interpolatedColorImage0.multiply(40, 1206, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1206
         //
         verifyException("jigl.image.types.GrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      ROI rOI0 = new ROI(5, 0, 0, 5);
      // Undeclared exception!
      try { 
        interpolatedColorImage0.multiply(6, 6, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      // Undeclared exception!
      try { 
        interpolatedColorImage0.multiply(0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      ROI rOI0 = new ROI((-878), 128, 221, (-781));
      // Undeclared exception!
      try { 
        interpolatedColorImage0.min(rOI0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      ROI rOI0 = new ROI((-878), 128, 255, (-781));
      // Undeclared exception!
      try { 
        interpolatedColorImage0.min(rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -781
         //
         verifyException("jigl.image.types.GrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      // Undeclared exception!
      try { 
        interpolatedColorImage0.min(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(893, 1440);
      // Undeclared exception!
      colorImage0.min();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(255, 255);
      // Undeclared exception!
      interpolatedColorImage0.maxComponent();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      ROI rOI0 = new ROI();
      // Undeclared exception!
      try { 
        interpolatedColorImage0.max(rOI0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(0, 16);
      ROI rOI0 = new ROI(0, 0, (-985), 0);
      // Undeclared exception!
      try { 
        colorImage0.max(rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -985
         //
         verifyException("jigl.image.types.GrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      ROI rOI0 = new ROI(209, 3614, 3614, Integer.MAX_VALUE);
      // Undeclared exception!
      try { 
        interpolatedColorImage0.max(Integer.MAX_VALUE, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2147483647
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      // Undeclared exception!
      try { 
        interpolatedColorImage0.max(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage();
      // Undeclared exception!
      try { 
        colorImage0.getJavaImage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(0, 17);
      ROI rOI0 = new ROI((-32768), (-430), 0, 0);
      // Undeclared exception!
      try { 
        colorImage0.get(12, 0, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -430
         //
         verifyException("jigl.image.types.GrayImage", e);
      }
  }
}