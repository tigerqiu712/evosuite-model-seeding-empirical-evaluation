/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 04 11:29:57 GMT 2019
 */

package fr.unice.gfarce.interGraph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.unice.gfarce.interGraph.TableStockage;
import javax.swing.JDialog;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TableStockage_ESTest extends TableStockage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      assertEquals(0, tableStockage0.getColumnCount());
      assertEquals(0, tableStockage0.getRowCount());
      assertNotNull(tableStockage0);
      
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      assertEquals(100, (int)integer0);
      assertNotNull(integer0);
      
      // Undeclared exception!
      try { 
        tableStockage0.remplirMatrice(integer0, (-391), 589);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -392
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[3];
      Object[][] objectArray0 = new Object[1][3];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      assertEquals(3, stringArray0.length);
      assertEquals(1, objectArray0.length);
      assertEquals(1, tableStockage0.getRowCount());
      assertEquals(3, tableStockage0.getColumnCount());
      assertNotNull(tableStockage0);
      
      Class<Integer> class0 = Integer.class;
      tableStockage0.setColumnClass(2, class0);
      assertEquals(3, stringArray0.length);
      assertEquals(1, objectArray0.length);
      assertEquals(1, tableStockage0.getRowCount());
      assertEquals(3, tableStockage0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      TableStockage tableStockage0 = new TableStockage(1, 1730);
      assertEquals(0, tableStockage0.getRowCount());
      assertEquals(1730, tableStockage0.getColumnCount());
      assertNotNull(tableStockage0);
      
      String[] stringArray0 = tableStockage0.getNomColonnes();
      assertEquals(1730, stringArray0.length);
      assertEquals(0, tableStockage0.getRowCount());
      assertEquals(1730, tableStockage0.getColumnCount());
      assertNotNull(stringArray0);
      
      Object[][] objectArray0 = new Object[3][3];
      objectArray0[0] = (Object[]) stringArray0;
      objectArray0[1] = (Object[]) stringArray0;
      objectArray0[2] = (Object[]) stringArray0;
      TableStockage tableStockage1 = new TableStockage(stringArray0, objectArray0);
      assertEquals(1730, stringArray0.length);
      assertEquals(3, objectArray0.length);
      assertEquals(0, tableStockage0.getRowCount());
      assertEquals(1730, tableStockage0.getColumnCount());
      assertEquals(3, tableStockage1.getRowCount());
      assertEquals(1730, tableStockage1.getColumnCount());
      assertFalse(tableStockage1.equals((Object)tableStockage0));
      assertNotNull(tableStockage1);
      
      tableStockage1.setColumnClass(1335, class0);
      assertEquals(1730, stringArray0.length);
      assertEquals(3, objectArray0.length);
      assertEquals(0, tableStockage0.getRowCount());
      assertEquals(1730, tableStockage0.getColumnCount());
      assertEquals(3, tableStockage1.getRowCount());
      assertEquals(1730, tableStockage1.getColumnCount());
      assertNotSame(tableStockage0, tableStockage1);
      assertNotSame(tableStockage1, tableStockage0);
      assertFalse(tableStockage0.equals((Object)tableStockage1));
      assertFalse(tableStockage1.equals((Object)tableStockage0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      assertEquals(0, tableStockage0.getColumnCount());
      assertEquals(0, tableStockage0.getRowCount());
      assertNotNull(tableStockage0);
      
      TableStockage tableStockage1 = new TableStockage(1267, 1424);
      assertEquals(1266, tableStockage1.getRowCount());
      assertEquals(1424, tableStockage1.getColumnCount());
      assertFalse(tableStockage1.equals((Object)tableStockage0));
      assertNotNull(tableStockage1);
      
      tableStockage1.setValueAt(tableStockage0, 731, 1);
      assertEquals(0, tableStockage0.getColumnCount());
      assertEquals(0, tableStockage0.getRowCount());
      assertEquals(1266, tableStockage1.getRowCount());
      assertEquals(1424, tableStockage1.getColumnCount());
      assertNotSame(tableStockage0, tableStockage1);
      assertNotSame(tableStockage1, tableStockage0);
      assertFalse(tableStockage0.equals((Object)tableStockage1));
      assertFalse(tableStockage1.equals((Object)tableStockage0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(638, 638);
      assertEquals(637, tableStockage0.getRowCount());
      assertEquals(638, tableStockage0.getColumnCount());
      assertNotNull(tableStockage0);
      
      tableStockage0.setColumnName(0, "hZD=#^Fq l7tQ-");
      assertEquals(637, tableStockage0.getRowCount());
      assertEquals(638, tableStockage0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[1] = "|;(@h[g0+Zw.|";
      Object[][] objectArray0 = new Object[6][3];
      objectArray0[1] = (Object[]) stringArray0;
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      assertEquals(2, stringArray0.length);
      assertEquals(6, objectArray0.length);
      assertEquals(2, tableStockage0.getColumnCount());
      assertEquals(6, tableStockage0.getRowCount());
      assertNotNull(tableStockage0);
      
      Object object0 = tableStockage0.getValueAt(1, 1);
      assertEquals("|;(@h[g0+Zw.|", object0);
      assertEquals(2, stringArray0.length);
      assertEquals(6, objectArray0.length);
      assertEquals(2, tableStockage0.getColumnCount());
      assertEquals(6, tableStockage0.getRowCount());
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(702, 1);
      assertEquals(1, tableStockage0.getColumnCount());
      assertEquals(701, tableStockage0.getRowCount());
      assertNotNull(tableStockage0);
      
      int int0 = tableStockage0.getRowCount();
      assertEquals(701, int0);
      assertEquals(1, tableStockage0.getColumnCount());
      assertEquals(701, tableStockage0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(1090, 1090);
      assertEquals(1089, tableStockage0.getRowCount());
      assertEquals(1090, tableStockage0.getColumnCount());
      assertNotNull(tableStockage0);
      
      String string0 = tableStockage0.getColumnName(1049);
      assertEquals(1089, tableStockage0.getRowCount());
      assertEquals(1090, tableStockage0.getColumnCount());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "3\"bqv1";
      Object[][] objectArray0 = new Object[2][4];
      objectArray0[0] = (Object[]) stringArray0;
      objectArray0[1] = (Object[]) stringArray0;
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      assertEquals(8, stringArray0.length);
      assertEquals(2, objectArray0.length);
      assertEquals(8, tableStockage0.getColumnCount());
      assertEquals(2, tableStockage0.getRowCount());
      assertNotNull(tableStockage0);
      
      String string0 = tableStockage0.getColumnName(0);
      assertEquals("3\"bqv1", string0);
      assertEquals(8, stringArray0.length);
      assertEquals(2, objectArray0.length);
      assertEquals(8, tableStockage0.getColumnCount());
      assertEquals(2, tableStockage0.getRowCount());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "";
      Object[][] objectArray0 = new Object[1][4];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      assertEquals(3, stringArray0.length);
      assertEquals(1, objectArray0.length);
      assertEquals(3, tableStockage0.getColumnCount());
      assertEquals(1, tableStockage0.getRowCount());
      assertNotNull(tableStockage0);
      
      String string0 = tableStockage0.getColumnName(1);
      assertEquals("", string0);
      assertEquals(3, stringArray0.length);
      assertEquals(1, objectArray0.length);
      assertEquals(3, tableStockage0.getColumnCount());
      assertEquals(1, tableStockage0.getRowCount());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      assertEquals(0, tableStockage0.getRowCount());
      assertEquals(0, tableStockage0.getColumnCount());
      assertNotNull(tableStockage0);
      
      int int0 = tableStockage0.getColumnCount();
      assertEquals(0, int0);
      assertEquals(0, tableStockage0.getRowCount());
      assertEquals(0, tableStockage0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(1096, 638);
      assertEquals(1095, tableStockage0.getRowCount());
      assertEquals(638, tableStockage0.getColumnCount());
      assertNotNull(tableStockage0);
      
      int int0 = tableStockage0.getColumnCount();
      assertEquals(638, int0);
      assertEquals(1095, tableStockage0.getRowCount());
      assertEquals(638, tableStockage0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[2];
      Object[][] objectArray0 = new Object[6][3];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      assertEquals(2, stringArray0.length);
      assertEquals(6, objectArray0.length);
      assertEquals(2, tableStockage0.getColumnCount());
      assertEquals(6, tableStockage0.getRowCount());
      assertNotNull(tableStockage0);
      
      Class<?> class0 = tableStockage0.getColumnClass(1);
      assertEquals(2, stringArray0.length);
      assertEquals(6, objectArray0.length);
      assertEquals(2, tableStockage0.getColumnCount());
      assertEquals(6, tableStockage0.getRowCount());
      assertEquals(1, class0.getModifiers());
      assertFalse(class0.isEnum());
      assertFalse(class0.isSynthetic());
      assertEquals("class java.lang.Object", class0.toString());
      assertFalse(class0.isPrimitive());
      assertFalse(class0.isAnnotation());
      assertFalse(class0.isInterface());
      assertFalse(class0.isArray());
      assertNotNull(class0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      assertEquals(0, tableStockage0.getColumnCount());
      assertEquals(0, tableStockage0.getRowCount());
      assertNotNull(tableStockage0);
      
      // Undeclared exception!
      try { 
        tableStockage0.setColumnClass(2912, (Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      assertEquals(0, tableStockage0.getRowCount());
      assertEquals(0, tableStockage0.getColumnCount());
      assertNotNull(tableStockage0);
      
      // Undeclared exception!
      try { 
        tableStockage0.remplirMatrice("Nw/Zhz[y6h>S6z6o8Fl", 854, 854);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 853
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      assertEquals(0, tableStockage0.getRowCount());
      assertEquals(0, tableStockage0.getColumnCount());
      assertNotNull(tableStockage0);
      
      // Undeclared exception!
      try { 
        tableStockage0.getValueAt(854, 854);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 854
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      assertEquals(0, tableStockage0.getColumnCount());
      assertEquals(0, tableStockage0.getRowCount());
      assertNotNull(tableStockage0);
      
      // Undeclared exception!
      try { 
        tableStockage0.getColumnName((-3048));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3048
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(1, 1730);
      String[] stringArray0 = tableStockage0.getNomColonnes();
      Object[][] objectArray0 = new Object[3][3];
      objectArray0[0] = (Object[]) stringArray0;
      objectArray0[1] = (Object[]) stringArray0;
      objectArray0[2] = (Object[]) stringArray0;
      TableStockage tableStockage1 = new TableStockage(stringArray0, objectArray0);
      TableStockage tableStockage2 = new TableStockage(stringArray0, objectArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[0];
      TableStockage tableStockage0 = null;
      try {
        tableStockage0 = new TableStockage(stringArray0, (Object[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TableStockage tableStockage0 = null;
      try {
        tableStockage0 = new TableStockage((-1), 0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(1786, 2181);
      tableStockage0.getValueAt(5, 5);
      assertEquals(2181, tableStockage0.getColumnCount());
      assertEquals(1785, tableStockage0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      int int0 = tableStockage0.getRowCount();
      assertEquals(0, tableStockage0.getColumnCount());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      Boolean boolean0 = Boolean.valueOf("8A@;Qse");
      // Undeclared exception!
      try { 
        tableStockage0.remplirMatrice(boolean0, 0, 1080);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Boolean cannot be cast to java.lang.String
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(628, 628);
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      tableStockage0.remplirMatrice(integer0, 592, 125);
      assertEquals(628, tableStockage0.getColumnCount());
      assertEquals(627, tableStockage0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(2286, 2286);
      Class<JDialog> class0 = JDialog.class;
      // Undeclared exception!
      try { 
        tableStockage0.setColumnClass(2286, class0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      Class<Boolean> class0 = Boolean.class;
      String[] stringArray0 = tableStockage0.getNomColonnes();
      Object[][] objectArray0 = new Object[3][3];
      TableStockage tableStockage1 = new TableStockage(stringArray0, objectArray0);
      // Undeclared exception!
      try { 
        tableStockage1.setColumnClass(1335, class0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(1, 1730);
      String[] stringArray0 = tableStockage0.getNomColonnes();
      Object[][] objectArray0 = new Object[3][3];
      TableStockage tableStockage1 = null;
      try {
        tableStockage1 = new TableStockage(stringArray0, objectArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      // Undeclared exception!
      try { 
        tableStockage0.setValueAt(tableStockage0, 731, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      boolean boolean0 = tableStockage0.isCellEditable(5202, 5202);
      assertEquals(0, tableStockage0.getRowCount());
      assertTrue(boolean0);
      assertEquals(0, tableStockage0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(1096, 638);
      // Undeclared exception!
      try { 
        tableStockage0.setColumnName((-2898), "'N2#B 7'S/>T");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2898
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(628, 628);
      // Undeclared exception!
      try { 
        tableStockage0.getColumnClass((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }
}