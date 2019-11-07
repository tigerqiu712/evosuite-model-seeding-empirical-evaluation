/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 16:28:37 GMT 2019
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.SearchPanel;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SearchPanel_ESTest extends SearchPanel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SearchPanel.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      String[] stringArray0 = searchPanel0.getSelectedGroups();
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      JCheckBoxMenuItem jCheckBoxMenuItem0 = new JCheckBoxMenuItem();
      ListSelectionEvent listSelectionEvent0 = new ListSelectionEvent(jCheckBoxMenuItem0, 2938, (-575), false);
      searchPanel0.valueChanged(listSelectionEvent0);
      assertFalse(searchPanel0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      ActionEvent actionEvent0 = new ActionEvent(defaultTableModel0, 4, "DOWNLOAD", (-300));
      // Undeclared exception!
      try { 
        searchPanel0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Newzgrabber.SearchPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      ActionEvent actionEvent0 = new ActionEvent("STOPSEARCH", 4, "STOPSEARCH", 4);
      searchPanel0.actionPerformed(actionEvent0);
      assertFalse(searchPanel0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      ActionEvent actionEvent0 = new ActionEvent(searchPanel0, 4, "SEARCH", 300);
      // Undeclared exception!
      try { 
        searchPanel0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Newzgrabber.SearchPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      ActionEvent actionEvent0 = new ActionEvent(searchPanel0, (-15), "CLEAR", (-15), (-15));
      searchPanel0.actionPerformed(actionEvent0);
      assertTrue(searchPanel0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      ActionEvent actionEvent0 = new ActionEvent("", 0, "", 2938, 0);
      searchPanel0.actionPerformed(actionEvent0);
      assertEquals(2938L, actionEvent0.getWhen());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      searchPanel0.windowDeactivated((WindowEvent) null);
      assertFalse(searchPanel0.isFocusCycleRoot());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      searchPanel0.windowDeiconified((WindowEvent) null);
      assertTrue(searchPanel0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      searchPanel0.windowIconified((WindowEvent) null);
      assertFalse(searchPanel0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      searchPanel0.windowOpened((WindowEvent) null);
      assertFalse(searchPanel0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      searchPanel0.windowClosed((WindowEvent) null);
      assertFalse(searchPanel0.isFocusCycleRoot());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      searchPanel0.windowActivated((WindowEvent) null);
      assertFalse(searchPanel0.isFocusTraversalPolicyProvider());
  }
}
