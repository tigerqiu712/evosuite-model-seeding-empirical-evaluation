/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 04 13:44:43 GMT 2019
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.SortFilterModel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.Stack;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.event.MenuDragMouseEvent;
import javax.swing.plaf.synth.SynthDesktopPaneUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SortFilterModel_ESTest extends SortFilterModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Stack<JFrame> stack0 = new Stack<JFrame>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, stack0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      defaultTableModel0.setColumnCount(518);
      JTable jTable0 = new JTable(518, 518);
      sortFilterModel0.setTable(jTable0);
      defaultTableModel0.addRow((Vector) stack0);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(jTable0, 273, 0L, 271, 518, 518, 258, 1, 0, false, 272, 1, 1, 1.0);
      sortFilterModel0.mouseClicked(mouseWheelEvent0);
      assertEquals(518, mouseWheelEvent0.getX());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      Object object0 = new Object();
      Stack<SynthDesktopPaneUI> stack0 = new Stack<SynthDesktopPaneUI>();
      SynthDesktopPaneUI synthDesktopPaneUI0 = new SynthDesktopPaneUI();
      stack0.add(synthDesktopPaneUI0);
      defaultTableModel0.addColumn(object0, (Vector) stack0);
      sortFilterModel0.updateTable();
      // Undeclared exception!
      try { 
        sortFilterModel0.setValueAt("Cancel", 0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1 >= 1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      Object object0 = new Object();
      Stack<SynthDesktopPaneUI> stack0 = new Stack<SynthDesktopPaneUI>();
      SynthDesktopPaneUI synthDesktopPaneUI0 = new SynthDesktopPaneUI();
      stack0.add(synthDesktopPaneUI0);
      defaultTableModel0.addColumn(object0, (Vector) stack0);
      sortFilterModel0.updateTable();
      sortFilterModel0.setValueAt("Cancel", 0, 0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Stack<JFrame> stack0 = new Stack<JFrame>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, stack0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      defaultTableModel0.setColumnCount(282);
      SortFilterModel sortFilterModel1 = new SortFilterModel(sortFilterModel0);
      Object object0 = sortFilterModel1.getValueAt(0, (-2441));
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, 487);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      boolean boolean0 = sortFilterModel0.isCellEditable(342, (-1712));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      Object object0 = new Object();
      Stack<SynthDesktopPaneUI> stack0 = new Stack<SynthDesktopPaneUI>();
      SynthDesktopPaneUI synthDesktopPaneUI0 = new SynthDesktopPaneUI();
      stack0.add(synthDesktopPaneUI0);
      defaultTableModel0.addColumn(object0, (Vector) stack0);
      int int0 = sortFilterModel0.getRowCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      String string0 = sortFilterModel0.getColumnName((-2476));
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      Object object0 = new Object();
      Stack<SynthDesktopPaneUI> stack0 = new Stack<SynthDesktopPaneUI>();
      defaultTableModel0.addColumn(object0, (Vector) stack0);
      int int0 = sortFilterModel0.getColumnCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Stack<Integer> stack0 = new Stack<Integer>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, stack0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      stack0.add((Integer) null);
      stack0.add((Integer) null);
      JTable jTable0 = new JTable(197, 543);
      sortFilterModel0.setTable(jTable0);
      // Undeclared exception!
      try { 
        sortFilterModel0.sortTable((-2467));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Stack<Integer> stack0 = new Stack<Integer>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, stack0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      Integer integer0 = JLayeredPane.MODAL_LAYER;
      stack0.add(integer0);
      stack0.add(integer0);
      JTable jTable0 = new JTable(197, 197);
      sortFilterModel0.setTable(jTable0);
      // Undeclared exception!
      try { 
        sortFilterModel0.sortTable(0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Stack<Integer> stack0 = new Stack<Integer>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, stack0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      // Undeclared exception!
      try { 
        sortFilterModel0.setTable((JTable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Newzgrabber.SortFilterModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Stack<JFrame> stack0 = new Stack<JFrame>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, stack0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      defaultTableModel0.setColumnCount(282);
      JTable jTable0 = new JTable(518, 518);
      sortFilterModel0.setTable(jTable0);
      stack0.add((JFrame) null);
      MouseEvent mouseEvent0 = new MouseEvent(jTable0, 282, 1L, 518, 272, 518, 282, false);
      // Undeclared exception!
      try { 
        sortFilterModel0.mouseClicked(mouseEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Stack<JFrame> stack0 = new Stack<JFrame>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, stack0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      defaultTableModel0.setColumnCount(534);
      JTable jTable0 = new JTable();
      sortFilterModel0.setTable(jTable0);
      MouseEvent mouseEvent0 = new MouseEvent(jTable0, 534, 1L, 534, 534, 534, 534, false);
      // Undeclared exception!
      try { 
        sortFilterModel0.mouseClicked(mouseEvent0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SortFilterModel sortFilterModel0 = null;
      try {
        sortFilterModel0 = new SortFilterModel((TableModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Newzgrabber.SortFilterModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Stack<JFrame> stack0 = new Stack<JFrame>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, stack0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      defaultTableModel0.setColumnCount(282);
      JTable jTable0 = new JTable(518, 518);
      sortFilterModel0.setTable(jTable0);
      MouseEvent mouseEvent0 = new MouseEvent(jTable0, 282, 1L, 518, 272, 518, 282, false);
      sortFilterModel0.mouseClicked(mouseEvent0);
      sortFilterModel0.mouseClicked(mouseEvent0);
      assertEquals(282, mouseEvent0.getID());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Stack<SortFilterModel> stack0 = new Stack<SortFilterModel>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, 0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.sort((-862));
      assertFalse(stack0.contains(sortFilterModel0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      int int0 = sortFilterModel0.getRowCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Stack<JFrame> stack0 = new Stack<JFrame>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, stack0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      defaultTableModel0.setColumnCount(282);
      JTable jTable0 = new JTable(518, 518);
      sortFilterModel0.setTable(jTable0);
      MouseEvent mouseEvent0 = new MouseEvent(jTable0, 282, 1L, 518, 272, 518, 282, false);
      sortFilterModel0.mouseClicked(mouseEvent0);
      sortFilterModel0.sortTable(263);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Stack<Integer> stack0 = new Stack<Integer>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, stack0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      JList<String> jList0 = new JList<String>();
      MouseEvent mouseEvent0 = new MouseEvent(jList0, 0, 0, 0, (-833), 0, 398, true);
      sortFilterModel0.mouseClicked(mouseEvent0);
      assertEquals(0, mouseEvent0.getID());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(vector0, vector0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.sortTable((-1));
      assertFalse(vector0.contains((-1)));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Stack<JFrame> stack0 = new Stack<JFrame>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, stack0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      Class class0 = sortFilterModel0.getColumnClass((-1466));
      assertFalse(class0.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Stack<Integer> stack0 = new Stack<Integer>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, stack0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      JTable jTable0 = new JTable(0, 3);
      MouseEvent mouseEvent0 = new MouseEvent(jTable0, (-2047), (-2047), (-1), (-1), (-1), 0, true);
      sortFilterModel0.mousePressed(mouseEvent0);
      assertTrue(mouseEvent0.isPopupTrigger());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      String string0 = sortFilterModel0.getColumnName(0);
      assertEquals("A", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      byte[] byteArray0 = new byte[0];
      ImageIcon imageIcon0 = new ImageIcon(byteArray0);
      JCheckBoxMenuItem jCheckBoxMenuItem0 = new JCheckBoxMenuItem("", imageIcon0, false);
      MenuElement[] menuElementArray0 = new MenuElement[1];
      MenuSelectionManager menuSelectionManager0 = MenuSelectionManager.defaultManager();
      MenuDragMouseEvent menuDragMouseEvent0 = new MenuDragMouseEvent(jCheckBoxMenuItem0, 20, 0, 2226, (-3058), 3, 300, 0, 291, true, menuElementArray0, menuSelectionManager0);
      sortFilterModel0.mouseReleased(menuDragMouseEvent0);
      assertEquals(0, menuDragMouseEvent0.getYOnScreen());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      int int0 = sortFilterModel0.getColumnCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Stack<Integer> stack0 = new Stack<Integer>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, stack0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      ImageIcon imageIcon0 = new ImageIcon("Cancel", "");
      JToggleButton jToggleButton0 = new JToggleButton("", imageIcon0);
      MouseEvent mouseEvent0 = new MouseEvent(jToggleButton0, (-1431), 2242L, (-1431), 0, (-2047), 0, false);
      sortFilterModel0.mouseEntered(mouseEvent0);
      assertTrue(mouseEvent0.isAltDown());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel((Vector) null, (Vector) null);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.setSort(false);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Stack<JFrame> stack0 = new Stack<JFrame>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, stack0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      // Undeclared exception!
      try { 
        sortFilterModel0.isCellEditable(247, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 247
         //
         verifyException("Newzgrabber.SortFilterModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Stack<Integer> stack0 = new Stack<Integer>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, stack0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      JList<String> jList0 = new JList<String>();
      MouseEvent mouseEvent0 = new MouseEvent(jList0, 0, 0, 0, (-833), 0, 398, true);
      sortFilterModel0.mouseExited(mouseEvent0);
      assertEquals(0, mouseEvent0.getXOnScreen());
  }
}