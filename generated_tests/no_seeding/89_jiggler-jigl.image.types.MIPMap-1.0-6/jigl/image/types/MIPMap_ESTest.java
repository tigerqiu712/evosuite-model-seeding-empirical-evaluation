/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 04 12:45:56 GMT 2019
 */

package jigl.image.types;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jigl.image.ROI;
import jigl.image.types.MIPMap;
import jigl.image.types.RealColorImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MIPMap_ESTest extends MIPMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RealColorImage realColorImage0 = new RealColorImage(1742, 0);
      MIPMap mIPMap0 = new MIPMap(realColorImage0);
      ROI rOI0 = new ROI();
      rOI0.setROI(1742, 0, 495, (-2146240890));
      // Undeclared exception!
      mIPMap0.getImage((float) 1742, rOI0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RealColorImage realColorImage0 = new RealColorImage(0, 0);
      MIPMap mIPMap0 = new MIPMap(realColorImage0);
      ROI rOI0 = new ROI(0, 1401, 0, (-429496729));
      // Undeclared exception!
      mIPMap0.getImage((float) 0, rOI0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RealColorImage realColorImage0 = new RealColorImage(1742, 0);
      MIPMap mIPMap0 = new MIPMap(realColorImage0);
      // Undeclared exception!
      try { 
        mIPMap0.getImage((-18.5F), (ROI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.MIPMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RealColorImage realColorImage0 = new RealColorImage(1742, 0);
      MIPMap mIPMap0 = new MIPMap(realColorImage0);
      ROI rOI0 = new ROI(16, 1742, 1997, 128);
      // Undeclared exception!
      try { 
        mIPMap0.getImage((-1470.0F), rOI0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RealColorImage realColorImage0 = new RealColorImage(0, 0);
      MIPMap mIPMap0 = new MIPMap(realColorImage0);
      // Undeclared exception!
      mIPMap0.getImage((float) 0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RealColorImage realColorImage0 = new RealColorImage(1742, 0);
      MIPMap mIPMap0 = new MIPMap(realColorImage0);
      // Undeclared exception!
      try { 
        mIPMap0.getImage((-1.0F));
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
      RealColorImage realColorImage0 = new RealColorImage(16, 16);
      MIPMap mIPMap0 = new MIPMap(realColorImage0);
      // Undeclared exception!
      try { 
        mIPMap0.getImage((float) 16);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("jigl.image.types.MIPMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RealColorImage realColorImage0 = new RealColorImage(1742, 0);
      MIPMap mIPMap0 = new MIPMap(realColorImage0);
      ROI rOI0 = new ROI(16, (-1), 1742, 1742);
      // Undeclared exception!
      try { 
        mIPMap0.getImage(1.0F, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RealColorImage realColorImage0 = new RealColorImage(1742, 0);
      MIPMap mIPMap0 = new MIPMap(realColorImage0);
      ROI rOI0 = new ROI();
      // Undeclared exception!
      try { 
        mIPMap0.getImage((float) 1742, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 10
         //
         verifyException("jigl.image.types.MIPMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RealColorImage realColorImage0 = new RealColorImage(2, 2);
      MIPMap mIPMap0 = new MIPMap(realColorImage0);
      // Undeclared exception!
      try { 
        mIPMap0.get(2511.7F, 2, 1.0F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RealColorImage realColorImage0 = new RealColorImage(1742, 0);
      MIPMap mIPMap0 = new MIPMap(realColorImage0);
      // Undeclared exception!
      try { 
        mIPMap0.get((-1.0F), (-1.0F), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2147483648
         //
         verifyException("jigl.image.types.MIPMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RealColorImage realColorImage0 = new RealColorImage(1742, 0);
      MIPMap mIPMap0 = new MIPMap(realColorImage0);
      // Undeclared exception!
      try { 
        mIPMap0.get((-0.46875F), 1742, (-1668.5641F));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RealColorImage realColorImage0 = new RealColorImage(1742, 0);
      MIPMap mIPMap0 = new MIPMap(realColorImage0);
      // Undeclared exception!
      try { 
        mIPMap0.get(1727.0F, 32767.0F, 32767.0F);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 14
         //
         verifyException("jigl.image.types.MIPMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RealColorImage realColorImage0 = new RealColorImage(2171, 2171);
      MIPMap mIPMap0 = new MIPMap(realColorImage0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RealColorImage realColorImage0 = new RealColorImage();
      MIPMap mIPMap0 = null;
      try {
        mIPMap0 = new MIPMap(realColorImage0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RealColorImage realColorImage0 = new RealColorImage(16, 1);
      MIPMap mIPMap0 = new MIPMap(realColorImage0);
      // Undeclared exception!
      try { 
        mIPMap0.getImage((float) 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }
}