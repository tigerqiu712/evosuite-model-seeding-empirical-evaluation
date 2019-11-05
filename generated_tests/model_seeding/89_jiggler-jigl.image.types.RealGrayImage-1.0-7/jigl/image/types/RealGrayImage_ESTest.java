/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 05 16:17:37 GMT 2019
 */

package jigl.image.types;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jigl.image.ROI;
import jigl.image.types.RealGrayImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RealGrayImage_ESTest extends RealGrayImage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(242, 0);
      realGrayImage0.toString();
      Integer integer0 = new Integer(0);
      ROI rOI0 = new ROI();
      rOI0.lx();
      rOI0.ly();
      realGrayImage0.copy();
      rOI0.ux();
      // Undeclared exception!
      try { 
        realGrayImage0.add((RealGrayImage) null, rOI0, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      float[][] floatArray0 = new float[1][0];
      float[] floatArray1 = new float[2];
      floatArray1[0] = (-3281.74F);
      floatArray1[1] = 2139.64F;
      floatArray0[0] = floatArray1;
      RealGrayImage realGrayImage0 = null;
      try {
        realGrayImage0 = new RealGrayImage(floatArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      float[][] floatArray0 = new float[0][2];
      RealGrayImage realGrayImage0 = new RealGrayImage(floatArray0);
      ROI rOI0 = new ROI();
      rOI0.X();
      realGrayImage0.getJavaImage();
      int int0 = 4721;
      RealGrayImage realGrayImage1 = realGrayImage0.copy();
      // Undeclared exception!
      realGrayImage1.addbuffer(4721, 4721, 255, 255, (float) 1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(228, 0);
      Float.valueOf(742.24F);
      Float float0 = Float.valueOf((-1880.9459F));
      float0.floatValue();
      Float float1 = new Float((-2388.412903));
      RealGrayImage realGrayImage1 = realGrayImage0.addbuffer(1, 1449, 255.0F);
      RealGrayImage realGrayImage2 = realGrayImage1.copy();
      RealGrayImage realGrayImage3 = realGrayImage2.copy();
      realGrayImage1.toString();
      realGrayImage3.toString();
      realGrayImage2.clip(255, 0);
      realGrayImage2.addSum();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(273, 0);
      realGrayImage0.toString();
      RealGrayImage realGrayImage1 = new RealGrayImage(realGrayImage0);
      realGrayImage0.addSum();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(639, 639);
      Float float0 = new Float(379.0);
      float0.floatValue();
      float0.floatValue();
      Float float1 = new Float((double) 379.0F);
      ROI rOI0 = new ROI();
      rOI0.X();
      rOI0.Y();
      rOI0.Y();
      RealGrayImage realGrayImage1 = realGrayImage0.copy(rOI0);
      // Undeclared exception!
      try { 
        realGrayImage1.add(1, 1, 2386.2F);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      float[][] floatArray0 = new float[0][8];
      RealGrayImage realGrayImage0 = new RealGrayImage(floatArray0);
      float float0 = (-3537.9624F);
      Float float1 = Float.valueOf((-3537.9624F));
      RealGrayImage realGrayImage1 = realGrayImage0.clear(float1);
      realGrayImage0.toString();
      RealGrayImage realGrayImage2 = new RealGrayImage(realGrayImage1);
      realGrayImage2.sqrSum();
      ROI rOI0 = new ROI((-920), (-920), (-2352), (-920));
      rOI0.ux();
      rOI0.lx();
      rOI0.ux();
      rOI0.uy();
      rOI0.ly();
      rOI0.ux();
      // Undeclared exception!
      try { 
        realGrayImage1.set(1827, (-1), float1, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -921
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = 0;
      float[] floatArray0 = new float[2];
      floatArray0[0] = (float) 0;
      floatArray0[1] = (float) 0;
      RealGrayImage realGrayImage0 = new RealGrayImage(0, 0, floatArray0);
      int int1 = (-920);
      int int2 = (-2352);
      realGrayImage0.addSum();
      realGrayImage0.getJavaImage();
      int int3 = 1901;
      int int4 = 255;
      int int5 = (-1199);
      // Undeclared exception!
      realGrayImage0.addbuffer(int4, int3, int0, int5, (float) int2);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = 273;
      RealGrayImage realGrayImage0 = null;
      try {
        realGrayImage0 = new RealGrayImage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = 44;
      RealGrayImage realGrayImage0 = new RealGrayImage(44, 44);
      realGrayImage0.copy();
      realGrayImage0.addbuffer(44, 44, (-1), 44, (float) (-1));
      RealGrayImage realGrayImage1 = null;
      try {
        realGrayImage1 = new RealGrayImage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      float[] floatArray0 = new float[2];
      floatArray0[0] = (float) 0;
      floatArray0[1] = (float) 0;
      RealGrayImage realGrayImage0 = new RealGrayImage(0, 0, floatArray0);
      ROI rOI0 = new ROI((-920), (-920), (-2352), (-920));
      rOI0.ux();
      rOI0.lx();
      rOI0.ux();
      rOI0.ux();
      rOI0.uy();
      rOI0.ly();
      rOI0.ux();
      ROI rOI1 = new ROI((-920), (-920), (-2352), (-920));
      rOI1.ux();
      rOI1.lx();
      rOI1.ux();
      rOI1.uy();
      rOI1.ly();
      rOI1.ux();
      // Undeclared exception!
      try { 
        realGrayImage0.byteSize(rOI1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -920
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(228, 0);
      realGrayImage0.addbuffer(0, 248, (float) 248);
      realGrayImage0.addSum();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(639, 639);
      Float float0 = new Float((double) 639);
      float0.floatValue();
      Float float1 = new Float((-38.82689055));
      Float float2 = new Float((double) 639);
      ROI rOI0 = new ROI();
      rOI0.X();
      rOI0.Y();
      ROI rOI1 = new ROI((-920), (-920), (-2352), (-920));
      rOI1.ux();
      rOI1.lx();
      rOI1.ux();
      rOI1.uy();
      rOI1.ly();
      rOI1.ux();
      // Undeclared exception!
      try { 
        realGrayImage0.clip((-1), (-1543), rOI1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -920
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(228, 0);
      realGrayImage0.toString();
      Integer integer0 = new Integer(0);
      ROI rOI0 = new ROI((-920), (-920), (-2352), (-920));
      rOI0.lx();
      rOI0.ly();
      rOI0.ux();
      // Undeclared exception!
      try { 
        realGrayImage0.add((RealGrayImage) null, rOI0, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2352
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = 0;
      float[] floatArray0 = new float[4];
      floatArray0[0] = (float) 0;
      floatArray0[1] = (float) 0;
      floatArray0[2] = (-194.48862F);
      floatArray0[3] = (float) 0;
      RealGrayImage realGrayImage0 = new RealGrayImage(0, 0, floatArray0);
      int int1 = 486;
      realGrayImage0.toString();
      RealGrayImage realGrayImage1 = realGrayImage0.copy();
      RealGrayImage realGrayImage2 = realGrayImage1.addbuffer(0, 0, (float) 0);
      // Undeclared exception!
      realGrayImage2.addbuffer(486, 486, (-194.48862F));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      float[][] floatArray0 = new float[2][2];
      float[] floatArray1 = new float[5];
      floatArray1[0] = 0.0F;
      floatArray1[1] = 0.0F;
      floatArray1[2] = 0.0F;
      floatArray1[3] = 342.005F;
      floatArray1[4] = (-2145.0137F);
      floatArray0[0] = floatArray1;
      float[] floatArray2 = new float[3];
      floatArray2[0] = 342.005F;
      floatArray2[1] = 0.0F;
      floatArray2[2] = 0.0F;
      floatArray0[1] = floatArray2;
      RealGrayImage realGrayImage0 = null;
      try {
        realGrayImage0 = new RealGrayImage(floatArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      float[][] floatArray0 = new float[3][9];
      float[] floatArray1 = new float[4];
      floatArray1[0] = (-3093.7F);
      floatArray1[1] = 1684.5728F;
      float float0 = (-2444.023F);
      floatArray1[2] = (-2444.023F);
      floatArray1[3] = 0.0F;
      floatArray0[0] = floatArray1;
      float[] floatArray2 = new float[3];
      floatArray2[0] = (-3093.7F);
      floatArray2[1] = 0.0F;
      floatArray2[2] = (-2444.023F);
      floatArray0[1] = floatArray2;
      float[] floatArray3 = new float[0];
      floatArray0[2] = floatArray3;
      RealGrayImage realGrayImage0 = null;
      try {
        realGrayImage0 = new RealGrayImage(floatArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(639, 639);
      ROI rOI0 = new ROI();
      rOI0.X();
      rOI0.Y();
      // Undeclared exception!
      try { 
        realGrayImage0.clip((-1042), 1, rOI0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = 273;
      RealGrayImage realGrayImage0 = new RealGrayImage(273, 273);
      int int1 = (-914);
      ROI rOI0 = new ROI();
      rOI0.Y();
      // Undeclared exception!
      try { 
        realGrayImage0.getJavaImage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      float[][] floatArray0 = new float[0][8];
      RealGrayImage realGrayImage0 = new RealGrayImage(floatArray0);
      Float float0 = Float.valueOf((-3537.9624F));
      realGrayImage0.clear(float0);
      int int0 = 3111;
      int int1 = (-1);
      RealGrayImage realGrayImage1 = null;
      try {
        realGrayImage1 = new RealGrayImage(3111, 3111, (float[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(639, 639);
      Float float0 = new Float(379.0);
      float0.floatValue();
      float0.floatValue();
      Float float1 = new Float((double) 379.0F);
      Float float2 = new Float((double) 379.0F);
      float2.floatValue();
      // Undeclared exception!
      realGrayImage0.clear((Float) 379.0F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(228, 0);
      ROI rOI0 = new ROI();
      rOI0.X();
      realGrayImage0.getJavaImage();
      rOI0.setROI(128, (-1), 228, 108);
      realGrayImage0.median(228);
      realGrayImage0.addbuffer(1423, 1, (float) (-1));
      int int0 = (-1);
      int int1 = 846;
      RealGrayImage realGrayImage1 = null;
      try {
        realGrayImage1 = new RealGrayImage((-1), 846);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(228, 0);
      ROI rOI0 = new ROI();
      rOI0.X();
      realGrayImage0.getJavaImage();
      rOI0.setROI(128, (-1), 228, 108);
      realGrayImage0.median(228);
      RealGrayImage realGrayImage1 = new RealGrayImage(0, 16);
      realGrayImage1.clip(108, (-1677));
      // Undeclared exception!
      try { 
        realGrayImage0.subtract(realGrayImage1, rOI0, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 128
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int int0 = 0;
      RealGrayImage realGrayImage0 = new RealGrayImage(228, 0);
      int int1 = 128;
      int int2 = 1;
      int int3 = 1449;
      ROI rOI0 = new ROI((-920), (-920), (-2352), (-920));
      rOI0.ux();
      rOI0.lx();
      rOI0.ux();
      rOI0.uy();
      rOI0.ly();
      rOI0.ux();
      // Undeclared exception!
      try { 
        realGrayImage0.multiply((-16777216), 0, 32767.0F, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -920
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = 44;
      RealGrayImage realGrayImage0 = new RealGrayImage(44, 44);
      RealGrayImage realGrayImage1 = realGrayImage0.copy();
      // Undeclared exception!
      try { 
        realGrayImage1.addbuffer(44, (-2764), 909, (-2764), (float) (-2764));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = 2110;
      RealGrayImage realGrayImage0 = new RealGrayImage(2110, 2110);
      // Undeclared exception!
      try { 
        realGrayImage0.byteSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(273, 273);
      realGrayImage0.get(1, 96);
      realGrayImage0.X();
      // Undeclared exception!
      try { 
        realGrayImage0.addSum();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(639, 639);
      Float float0 = new Float(379.0);
      float0.floatValue();
      Float float1 = new Float((double) 379.0F);
      Float float2 = new Float((double) 379.0F);
      float2.floatValue();
      // Undeclared exception!
      realGrayImage0.clear((Float) 379.0F);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(228, 0);
      realGrayImage0.toString();
      Integer integer0 = new Integer(0);
      RealGrayImage realGrayImage1 = null;
      ROI rOI0 = new ROI((-920), (-920), (-2352), (-920));
      rOI0.ux();
      rOI0.lx();
      // Undeclared exception!
      try { 
        realGrayImage0.subtract(1, 0, 0.0F);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      float[][] floatArray0 = new float[0][8];
      RealGrayImage realGrayImage0 = new RealGrayImage(floatArray0);
      float float0 = (-3537.9624F);
      Float float1 = Float.valueOf((-3537.9624F));
      RealGrayImage realGrayImage1 = realGrayImage0.clear(float1);
      int int0 = 3111;
      int int1 = (-1);
      float float2 = 2604.0F;
      realGrayImage0.toString();
      realGrayImage1.addbuffer(int0, int0, int1, int1, float2);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = 0;
      RealGrayImage realGrayImage0 = new RealGrayImage(228, 0);
      int int1 = 248;
      // Undeclared exception!
      try { 
        realGrayImage0.addbuffer(248, (-159), (float) 228);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = 0;
      RealGrayImage realGrayImage0 = new RealGrayImage(0, 0);
      RealGrayImage realGrayImage1 = realGrayImage0.copy();
      realGrayImage0.addbuffer(0, 0, (-1), 0, 0.0F);
      realGrayImage1.copy();
      ROI rOI0 = new ROI();
      rOI0.X();
      rOI0.Y();
      // Undeclared exception!
      try { 
        realGrayImage1.copy(rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(639, 639);
      Float float0 = new Float(379.0);
      float0.floatValue();
      float0.floatValue();
      Float float1 = new Float((double) 379.0F);
      RealGrayImage realGrayImage1 = realGrayImage0.addbuffer(8, 32, (float) 32);
      realGrayImage1.copy();
      Float float2 = Float.valueOf((-1100.0F));
      realGrayImage1.clear(float2);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = 228;
      RealGrayImage realGrayImage0 = new RealGrayImage(228, 2);
      int int1 = 248;
      // Undeclared exception!
      realGrayImage0.addbuffer(248, 1091, (float) 228);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(0, 0);
      RealGrayImage realGrayImage1 = realGrayImage0.copy();
      realGrayImage0.addbuffer(0, 0, (-1), 0, 0.0F);
      realGrayImage1.copy();
      realGrayImage0.getJavaImage();
      realGrayImage0.copy();
      RealGrayImage realGrayImage2 = realGrayImage0.divide(425.3192F);
      realGrayImage1.addSum();
      // Undeclared exception!
      try { 
        realGrayImage2.get(0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = 0;
      RealGrayImage realGrayImage0 = new RealGrayImage(0, 0);
      realGrayImage0.addbuffer(0, 0, (-1), 0, 0.0F);
      realGrayImage0.copy();
      ROI rOI0 = new ROI();
      rOI0.X();
      rOI0.Y();
      // Undeclared exception!
      try { 
        realGrayImage0.copy(rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(0, 0);
      RealGrayImage realGrayImage1 = realGrayImage0.copy();
      RealGrayImage realGrayImage2 = realGrayImage0.addbuffer(0, 0, (-1), 0, 0.0F);
      realGrayImage2.getJavaImage();
      realGrayImage1.copy();
      realGrayImage0.copy();
      RealGrayImage realGrayImage3 = realGrayImage0.divide(425.3192F);
      realGrayImage1.addSum();
      realGrayImage3.getJavaImage();
      int int0 = 875;
      realGrayImage3.addbuffer(0, 1901, 875, (-1), 0.0F);
      float[] floatArray0 = new float[6];
      floatArray0[0] = 2092.201F;
      floatArray0[1] = (float) (-1777);
      floatArray0[2] = (float) (-1777);
      floatArray0[3] = (float) 0;
      floatArray0[4] = (float) 0;
      floatArray0[5] = (float) 0;
      RealGrayImage realGrayImage4 = null;
      try {
        realGrayImage4 = new RealGrayImage(0, (-1777), (float[]) null);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      float[] floatArray0 = new float[2];
      floatArray0[0] = (float) 0;
      floatArray0[1] = (float) 0;
      RealGrayImage realGrayImage0 = new RealGrayImage(0, 0, floatArray0);
      realGrayImage0.addSum();
      realGrayImage0.getJavaImage();
      realGrayImage0.addSum();
      // Undeclared exception!
      try { 
        realGrayImage0.get((-1941), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }
}