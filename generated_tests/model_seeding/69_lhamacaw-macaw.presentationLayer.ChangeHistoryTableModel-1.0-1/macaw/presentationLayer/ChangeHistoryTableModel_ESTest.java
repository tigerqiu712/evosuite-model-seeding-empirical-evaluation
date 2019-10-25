/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 11:15:45 GMT 2019
 */

package macaw.presentationLayer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import macaw.presentationLayer.ChangeHistoryTableModel;
import macaw.system.MacawChangeEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ChangeHistoryTableModel_ESTest extends ChangeHistoryTableModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ChangeHistoryTableModel changeHistoryTableModel0 = new ChangeHistoryTableModel();
      ArrayList<MacawChangeEvent> arrayList0 = new ArrayList<MacawChangeEvent>();
      MacawChangeEvent macawChangeEvent0 = new MacawChangeEvent();
      arrayList0.add(macawChangeEvent0);
      changeHistoryTableModel0.setChangeEvents(arrayList0);
      Object object0 = changeHistoryTableModel0.getValueAt(0, 146);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ChangeHistoryTableModel changeHistoryTableModel0 = new ChangeHistoryTableModel();
      String string0 = changeHistoryTableModel0.getColumnName((-1));
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ChangeHistoryTableModel changeHistoryTableModel0 = new ChangeHistoryTableModel();
      ArrayList<MacawChangeEvent> arrayList0 = new ArrayList<MacawChangeEvent>();
      arrayList0.add((MacawChangeEvent) null);
      changeHistoryTableModel0.setChangeEvents(arrayList0);
      int int0 = changeHistoryTableModel0.getRowCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ChangeHistoryTableModel changeHistoryTableModel0 = new ChangeHistoryTableModel();
      changeHistoryTableModel0.setChangeEvents((ArrayList<MacawChangeEvent>) null);
      // Undeclared exception!
      try { 
        changeHistoryTableModel0.getValueAt(654, 654);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.presentationLayer.ChangeHistoryTableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ChangeHistoryTableModel changeHistoryTableModel0 = new ChangeHistoryTableModel();
      // Undeclared exception!
      try { 
        changeHistoryTableModel0.getValueAt(3765, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3765, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ChangeHistoryTableModel changeHistoryTableModel0 = new ChangeHistoryTableModel();
      // Undeclared exception!
      try { 
        changeHistoryTableModel0.getValueAt((-2295), (-2295));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ChangeHistoryTableModel changeHistoryTableModel0 = new ChangeHistoryTableModel();
      changeHistoryTableModel0.setChangeEvents((ArrayList<MacawChangeEvent>) null);
      // Undeclared exception!
      try { 
        changeHistoryTableModel0.getRowCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.presentationLayer.ChangeHistoryTableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ChangeHistoryTableModel changeHistoryTableModel0 = new ChangeHistoryTableModel();
      ArrayList<MacawChangeEvent> arrayList0 = new ArrayList<MacawChangeEvent>();
      MacawChangeEvent macawChangeEvent0 = new MacawChangeEvent();
      arrayList0.add(macawChangeEvent0);
      changeHistoryTableModel0.setChangeEvents(arrayList0);
      Object object0 = changeHistoryTableModel0.getValueAt(0, (-14));
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ChangeHistoryTableModel changeHistoryTableModel0 = new ChangeHistoryTableModel();
      ArrayList<MacawChangeEvent> arrayList0 = new ArrayList<MacawChangeEvent>();
      MacawChangeEvent macawChangeEvent0 = new MacawChangeEvent();
      arrayList0.add(macawChangeEvent0);
      changeHistoryTableModel0.setChangeEvents(arrayList0);
      Object object0 = changeHistoryTableModel0.getValueAt(0, 1);
      assertNotNull(object0);
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ChangeHistoryTableModel changeHistoryTableModel0 = new ChangeHistoryTableModel();
      ArrayList<MacawChangeEvent> arrayList0 = new ArrayList<MacawChangeEvent>();
      MacawChangeEvent macawChangeEvent0 = new MacawChangeEvent();
      arrayList0.add(macawChangeEvent0);
      changeHistoryTableModel0.setChangeEvents(arrayList0);
      Object object0 = changeHistoryTableModel0.getValueAt(0, 0);
      assertNotNull(object0);
      assertEquals("14-Feb-2014 08:21:21", object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ChangeHistoryTableModel changeHistoryTableModel0 = new ChangeHistoryTableModel();
      ArrayList<MacawChangeEvent> arrayList0 = new ArrayList<MacawChangeEvent>();
      MacawChangeEvent macawChangeEvent0 = new MacawChangeEvent();
      arrayList0.add(macawChangeEvent0);
      changeHistoryTableModel0.setChangeEvents(arrayList0);
      Object object0 = changeHistoryTableModel0.getValueAt(0, 2);
      assertEquals("", object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ChangeHistoryTableModel changeHistoryTableModel0 = new ChangeHistoryTableModel();
      String string0 = changeHistoryTableModel0.getColumnName(2);
      assertEquals("User ID", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ChangeHistoryTableModel changeHistoryTableModel0 = new ChangeHistoryTableModel();
      String string0 = changeHistoryTableModel0.getColumnName(1);
      assertNotNull(string0);
      assertEquals("Change", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ChangeHistoryTableModel changeHistoryTableModel0 = new ChangeHistoryTableModel();
      String string0 = changeHistoryTableModel0.getColumnName(0);
      assertEquals("Date", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ChangeHistoryTableModel changeHistoryTableModel0 = new ChangeHistoryTableModel();
      String string0 = changeHistoryTableModel0.getColumnName(2176);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ChangeHistoryTableModel changeHistoryTableModel0 = new ChangeHistoryTableModel();
      int int0 = changeHistoryTableModel0.getRowCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ChangeHistoryTableModel changeHistoryTableModel0 = new ChangeHistoryTableModel();
      int int0 = changeHistoryTableModel0.getColumnCount();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ChangeHistoryTableModel changeHistoryTableModel0 = new ChangeHistoryTableModel();
      boolean boolean0 = changeHistoryTableModel0.isCellEditable((-90), (-90));
      assertFalse(boolean0);
  }
}
