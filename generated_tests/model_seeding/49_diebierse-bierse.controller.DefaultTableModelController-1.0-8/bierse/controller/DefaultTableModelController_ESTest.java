/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 23:35:08 GMT 2019
 */

package bierse.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import bierse.controller.DefaultTableModelController;
import bierse.model.Model;
import bierse.view.IDrinkSellView;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultTableModelController_ESTest extends DefaultTableModelController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultTableModelController defaultTableModelController0 = new DefaultTableModelController((Model) null, (IDrinkSellView) null);
      Object[] objectArray0 = new Object[0];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, 11);
      TableModelEvent tableModelEvent0 = new TableModelEvent(defaultTableModel0, 11, (-1269));
      // Undeclared exception!
      try { 
        defaultTableModelController0.tableChanged(tableModelEvent0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 11 >= 11
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultTableModelController defaultTableModelController0 = new DefaultTableModelController((Model) null, (IDrinkSellView) null);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(0, 1790);
      Object[] objectArray0 = new Object[7];
      defaultTableModel0.addColumn((Object) null, objectArray0);
      TableModelEvent tableModelEvent0 = new TableModelEvent(defaultTableModel0);
      // Undeclared exception!
      try { 
        defaultTableModelController0.tableChanged(tableModelEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bierse.controller.DefaultTableModelController", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      TableModelEvent tableModelEvent0 = new TableModelEvent(defaultTableModel0);
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) tableModelEvent0;
      defaultTableModel0.addColumn((Object) tableModelEvent0, objectArray0);
      DefaultTableModelController defaultTableModelController0 = new DefaultTableModelController((Model) null, (IDrinkSellView) null);
      // Undeclared exception!
      try { 
        defaultTableModelController0.tableChanged(tableModelEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.swing.event.TableModelEvent cannot be cast to java.lang.String
         //
         verifyException("bierse.controller.DefaultTableModelController", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultTableModelController defaultTableModelController0 = new DefaultTableModelController((Model) null, (IDrinkSellView) null);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      TableModelEvent tableModelEvent0 = new TableModelEvent(defaultTableModel0, (-19), (-19), 1671, 1671);
      defaultTableModelController0.tableChanged(tableModelEvent0);
  }
}