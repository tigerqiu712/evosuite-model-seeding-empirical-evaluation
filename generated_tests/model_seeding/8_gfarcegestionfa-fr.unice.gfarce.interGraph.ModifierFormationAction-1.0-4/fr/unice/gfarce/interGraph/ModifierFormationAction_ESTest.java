/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 18:29:59 GMT 2019
 */

package fr.unice.gfarce.interGraph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.unice.gfarce.interGraph.FenetrePrincipale;
import fr.unice.gfarce.interGraph.ModifierFormationAction;
import fr.unice.gfarce.main.Controler;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.text.DateFormatter;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ModifierFormationAction_ESTest extends ModifierFormationAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ModifierFormationAction modifierFormationAction0 = new ModifierFormationAction((FenetrePrincipale) null, "-\"m'8[-ysSVX[Ge[v", (Controler) null);
      NumberFormatter numberFormatter0 = new NumberFormatter();
      JTextField jTextField0 = new JTextField(164);
      FenetrePrincipale.outputDateLimiteFormation = jTextField0;
      DateFormatter dateFormatter0 = new DateFormatter();
      DefaultFormatterFactory defaultFormatterFactory0 = new DefaultFormatterFactory(numberFormatter0, numberFormatter0, dateFormatter0);
      JFormattedTextField jFormattedTextField0 = new JFormattedTextField((JFormattedTextField.AbstractFormatterFactory) defaultFormatterFactory0);
      FenetrePrincipale.outputTitreFormation = (JTextField) jFormattedTextField0;
      // Undeclared exception!
      try { 
        modifierFormationAction0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.ModifierFormationAction", e);
      }
  }
}