/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 04 13:40:39 GMT 2019
 */

package jigl.image.types;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jigl.image.ROI;
import jigl.image.types.ComplexImage;
import jigl.image.types.RealGrayImage;
import jigl.math.Complex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ComplexImage_ESTest extends ComplexImage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ComplexImage complexImage0 = new ComplexImage(0, 0);
      assertNotNull(complexImage0);
      assertEquals(0, complexImage0.Y());
      assertEquals(0, complexImage0.X());
      
      RealGrayImage realGrayImage0 = complexImage0.phaseImage();
      assertNotNull(realGrayImage0);
      assertEquals(0, complexImage0.Y());
      assertEquals(0, complexImage0.X());
      assertEquals(0.0, realGrayImage0.sqrSum(), 0.01);
      assertEquals(0.0F, realGrayImage0.addSum(), 0.01F);
      assertEquals(0.0F, realGrayImage0.absSum(), 0.01F);
      assertEquals(0, realGrayImage0.Y());
      assertEquals(0, realGrayImage0.X());
      assertEquals((-32768.0F), realGrayImage0.max(), 0.01F);
      assertEquals(32767.0F, realGrayImage0.min(), 0.01F);
      
      ComplexImage complexImage1 = new ComplexImage(0, 7);
      assertFalse(complexImage1.equals((Object)complexImage0));
      assertNotNull(complexImage1);
      assertEquals(0, complexImage1.X());
      assertEquals(7, complexImage1.Y());
      
      Complex complex0 = complexImage1.max();
      assertNotSame(complexImage1, complexImage0);
      assertFalse(complexImage1.equals((Object)complexImage0));
      assertNotNull(complex0);
      assertEquals(0, complexImage1.X());
      assertEquals(7, complexImage1.Y());
      assertEquals(0.0F, complex0.floatValue(), 0.01F);
      assertEquals(0.0, complex0.real(), 0.01);
      assertEquals(0.0, complex0.imag(), 0.01);
      assertEquals((byte)0, complex0.byteValue());
      assertEquals(0, complex0.intValue());
      assertEquals(0.0, complex0.magnitude(), 0.01);
      assertEquals(0.0, complex0.doubleValue(), 0.01);
      assertEquals(0.0, complex0.imaginary(), 0.01);
      assertEquals(0.0, complex0.arg(), 0.01);
      assertEquals(0L, complex0.longValue());
      assertEquals((short)0, complex0.shortValue());
      
      complexImage1.divide(complexImage0);
      assertNotSame(complexImage0, complexImage1);
      assertNotSame(complexImage1, complexImage0);
      assertFalse(complexImage0.equals((Object)complexImage1));
      assertFalse(complexImage1.equals((Object)complexImage0));
      assertEquals(0, complexImage0.Y());
      assertEquals(0, complexImage0.X());
      assertEquals(0, complexImage1.X());
      assertEquals(7, complexImage1.Y());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ComplexImage complexImage0 = new ComplexImage();
      assertNotNull(complexImage0);
      assertEquals(0, complexImage0.Y());
      assertEquals(0, complexImage0.X());
      
      RealGrayImage realGrayImage0 = complexImage0.imag();
      assertNull(realGrayImage0);
      assertEquals(0, complexImage0.Y());
      assertEquals(0, complexImage0.X());
      
      int int0 = 255;
      ComplexImage complexImage1 = new ComplexImage(1647, 1647);
      assertFalse(complexImage1.equals((Object)complexImage0));
      assertNotNull(complexImage1);
      assertEquals(1647, complexImage1.X());
      assertEquals(1647, complexImage1.Y());
      
      // Undeclared exception!
      try { 
        complexImage1.divide(complexImage0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ComplexImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ComplexImage complexImage0 = new ComplexImage();
      assertNotNull(complexImage0);
      assertEquals(0, complexImage0.X());
      assertEquals(0, complexImage0.Y());
      
      ROI rOI0 = new ROI(0, 0, (-927), 0);
      assertNotNull(rOI0);
      assertEquals(0, rOI0.ly());
      assertEquals(0, rOI0.lx());
      assertEquals(1, rOI0.Y());
      assertEquals(928, rOI0.X());
      assertEquals((-927), rOI0.ux());
      assertEquals(0, rOI0.uy());
      
      ComplexImage complexImage1 = new ComplexImage();
      assertFalse(complexImage1.equals((Object)complexImage0));
      assertNotNull(complexImage1);
      assertEquals(0, complexImage1.X());
      assertEquals(0, complexImage1.Y());
      
      ROI rOI1 = new ROI(0, 0, (-886), 0);
      assertFalse(rOI1.equals((Object)rOI0));
      assertNotNull(rOI1);
      assertEquals(0, rOI1.ly());
      assertEquals(0, rOI1.lx());
      assertEquals(1, rOI1.Y());
      assertEquals(0, rOI1.uy());
      assertEquals(887, rOI1.X());
      assertEquals((-886), rOI1.ux());
      
      // Undeclared exception!
      try { 
        complexImage0.add(complexImage1, rOI1, rOI0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ComplexImage", e);
      }
  }
}