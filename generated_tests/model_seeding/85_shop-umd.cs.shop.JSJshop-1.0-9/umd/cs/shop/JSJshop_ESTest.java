/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 26 01:10:09 GMT 2019
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.PipedReader;
import java.io.StreamTokenizer;
import javax.swing.JApplet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshop;
import umd.cs.shop.JSJshopNode;
import umd.cs.shop.JSJshopVars;
import umd.cs.shop.JSListLogicalAtoms;
import umd.cs.shop.JSPairPlanTSListNodes;
import umd.cs.shop.JSPlan;
import umd.cs.shop.JSPlanningDomain;
import umd.cs.shop.JSPlanningProblem;
import umd.cs.shop.JSTaskAtom;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSJshop_ESTest extends JSJshop_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("C");
      byte[] byteArray0 = new byte[6];
      byteArray0[3] = (byte) (-14);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("C", "C");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      // Undeclared exception!
      try { 
        jSJshop0.testParser();
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      JSJshop jSJshop0 = new JSJshop();
      // Undeclared exception!
      try { 
        jSJshop0.setFile("9c", jSTaskAtom0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      // Undeclared exception!
      try { 
        jSJshop0.processToken((StreamTokenizer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      // Undeclared exception!
      try { 
        jSJshop0.parserFile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop((String) null, "umd.cs.shop.JSListSubstitution");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      PipedReader pipedReader0 = new PipedReader();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(pipedReader0);
      // Undeclared exception!
      try { 
        jSJshop0.processToken(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("C");
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte)10;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = new JSJshop("C", "C");
      JSJshopVars.apostrophe = (int) (byte)10;
      boolean boolean0 = jSJshop0.parserFile("C");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("C");
      byte[] byteArray0 = new byte[6];
      boolean boolean0 = FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = new JSJshop("C", "C");
      boolean boolean1 = jSJshop0.parserFile("C");
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("File parsed/File parsed");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "#v[z#h${?!;gvTy");
      JSJshop jSJshop0 = new JSJshop();
      BufferedReader bufferedReader0 = jSJshop0.getBufferedReader("File parsed", "File parsed", (JApplet) null);
      assertNotNull(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      BufferedReader bufferedReader0 = jSJshop0.getBufferedReader((String) null, (String) null, (JApplet) null);
      assertNull(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      BufferedReader bufferedReader0 = jSJshop0.getBufferedReader("Line : ", "tc", (JApplet) null);
      assertNull(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("C");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "< ");
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("C", "C");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)126;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.verticalL = (int) (byte)126;
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)91;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Gtuh!Sb9,$f+j");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "w]&/l~UMV+l");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "JSJshop>>processToken");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "********* list-tree final solution*******");
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.exclamation = (-3);
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.rightPar = (int) (byte)0;
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "cI}{7Bdpf]NHvY");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "z?yy(l");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSListLogicalAtoms jSListLogicalAtoms0 = jSJshop0.getDeleteList();
      assertNull(jSListLogicalAtoms0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSListLogicalAtoms jSListLogicalAtoms0 = jSJshop0.getAddList();
      assertNull(jSListLogicalAtoms0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("C");
      byte[] byteArray0 = new byte[7];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("C", " ");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "6xLKjGdnq\"0>I`M8";
      // Undeclared exception!
      try { 
        JSJshop.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[2] = "one";
      JSJshop.main(stringArray0);
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[6];
      JSJshop.main(stringArray0);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        JSJshop.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JSJshop.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSPlanningDomain jSPlanningDomain0 = jSJshop0.dom();
      assertNull(jSPlanningDomain0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSPlanningProblem jSPlanningProblem0 = jSJshop0.prob();
      assertNull(jSPlanningProblem0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopNode jSJshopNode0 = jSJshop0.tree();
      assertNull(jSJshopNode0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("C");
      byte[] byteArray0 = new byte[6];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = new JSJshop("C", "C");
      JSPlan jSPlan0 = jSJshop0.sol();
      assertNull(jSPlan0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSPairPlanTSListNodes jSPairPlanTSListNodes0 = jSJshop0.getSolution();
      assertNull(jSPairPlanTSListNodes0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("dXUmh2\"I`p4P~7#", (JSTaskAtom) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      // Undeclared exception!
      try { 
        jSJshop0.getAppletURL("|Axf||XcffBDF/gON", (JApplet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopNode jSJshopNode0 = jSJshop0.getTree();
      assertNull(jSJshopNode0);
  }
}
