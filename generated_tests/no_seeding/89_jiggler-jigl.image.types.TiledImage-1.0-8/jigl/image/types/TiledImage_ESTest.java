/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 04 13:40:22 GMT 2019
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
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiledImage_ESTest extends TiledImage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("-H;[_", 255, 255, 255, 255);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      TiledImage tiledImage1 = new TiledImage("(<*dl M%,qGCK+", 235, 7, 955, 255);
      ROI rOI0 = new ROI();
      tiledImage1.getImage(rOI0);
      try { 
        tiledImage1.get(235, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("jigl.image.AbstractImage", 0, 0, 0, 248);
      tiledImage0.X();
      tiledImage0.Y();
      tiledImage0.flush();
      tiledImage0.Y();
      try { 
        tiledImage0.get((-1070), (-1070));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("-H;[_", 255, 255, 255, 255);
      int int0 = 148;
      int int1 = 0;
      int[] intArray0 = new int[2];
      tiledImage0.flush();
      intArray0[0] = 148;
      tiledImage0.close();
      ROI rOI0 = new ROI(255, 148, 76, 884);
      try { 
        tiledImage0.getImage(rOI0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("-H;[_", 255, 255, 255, 255);
      int int0 = (-1680);
      TiledImage tiledImage1 = new TiledImage("-H;[_", 255, (-1680));
      ROI rOI0 = new ROI(9, (-1), 13, 13);
      // Undeclared exception!
      try { 
        tiledImage1.getImage(rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("As=YCR", 1198, 1198, 1198, 1198);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = 244;
      String string0 = "bLoxEh2`WT]ST";
      int int1 = (-1164);
      TiledImage tiledImage0 = new TiledImage("bLoxEh2`WT]ST", 255, 3, (-1164), 32);
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
  public void test06()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("-H;[_", 244, 244, 244, 244);
      ROI rOI0 = new ROI();
      tiledImage0.getImage(rOI0);
      tiledImage0.Y();
      tiledImage0.flush();
      TiledImage tiledImage1 = new TiledImage("-H;[_", 1798, 244);
      int int0 = (-445);
      int int1 = 8;
      tiledImage0.getImage(rOI0);
      try { 
        tiledImage0.get(1798, 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = (-1701);
      TiledImage tiledImage0 = new TiledImage("*25}RB4S", 955, 955, (-903), (-1701));
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      // Undeclared exception!
      try { 
        tiledImage0.get(0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("-H;[_", 255, 255, 255, 255);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "-H;[_");
      TiledImage tiledImage1 = new TiledImage("8]|", 255, 255, 197, 32);
      tiledImage1.flush();
      tiledImage0.close();
      int[] intArray0 = new int[8];
      intArray0[0] = 0;
      intArray0[1] = (-4314);
      intArray0[2] = 197;
      intArray0[3] = 0;
      intArray0[4] = 32;
      intArray0[5] = 32;
      intArray0[6] = 197;
      intArray0[7] = (-16777216);
      try { 
        tiledImage0.set(32, 32, intArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("-H;[_", 255, 255, 255, 255);
      TiledImage tiledImage1 = new TiledImage("-H;[_", 255, 109);
      TiledImage.Tile tiledImage_Tile0 = tiledImage1.new Tile();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = 0;
      TiledImage tiledImage0 = new TiledImage("oa", 10, 0, 711, 10);
      tiledImage0.X();
      try { 
        tiledImage0.get(711, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "-H;[_";
      int int0 = 244;
      TiledImage tiledImage0 = new TiledImage("-H;[_", 244, 244, 244, 244);
      ROI rOI0 = new ROI();
      rOI0.setROI(13, (-4974), 3166, 244);
      // Undeclared exception!
      tiledImage0.getImage(rOI0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("-H;[_", 255, 255, 255, 255);
      TiledImage tiledImage1 = new TiledImage("-H;[_", 255, 109);
      TiledImage tiledImage2 = new TiledImage("-H;[_", 2342, 109);
      TiledImage.Tile tiledImage_Tile0 = tiledImage2.new Tile();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("-H;[_", 255, 255, 255, 255);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      TiledImage tiledImage1 = new TiledImage("-H;[_", 235, 7, 255, 255);
      ROI rOI0 = new ROI();
      tiledImage1.getImage(rOI0);
      try { 
        tiledImage1.get(235, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TiledImage tiledImage0 = null;
      try {
        tiledImage0 = new TiledImage((String) null, (-1396), (-1396));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = 270;
      int int1 = (-491);
      TiledImage tiledImage0 = new TiledImage("aOo7($j\"/n@$ls5)$<", 270, 270, (-491), 270);
      ROI rOI0 = new ROI();
      int int2 = 0;
      int int3 = (-3734);
      rOI0.setROI(0, 0, (-3734), 1775);
      rOI0.setROI(0, (-491), 2485, (-229));
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
  public void test16()  throws Throwable  {
      int int0 = 255;
      TiledImage tiledImage0 = new TiledImage("-H;[_", 255, 255, 255, 255);
      int[] intArray0 = new int[2];
      intArray0[0] = 148;
      tiledImage0.close();
      try { 
        tiledImage0.set(148, 0, intArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("-H;[_", 255, 255, 255, 255);
      ROI rOI0 = new ROI();
      tiledImage0.getImage(rOI0);
      tiledImage0.Y();
      tiledImage0.flush();
      int int0 = 5;
      TiledImage tiledImage1 = null;
      try {
        tiledImage1 = new TiledImage("seconds, with ", 255, 5);
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.RandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/pderakhshanfar/evosuite-model-seeding-ee/evosuite-model-seeding-empirical-evaluation");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      TiledImage tiledImage0 = new TiledImage("As=ECR", 824, 824, 1, 824);
      ROI rOI0 = new ROI();
      tiledImage0.getImage(rOI0);
      try { 
        tiledImage0.get(824, 3);
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
      int int0 = 255;
      TiledImage tiledImage0 = new TiledImage("-H;[_", 255, 255, 255, 255);
      int int1 = 0;
      int[] intArray0 = new int[2];
      intArray0[1] = 255;
      tiledImage0.close();
      try { 
        tiledImage0.set(255, 0, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("As=ECR", 824, 824, 1, 824);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("7[:lb7]~g", 2342, 2342, 2342, 2342);
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = "-H;[_";
      int int0 = 52;
      int int1 = 2342;
      TiledImage tiledImage0 = new TiledImage("s3conds, with ", 2342, 52, 52, 2342);
      TiledImage tiledImage1 = new TiledImage("-H;[_", 2342, 2342, 2342, 2342);
      tiledImage1.flush();
      // Undeclared exception!
      try { 
        tiledImage1.getImage((ROI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("-H;[_", 255, 255, 255, 255);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      TiledImage tiledImage1 = new TiledImage("-H;[_", 235, 255, Integer.MAX_VALUE, Integer.MAX_VALUE);
      ROI rOI0 = new ROI();
      // Undeclared exception!
      try { 
        tiledImage1.getImage(rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("7[:lb7]~g", 0, (-2632), (-2632), 0);
      int[] intArray0 = new int[3];
      intArray0[0] = (-1514);
      intArray0[1] = (-1514);
      intArray0[2] = 0;
      try { 
        tiledImage0.set((-1514), 255, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = "-H;[_";
      TiledImage tiledImage0 = new TiledImage("-H;[_", 255, 255, 255, 255);
      int int0 = 0;
      ROI rOI0 = new ROI(255, 16, 96, 0);
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
  public void test26()  throws Throwable  {
      TiledImage tiledImage0 = null;
      try {
        tiledImage0 = new TiledImage("As=YCR", (-4489), (-4489));
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.RandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("-H;[_", 255, 255, 255, 255);
      ROI rOI0 = new ROI();
      tiledImage0.getImage(rOI0);
      tiledImage0.Y();
      tiledImage0.flush();
      TiledImage tiledImage1 = new TiledImage("-H;[_", 256, 256);
      int[] intArray0 = new int[8];
      intArray0[0] = 256;
      intArray0[1] = 256;
      intArray0[2] = 255;
      intArray0[3] = 1694;
      intArray0[4] = (-1219);
      intArray0[5] = 255;
      intArray0[6] = 255;
      intArray0[7] = 1694;
      try { 
        tiledImage1.set(99, 1694, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage(".8*;ATMY48p(]O>\"", (-2563), (-2563), (-2563), (-415));
      tiledImage0.X();
      tiledImage0.flush();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TiledImage tiledImage0 = null;
      try {
        tiledImage0 = new TiledImage((String) null, 0, (-1431), 10, (-2574));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = "-H;[_";
      TiledImage tiledImage0 = new TiledImage("-H;[_", 233, 233, 10, 233);
      try { 
        tiledImage0.get(10, 801);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TiledImage tiledImage0 = null;
      try {
        tiledImage0 = new TiledImage("", 2388, 1198);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("*25}RB4S", 955, 955, (-903), (-1701));
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "*25}RB4S");
      tiledImage0.close();
      int[] intArray0 = new int[4];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 0;
      // Undeclared exception!
      try { 
        tiledImage0.set(231, 231, intArray0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("*25}RB4S", 955, 955, (-903), (-1701));
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "*25}RB4S");
      // Undeclared exception!
      try { 
        tiledImage0.get(0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int int0 = 10;
      TiledImage tiledImage0 = new TiledImage("-H;[_", 233, 233, 10, 233);
      int int1 = 775;
      try { 
        tiledImage0.get(10, 775);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/pderakhshanfar/evosuite-model-seeding-ee/evosuite-model-seeding-empirical-evaluation");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      TiledImage tiledImage0 = new TiledImage("As=ECR", 824, 824, 1, 824);
      try { 
        tiledImage0.get(824, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("-H;[_", 255, 255, 255, 255);
      tiledImage0.close();
      int[] intArray0 = new int[6];
      intArray0[0] = 109;
      intArray0[1] = 2342;
      intArray0[2] = 255;
      intArray0[3] = 109;
      intArray0[4] = 109;
      intArray0[5] = 2342;
      try { 
        tiledImage0.set(0, (-2917), intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = "-H;[_";
      int int0 = 244;
      TiledImage tiledImage0 = new TiledImage("-H;[_", 244, 244, 244, 244);
      ROI rOI0 = new ROI(244, 244, 244, 244);
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
  public void test38()  throws Throwable  {
      int int0 = (-1154);
      int int1 = 128;
      TiledImage tiledImage0 = new TiledImage("]Q/,\"-0eH!\b1sc<", (-1154), (-1154), 0, 128);
      int int2 = (-3683);
      try { 
        tiledImage0.get((-1154), (-3683));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("yH;[q", 255, 255, 255, 255);
      TiledImage tiledImage1 = new TiledImage("yH;[q", 255, 255, 255, 109);
      TiledImage.Tile tiledImage_Tile0 = tiledImage1.new Tile();
      // Undeclared exception!
      try { 
        tiledImage_Tile0.write(255);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage$Tile", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("2[giM\"A/+3&{9", (-53), (-53), (-53), 1120);
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
      ROI rOI0 = new ROI();
      int[] intArray0 = new int[1];
      intArray0[0] = 1120;
      try { 
        tiledImage0.set(3107, 0, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }
}