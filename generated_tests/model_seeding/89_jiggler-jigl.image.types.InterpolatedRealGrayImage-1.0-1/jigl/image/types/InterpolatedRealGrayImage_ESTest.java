/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 11:35:04 GMT 2019
 */

package jigl.image.types;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Image;
import jigl.image.InterpolationMethod;
import jigl.image.types.InterpolatedRealGrayImage;
import jigl.image.types.RealGrayImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InterpolatedRealGrayImage_ESTest extends InterpolatedRealGrayImage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(879, 879);
      interpolatedRealGrayImage0.splat(0, 2, 971.14F);
      assertEquals(879, interpolatedRealGrayImage0.Y());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(2473, 2473);
      interpolatedRealGrayImage0.splat(2432.8313F, 2432.8313F, 3137.8958F);
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(8, 8);
      interpolatedRealGrayImage0.splat(0.0F, (-0.5F), 0.0F);
      assertEquals(8, interpolatedRealGrayImage0.X());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(15, 15);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.splat(251.17369F, 0.0F, (-1036.4415F));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 251
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(0, 0);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.CUBIC;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.accum(0, 0.0F, 1194.5F);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(1, 2);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.LINEAR;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.accum(2, 0.0F, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(0, 715);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.accum(1194.5F, 0.0F, 0.0F);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1195
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(8, 8);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(101.039154F, (-0.5F));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 101
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(1, 1);
      interpolatedRealGrayImage0.splat(0.0F, 0.0F, 1089.3794F);
      InterpolatedRealGrayImage interpolatedRealGrayImage1 = interpolatedRealGrayImage0.copy();
      assertEquals(1, interpolatedRealGrayImage1.Y());
      assertEquals(1089.3794F, interpolatedRealGrayImage1.min(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(0, 0);
      InterpolatedRealGrayImage interpolatedRealGrayImage1 = interpolatedRealGrayImage0.copy();
      assertEquals(0, interpolatedRealGrayImage1.Y());
      assertEquals(0, interpolatedRealGrayImage1.X());
      assertNotSame(interpolatedRealGrayImage1, interpolatedRealGrayImage0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(2704, 2704);
      interpolatedRealGrayImage0.setInterpolationMethod((InterpolationMethod) null);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.splat(2704, 2704, 2704);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(101, 101);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.accum(0, 0, 101);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(8, 2327);
      InterpolatedRealGrayImage interpolatedRealGrayImage1 = new InterpolatedRealGrayImage((RealGrayImage) interpolatedRealGrayImage0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(4175, 4175);
      InterpolatedRealGrayImage interpolatedRealGrayImage1 = new InterpolatedRealGrayImage(interpolatedRealGrayImage0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(8, 32767);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = null;
      try {
        interpolatedRealGrayImage0 = new InterpolatedRealGrayImage((-14), (-14));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(41, 41);
      InterpolatedRealGrayImage interpolatedRealGrayImage1 = new InterpolatedRealGrayImage((RealGrayImage) interpolatedRealGrayImage0);
      assertEquals(41, interpolatedRealGrayImage1.Y());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(0, 0);
      InterpolationMethod interpolationMethod0 = interpolatedRealGrayImage0.getInterpolationMethod();
      assertEquals(InterpolationMethod.NEIGHBOR, interpolationMethod0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(136, 136);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.LINEAR;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.splat((-1533.3F), 0.0F, 0.7948893F);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1533
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(0, 0);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.CUBIC;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.splat(0, 0.0F, 32767.0F);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(8, 8);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.LINEAR;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.accum(8, 8, 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(21, 21);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.CUBIC;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(4.0F, 4.0F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(21, 21);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.CUBIC;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(4.0F, 21);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 21
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(8, 8);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.CUBIC;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(8, 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(1580, 1580);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.CUBIC;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(1580, 0.0F);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1580
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(8, 8);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.CUBIC;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp((-6328.496F), (-6328.496F));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -6328
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(8, 8);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.LINEAR;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(8, (-1.0F));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(8, 8);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.LINEAR;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(0.0F, 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(41, 41);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.LINEAR;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(0.0F, 0.0F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(5, 5);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.LINEAR;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(4.0F, 2725.8774F);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2725
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(15, 15);
      InterpolatedRealGrayImage interpolatedRealGrayImage1 = interpolatedRealGrayImage0.copy();
      assertEquals(15, interpolatedRealGrayImage1.X());
      assertEquals(15, interpolatedRealGrayImage1.Y());
      assertNotSame(interpolatedRealGrayImage1, interpolatedRealGrayImage0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(1015, 1015);
      // Undeclared exception!
      interpolatedRealGrayImage0.copy();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = null;
      try {
        interpolatedRealGrayImage0 = new InterpolatedRealGrayImage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(0, 0);
      InterpolatedRealGrayImage interpolatedRealGrayImage1 = new InterpolatedRealGrayImage(interpolatedRealGrayImage0);
      assertEquals(0, interpolatedRealGrayImage1.Y());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = null;
      try {
        interpolatedRealGrayImage0 = new InterpolatedRealGrayImage((Image) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.AbstractImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = null;
      try {
        interpolatedRealGrayImage0 = new InterpolatedRealGrayImage((RealGrayImage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = null;
      try {
        interpolatedRealGrayImage0 = new InterpolatedRealGrayImage((InterpolatedRealGrayImage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
