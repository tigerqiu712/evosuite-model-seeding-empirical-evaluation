/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 18:29:57 GMT 2019
 */

package fr.unice.gfarce.interGraph;

import org.junit.Test;
import static org.junit.Assert.*;
import fr.unice.gfarce.interGraph.ExportExelAction;
import fr.unice.gfarce.interGraph.FenetrePrincipale;
import fr.unice.gfarce.main.Controler;
import java.awt.event.ActionEvent;
import java.text.AttributedCharacterIterator;
import javax.swing.JComboBox;
import javax.swing.filechooser.FileSystemView;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.javax.swing.MockJFileChooser;
import org.evosuite.runtime.mock.javax.swing.filechooser.MockFileSystemView;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExportExelAction_ESTest extends ExportExelAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExportExelAction exportExelAction0 = new ExportExelAction((FenetrePrincipale) null, (String) null, (Controler) null);
      FileSystemView fileSystemView0 = MockFileSystemView.getFileSystemView();
      AttributedCharacterIterator.Attribute[] attributedCharacterIterator_AttributeArray0 = new AttributedCharacterIterator.Attribute[7];
      AttributedCharacterIterator.Attribute attributedCharacterIterator_Attribute0 = AttributedCharacterIterator.Attribute.INPUT_METHOD_SEGMENT;
      attributedCharacterIterator_AttributeArray0[0] = attributedCharacterIterator_Attribute0;
      JComboBox<AttributedCharacterIterator.Attribute> jComboBox0 = new JComboBox<AttributedCharacterIterator.Attribute>(attributedCharacterIterator_AttributeArray0);
      FenetrePrincipale.comboBoxFormation2 = jComboBox0;
      MockJFileChooser mockJFileChooser0 = new MockJFileChooser(fileSystemView0);
      ActionEvent actionEvent0 = new ActionEvent(mockJFileChooser0, 12, "J", 12, 12);
      exportExelAction0.actionPerformed(actionEvent0);
      assertEquals(12, actionEvent0.getModifiers());
  }
}