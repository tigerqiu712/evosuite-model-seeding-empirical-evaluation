/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 17:15:19 GMT 2019
 */

package org.dom4j.tree;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.dom4j.Namespace;
import org.dom4j.Node;
import org.dom4j.QName;
import org.dom4j.dom.DOMElement;
import org.dom4j.dom.DOMNamespace;
import org.dom4j.tree.AbstractBranch;
import org.dom4j.tree.BackedList;
import org.dom4j.tree.BaseElement;
import org.dom4j.util.NonLazyElement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BackedList_ESTest extends BackedList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NonLazyElement nonLazyElement0 = new NonLazyElement("E[p!aGf$}7}Z_");
      BackedList<Namespace> backedList0 = ((AbstractBranch)nonLazyElement0).createResultList();
      DOMNamespace dOMNamespace0 = new DOMNamespace("E[p!aGf$}7}Z_", "E[p!aGf$}7}Z_");
      QName qName0 = QName.get("E[p!aGf$}7}Z_", (Namespace) dOMNamespace0);
      nonLazyElement0.addElement(qName0);
      backedList0.add(0, (Namespace) dOMNamespace0);
      Namespace namespace0 = backedList0.set(0, (Namespace) dOMNamespace0);
      assertFalse(namespace0.isReadOnly());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BaseElement baseElement0 = new BaseElement("");
      BackedList<Namespace> backedList0 = baseElement0.createResultList();
      Namespace namespace0 = Namespace.get("", "");
      backedList0.add(0, namespace0);
      backedList0.add(0, namespace0);
      assertEquals("", namespace0.getText());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NonLazyElement nonLazyElement0 = new NonLazyElement("");
      BackedList<Namespace> backedList0 = ((AbstractBranch)nonLazyElement0).createResultList();
      Namespace namespace0 = Namespace.get("");
      backedList0.add(namespace0);
      backedList0.add(1, namespace0);
      assertEquals(2, backedList0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Namespace namespace0 = Namespace.NO_NAMESPACE;
      DOMElement dOMElement0 = new DOMElement(" is less than zero");
      LinkedList<Node> linkedList0 = new LinkedList<Node>();
      BackedList<Namespace> backedList0 = new BackedList<Namespace>(dOMElement0, linkedList0);
      backedList0.add(0, namespace0);
      backedList0.add(namespace0);
      backedList0.add(2, namespace0);
      assertFalse(namespace0.supportsParent());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BaseElement baseElement0 = new BaseElement("E[p!aGf$}7}Z_");
      BackedList<Namespace> backedList0 = baseElement0.createResultList();
      DOMNamespace dOMNamespace0 = new DOMNamespace("E[p!aGf$}7}Z_", "E[p!aGf$}7}Z_");
      backedList0.add(0, (Namespace) dOMNamespace0);
      Namespace namespace0 = backedList0.set(0, (Namespace) dOMNamespace0);
      assertEquals("E[p!aGf$}7}Z_", namespace0.getText());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NonLazyElement nonLazyElement0 = new NonLazyElement("|9azUy32W");
      BackedList<Namespace> backedList0 = ((AbstractBranch)nonLazyElement0).createResultList();
      DOMNamespace dOMNamespace0 = new DOMNamespace("|9azUy32W", "|9azUy32W");
      backedList0.add(0, (Namespace) dOMNamespace0);
      Namespace namespace0 = backedList0.remove(0);
      assertEquals("|9azUy32W", namespace0.getStringValue());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Namespace namespace0 = Namespace.NO_NAMESPACE;
      DOMElement dOMElement0 = new DOMElement("/", namespace0);
      LinkedList<Node> linkedList0 = new LinkedList<Node>();
      BackedList<Namespace> backedList0 = new BackedList<Namespace>(dOMElement0, linkedList0);
      backedList0.add(0, namespace0);
      DOMNamespace dOMNamespace0 = new DOMNamespace(dOMElement0, "/", "/");
      // Undeclared exception!
      try { 
        backedList0.set(0, (Namespace) dOMNamespace0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The node \"org.dom4j.dom.DOMNamespace@0000000010\" could not be added to the element \"/\" because: The Node already has an existing parent of \"/\"
         //
         verifyException("org.dom4j.tree.AbstractElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BaseElement baseElement0 = new BaseElement("\" could not be added to the branch \"");
      BackedList<Namespace> backedList0 = baseElement0.createResultList();
      Namespace namespace0 = Namespace.XML_NAMESPACE;
      backedList0.size = (-154);
      // Undeclared exception!
      try { 
        backedList0.set(4645, namespace0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dom4j.tree.LazyList", e);
      }
  }
}