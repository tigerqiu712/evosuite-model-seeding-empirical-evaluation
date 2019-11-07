/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 16:52:31 GMT 2019
 */

package jaw.gui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import javax.swing.table.DefaultTableModel;
import jaw.gui.ProcessarEntidadesTabela;
import jaw.gui.ProcessarEntidadesTree;
import jaw.metamodelo.Atributo;
import jaw.metamodelo.Entidade;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProcessarEntidades_ESTest extends ProcessarEntidades_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      int int0 = processarEntidadesTabela0.getEntidadeSelecionada();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      int int0 = processarEntidadesTabela0.getAtributoSelecionado();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.setNomeArquivoSalvo((String) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported yet.
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.setEntidades((List<Entidade>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      Stack<Entidade> stack0 = new Stack<Entidade>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, stack0);
      Object[] objectArray0 = new Object[4];
      defaultTableModel0.addRow(objectArray0);
      // Undeclared exception!
      try { 
        processarEntidadesTabela0.setEntidades(stack0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Vector cannot be cast to jaw.metamodelo.Entidade
         //
         verifyException("jaw.gui.ProcessarEntidadesTabela", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.setEntidadeSelecionada((-1726));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported yet.
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.setAtributoSelecionado(439);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported yet.
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.setAtributo((Atributo) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported yet.
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      LinkedList<Entidade> linkedList0 = new LinkedList<Entidade>();
      processarEntidadesTabela0.carregarEntidades(linkedList0);
      Atributo atributo0 = processarEntidadesTabela0.getAtributo();
      // Undeclared exception!
      try { 
        processarEntidadesTabela0.setAtributo(atributo0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      // Undeclared exception!
      try { 
        processarEntidadesTabela0.setAtributo((Atributo) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.selecionarEntidades();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported yet.
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.resetAtributos();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported yet.
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.removerEntidades();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported yet.
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.listarAtributos();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported yet.
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      LinkedList<Entidade> linkedList0 = new LinkedList<Entidade>();
      processarEntidadesTabela0.setEntidades(linkedList0);
      // Undeclared exception!
      try { 
        processarEntidadesTabela0.listarAtributos();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      // Undeclared exception!
      try { 
        processarEntidadesTabela0.listarAtributos();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.getEntidadeSelecionada();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported yet.
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.getAtributoSelecionado();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported yet.
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.getAtributo();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported yet.
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.carregarEntidades((List<Entidade>) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported yet.
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.atualizarEntidades();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported yet.
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      // Undeclared exception!
      try { 
        processarEntidadesTabela0.carregarEntidades((List<Entidade>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections", e);
      }
  }
}
