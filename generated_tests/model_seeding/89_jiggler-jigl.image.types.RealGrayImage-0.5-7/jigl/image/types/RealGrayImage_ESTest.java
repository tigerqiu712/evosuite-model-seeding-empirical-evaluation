/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 20:25:55 GMT 2019
 */

package jigl.image.types;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Image;
import java.awt.image.ImageProducer;
import jigl.image.ROI;
import jigl.image.types.RealGrayImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RealGrayImage_ESTest extends RealGrayImage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      float[][] floatArray0 = new float[5][5];
      RealGrayImage realGrayImage0 = new RealGrayImage(floatArray0);
      realGrayImage0.getJavaImage();
      ROI rOI0 = new ROI();
      realGrayImage0.multiply(1, 1, (-32768.0F), rOI0);
      realGrayImage0.byteSize(rOI0);
      realGrayImage0.clip(2490, 2490, rOI0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      float[][] floatArray0 = new float[5][5];
      RealGrayImage realGrayImage0 = new RealGrayImage(floatArray0);
      realGrayImage0.getJavaImage();
      realGrayImage0.subtract(1, 1, 3818.0F);
      RealGrayImage realGrayImage1 = new RealGrayImage(0, 0);
      realGrayImage0.addSum();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(15, 15);
      RealGrayImage realGrayImage1 = realGrayImage0.addbuffer(3, 15, (float) 15);
      realGrayImage1.toString();
      RealGrayImage realGrayImage2 = realGrayImage0.copy();
      ROI rOI0 = new ROI(0, (-1923), 15, (-1923));
      realGrayImage2.copy();
      realGrayImage2.addbuffer(0, 15, (float) 0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      float[][] floatArray0 = new float[5][5];
      RealGrayImage realGrayImage0 = new RealGrayImage(floatArray0);
      realGrayImage0.getJavaImage();
      realGrayImage0.addbuffer(0, 3660, (-2239.0F));
      ROI rOI0 = new ROI();
      realGrayImage0.multiply(0, 0, 0.0F, rOI0);
      realGrayImage0.byteSize(rOI0);
      realGrayImage0.clip(0, 253, rOI0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      float[][] floatArray0 = new float[5][5];
      float[] floatArray1 = new float[6];
      floatArray1[0] = 776.399F;
      RealGrayImage realGrayImage0 = new RealGrayImage(floatArray0);
      realGrayImage0.clip((-276), 1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(0, 0);
      RealGrayImage realGrayImage1 = realGrayImage0.addbuffer(0, 1, (float) 0);
      realGrayImage1.subtract(0.0F);
      // Undeclared exception!
      try { 
        realGrayImage0.addbuffer(0, (-1130), (float) (-1130));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      float[][] floatArray0 = new float[5][5];
      RealGrayImage realGrayImage0 = new RealGrayImage(floatArray0);
      realGrayImage0.getJavaImage();
      realGrayImage0.getJavaImage();
      realGrayImage0.clip(1, 1);
      ROI rOI0 = new ROI();
      realGrayImage0.min(rOI0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(255, 2);
      Integer integer0 = new Integer(2993);
      // Undeclared exception!
      try { 
        realGrayImage0.sqrSum();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      float[][] floatArray0 = new float[5][5];
      float[] floatArray1 = new float[6];
      RealGrayImage realGrayImage0 = new RealGrayImage(floatArray0);
      realGrayImage0.getJavaImage();
      realGrayImage0.clip(1, 1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(1496, 1496);
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
  public void test10()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(1, 30);
      RealGrayImage realGrayImage1 = realGrayImage0.clear();
      ROI rOI0 = new ROI(0, (-1572), 30, (-1572));
      float[][] floatArray0 = new float[0][4];
      RealGrayImage realGrayImage2 = new RealGrayImage(floatArray0);
      realGrayImage2.divide(realGrayImage1);
      // Undeclared exception!
      try { 
        realGrayImage0.toString(rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1572
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      float[][] floatArray0 = new float[5][5];
      RealGrayImage realGrayImage0 = new RealGrayImage(floatArray0);
      realGrayImage0.getJavaImage();
      realGrayImage0.toString();
      RealGrayImage realGrayImage1 = realGrayImage0.copy();
      ROI rOI0 = new ROI((-1374), 1072, (-1374), (-16777216));
      RealGrayImage realGrayImage2 = realGrayImage0.copy();
      realGrayImage0.divide(realGrayImage2);
      // Undeclared exception!
      try { 
        realGrayImage1.toString(rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -16777216
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      float[] floatArray0 = new float[4];
      floatArray0[0] = (float) 2014;
      floatArray0[1] = (float) 2014;
      floatArray0[2] = (float) 2014;
      floatArray0[3] = (float) 2014;
      RealGrayImage realGrayImage0 = null;
      try {
        realGrayImage0 = new RealGrayImage(2014, 2014, floatArray0);
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(1496, 3404);
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
  public void test14()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(15, 255);
      RealGrayImage realGrayImage1 = realGrayImage0.addbuffer(3, 255, (float) 255);
      realGrayImage1.toString();
      realGrayImage0.copy();
      ROI rOI0 = new ROI(0, (-1923), 15, (-1923));
      // Undeclared exception!
      try { 
        realGrayImage0.add(0, (-311), (float) 0, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2234
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(730, 730);
      // Undeclared exception!
      realGrayImage0.clear();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = 255;
      RealGrayImage realGrayImage0 = new RealGrayImage(0, 255);
      RealGrayImage realGrayImage1 = new RealGrayImage(128, 1396);
      realGrayImage0.sqrSum();
      ROI rOI0 = new ROI();
      // Undeclared exception!
      try { 
        realGrayImage1.absSum();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      float[][] floatArray0 = new float[5][5];
      RealGrayImage realGrayImage0 = new RealGrayImage(floatArray0);
      realGrayImage0.copy();
      realGrayImage0.clip(1, 731);
      realGrayImage0.getJavaImage();
      ROI rOI0 = new ROI();
      realGrayImage0.add(1.0F);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      float[][] floatArray0 = new float[5][5];
      RealGrayImage realGrayImage0 = new RealGrayImage(floatArray0);
      realGrayImage0.getJavaImage();
      ROI rOI0 = new ROI();
      rOI0.uy();
      int int0 = new Integer(0);
      int int1 = new Integer(0);
      rOI0.ux();
      rOI0.lx();
      rOI0.uy();
      rOI0.ly();
      realGrayImage0.byteSize(rOI0);
      realGrayImage0.clip(0, 0, rOI0);
      RealGrayImage realGrayImage1 = realGrayImage0.copy();
      // Undeclared exception!
      realGrayImage1.median(252);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(255, 255);
      int int0 = 2;
      ROI rOI0 = new ROI(2, 2, 0, 0);
      int int1 = (-2509);
      rOI0.setROI(2, 0, (-2509), 2);
      rOI0.X();
      rOI0.setROI(3436, 4653, 1, 1);
      int int2 = 0;
      // Undeclared exception!
      try { 
        realGrayImage0.absSum();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = 8;
      int int1 = 0;
      RealGrayImage realGrayImage0 = new RealGrayImage(8, 0, (float[]) null);
      realGrayImage0.median(255);
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
  public void test21()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(0, 0);
      RealGrayImage realGrayImage1 = realGrayImage0.subtract((float) 0);
      realGrayImage1.median(253);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RealGrayImage realGrayImage0 = null;
      try {
        realGrayImage0 = new RealGrayImage(255, 255, (float[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      float[][] floatArray0 = new float[5][5];
      RealGrayImage realGrayImage0 = new RealGrayImage(floatArray0);
      ROI rOI0 = new ROI();
      realGrayImage0.toString(rOI0);
      realGrayImage0.toString(rOI0);
      realGrayImage0.clip((-276), (-276));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = 255;
      RealGrayImage realGrayImage0 = new RealGrayImage(0, 255);
      Float float0 = new Float((float) 0);
      RealGrayImage realGrayImage1 = realGrayImage0.addbuffer(0, 128, (float) 0);
      realGrayImage0.median(255);
      realGrayImage0.toString();
      // Undeclared exception!
      try { 
        realGrayImage1.clip(1494, 128, (ROI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(0, 255);
      float float0 = new Integer(255);
      realGrayImage0.sqrSum();
      ROI rOI0 = new ROI();
      realGrayImage0.copy();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      float[][] floatArray0 = new float[0][7];
      RealGrayImage realGrayImage0 = new RealGrayImage(floatArray0);
      int int0 = 1217;
      // Undeclared exception!
      realGrayImage0.addbuffer(245, 245, 245, (-130), (float) 1217);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(255, 255);
      ROI rOI0 = new ROI(2, 2, 0, 0);
      rOI0.setROI(2, 0, (-2509), 2);
      rOI0.X();
      rOI0.setROI((-2509), 0, 2616, 2);
      rOI0.Y();
      rOI0.Y();
      // Undeclared exception!
      try { 
        realGrayImage0.byteSize(rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2509
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = 0;
      float[] floatArray0 = null;
      RealGrayImage realGrayImage0 = new RealGrayImage(8, 0, (float[]) null);
      float[][] floatArray1 = new float[9][2];
      floatArray1[0] = null;
      float[] floatArray2 = new float[5];
      floatArray2[0] = 1915.5F;
      floatArray2[1] = (float) 255;
      floatArray2[2] = (float) 255;
      floatArray2[3] = (float) 0;
      floatArray2[4] = (float) 0;
      floatArray1[1] = floatArray2;
      floatArray1[2] = null;
      // Undeclared exception!
      realGrayImage0.addbuffer(3425, 8, 1217, 255, (float) 0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      float[][] floatArray0 = new float[5][5];
      float[] floatArray1 = new float[6];
      floatArray1[0] = 776.399F;
      ROI rOI0 = new ROI();
      rOI0.uy();
      rOI0.ux();
      rOI0.ly();
      rOI0.ux();
      rOI0.lx();
      rOI0.uy();
      rOI0.ly();
      rOI0.Y();
      rOI0.Y();
      RealGrayImage realGrayImage0 = new RealGrayImage(floatArray0);
      RealGrayImage realGrayImage1 = realGrayImage0.copy(rOI0);
      int int0 = 0;
      ROI rOI1 = new ROI((-327), 0, 1, 304);
      // Undeclared exception!
      try { 
        realGrayImage1.get(0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(0, 0, (float[]) null);
      RealGrayImage realGrayImage1 = new RealGrayImage(realGrayImage0);
      ROI rOI0 = new ROI(538, 335, 0, 0);
      ROI rOI1 = new ROI(538, 2521, (-1706), 0);
      // Undeclared exception!
      try { 
        realGrayImage1.add((-1706), 538, (-1.0F), rOI1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 538
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(8, 0, (float[]) null);
      float[][] floatArray0 = new float[9][2];
      floatArray0[0] = null;
      floatArray0[1] = floatArray0[0];
      RealGrayImage realGrayImage1 = realGrayImage0.addbuffer(100, 0, 110, (-190), (-1.0F));
      realGrayImage1.copy();
      ROI rOI0 = new ROI(1, (-1138), 1159, 106);
      // Undeclared exception!
      try { 
        realGrayImage0.toString(rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1138
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(11, 11);
      realGrayImage0.Y();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(255, 255);
      // Undeclared exception!
      try { 
        realGrayImage0.subtract((float) 255);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(0, 0);
      RealGrayImage realGrayImage1 = realGrayImage0.subtract((float) 0);
      realGrayImage0.getJavaImage();
      // Undeclared exception!
      try { 
        realGrayImage1.subtract(2, (-3290), (-461.0F));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3290
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(0, 255);
      realGrayImage0.copy();
      Integer integer0 = new Integer(255);
      realGrayImage0.sqrSum();
      ROI rOI0 = new ROI();
      RealGrayImage realGrayImage1 = realGrayImage0.copy();
      realGrayImage1.add(2410.0F);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(0, 255);
      Float float0 = new Float((float) 0);
      Float float1 = new Float(1.0F);
      // Undeclared exception!
      try { 
        realGrayImage0.set(255, 0, float1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 255
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(0, 0);
      realGrayImage0.subtract((float) 0);
      RealGrayImage realGrayImage1 = realGrayImage0.addbuffer(0, 253, 1.0F);
      realGrayImage1.clear();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      float[][] floatArray0 = new float[5][5];
      RealGrayImage realGrayImage0 = new RealGrayImage(floatArray0);
      RealGrayImage realGrayImage1 = realGrayImage0.copy();
      realGrayImage0.clip(1, 731);
      ROI rOI0 = new ROI();
      realGrayImage0.min(rOI0);
      realGrayImage1.subtract((-1574.915F));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = 0;
      RealGrayImage realGrayImage0 = new RealGrayImage(8, 0, (float[]) null);
      assertEquals(0.0F, realGrayImage0.absSum(), 0.01F);
      assertEquals(0, realGrayImage0.Y());
      assertEquals(32767.0F, realGrayImage0.min(), 0.01F);
      assertEquals(0.0, realGrayImage0.sqrSum(), 0.01);
      assertEquals(0.0F, realGrayImage0.addSum(), 0.01F);
      assertEquals(8, realGrayImage0.X());
      assertEquals((-32768.0F), realGrayImage0.max(), 0.01F);
      assertNotNull(realGrayImage0);
      
      float[][] floatArray0 = new float[3][2];
      floatArray0[1] = floatArray0[0];
      floatArray0[2] = null;
      int int1 = 3425;
      // Undeclared exception!
      realGrayImage0.addbuffer(3425, 8, 1217, 0, (float) 0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      float[][] floatArray0 = new float[5][5];
      RealGrayImage realGrayImage0 = new RealGrayImage(floatArray0);
      assertEquals(5, floatArray0.length);
      assertEquals(0.0F, realGrayImage0.max(), 0.01F);
      assertEquals(5, realGrayImage0.Y());
      assertEquals(5, realGrayImage0.X());
      assertEquals(0.0F, realGrayImage0.min(), 0.01F);
      assertEquals(0.0F, realGrayImage0.absSum(), 0.01F);
      assertEquals(0.0F, realGrayImage0.addSum(), 0.01F);
      assertEquals(0.0, realGrayImage0.sqrSum(), 0.01);
      assertNotNull(realGrayImage0);
      
      realGrayImage0.clip(1, 740);
      assertEquals(5, floatArray0.length);
      assertEquals(1.0F, realGrayImage0.max(), 0.01F);
      assertEquals(5, realGrayImage0.Y());
      assertEquals(5, realGrayImage0.X());
      assertEquals(1.0F, realGrayImage0.min(), 0.01F);
      assertEquals(25.0, realGrayImage0.sqrSum(), 0.01);
      assertEquals(25.0F, realGrayImage0.absSum(), 0.01F);
      assertEquals(25.0F, realGrayImage0.addSum(), 0.01F);
      
      ImageProducer imageProducer0 = realGrayImage0.getJavaImage();
      assertEquals(5, floatArray0.length);
      assertEquals(1.0F, realGrayImage0.max(), 0.01F);
      assertEquals(5, realGrayImage0.Y());
      assertEquals(5, realGrayImage0.X());
      assertEquals(1.0F, realGrayImage0.min(), 0.01F);
      assertEquals(25.0, realGrayImage0.sqrSum(), 0.01);
      assertEquals(25.0F, realGrayImage0.absSum(), 0.01F);
      assertEquals(25.0F, realGrayImage0.addSum(), 0.01F);
      assertNotNull(imageProducer0);
      
      realGrayImage0.clip((-1971), 2410);
      assertEquals(5, floatArray0.length);
      assertEquals(1.0F, realGrayImage0.max(), 0.01F);
      assertEquals(5, realGrayImage0.Y());
      assertEquals(5, realGrayImage0.X());
      assertEquals(1.0F, realGrayImage0.min(), 0.01F);
      assertEquals(25.0, realGrayImage0.sqrSum(), 0.01);
      assertEquals(25.0F, realGrayImage0.absSum(), 0.01F);
      assertEquals(25.0F, realGrayImage0.addSum(), 0.01F);
      
      ROI rOI0 = new ROI();
      assertEquals(0, rOI0.uy());
      assertEquals(0, rOI0.ux());
      assertEquals(0, rOI0.ly());
      assertEquals(0, rOI0.lx());
      assertEquals(1, rOI0.Y());
      assertEquals(1, rOI0.X());
      assertNotNull(rOI0);
      
      float float0 = realGrayImage0.min(rOI0);
      assertEquals(5, floatArray0.length);
      assertEquals(1.0F, realGrayImage0.max(), 0.01F);
      assertEquals(5, realGrayImage0.Y());
      assertEquals(5, realGrayImage0.X());
      assertEquals(1.0F, realGrayImage0.min(), 0.01F);
      assertEquals(25.0, realGrayImage0.sqrSum(), 0.01);
      assertEquals(25.0F, realGrayImage0.absSum(), 0.01F);
      assertEquals(25.0F, realGrayImage0.addSum(), 0.01F);
      assertEquals(0, rOI0.uy());
      assertEquals(0, rOI0.ux());
      assertEquals(0, rOI0.ly());
      assertEquals(0, rOI0.lx());
      assertEquals(1, rOI0.Y());
      assertEquals(1, rOI0.X());
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int int0 = 255;
      RealGrayImage realGrayImage0 = new RealGrayImage(255, 255);
      assertEquals(255, realGrayImage0.Y());
      assertEquals(255, realGrayImage0.X());
      assertNotNull(realGrayImage0);
      
      RealGrayImage realGrayImage1 = new RealGrayImage(realGrayImage0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      float[][] floatArray0 = new float[5][5];
      RealGrayImage realGrayImage0 = new RealGrayImage(floatArray0);
      assertEquals(5, floatArray0.length);
      assertEquals(0.0F, realGrayImage0.addSum(), 0.01F);
      assertEquals(0.0, realGrayImage0.sqrSum(), 0.01);
      assertEquals(0.0F, realGrayImage0.absSum(), 0.01F);
      assertEquals(0.0F, realGrayImage0.max(), 0.01F);
      assertEquals(5, realGrayImage0.Y());
      assertEquals(5, realGrayImage0.X());
      assertEquals(0.0F, realGrayImage0.min(), 0.01F);
      assertNotNull(realGrayImage0);
      
      RealGrayImage realGrayImage1 = realGrayImage0.copy();
      assertEquals(5, floatArray0.length);
      assertEquals(0.0F, realGrayImage0.addSum(), 0.01F);
      assertEquals(0.0, realGrayImage0.sqrSum(), 0.01);
      assertEquals(0.0F, realGrayImage0.absSum(), 0.01F);
      assertEquals(0.0F, realGrayImage0.max(), 0.01F);
      assertEquals(5, realGrayImage0.Y());
      assertEquals(5, realGrayImage0.X());
      assertEquals(0.0F, realGrayImage0.min(), 0.01F);
      assertEquals(0.0F, realGrayImage1.absSum(), 0.01F);
      assertEquals(0.0, realGrayImage1.sqrSum(), 0.01);
      assertEquals(0.0F, realGrayImage1.min(), 0.01F);
      assertEquals(0.0F, realGrayImage1.max(), 0.01F);
      assertEquals(0.0F, realGrayImage1.addSum(), 0.01F);
      assertEquals(5, realGrayImage1.X());
      assertEquals(5, realGrayImage1.Y());
      assertNotSame(realGrayImage0, realGrayImage1);
      assertNotSame(realGrayImage1, realGrayImage0);
      assertFalse(realGrayImage1.equals((Object)realGrayImage0));
      assertNotNull(realGrayImage1);
      
      realGrayImage0.clip(1, 731);
      assertEquals(5, floatArray0.length);
      assertEquals(1.0F, realGrayImage0.max(), 0.01F);
      assertEquals(5, realGrayImage0.Y());
      assertEquals(25.0F, realGrayImage0.addSum(), 0.01F);
      assertEquals(25.0F, realGrayImage0.absSum(), 0.01F);
      assertEquals(25.0, realGrayImage0.sqrSum(), 0.01);
      assertEquals(5, realGrayImage0.X());
      assertEquals(1.0F, realGrayImage0.min(), 0.01F);
      assertNotSame(realGrayImage0, realGrayImage1);
      assertFalse(realGrayImage0.equals((Object)realGrayImage1));
      
      ImageProducer imageProducer0 = realGrayImage0.getJavaImage();
      assertEquals(5, floatArray0.length);
      assertEquals(1.0F, realGrayImage0.max(), 0.01F);
      assertEquals(5, realGrayImage0.Y());
      assertEquals(25.0F, realGrayImage0.addSum(), 0.01F);
      assertEquals(25.0F, realGrayImage0.absSum(), 0.01F);
      assertEquals(25.0, realGrayImage0.sqrSum(), 0.01);
      assertEquals(5, realGrayImage0.X());
      assertEquals(1.0F, realGrayImage0.min(), 0.01F);
      assertNotSame(realGrayImage0, realGrayImage1);
      assertFalse(realGrayImage0.equals((Object)realGrayImage1));
      assertNotNull(imageProducer0);
      
      ROI rOI0 = new ROI();
      assertEquals(0, rOI0.ux());
      assertEquals(0, rOI0.uy());
      assertEquals(1, rOI0.X());
      assertEquals(1, rOI0.Y());
      assertEquals(0, rOI0.lx());
      assertEquals(0, rOI0.ly());
      assertNotNull(rOI0);
      
      RealGrayImage realGrayImage2 = realGrayImage0.copy();
      assertEquals(5, floatArray0.length);
      assertEquals(1.0F, realGrayImage0.max(), 0.01F);
      assertEquals(5, realGrayImage0.Y());
      assertEquals(25.0F, realGrayImage0.addSum(), 0.01F);
      assertEquals(25.0F, realGrayImage0.absSum(), 0.01F);
      assertEquals(25.0, realGrayImage0.sqrSum(), 0.01);
      assertEquals(5, realGrayImage0.X());
      assertEquals(1.0F, realGrayImage0.min(), 0.01F);
      assertEquals(1.0F, realGrayImage2.max(), 0.01F);
      assertEquals(5, realGrayImage2.X());
      assertEquals(25.0, realGrayImage2.sqrSum(), 0.01);
      assertEquals(5, realGrayImage2.Y());
      assertEquals(25.0F, realGrayImage2.absSum(), 0.01F);
      assertEquals(1.0F, realGrayImage2.min(), 0.01F);
      assertEquals(25.0F, realGrayImage2.addSum(), 0.01F);
      assertNotSame(realGrayImage0, realGrayImage2);
      assertNotSame(realGrayImage0, realGrayImage1);
      assertNotSame(realGrayImage2, realGrayImage1);
      assertNotSame(realGrayImage2, realGrayImage0);
      assertFalse(realGrayImage0.equals((Object)realGrayImage1));
      assertFalse(realGrayImage2.equals((Object)realGrayImage1));
      assertFalse(realGrayImage2.equals((Object)realGrayImage0));
      assertNotNull(realGrayImage2);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      int int0 = 15;
      RealGrayImage realGrayImage0 = new RealGrayImage(15, 255);
      assertEquals(255, realGrayImage0.Y());
      assertEquals(15, realGrayImage0.X());
      assertNotNull(realGrayImage0);
      
      int int1 = (-1923);
      int int2 = 0;
      ROI rOI0 = new ROI(2, 2, 0, 0);
      assertEquals(3, rOI0.X());
      assertEquals(3, rOI0.Y());
      assertEquals(2, rOI0.lx());
      assertEquals(2, rOI0.ly());
      assertEquals(0, rOI0.ux());
      assertEquals(0, rOI0.uy());
      assertNotNull(rOI0);
      
      rOI0.setROI(245, 15, 15, 231);
      assertEquals(231, rOI0.X());
      assertEquals(245, rOI0.lx());
      assertEquals(217, rOI0.Y());
      assertEquals(15, rOI0.ux());
      assertEquals(15, rOI0.uy());
      assertEquals(231, rOI0.ly());
      
      int int3 = rOI0.X();
      assertEquals(231, rOI0.X());
      assertEquals(245, rOI0.lx());
      assertEquals(217, rOI0.Y());
      assertEquals(15, rOI0.ux());
      assertEquals(15, rOI0.uy());
      assertEquals(231, rOI0.ly());
      assertFalse(int3 == int1);
      assertFalse(int3 == int0);
      assertFalse(int3 == int2);
      assertEquals(231, int3);
      
      int int4 = rOI0.Y();
      assertEquals(231, rOI0.X());
      assertEquals(245, rOI0.lx());
      assertEquals(217, rOI0.Y());
      assertEquals(15, rOI0.ux());
      assertEquals(15, rOI0.uy());
      assertEquals(231, rOI0.ly());
      assertFalse(int4 == int1);
      assertFalse(int4 == int3);
      assertFalse(int4 == int2);
      assertFalse(int4 == int0);
      assertEquals(217, int4);
      
      int int5 = rOI0.Y();
      assertEquals(231, rOI0.X());
      assertEquals(245, rOI0.lx());
      assertEquals(217, rOI0.Y());
      assertEquals(15, rOI0.ux());
      assertEquals(15, rOI0.uy());
      assertEquals(231, rOI0.ly());
      assertFalse(int5 == int0);
      assertFalse(int5 == int2);
      assertTrue(int5 == int4);
      assertFalse(int5 == int1);
      assertFalse(int5 == int3);
      assertEquals(217, int5);
      
      // Undeclared exception!
      try { 
        realGrayImage0.copy(rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      RealGrayImage realGrayImage0 = null;
      try {
        realGrayImage0 = new RealGrayImage((Image) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.AbstractImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(0, 255);
      assertEquals(0.0F, realGrayImage0.addSum(), 0.01F);
      assertEquals(0.0, realGrayImage0.sqrSum(), 0.01);
      assertEquals(255, realGrayImage0.Y());
      assertEquals(0, realGrayImage0.X());
      assertEquals(0.0F, realGrayImage0.absSum(), 0.01F);
      assertEquals(32767.0F, realGrayImage0.min(), 0.01F);
      assertEquals((-32768.0F), realGrayImage0.max(), 0.01F);
      assertNotNull(realGrayImage0);
      
      RealGrayImage realGrayImage1 = realGrayImage0.copy();
      assertEquals(0.0F, realGrayImage0.addSum(), 0.01F);
      assertEquals(0.0, realGrayImage0.sqrSum(), 0.01);
      assertEquals(255, realGrayImage0.Y());
      assertEquals(0, realGrayImage0.X());
      assertEquals(0.0F, realGrayImage0.absSum(), 0.01F);
      assertEquals(32767.0F, realGrayImage0.min(), 0.01F);
      assertEquals((-32768.0F), realGrayImage0.max(), 0.01F);
      assertEquals(0.0, realGrayImage1.sqrSum(), 0.01);
      assertEquals(32767.0F, realGrayImage1.min(), 0.01F);
      assertEquals(0.0F, realGrayImage1.absSum(), 0.01F);
      assertEquals(255, realGrayImage1.Y());
      assertEquals(0, realGrayImage1.X());
      assertEquals((-32768.0F), realGrayImage1.max(), 0.01F);
      assertEquals(0.0F, realGrayImage1.addSum(), 0.01F);
      assertNotSame(realGrayImage0, realGrayImage1);
      assertNotSame(realGrayImage1, realGrayImage0);
      assertFalse(realGrayImage1.equals((Object)realGrayImage0));
      assertNotNull(realGrayImage1);
      
      Float float0 = new Float((float) 0);
      assertNotNull(float0);
      assertEquals(0.0F, (float)float0, 0.01F);
      
      RealGrayImage realGrayImage2 = realGrayImage0.addbuffer(1494, 0, 0, 3459, (float) 1217);
      assertEquals(0.0F, realGrayImage0.addSum(), 0.01F);
      assertEquals(0.0, realGrayImage0.sqrSum(), 0.01);
      assertEquals(255, realGrayImage0.Y());
      assertEquals(0, realGrayImage0.X());
      assertEquals(0.0F, realGrayImage0.absSum(), 0.01F);
      assertEquals(32767.0F, realGrayImage0.min(), 0.01F);
      assertEquals((-32768.0F), realGrayImage0.max(), 0.01F);
      assertEquals(0.0F, realGrayImage2.absSum(), 0.01F);
      assertEquals(0, realGrayImage2.Y());
      assertEquals((-32768.0F), realGrayImage2.max(), 0.01F);
      assertEquals(32767.0F, realGrayImage2.min(), 0.01F);
      assertEquals(0.0, realGrayImage2.sqrSum(), 0.01);
      assertEquals(1494, realGrayImage2.X());
      assertEquals(0.0F, realGrayImage2.addSum(), 0.01F);
      assertNotSame(realGrayImage0, realGrayImage2);
      assertNotSame(realGrayImage0, realGrayImage1);
      assertNotSame(realGrayImage2, realGrayImage0);
      assertNotSame(realGrayImage2, realGrayImage1);
      assertFalse(realGrayImage0.equals((Object)realGrayImage1));
      assertFalse(realGrayImage2.equals((Object)realGrayImage0));
      assertFalse(realGrayImage2.equals((Object)realGrayImage1));
      assertNotNull(realGrayImage2);
      
      float float1 = realGrayImage2.absSum();
      assertEquals(0.0F, realGrayImage0.addSum(), 0.01F);
      assertEquals(0.0, realGrayImage0.sqrSum(), 0.01);
      assertEquals(255, realGrayImage0.Y());
      assertEquals(0, realGrayImage0.X());
      assertEquals(0.0F, realGrayImage0.absSum(), 0.01F);
      assertEquals(32767.0F, realGrayImage0.min(), 0.01F);
      assertEquals((-32768.0F), realGrayImage0.max(), 0.01F);
      assertEquals(0.0F, realGrayImage2.absSum(), 0.01F);
      assertEquals(0, realGrayImage2.Y());
      assertEquals((-32768.0F), realGrayImage2.max(), 0.01F);
      assertEquals(32767.0F, realGrayImage2.min(), 0.01F);
      assertEquals(0.0, realGrayImage2.sqrSum(), 0.01);
      assertEquals(1494, realGrayImage2.X());
      assertEquals(0.0F, realGrayImage2.addSum(), 0.01F);
      assertNotSame(realGrayImage0, realGrayImage2);
      assertNotSame(realGrayImage0, realGrayImage1);
      assertNotSame(realGrayImage2, realGrayImage0);
      assertNotSame(realGrayImage2, realGrayImage1);
      assertFalse(realGrayImage0.equals((Object)realGrayImage2));
      assertFalse(realGrayImage0.equals((Object)realGrayImage1));
      assertFalse(realGrayImage2.equals((Object)realGrayImage0));
      assertFalse(realGrayImage2.equals((Object)realGrayImage1));
      assertEquals(0.0F, float1, 0.01F);
      
      // Undeclared exception!
      try { 
        realGrayImage2.multiply(1217, 1494, (float) 1494);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1494
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      RealGrayImage realGrayImage0 = new RealGrayImage(0, 255);
      assertEquals(0, realGrayImage0.X());
      assertEquals(32767.0F, realGrayImage0.min(), 0.01F);
      assertEquals((-32768.0F), realGrayImage0.max(), 0.01F);
      assertEquals(0.0F, realGrayImage0.addSum(), 0.01F);
      assertEquals(0.0, realGrayImage0.sqrSum(), 0.01);
      assertEquals(0.0F, realGrayImage0.absSum(), 0.01F);
      assertEquals(255, realGrayImage0.Y());
      assertNotNull(realGrayImage0);
      
      RealGrayImage realGrayImage1 = realGrayImage0.addbuffer(255, 1, (-402.0F));
      assertEquals(0, realGrayImage0.X());
      assertEquals(32767.0F, realGrayImage0.min(), 0.01F);
      assertEquals((-32768.0F), realGrayImage0.max(), 0.01F);
      assertEquals(0.0F, realGrayImage0.addSum(), 0.01F);
      assertEquals(0.0, realGrayImage0.sqrSum(), 0.01);
      assertEquals(0.0F, realGrayImage0.absSum(), 0.01F);
      assertEquals(255, realGrayImage0.Y());
      assertEquals(102510.0F, realGrayImage1.absSum(), 0.01F);
      assertEquals(4.120902E7, realGrayImage1.sqrSum(), 0.01);
      assertEquals(255, realGrayImage1.X());
      assertEquals((-402.0F), realGrayImage1.min(), 0.01F);
      assertEquals(1, realGrayImage1.Y());
      assertEquals((-102510.0F), realGrayImage1.addSum(), 0.01F);
      assertEquals((-402.0F), realGrayImage1.max(), 0.01F);
      assertNotSame(realGrayImage0, realGrayImage1);
      assertNotSame(realGrayImage1, realGrayImage0);
      assertFalse(realGrayImage1.equals((Object)realGrayImage0));
      assertNotNull(realGrayImage1);
      
      realGrayImage0.median(1);
      assertEquals(0, realGrayImage0.X());
      assertEquals(32767.0F, realGrayImage0.min(), 0.01F);
      assertEquals((-32768.0F), realGrayImage0.max(), 0.01F);
      assertEquals(0.0F, realGrayImage0.addSum(), 0.01F);
      assertEquals(0.0, realGrayImage0.sqrSum(), 0.01);
      assertEquals(0.0F, realGrayImage0.absSum(), 0.01F);
      assertEquals(255, realGrayImage0.Y());
      assertNotSame(realGrayImage0, realGrayImage1);
      assertFalse(realGrayImage0.equals((Object)realGrayImage1));
      
      // Undeclared exception!
      realGrayImage1.addbuffer(417, 255, 255.0F);
  }
}
