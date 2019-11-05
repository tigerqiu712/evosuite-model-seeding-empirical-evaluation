/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 05 15:25:41 GMT 2019
 */

package fr.unice.gfarce.interGraph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.unice.gfarce.interGraph.FenetrePrincipale;
import fr.unice.gfarce.interGraph.SupprRespAction;
import fr.unice.gfarce.main.Controler;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JTextField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SupprRespAction_ESTest extends SupprRespAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SupprRespAction supprRespAction0 = new SupprRespAction((FenetrePrincipale) null, "L1pN", (Controler) null);
      JTable jTable0 = new JTable();
      FenetrePrincipale.tableResp = jTable0;
      JTextField jTextField0 = new JTextField("Prenom : *");
      FenetrePrincipale.outputNomResp = jTextField0;
      // Undeclared exception!
      try { 
        supprRespAction0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.SupprRespAction", e);
      }
  }
}