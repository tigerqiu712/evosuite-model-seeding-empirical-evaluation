/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 19:48:13 GMT 2019
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.SearchPanel;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.KeyStroke;
import javax.swing.event.ListSelectionEvent;
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
      searchPanel0.valueChanged((ListSelectionEvent) null);
      assertFalse(searchPanel0.isFocusCycleRoot());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      ActionEvent actionEvent0 = new ActionEvent("DOWNLOAD", 10, "DOWNLOAD");
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
      ActionEvent actionEvent0 = new ActionEvent(searchPanel0, 3144, "STOPSEARCH");
      searchPanel0.actionPerformed(actionEvent0);
      assertFalse(searchPanel0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      ActionEvent actionEvent0 = new ActionEvent("SEARCH", (-1902), "SEARCH", (-1902));
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
      KeyStroke keyStroke0 = KeyStroke.getKeyStroke(4, 1323, false);
      ActionEvent actionEvent0 = new ActionEvent(keyStroke0, 4, "CLEAR");
      searchPanel0.actionPerformed(actionEvent0);
      assertTrue(searchPanel0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      ActionEvent actionEvent0 = new ActionEvent(searchPanel0, 2, "GbsAE|GLq/J_MQG");
      searchPanel0.actionPerformed(actionEvent0);
      assertFalse(searchPanel0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      searchPanel0.windowDeactivated((WindowEvent) null);
      assertFalse(searchPanel0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      searchPanel0.windowDeiconified((WindowEvent) null);
      assertFalse(searchPanel0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      searchPanel0.windowIconified((WindowEvent) null);
      assertFalse(searchPanel0.isFocusTraversalPolicyProvider());
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
      assertFalse(searchPanel0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      searchPanel0.windowActivated((WindowEvent) null);
      assertFalse(searchPanel0.getIgnoreRepaint());
  }
}
