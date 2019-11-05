/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 13:05:24 GMT 2019
 */

package fr.unice.gfarce.interGraph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.unice.gfarce.interGraph.FenetrePrincipale;
import fr.unice.gfarce.interGraph.ModifTableStockage;
import fr.unice.gfarce.interGraph.SupprFormationAction;
import fr.unice.gfarce.interGraph.TableStockage;
import fr.unice.gfarce.main.Controler;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.javax.swing.MockDefaultListSelectionModel;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SupprFormationAction_ESTest extends SupprFormationAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      SupprFormationAction supprFormationAction0 = new SupprFormationAction((FenetrePrincipale) null, "", (Controler) null, modifTableStockage0);
      MockDefaultListSelectionModel mockDefaultListSelectionModel0 = new MockDefaultListSelectionModel();
      JTable jTable0 = new JTable(tableStockage0, (TableColumnModel) null, mockDefaultListSelectionModel0);
      FenetrePrincipale.tableFormation = jTable0;
      // Undeclared exception!
      try { 
        supprFormationAction0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.SupprFormationAction", e);
      }
  }
}