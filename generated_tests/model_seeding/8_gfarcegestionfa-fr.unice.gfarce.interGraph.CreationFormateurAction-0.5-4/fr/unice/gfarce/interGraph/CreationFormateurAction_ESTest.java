/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 17:52:06 GMT 2019
 */

package fr.unice.gfarce.interGraph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.unice.gfarce.interGraph.CreationFormateurAction;
import fr.unice.gfarce.interGraph.FenetrePrincipale;
import fr.unice.gfarce.main.Controler;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.text.DefaultFormatter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CreationFormateurAction_ESTest extends CreationFormateurAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CreationFormateurAction creationFormateurAction0 = new CreationFormateurAction((FenetrePrincipale) null, "fr.unice.gfarce.interGraph.FenetrePrinipale", (Controler) null);
      DefaultFormatter defaultFormatter0 = new DefaultFormatter();
      JFormattedTextField jFormattedTextField0 = new JFormattedTextField((JFormattedTextField.AbstractFormatter) defaultFormatter0);
      FenetrePrincipale.textFieldNomResponsable = (JTextField) jFormattedTextField0;
      // Undeclared exception!
      try { 
        creationFormateurAction0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.CreationFormateurAction", e);
      }
  }
}
