/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 05 00:05:20 GMT 2019
 */

package jigl.image.types;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.EOFException;
import java.io.IOException;
import jigl.image.ROI;
import jigl.image.types.TiledImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiledImage_ESTest extends TiledImage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("7J", 378, 378, 378, 303);
      ROI rOI0 = new ROI();
      tiledImage0.getImage(rOI0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      tiledImage0.close();
      try { 
        tiledImage0.get(1, 303);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TiledImage tiledImage0 = null;
      try {
        tiledImage0 = new TiledImage("P", (-1), (-1));
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.RandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = 4;
      int int1 = 35;
      TiledImage tiledImage0 = new TiledImage("MF.vA9aMhlUc", 35, 4, 303, 4);
      int int2 = 3;
      int[] intArray0 = new int[3];
      int int3 = 16;
      ROI rOI0 = new ROI(16, (-929), 35, (-1067));
      // Undeclared exception!
      try { 
        tiledImage0.getImage(rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = 3875;
      TiledImage tiledImage0 = null;
      try {
        tiledImage0 = new TiledImage("xe-om dbF", 32767, 32767, 32767, 3875);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Negative position: -1073938410
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "]((CP{<0}(E8sFtWa@";
      int int0 = 0;
      TiledImage tiledImage0 = new TiledImage("]((CP{<0}(E8sFtWa@", 968, 968, 968, 0);
      tiledImage0.close();
      TiledImage tiledImage1 = new TiledImage("]((CP{<0}(E8sFtWa@", 968, 0);
      try { 
        tiledImage1.get(0, 968);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = 0;
      TiledImage tiledImage0 = new TiledImage("*@ ?J", 0, 0, 0, 256);
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
      tiledImage0.close();
      // Undeclared exception!
      try { 
        tiledImage_Tile0.write(256);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage$Tile", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "]((CP{<0}(E8sFtWa@";
      int int0 = 968;
      int int1 = 0;
      TiledImage tiledImage0 = new TiledImage("]((CP{<0}(E8sFtWa@", 968, 968, 968, 0);
      ROI rOI0 = new ROI();
      // Undeclared exception!
      try { 
        tiledImage0.getImage(rOI0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("%UY'ZJu4Z-b3p;", (-1), (-1), (-1), (-1));
      int[] intArray0 = new int[1];
      intArray0[0] = (-1);
      try { 
        tiledImage0.set((-1), (-1), intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("J}qR8R{", (-1085), (-1085), (-1085), (-248));
      ROI rOI0 = new ROI((-1085), (-1085), 2, (-248));
      // Undeclared exception!
      try { 
        tiledImage0.getImage(rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TiledImage tiledImage0 = null;
      try {
        tiledImage0 = new TiledImage("", 32767, 581);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("]((CP{<0}(E8sFtWa@", 968, 968, 968, 0);
      tiledImage0.close();
      TiledImage tiledImage1 = new TiledImage("]((CP{<0}(E8sFtWa@", 968, 0);
      // Undeclared exception!
      try { 
        tiledImage1.get(0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TiledImage tiledImage0 = null;
      try {
        tiledImage0 = new TiledImage((String) null, (-2188), 581);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("k%hc)P", 0, 0, 0, Integer.MAX_VALUE);
      tiledImage0.close();
      TiledImage tiledImage1 = new TiledImage("7J", 2, 13, (-1174), 7);
      try { 
        tiledImage0.get((-1798), 2395);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("mg;~Ids8L&r:h", (-1308), (-1308), (-2086), (-2086));
      tiledImage0.flush();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("7J", 968, 968, 968, 0);
      tiledImage0.close();
      TiledImage tiledImage1 = new TiledImage("7J", 570, 968, 6, 570);
      tiledImage1.get(128, 570);
      TiledImage.Tile tiledImage_Tile0 = tiledImage1.new Tile();
      int[] intArray0 = new int[6];
      intArray0[0] = 385;
      intArray0[1] = 1;
      intArray0[2] = 6;
      intArray0[3] = (-1);
      intArray0[4] = (-1557);
      intArray0[5] = (-1);
      tiledImage1.set(385, 6, intArray0);
      try { 
        tiledImage1.get((-1127), (-1054));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("7J", 968, 968, 968, 0);
      tiledImage0.close();
      TiledImage tiledImage1 = new TiledImage("7J", 570, 968, 6, 570);
      tiledImage1.get(128, 570);
      TiledImage.Tile tiledImage_Tile0 = tiledImage1.new Tile();
      // Undeclared exception!
      try { 
        tiledImage_Tile0.write((-1189));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage$Tile", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("7J", 0, 0, 0, 0);
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("7J", 968, 968, 968, 0);
      tiledImage0.close();
      TiledImage tiledImage1 = new TiledImage("7J", 570, 968, 6, 570);
      tiledImage1.get(128, 570);
      TiledImage.Tile tiledImage_Tile0 = tiledImage1.new Tile();
      tiledImage1.flush();
      System.setCurrentTimeMillis(0L);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = 303;
      int int1 = 378;
      TiledImage tiledImage0 = new TiledImage("7J", 378, 378, 378, 303);
      ROI rOI0 = new ROI();
      tiledImage0.getImage(rOI0);
      EvoSuiteFile evoSuiteFile0 = null;
      FileSystemHandling.createFolder(evoSuiteFile0);
      try { 
        tiledImage0.get(int1, int0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = 3875;
      TiledImage tiledImage0 = null;
      try {
        tiledImage0 = new TiledImage((String) null, (-2147), (-522), (-2132), 1810);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("jigl.image.AbstractArrayImage", 4, 4, 196, (-661));
      int[] intArray0 = new int[5];
      intArray0[0] = 196;
      intArray0[1] = 0;
      intArray0[2] = 4;
      intArray0[3] = (-661);
      intArray0[4] = 0;
      try { 
        tiledImage0.set(0, 4, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("jigl.image.AbstractArrayImage", 4, 4, (-2), (-661));
      int[] intArray0 = new int[5];
      intArray0[0] = 0;
      intArray0[1] = (-2);
      intArray0[3] = (-661);
      intArray0[4] = 0;
      try { 
        tiledImage0.set(0, 4, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("jigl.image.AbstractArrayImage", (-1), (-2086), 6, 10);
      ROI rOI0 = new ROI((-4385), 10, 6, (-2164));
      rOI0.setROI((-2164), 32767, (-581), 10);
      // Undeclared exception!
      tiledImage0.getImage(rOI0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("7J", 968, 968, 968, 0);
      tiledImage0.close();
      TiledImage tiledImage1 = new TiledImage("7J", 570, 968, 6, 570);
      int[] intArray0 = new int[5];
      intArray0[0] = 839;
      intArray0[1] = 968;
      intArray0[2] = 968;
      intArray0[3] = 0;
      intArray0[4] = 570;
      // Undeclared exception!
      try { 
        tiledImage0.set(570, 6, intArray0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("7J", 968, 968, 968, 0);
      tiledImage0.close();
      TiledImage tiledImage1 = new TiledImage("7J", 554, 968, 6, 554);
      tiledImage1.get(128, 554);
      TiledImage.Tile tiledImage_Tile0 = tiledImage1.new Tile();
      int[] intArray0 = new int[6];
      intArray0[0] = 385;
      intArray0[1] = 1;
      intArray0[2] = 6;
      intArray0[3] = (-1);
      intArray0[4] = (-1557);
      intArray0[5] = (-1);
      tiledImage1.set(385, 6, intArray0);
      try { 
        tiledImage1.get((-1127), (-1054));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }
}