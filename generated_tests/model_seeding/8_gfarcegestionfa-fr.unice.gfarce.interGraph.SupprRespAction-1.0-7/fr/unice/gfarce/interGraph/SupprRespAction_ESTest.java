/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 22:04:15 GMT 2019
 */

package fr.unice.gfarce.interGraph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.unice.gfarce.interGraph.FenetrePrincipale;
import fr.unice.gfarce.interGraph.SupprRespAction;
import fr.unice.gfarce.interGraph.TableStockage;
import fr.unice.gfarce.main.Controler;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SupprRespAction_ESTest extends SupprRespAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SupprRespAction supprRespAction0 = new SupprRespAction((FenetrePrincipale) null, "q3~ZVu3e~K4", (Controler) null);
      Object object0 = new Object();
      ActionEvent actionEvent0 = new ActionEvent(object0, 19, "q3~ZVu3e~K4", 19);
      TableStockage tableStockage0 = new TableStockage();
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      JTable jTable0 = new JTable(tableStockage0, defaultTableColumnModel0);
      FenetrePrincipale.tableResp = jTable0;
      // Undeclared exception!
      try { 
        supprRespAction0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.SupprRespAction", e);
      }
  }
}