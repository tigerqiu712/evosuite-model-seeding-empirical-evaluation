/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 17:12:37 GMT 2019
 */

package weka.filters.unsupervised.attribute;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import weka.core.BinarySparseInstance;
import weka.core.Instances;
import weka.filters.unsupervised.attribute.Remove;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Remove_ESTest extends Remove_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Remove remove0 = new Remove();
      int[] intArray0 = new int[1];
      remove0.setAttributeIndicesArray(intArray0);
      String string0 = remove0.getAttributeIndices();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Remove remove0 = new Remove();
      String[] stringArray0 = new String[9];
      try { 
        remove0.setOptions(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Remove remove0 = new Remove();
      // Undeclared exception!
      try { 
        remove0.setAttributeIndicesArray((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Remove remove0 = new Remove();
      // Undeclared exception!
      try { 
        remove0.setAttributeIndices((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Remove remove0 = new Remove();
      remove0.setInvertSelection(false);
      assertEquals("Determines whether action is to select or delete. If set to true, only the specified attributes will be kept; If set to false, specified attributes will be deleted.", remove0.invertSelectionTipText());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Remove remove0 = new Remove();
      boolean boolean0 = remove0.getInvertSelection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Remove remove0 = new Remove();
      String[] stringArray0 = new String[0];
      remove0.setOptions(stringArray0);
      assertTrue(remove0.isNewBatch());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Remove remove0 = new Remove();
      Enumeration enumeration0 = remove0.listOptions();
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Remove remove0 = new Remove();
      // Undeclared exception!
      try { 
        remove0.getCapabilities();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // weka/core/WekaPackageManager
         //
         verifyException("weka.core.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Remove remove0 = new Remove();
      remove0.setAttributeIndices("$e?A4I,i7ZI[o=");
      assertFalse(remove0.isOutputFormatDefined());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Remove remove0 = new Remove();
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(1);
      // Undeclared exception!
      try { 
        remove0.input(binarySparseInstance0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No input instance format defined
         //
         verifyException("weka.filters.unsupervised.attribute.Remove", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Remove remove0 = new Remove();
      remove0.setInvertSelection(true);
      String[] stringArray0 = remove0.getOptions();
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-1684,2";
      Remove.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Remove remove0 = new Remove();
      int[] intArray0 = new int[2];
      remove0.setAttributeIndicesArray(intArray0);
      String[] stringArray0 = remove0.getOptions();
      remove0.setOptions(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Remove remove0 = new Remove();
      String string0 = remove0.globalInfo();
      assertEquals("A filter that removes a range of attributes from the dataset. Will re-order the remaining attributes if invert matching sense is turned on and the attribute column indices are not specified in ascending order.", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Remove remove0 = new Remove();
      String string0 = remove0.getRevision();
      assertEquals("8034", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Remove remove0 = new Remove();
      String string0 = remove0.invertSelectionTipText();
      assertEquals("Determines whether action is to select or delete. If set to true, only the specified attributes will be kept; If set to false, specified attributes will be deleted.", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Remove remove0 = new Remove();
      // Undeclared exception!
      try { 
        remove0.setInputFormat((Instances) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // weka/core/WekaPackageManager
         //
         verifyException("weka.core.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Remove remove0 = new Remove();
      String string0 = remove0.attributeIndicesTipText();
      assertEquals("Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Remove remove0 = new Remove();
      String string0 = remove0.getAttributeIndices();
      assertEquals("", string0);
  }
}
