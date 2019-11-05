/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 16:01:03 GMT 2019
 */

package weka.filters.unsupervised.attribute;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import weka.core.Attribute;
import weka.core.BinarySparseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.filters.unsupervised.attribute.ClassAssigner;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassAssigner_ESTest extends ClassAssigner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      classAssigner0.m_ClassIndex = (-2021615768);
      String string0 = classAssigner0.getClassIndex();
      assertEquals("-2021615767", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      classAssigner0.setClassIndex("not a valid attribute weight: '");
      assertEquals("Turns on output of debugging information.", classAssigner0.debugTipText());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      Instance instance0 = classAssigner0.process((Instance) null);
      assertNull(instance0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("4}C*rq|f");
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("~", arrayList0, 0);
      Instances instances1 = classAssigner0.determineOutputFormat(instances0);
      assertEquals(0, instances1.classIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      String[] stringArray0 = new String[3];
      try { 
        classAssigner0.setOptions(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      // Undeclared exception!
      try { 
        classAssigner0.setClassIndex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      try { 
        classAssigner0.determineOutputFormat((Instances) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Instances", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      String string0 = classAssigner0.getClassIndex();
      assertEquals("last", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      classAssigner0.setClassIndex("last");
      assertEquals(0, ClassAssigner.FIRST);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      classAssigner0.setOptions((String[]) null);
      assertEquals((-1), ClassAssigner.UNSET);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      String[] stringArray0 = classAssigner0.getOptions();
      classAssigner0.setOptions(stringArray0);
      assertFalse(classAssigner0.isOutputFormatDefined());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      Enumeration enumeration0 = classAssigner0.listOptions();
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      classAssigner0.setClassIndex("0");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("0", arrayList0, 1652);
      Instances instances1 = classAssigner0.determineOutputFormat(instances0);
      assertNotSame(instances1, instances0);
      assertEquals((-1), instances1.classIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("\";\n", arrayList0, 0);
      Instances instances1 = classAssigner0.determineOutputFormat(instances0);
      assertNotSame(instances1, instances0);
      assertEquals((-1), instances1.classIndex());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      classAssigner0.setClassIndex("5");
      String string0 = classAssigner0.getClassIndex();
      assertEquals("5", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      classAssigner0.setClassIndex("0");
      String string0 = classAssigner0.getClassIndex();
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      classAssigner0.setClassIndex("first");
      String string0 = classAssigner0.getClassIndex();
      assertEquals("first", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      classAssigner0.setDebug(true);
      String[] stringArray0 = classAssigner0.getOptions();
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      String[] stringArray0 = classAssigner0.getOptions();
      ClassAssigner.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      String string0 = classAssigner0.classIndexTipText();
      assertEquals("The index of the class attribute, starts with 1, 'first' and 'last' are accepted as well, '0' unsets the class index.", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      String string0 = classAssigner0.getRevision();
      assertEquals("8034", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      int[] intArray0 = new int[5];
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(0.0, intArray0, 237);
      Instance instance0 = classAssigner0.process(binarySparseInstance0);
      assertSame(binarySparseInstance0, instance0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      // Undeclared exception!
      try { 
        classAssigner0.getCapabilities();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // weka/core/WekaPackageManager
         //
         verifyException("weka.core.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      String string0 = classAssigner0.globalInfo();
      assertEquals("Filter that can set and unset the class index.", string0);
  }
}