/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 04 13:58:37 GMT 2019
 */

package fr.unice.gfarce.interGraph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.unice.gfarce.interGraph.EnvoiFormationAction;
import fr.unice.gfarce.interGraph.FenetrePrincipale;
import fr.unice.gfarce.main.Controler;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.text.DateFormatter;
import javax.swing.text.DefaultFormatterFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EnvoiFormationAction_ESTest extends EnvoiFormationAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EnvoiFormationAction envoiFormationAction0 = new EnvoiFormationAction((FenetrePrincipale) null, "fwEgLx615^<-PKH3@=", (Controler) null);
      DateFormatter dateFormatter0 = new DateFormatter();
      DefaultFormatterFactory defaultFormatterFactory0 = new DefaultFormatterFactory(dateFormatter0, dateFormatter0);
      JFormattedTextField jFormattedTextField0 = new JFormattedTextField((JFormattedTextField.AbstractFormatterFactory) defaultFormatterFactory0);
      FenetrePrincipale.outputTitreFormation = (JTextField) jFormattedTextField0;
      JTable jTable0 = new JTable();
      FenetrePrincipale.tableFormation = jTable0;
      // Undeclared exception!
      try { 
        envoiFormationAction0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.EnvoiFormationAction", e);
      }
  }
}