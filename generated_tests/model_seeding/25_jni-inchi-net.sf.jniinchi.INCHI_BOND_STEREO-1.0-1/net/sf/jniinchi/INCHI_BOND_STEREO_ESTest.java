/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 09:43:11 GMT 2019
 */

package net.sf.jniinchi;

import org.junit.Test;
import static org.junit.Assert.*;
import net.sf.jniinchi.INCHI_BOND_STEREO;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class INCHI_BOND_STEREO_ESTest extends INCHI_BOND_STEREO_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      INCHI_BOND_STEREO[] iNCHI_BOND_STEREOArray0 = INCHI_BOND_STEREO.values();
      assertEquals(8, iNCHI_BOND_STEREOArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.SINGLE_1EITHER;
      int int0 = iNCHI_BOND_STEREO0.getIndx();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      INCHI_BOND_STEREO.getValue(2891);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.getValue(6);
      assertEquals(INCHI_BOND_STEREO.SINGLE_1DOWN, iNCHI_BOND_STEREO0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      INCHI_BOND_STEREO.getValue(5);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.getValue(4);
      assertEquals(INCHI_BOND_STEREO.SINGLE_1EITHER, iNCHI_BOND_STEREO0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.getValue(3);
      assertEquals(INCHI_BOND_STEREO.DOUBLE_EITHER, iNCHI_BOND_STEREO0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      INCHI_BOND_STEREO.getValue(2);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.getValue(1);
      assertEquals(INCHI_BOND_STEREO.SINGLE_1UP, iNCHI_BOND_STEREO0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.getValue((-1));
      assertEquals(INCHI_BOND_STEREO.SINGLE_2UP, iNCHI_BOND_STEREO0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      INCHI_BOND_STEREO.getValue((-2));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      INCHI_BOND_STEREO.getValue((-3));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.getValue((-4));
      assertEquals(INCHI_BOND_STEREO.SINGLE_2EITHER, iNCHI_BOND_STEREO0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      INCHI_BOND_STEREO.getValue((-5));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.getValue((-6));
      int int0 = iNCHI_BOND_STEREO0.getIndx();
      assertEquals((-6), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.getValue(0);
      int int0 = iNCHI_BOND_STEREO0.getIndx();
      assertEquals(0, int0);
  }
}