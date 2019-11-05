/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 18:03:44 GMT 2019
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import umd.cs.shop.JSEvaluate;
import umd.cs.shop.JSTerm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSEvaluate_ESTest extends JSEvaluate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSTerm jSTerm0 = JSEvaluate.mult(2210.89F, 2210.89F);
      JSTerm jSTerm1 = JSEvaluate.floor(2);
      JSTerm jSTerm2 = JSEvaluate.applyOperator("/", jSTerm0, jSTerm1);
      assertEquals("[2444017.0]", jSTerm2.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSTerm jSTerm0 = JSEvaluate.mult(2210.89F, 2210.89F);
      JSTerm jSTerm1 = JSEvaluate.applyOperator("*", jSTerm0, jSTerm0);
      JSTerm jSTerm2 = JSEvaluate.applyOperator("*", jSTerm1, jSTerm0);
      assertEquals("[1.1678919E20]", jSTerm2.toString());
      assertEquals("[2.38928758E13]", jSTerm1.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSTerm jSTerm0 = JSEvaluate.floor((-2791.771F));
      JSTerm jSTerm1 = JSEvaluate.applyOperator("-", jSTerm0, jSTerm0);
      JSTerm jSTerm2 = JSEvaluate.applyOperator("-", jSTerm0, jSTerm1);
      assertEquals("[-2791.0]", jSTerm2.toString());
      assertEquals("[0.0]", jSTerm1.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTerm jSTerm0 = JSEvaluate.mult(2210.89F, 2210.89F);
      JSTerm jSTerm1 = JSEvaluate.minOf(63.044853F, 1.0F);
      JSTerm jSTerm2 = JSEvaluate.applyOperator("+", jSTerm1, jSTerm0);
      assertEquals("[4888035.0]", jSTerm2.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSTerm jSTerm0 = JSEvaluate.maxOf(2, 1.4E-45F);
      JSTerm jSTerm1 = JSEvaluate.floor(1005.577F);
      JSEvaluate.applyOperator("member", jSTerm0, jSTerm1);
      assertEquals("[1005.0]", jSTerm1.toString());
      assertEquals("[2.0]", jSTerm0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSTerm jSTerm0 = JSEvaluate.maxOf(1.0F, 1086.331F);
      assertEquals("[1086.331]", jSTerm0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSTerm jSTerm0 = JSEvaluate.notequal(1443.2336F, 1.4E-45F);
      assertEquals("[t]", jSTerm0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSTerm jSTerm0 = JSEvaluate.equal(3633.1953F, (-1.0F));
      assertEquals("[]", jSTerm0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSTerm jSTerm0 = JSEvaluate.mult(2210.89F, 2210.89F);
      JSTerm jSTerm1 = JSEvaluate.applyOperator("*", jSTerm0, jSTerm0);
      JSTerm jSTerm2 = JSEvaluate.applyOperator("<", jSTerm0, jSTerm1);
      assertEquals("[2.38928758E13]", jSTerm1.toString());
      assertEquals("[t]", jSTerm2.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSTerm jSTerm0 = JSEvaluate.greater((-572.1F), 0.0F);
      assertEquals(0, jSTerm0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSTerm jSTerm0 = JSEvaluate.addsub((-2736.8F), (-2952.0F), (-2014240511));
      float float0 = JSEvaluate.numericValue(jSTerm0);
      assertEquals(5.9460378E12F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        JSEvaluate.numericValue((JSTerm) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSEvaluate", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSTerm jSTerm0 = JSEvaluate.addsub(0.0F, 1015.4813F, (-501));
      JSTerm jSTerm1 = JSEvaluate.applyOperatorUnary("Expecting elements of the list", jSTerm0);
      jSTerm1.addElement(jSTerm0);
      // Undeclared exception!
      try { 
        JSEvaluate.numericValue(jSTerm1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSTerm cannot be cast to java.lang.String
         //
         verifyException("umd.cs.shop.JSEvaluate", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSTerm jSTerm0 = JSEvaluate.greater((-1.1962427F), (-1.1962427F));
      // Undeclared exception!
      try { 
        JSEvaluate.numericValue(jSTerm0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        JSEvaluate.not((JSTerm) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSEvaluate", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        JSEvaluate.minElement((JSTerm) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSEvaluate", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      jSTerm0.add(object0);
      // Undeclared exception!
      try { 
        JSEvaluate.minElement(jSTerm0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.String
         //
         verifyException("umd.cs.shop.JSEvaluate", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        JSEvaluate.member((JSTerm) null, (JSTerm) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSEvaluate", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSTerm0);
      // Undeclared exception!
      try { 
        JSEvaluate.member(jSTerm0, jSTerm0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSTerm cannot be cast to java.lang.String
         //
         verifyException("umd.cs.shop.JSEvaluate", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        JSEvaluate.maxElement((JSTerm) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSEvaluate", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      jSTerm0.add(object0);
      // Undeclared exception!
      try { 
        JSEvaluate.maxElement(jSTerm0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.String
         //
         verifyException("umd.cs.shop.JSEvaluate", e);
      }
  }
}