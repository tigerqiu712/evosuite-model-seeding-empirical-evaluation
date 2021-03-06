/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 09:22:53 GMT 2019
 */

package fr.unice.gfarce.interGraph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.unice.gfarce.interGraph.EnvoiRespAction;
import fr.unice.gfarce.interGraph.FenetrePrincipale;
import fr.unice.gfarce.main.Controler;
import java.awt.event.ActionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EnvoiRespAction_ESTest extends EnvoiRespAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EnvoiRespAction envoiRespAction0 = new EnvoiRespAction((FenetrePrincipale) null, "erreur d'update", (Controler) null);
      // Undeclared exception!
      try { 
        envoiRespAction0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.EnvoiRespAction", e);
      }
  }
}
