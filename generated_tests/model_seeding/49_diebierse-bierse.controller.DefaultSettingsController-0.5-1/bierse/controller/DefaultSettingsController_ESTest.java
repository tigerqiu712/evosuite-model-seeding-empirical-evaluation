/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 08:32:53 GMT 2019
 */

package bierse.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import bierse.controller.DefaultSettingsController;
import bierse.model.Model;
import bierse.view.IDrinkSettingsView;
import bierse.view.ISettingsView;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.io.InputStream;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultSettingsController_ESTest extends DefaultSettingsController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultSettingsController defaultSettingsController0 = new DefaultSettingsController((Model) null, (ISettingsView) null, (IDrinkSettingsView) null);
      Vector<InputStream> vector0 = new Vector<InputStream>(33, 112);
      ActionEvent actionEvent0 = new ActionEvent(vector0, (-3760), "SETTINGS_ACTION_DRINK_SELECTED");
      actionEvent0.setSource((Object) null);
      // Undeclared exception!
      try { 
        defaultSettingsController0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bierse.controller.DefaultSettingsController", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ActionEvent actionEvent0 = new ActionEvent("SETTINGS_ACTION_CHOOSE_BACKGROUND", 7, "SETTINGS_ACTION_CHOOSE_BACKGROUND", 7);
      DefaultSettingsController defaultSettingsController0 = new DefaultSettingsController((Model) null, (ISettingsView) null, (IDrinkSettingsView) null);
      // Undeclared exception!
      try { 
        defaultSettingsController0.actionPerformed(actionEvent0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultSettingsController defaultSettingsController0 = new DefaultSettingsController((Model) null, (ISettingsView) null, (IDrinkSettingsView) null);
      Vector<InputStream> vector0 = new Vector<InputStream>(33, 112);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(vector0, 33);
      ActionEvent actionEvent0 = new ActionEvent(defaultTableModel0, 2957, "Ka+dOpup.ue9Jd", 2957);
      defaultSettingsController0.actionPerformed(actionEvent0);
      assertEquals("Ka+dOpup.ue9Jd", actionEvent0.getActionCommand());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultSettingsController defaultSettingsController0 = new DefaultSettingsController((Model) null, (ISettingsView) null, (IDrinkSettingsView) null);
      ActionEvent actionEvent0 = new ActionEvent(defaultSettingsController0, 32, "SETTINGS_ACTION_CANCEL", 32);
      // Undeclared exception!
      try { 
        defaultSettingsController0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bierse.controller.DefaultSettingsController", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DefaultSettingsController defaultSettingsController0 = new DefaultSettingsController((Model) null, (ISettingsView) null, (IDrinkSettingsView) null);
      Vector<InputStream> vector0 = new Vector<InputStream>(33, 112);
      ActionEvent actionEvent0 = new ActionEvent(vector0, 112, "SETTINGS_ACTION_OK", 33);
      // Undeclared exception!
      try { 
        defaultSettingsController0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bierse.controller.DefaultSettingsController", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultSettingsController defaultSettingsController0 = new DefaultSettingsController((Model) null, (ISettingsView) null, (IDrinkSettingsView) null);
      Vector<InputStream> vector0 = new Vector<InputStream>(33, 112);
      ActionEvent actionEvent0 = new ActionEvent(vector0, (-3760), "SETTINGS_ACTION_DRINK_SELECTED");
      // Undeclared exception!
      try { 
        defaultSettingsController0.actionPerformed(actionEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Vector cannot be cast to javax.swing.JComboBox
         //
         verifyException("bierse.controller.DefaultSettingsController", e);
      }
  }
}