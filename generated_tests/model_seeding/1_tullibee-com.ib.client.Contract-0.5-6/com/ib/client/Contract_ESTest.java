/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 19:10:47 GMT 2019
 */

package com.ib.client;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ib.client.Contract;
import com.ib.client.UnderComp;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Contract_ESTest extends Contract_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Contract contract0 = new Contract();
      assertFalse(contract0.m_includeExpired);
      assertEquals(0, contract0.m_conId);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertNotNull(contract0);
      
      contract0.m_right = "k5xUQ)sgYVZVb";
      Contract contract1 = new Contract();
      assertFalse(contract1.m_includeExpired);
      assertEquals(0, contract1.m_conId);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertNotNull(contract1);
      assertFalse(contract1.equals((Object)contract0));
      
      boolean boolean0 = contract0.equals(contract1);
      assertNotSame(contract0, contract1);
      assertNotSame(contract1, contract0);
      assertFalse(contract0.m_includeExpired);
      assertEquals(0, contract0.m_conId);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertFalse(contract1.m_includeExpired);
      assertEquals(0, contract1.m_conId);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertFalse(boolean0);
      assertFalse(contract0.equals((Object)contract1));
      assertFalse(contract1.equals((Object)contract0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      assertNotNull(vector0);
      assertEquals(10, vector0.capacity());
      assertEquals(0, vector0.size());
      assertTrue(vector0.isEmpty());
      assertEquals("[]", vector0.toString());
      
      Contract contract0 = new Contract((-324), "rV@D&", "`HH:C", "rV@D&", (-324), "rV@D&", "`HH:C", "`HH:C", "", "", vector0, "", true, "rV@D&", "");
      assertTrue(contract0.m_includeExpired);
      assertEquals((-324.0), contract0.m_strike, 0.01);
      assertEquals((-324), contract0.m_conId);
      assertNotNull(contract0);
      assertEquals(10, vector0.capacity());
      assertEquals(0, vector0.size());
      assertTrue(vector0.isEmpty());
      assertEquals("[]", vector0.toString());
      assertFalse(vector0.contains("rV@D&"));
      
      Contract contract1 = (Contract)contract0.clone();
      assertNotSame(contract0, contract1);
      assertNotSame(contract1, contract0);
      assertTrue(contract0.m_includeExpired);
      assertEquals((-324.0), contract0.m_strike, 0.01);
      assertEquals((-324), contract0.m_conId);
      assertTrue(contract1.m_includeExpired);
      assertEquals((-324), contract1.m_conId);
      assertEquals((-324.0), contract1.m_strike, 0.01);
      assertNotNull(contract1);
      assertEquals(10, vector0.capacity());
      assertEquals(0, vector0.size());
      assertTrue(vector0.isEmpty());
      assertEquals("[]", vector0.toString());
      assertFalse(vector0.contains("rV@D&"));
      assertTrue(contract1.equals((Object)contract0));
      
      contract0.m_expiry = "";
      assertEquals(10, vector0.capacity());
      assertEquals(0, vector0.size());
      assertTrue(vector0.isEmpty());
      assertEquals("[]", vector0.toString());
      
      boolean boolean0 = contract0.equals(contract1);
      assertNotSame(contract0, contract1);
      assertNotSame(contract1, contract0);
      assertTrue(contract0.m_includeExpired);
      assertEquals((-324.0), contract0.m_strike, 0.01);
      assertEquals((-324), contract0.m_conId);
      assertTrue(contract1.m_includeExpired);
      assertEquals((-324), contract1.m_conId);
      assertEquals((-324.0), contract1.m_strike, 0.01);
      assertFalse(boolean0);
      assertEquals(10, vector0.capacity());
      assertEquals(0, vector0.size());
      assertTrue(vector0.isEmpty());
      assertEquals("[]", vector0.toString());
      assertFalse(vector0.contains("rV@D&"));
      assertFalse(contract0.equals((Object)contract1));
      assertFalse(contract1.equals((Object)contract0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Contract contract0 = new Contract();
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertEquals(0, contract0.m_conId);
      assertFalse(contract0.m_includeExpired);
      assertNotNull(contract0);
      
      Contract contract1 = new Contract(0, "-#Sf0#n>k_v~tZ<", (String) null, "jOV~l-)KF<xg;l`A", 0.0, (String) null, "", (String) null, "com.ib.client.UnderComp", "BOND", contract0.m_comboLegs, (String) null, false, (String) null, "-#Sf0#n>k_v~tZ<");
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertEquals(0, contract0.m_conId);
      assertFalse(contract0.m_includeExpired);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertFalse(contract1.m_includeExpired);
      assertEquals(0, contract1.m_conId);
      assertNotNull(contract1);
      assertFalse(contract1.equals((Object)contract0));
      
      Contract contract2 = (Contract)contract1.clone();
      assertNotSame(contract0, contract2);
      assertNotSame(contract0, contract1);
      assertNotSame(contract1, contract2);
      assertNotSame(contract1, contract0);
      assertNotSame(contract2, contract1);
      assertNotSame(contract2, contract0);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertEquals(0, contract0.m_conId);
      assertFalse(contract0.m_includeExpired);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertFalse(contract1.m_includeExpired);
      assertEquals(0, contract1.m_conId);
      assertFalse(contract2.m_includeExpired);
      assertEquals(0.0, contract2.m_strike, 0.01);
      assertEquals(0, contract2.m_conId);
      assertNotNull(contract2);
      assertFalse(contract0.equals((Object)contract1));
      assertFalse(contract1.equals((Object)contract0));
      assertFalse(contract2.equals((Object)contract0));
      assertTrue(contract2.equals((Object)contract1));
      
      boolean boolean0 = contract1.equals(contract2);
      assertNotSame(contract0, contract2);
      assertNotSame(contract0, contract1);
      assertNotSame(contract1, contract2);
      assertNotSame(contract1, contract0);
      assertNotSame(contract2, contract1);
      assertNotSame(contract2, contract0);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertEquals(0, contract0.m_conId);
      assertFalse(contract0.m_includeExpired);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertFalse(contract1.m_includeExpired);
      assertEquals(0, contract1.m_conId);
      assertFalse(contract2.m_includeExpired);
      assertEquals(0.0, contract2.m_strike, 0.01);
      assertEquals(0, contract2.m_conId);
      assertTrue(boolean0);
      assertFalse(contract0.equals((Object)contract2));
      assertFalse(contract0.equals((Object)contract1));
      assertTrue(contract1.equals((Object)contract2));
      assertFalse(contract1.equals((Object)contract0));
      assertFalse(contract2.equals((Object)contract0));
      assertTrue(contract2.equals((Object)contract1));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Contract contract0 = new Contract();
      assertEquals(0, contract0.m_conId);
      assertFalse(contract0.m_includeExpired);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertNotNull(contract0);
      
      contract0.m_primaryExch = "Tz*Z,iO-\"|,t1~V~q";
      Contract contract1 = (Contract)contract0.clone();
      assertNotSame(contract0, contract1);
      assertNotSame(contract1, contract0);
      assertEquals(0, contract0.m_conId);
      assertFalse(contract0.m_includeExpired);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertFalse(contract1.m_includeExpired);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertEquals(0, contract1.m_conId);
      assertNotNull(contract1);
      assertTrue(contract1.equals((Object)contract0));
      
      boolean boolean0 = contract0.equals(contract1);
      assertNotSame(contract0, contract1);
      assertNotSame(contract1, contract0);
      assertEquals(0, contract0.m_conId);
      assertFalse(contract0.m_includeExpired);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertFalse(contract1.m_includeExpired);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertEquals(0, contract1.m_conId);
      assertTrue(boolean0);
      assertTrue(contract0.equals((Object)contract1));
      assertTrue(contract1.equals((Object)contract0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      assertNotNull(vector0);
      assertTrue(vector0.isEmpty());
      assertEquals(0, vector0.size());
      assertEquals("[]", vector0.toString());
      assertEquals(10, vector0.capacity());
      
      Contract contract0 = new Contract(0, "", "", "", (-1776.164), "", "", "", "", "", vector0, "", true, "BOND", "");
      assertEquals((-1776.164), contract0.m_strike, 0.01);
      assertTrue(contract0.m_includeExpired);
      assertEquals(0, contract0.m_conId);
      assertNotNull(contract0);
      assertTrue(vector0.isEmpty());
      assertEquals(0, vector0.size());
      assertEquals("[]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertFalse(vector0.contains(""));
      
      Contract contract1 = new Contract();
      assertFalse(contract1.m_includeExpired);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertEquals(0, contract1.m_conId);
      assertNotNull(contract1);
      assertFalse(contract1.equals((Object)contract0));
      
      boolean boolean0 = contract0.equals(contract1);
      assertNotSame(contract0, contract1);
      assertNotSame(contract1, contract0);
      assertEquals((-1776.164), contract0.m_strike, 0.01);
      assertTrue(contract0.m_includeExpired);
      assertEquals(0, contract0.m_conId);
      assertFalse(contract1.m_includeExpired);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertEquals(0, contract1.m_conId);
      assertFalse(boolean0);
      assertTrue(vector0.isEmpty());
      assertEquals(0, vector0.size());
      assertEquals("[]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertFalse(vector0.contains(""));
      assertFalse(contract0.equals((Object)contract1));
      assertFalse(contract1.equals((Object)contract0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Contract contract0 = new Contract();
      assertFalse(contract0.m_includeExpired);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertEquals(0, contract0.m_conId);
      assertNotNull(contract0);
      
      Contract contract1 = new Contract((-1211), (String) null, "%ADi`P!XKY2@C38", (String) null, 0.0, (String) null, "", "", "0 v", "", contract0.m_comboLegs, "", false, "~#Cn-^E", "");
      assertFalse(contract0.m_includeExpired);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertEquals(0, contract0.m_conId);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertEquals((-1211), contract1.m_conId);
      assertFalse(contract1.m_includeExpired);
      assertNotNull(contract1);
      assertFalse(contract1.equals((Object)contract0));
      
      contract0.m_conId = (-1211);
      contract1.m_secType = null;
      boolean boolean0 = contract0.equals(contract1);
      assertNotSame(contract0, contract1);
      assertNotSame(contract1, contract0);
      assertEquals((-1211), contract0.m_conId);
      assertFalse(contract0.m_includeExpired);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertEquals((-1211), contract1.m_conId);
      assertFalse(contract1.m_includeExpired);
      assertFalse(boolean0);
      assertFalse(contract0.equals((Object)contract1));
      assertFalse(contract1.equals((Object)contract0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Contract contract0 = new Contract();
      assertFalse(contract0.m_includeExpired);
      assertEquals(0, contract0.m_conId);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertNotNull(contract0);
      
      Contract contract1 = new Contract();
      assertFalse(contract1.m_includeExpired);
      assertEquals(0, contract1.m_conId);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertNotNull(contract1);
      assertTrue(contract1.equals((Object)contract0));
      
      contract1.m_primaryExch = "72=]<dDmT{x'";
      boolean boolean0 = contract1.equals(contract0);
      assertNotSame(contract0, contract1);
      assertNotSame(contract1, contract0);
      assertFalse(contract0.m_includeExpired);
      assertEquals(0, contract0.m_conId);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertFalse(contract1.m_includeExpired);
      assertEquals(0, contract1.m_conId);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertFalse(boolean0);
      assertFalse(contract0.equals((Object)contract1));
      assertFalse(contract1.equals((Object)contract0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Contract contract0 = new Contract();
      assertFalse(contract0.m_includeExpired);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertEquals(0, contract0.m_conId);
      assertNotNull(contract0);
      
      Contract contract1 = (Contract)contract0.clone();
      assertNotSame(contract0, contract1);
      assertNotSame(contract1, contract0);
      assertFalse(contract0.m_includeExpired);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertEquals(0, contract0.m_conId);
      assertEquals(0, contract1.m_conId);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertFalse(contract1.m_includeExpired);
      assertNotNull(contract1);
      assertTrue(contract1.equals((Object)contract0));
      
      contract0.m_exchange = "(r@g,:/O";
      boolean boolean0 = contract0.equals(contract1);
      assertNotSame(contract0, contract1);
      assertNotSame(contract1, contract0);
      assertFalse(contract0.m_includeExpired);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertEquals(0, contract0.m_conId);
      assertEquals(0, contract1.m_conId);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertFalse(contract1.m_includeExpired);
      assertFalse(boolean0);
      assertFalse(contract0.equals((Object)contract1));
      assertFalse(contract1.equals((Object)contract0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Contract contract0 = new Contract();
      assertEquals(0, contract0.m_conId);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertFalse(contract0.m_includeExpired);
      assertNotNull(contract0);
      
      contract0.m_symbol = "rV@D&";
      Contract contract1 = new Contract();
      assertFalse(contract1.m_includeExpired);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertEquals(0, contract1.m_conId);
      assertNotNull(contract1);
      assertFalse(contract1.equals((Object)contract0));
      
      boolean boolean0 = contract1.equals(contract0);
      assertNotSame(contract0, contract1);
      assertNotSame(contract1, contract0);
      assertEquals(0, contract0.m_conId);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertFalse(contract0.m_includeExpired);
      assertFalse(contract1.m_includeExpired);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertEquals(0, contract1.m_conId);
      assertFalse(boolean0);
      assertFalse(contract0.equals((Object)contract1));
      assertFalse(contract1.equals((Object)contract0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Contract contract0 = new Contract();
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertEquals(0, contract0.m_conId);
      assertFalse(contract0.m_includeExpired);
      assertNotNull(contract0);
      
      contract0.m_secType = "BOND";
      Contract contract1 = new Contract();
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertEquals(0, contract1.m_conId);
      assertFalse(contract1.m_includeExpired);
      assertNotNull(contract1);
      assertFalse(contract1.equals((Object)contract0));
      
      boolean boolean0 = contract1.equals(contract0);
      assertNotSame(contract0, contract1);
      assertNotSame(contract1, contract0);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertEquals(0, contract0.m_conId);
      assertFalse(contract0.m_includeExpired);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertEquals(0, contract1.m_conId);
      assertFalse(contract1.m_includeExpired);
      assertFalse(boolean0);
      assertFalse(contract0.equals((Object)contract1));
      assertFalse(contract1.equals((Object)contract0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      assertNotNull(vector0);
      assertTrue(vector0.isEmpty());
      assertEquals("[]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertEquals(0, vector0.size());
      
      Contract contract0 = new Contract(3203, "", "", "com.ib.client.Contract", 3203, "", "", "", "", "", vector0, "", false, "", "");
      assertEquals(3203, contract0.m_conId);
      assertEquals(3203.0, contract0.m_strike, 0.01);
      assertFalse(contract0.m_includeExpired);
      assertNotNull(contract0);
      assertTrue(vector0.isEmpty());
      assertEquals("[]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertEquals(0, vector0.size());
      assertFalse(vector0.contains(3203));
      
      Contract contract1 = new Contract();
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertFalse(contract1.m_includeExpired);
      assertEquals(0, contract1.m_conId);
      assertNotNull(contract1);
      assertFalse(contract1.equals((Object)contract0));
      
      boolean boolean0 = contract0.equals(contract1);
      assertNotSame(contract0, contract1);
      assertNotSame(contract1, contract0);
      assertEquals(3203, contract0.m_conId);
      assertEquals(3203.0, contract0.m_strike, 0.01);
      assertFalse(contract0.m_includeExpired);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertFalse(contract1.m_includeExpired);
      assertEquals(0, contract1.m_conId);
      assertFalse(boolean0);
      assertTrue(vector0.isEmpty());
      assertEquals("[]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertEquals(0, vector0.size());
      assertFalse(vector0.contains(3203));
      assertFalse(contract0.equals((Object)contract1));
      assertFalse(contract1.equals((Object)contract0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      assertNotNull(vector0);
      assertTrue(vector0.isEmpty());
      assertEquals("[]", vector0.toString());
      assertEquals(0, vector0.size());
      assertEquals(10, vector0.capacity());
      
      boolean boolean0 = vector0.add((Integer) null);
      assertTrue(boolean0);
      assertFalse(vector0.isEmpty());
      assertEquals(1, vector0.size());
      assertEquals("[null]", vector0.toString());
      assertEquals(10, vector0.capacity());
      
      Contract contract0 = new Contract((-260), "%Zx;", "%Zx;", "w&+5cXU6~b%", (-260), "jOV~l-)KF<xg;l`A", "w&+5cXU6~b%", "jOV~l-)KF<xg;l`A", "w&+5cXU6~b%", "O", vector0, "w&+5cXU6~b%", false, "w&+5cXU6~b%", "w&+5cXU6~b%");
      assertEquals((-260), contract0.m_conId);
      assertFalse(contract0.m_includeExpired);
      assertEquals((-260.0), contract0.m_strike, 0.01);
      assertNotNull(contract0);
      assertFalse(vector0.isEmpty());
      assertEquals(1, vector0.size());
      assertEquals("[null]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertFalse(vector0.contains((-260)));
      
      Contract contract1 = (Contract)contract0.clone();
      assertNotSame(contract0, contract1);
      assertNotSame(contract1, contract0);
      assertEquals((-260), contract0.m_conId);
      assertFalse(contract0.m_includeExpired);
      assertEquals((-260.0), contract0.m_strike, 0.01);
      assertFalse(contract1.m_includeExpired);
      assertEquals((-260), contract1.m_conId);
      assertEquals((-260.0), contract1.m_strike, 0.01);
      assertNotNull(contract1);
      assertFalse(vector0.isEmpty());
      assertEquals(1, vector0.size());
      assertEquals("[null]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertFalse(vector0.contains((-260)));
      
      // Undeclared exception!
      try { 
        contract1.equals(contract0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Contract contract0 = new Contract();
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertFalse(contract0.m_includeExpired);
      assertEquals(0, contract0.m_conId);
      assertNotNull(contract0);
      
      contract0.m_comboLegs = null;
      // Undeclared exception!
      try { 
        contract0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.Contract", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Contract contract0 = new Contract();
      assertEquals(0, contract0.m_conId);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertFalse(contract0.m_includeExpired);
      assertNotNull(contract0);
      
      UnderComp underComp0 = new UnderComp();
      assertEquals(0.0, underComp0.m_price, 0.01);
      assertEquals(0.0, underComp0.m_delta, 0.01);
      assertEquals(0, underComp0.m_conId);
      assertNotNull(underComp0);
      
      contract0.m_underComp = underComp0;
      Contract contract1 = new Contract();
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertFalse(contract1.m_includeExpired);
      assertEquals(0, contract1.m_conId);
      assertNotNull(contract1);
      assertFalse(contract1.equals((Object)contract0));
      
      boolean boolean0 = contract0.equals(contract1);
      assertNotSame(contract0, contract1);
      assertNotSame(contract1, contract0);
      assertEquals(0, contract0.m_conId);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertFalse(contract0.m_includeExpired);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertFalse(contract1.m_includeExpired);
      assertEquals(0, contract1.m_conId);
      assertFalse(boolean0);
      assertFalse(contract0.equals((Object)contract1));
      assertFalse(contract1.equals((Object)contract0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      assertNotNull(vector0);
      assertTrue(vector0.isEmpty());
      assertEquals(0, vector0.size());
      assertEquals("[]", vector0.toString());
      assertEquals(10, vector0.capacity());
      
      Contract contract0 = new Contract(1201, "%Zx;", "%Zx;", "w&+5cXU6~b%", 1201, "w&+5cXU6~b%", "w&+5cXU6~b%", "w&+5cXU6~b%", "w&+5cXU6~b%", "w&+5cXU6~b%", vector0, "w&+5cXU6~b%", false, "w&+5cXU6~b%", "w&+5cXU6~b%");
      assertEquals(1201, contract0.m_conId);
      assertEquals(1201.0, contract0.m_strike, 0.01);
      assertFalse(contract0.m_includeExpired);
      assertNotNull(contract0);
      assertTrue(vector0.isEmpty());
      assertEquals(0, vector0.size());
      assertEquals("[]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertFalse(vector0.contains(1201));
      
      Contract contract1 = (Contract)contract0.clone();
      assertNotSame(contract0, contract1);
      assertNotSame(contract1, contract0);
      assertEquals(1201, contract0.m_conId);
      assertEquals(1201.0, contract0.m_strike, 0.01);
      assertFalse(contract0.m_includeExpired);
      assertEquals(1201, contract1.m_conId);
      assertFalse(contract1.m_includeExpired);
      assertEquals(1201.0, contract1.m_strike, 0.01);
      assertNotNull(contract1);
      assertTrue(vector0.isEmpty());
      assertEquals(0, vector0.size());
      assertEquals("[]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertFalse(vector0.contains(1201));
      assertTrue(contract1.equals((Object)contract0));
      
      boolean boolean0 = vector0.add((Integer) 1201);
      assertTrue(boolean0);
      assertEquals(1, vector0.size());
      assertEquals("[1201]", vector0.toString());
      assertFalse(vector0.isEmpty());
      assertEquals(10, vector0.capacity());
      assertTrue(vector0.contains(1201));
      
      boolean boolean1 = contract1.equals(contract0);
      assertNotSame(contract0, contract1);
      assertNotSame(contract1, contract0);
      assertEquals(1201, contract0.m_conId);
      assertEquals(1201.0, contract0.m_strike, 0.01);
      assertFalse(contract0.m_includeExpired);
      assertEquals(1201, contract1.m_conId);
      assertFalse(contract1.m_includeExpired);
      assertEquals(1201.0, contract1.m_strike, 0.01);
      assertFalse(boolean1);
      assertEquals(1, vector0.size());
      assertEquals("[1201]", vector0.toString());
      assertFalse(vector0.isEmpty());
      assertEquals(10, vector0.capacity());
      assertTrue(vector0.contains(1201));
      assertFalse(contract0.equals((Object)contract1));
      assertFalse(contract1.equals((Object)contract0));
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Contract contract0 = new Contract();
      assertEquals(0, contract0.m_conId);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertFalse(contract0.m_includeExpired);
      assertNotNull(contract0);
      
      Contract contract1 = (Contract)contract0.clone();
      assertNotSame(contract0, contract1);
      assertNotSame(contract1, contract0);
      assertEquals(0, contract0.m_conId);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertFalse(contract0.m_includeExpired);
      assertFalse(contract1.m_includeExpired);
      assertEquals(0, contract1.m_conId);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertNotNull(contract1);
      assertTrue(contract1.equals((Object)contract0));
      
      contract0.m_secId = "O_'rbVm)Yg3Sh6y4";
      boolean boolean0 = contract0.equals(contract1);
      assertNotSame(contract0, contract1);
      assertNotSame(contract1, contract0);
      assertEquals(0, contract0.m_conId);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertFalse(contract0.m_includeExpired);
      assertFalse(contract1.m_includeExpired);
      assertEquals(0, contract1.m_conId);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertFalse(boolean0);
      assertFalse(contract0.equals((Object)contract1));
      assertFalse(contract1.equals((Object)contract0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Contract contract0 = new Contract();
      assertEquals(0, contract0.m_conId);
      assertFalse(contract0.m_includeExpired);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertNotNull(contract0);
      
      Contract contract1 = new Contract();
      assertEquals(0, contract1.m_conId);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertFalse(contract1.m_includeExpired);
      assertNotNull(contract1);
      assertTrue(contract1.equals((Object)contract0));
      
      contract1.m_secIdType = "com.ib.client.UnderComp";
      boolean boolean0 = contract0.equals(contract1);
      assertNotSame(contract0, contract1);
      assertNotSame(contract1, contract0);
      assertEquals(0, contract0.m_conId);
      assertFalse(contract0.m_includeExpired);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertEquals(0, contract1.m_conId);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertFalse(contract1.m_includeExpired);
      assertFalse(boolean0);
      assertFalse(contract0.equals((Object)contract1));
      assertFalse(contract1.equals((Object)contract0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Contract contract0 = new Contract();
      assertEquals(0, contract0.m_conId);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertFalse(contract0.m_includeExpired);
      assertNotNull(contract0);
      
      Contract contract1 = new Contract();
      assertEquals(0, contract1.m_conId);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertFalse(contract1.m_includeExpired);
      assertNotNull(contract1);
      assertTrue(contract1.equals((Object)contract0));
      
      contract1.m_localSymbol = "QTBo[.C;";
      boolean boolean0 = contract1.equals(contract0);
      assertNotSame(contract0, contract1);
      assertNotSame(contract1, contract0);
      assertEquals(0, contract0.m_conId);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertFalse(contract0.m_includeExpired);
      assertEquals(0, contract1.m_conId);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertFalse(contract1.m_includeExpired);
      assertFalse(boolean0);
      assertFalse(contract0.equals((Object)contract1));
      assertFalse(contract1.equals((Object)contract0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Contract contract0 = new Contract();
      assertEquals(0, contract0.m_conId);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertFalse(contract0.m_includeExpired);
      assertNotNull(contract0);
      
      contract0.m_multiplier = "com.ib.client.UnderComp";
      Contract contract1 = new Contract();
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertEquals(0, contract1.m_conId);
      assertFalse(contract1.m_includeExpired);
      assertNotNull(contract1);
      assertFalse(contract1.equals((Object)contract0));
      
      boolean boolean0 = contract0.equals(contract1);
      assertNotSame(contract0, contract1);
      assertNotSame(contract1, contract0);
      assertEquals(0, contract0.m_conId);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertFalse(contract0.m_includeExpired);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertEquals(0, contract1.m_conId);
      assertFalse(contract1.m_includeExpired);
      assertFalse(boolean0);
      assertFalse(contract0.equals((Object)contract1));
      assertFalse(contract1.equals((Object)contract0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Contract contract0 = new Contract();
      Contract contract1 = new Contract();
      assertTrue(contract1.equals((Object)contract0));
      
      contract1.m_right = "yHlwD.KqZkXQ";
      boolean boolean0 = contract0.equals(contract1);
      assertFalse(contract1.equals((Object)contract0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Contract contract0 = new Contract();
      Object object0 = contract0.clone();
      assertTrue(object0.equals((Object)contract0));
      
      contract0.m_expiry = "427";
      boolean boolean0 = contract0.equals(object0);
      assertFalse(object0.equals((Object)contract0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Contract contract0 = new Contract();
      Contract contract1 = new Contract();
      assertTrue(contract1.equals((Object)contract0));
      
      contract1.m_strike = (-323.0);
      boolean boolean0 = contract0.equals(contract1);
      assertFalse(contract1.equals((Object)contract0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Contract contract0 = new Contract();
      Object object0 = contract0.clone();
      assertTrue(object0.equals((Object)contract0));
      
      contract0.m_currency = "@E.n}V/eonBgaH&=";
      boolean boolean0 = contract0.equals(object0);
      assertFalse(object0.equals((Object)contract0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract((-324), "rV@D&", "`HH:C", "rV@D&", (-324), "rV@D&", "`HH:C", "`HH:C", "", "", vector0, "", true, "rV@D&", "");
      Object object0 = contract0.clone();
      assertTrue(object0.equals((Object)contract0));
      
      contract0.m_primaryExch = "`HH:C";
      boolean boolean0 = object0.equals(contract0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Contract contract0 = new Contract();
      Contract contract1 = new Contract();
      assertTrue(contract1.equals((Object)contract0));
      
      contract1.m_exchange = "=3)vUO980YvFy";
      boolean boolean0 = contract0.equals(contract1);
      assertFalse(contract1.equals((Object)contract0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Contract contract0 = new Contract();
      contract0.m_symbol = "BOND";
      Contract contract1 = new Contract();
      boolean boolean0 = contract0.equals(contract1);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertFalse(contract1.m_includeExpired);
      assertFalse(boolean0);
      assertFalse(contract1.equals((Object)contract0));
      assertEquals(0, contract1.m_conId);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Contract contract0 = new Contract();
      contract0.m_secType = "jOV~l-)KF<xg;l`A";
      Contract contract1 = new Contract(0, "-#Sf0#n>k_v~tZ<", (String) null, "jOV~l-)KF<xg;l`A", 0.0, (String) null, "", (String) null, "com.ib.client.UnderComp", "BOND", contract0.m_comboLegs, (String) null, false, (String) null, "-#Sf0#n>k_v~tZ<");
      boolean boolean0 = contract0.equals(contract1);
      assertFalse(boolean0);
      assertFalse(contract1.m_includeExpired);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertEquals(0, contract0.m_conId);
      assertEquals(0.0, contract1.m_strike, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Contract contract0 = new Contract();
      assertEquals(0, contract0.m_conId);
      
      contract0.m_conId = 2038;
      Contract contract1 = new Contract();
      boolean boolean0 = contract1.equals(contract0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      Contract contract0 = new Contract((-260), "%Zx.", "BOND", "}zkyb:3J^LWCJ", 1742.1168636, ";b/k{u-2*9}", "%Zx;", "9t*", "Q<Vx", "BOND", vector0, (String) null, false, "NOl'p=^", (String) null);
      contract0.equals(contract0);
      assertEquals(1742.1168636, contract0.m_strike, 0.01);
      assertEquals((-260), contract0.m_conId);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      Contract contract0 = new Contract((-260), "%Zx.", "BOND", "}zkyb:3J^LWCJ", 1742.1168636, ";b/k{u-2*9}", "%Zx;", "9t*", "Q<Vx", "BOND", vector0, (String) null, false, "NOl'p=^", (String) null);
      boolean boolean0 = contract0.equals("%Zx;");
      assertEquals((-260), contract0.m_conId);
      assertFalse(boolean0);
      assertFalse(contract0.m_includeExpired);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      Contract contract0 = new Contract((-260), "%Zx.", "BOND", "}zkyb:3J^LWCJ", 1742.1168636, ";b/k{u-2*9}", "%Zx;", "9t*", "Q<Vx", "BOND", vector0, (String) null, false, "NOl'p=^", (String) null);
      Contract contract1 = (Contract)contract0.clone();
      boolean boolean0 = contract0.equals(contract1);
      assertEquals(1742.1168636, contract1.m_strike, 0.01);
      assertEquals((-260), contract1.m_conId);
      assertNotSame(contract1, contract0);
      assertTrue(boolean0);
  }
}
