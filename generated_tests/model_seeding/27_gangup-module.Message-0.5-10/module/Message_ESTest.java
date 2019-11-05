/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 18:18:39 GMT 2019
 */

package module;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.swing.JLayeredPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import module.Kernel;
import module.Message;
import module.MessageFactory;
import module.Module;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;
import state.Action;
import state.ActionFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Message_ESTest extends Message_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Message message0 = new Message();
      try { 
        message0.send();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // modnull,msg=Message[id=0,session=0,head=null,recip=null,sender=null,state=0,ttl=0,time=0,body=null]: no source module
         //
         verifyException("module.Message", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Message message0 = MessageFactory.createConnectionDroppedMessage(0, "m|ggzo{I9,~c}~|/1#");
      assertEquals(0L, message0.getSID());
      
      message0.sessionID = (-1913L);
      String string0 = message0.toString();
      assertEquals("Message[id=0,session=-1913,head=DROPPED,recip=*,sender=null,state=1,ttl=3000,time=1392409281320,body=ID: 0 IP: m|ggzo{I9,~c}~|/1#]", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Message message0 = MessageFactory.createConnectionDroppedMessage(0, "m|ggzo{I9,~c}~|/1#");
      message0.setDelivered(false);
      assertEquals(3000L, message0.getTTL());
      assertEquals(1, message0.getState());
      assertEquals(0L, message0.getSID());
      assertEquals("*", message0.getRecipient());
      assertEquals("DROPPED", message0.getHeader());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Message message0 = MessageFactory.createUnloadMessage("");
      message0.setDelivered(true);
      message0.setDelivered(true);
      assertTrue(message0.delivered());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Message message0 = MessageFactory.createUnloadMessage("");
      assertEquals("KERNEL", message0.getHeader());
      
      message0.setHeader("");
      assertEquals("", message0.getHeader());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Message message0 = MessageFactory.createUnloadMessage(" ");
      Kernel kernel0 = new Kernel();
      message0.sendTo(kernel0);
      assertEquals("*", message0.getRecipient());
      assertEquals("KERNEL", message0.getHeader());
      assertEquals(3000L, message0.getTTL());
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Message message0 = MessageFactory.createErrorMessage("\"", objectArray0);
      System.setCurrentTimeMillis(0);
      message0.reply(message0);
      assertEquals(2, message0.getRefCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      System.setCurrentTimeMillis((-1L));
      Object[] objectArray0 = new Object[3];
      Object object0 = new Object();
      Message message0 = MessageFactory.createWarningMessage(",head=", objectArray0);
      Message message1 = message0.reply(object0);
      assertEquals(0L, message1.getSID());
      assertEquals(1, message1.getState());
      assertEquals(1, message0.getState());
      assertEquals(1L, message1.getID());
      assertEquals(3000L, message0.getTTL());
      assertEquals(3000L, message1.getTTL());
      assertEquals("WARNING", message1.getHeader());
      assertEquals("*", message0.getRecipient());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Message message0 = MessageFactory.createMessage("+=xm</3urZsEP3Io5", (Object) "+=xm</3urZsEP3Io5");
      message0.set("+=xm</3urZsEP3Io5", "7", (Object) null);
      message0.reply((Object) null);
      assertEquals(1L, message0.getSID());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Message message0 = MessageFactory.createConnectionDroppedMessage(0, "m|ggzo{I9,~c}~|/1#");
      assertEquals(0L, message0.getSID());
      
      message0.sessionID = (-1913L);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel((Object[][]) null, (Object[]) null);
      Message message1 = message0.reply(defaultTableModel0);
      assertEquals(1L, message1.getID());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Message message0 = new Message();
      Object object0 = new Object();
      Message message1 = message0.reply(object0);
      assertEquals(3000L, message1.getTTL());
      assertEquals(0L, message1.getID());
      assertEquals(1, message1.getState());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Message message0 = new Message();
      long long0 = message0.getTimeStamp();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object object0 = new Object();
      Message message0 = MessageFactory.createMessage((String) null, "", object0);
      message0.timestamp = (-1L);
      long long0 = message0.getTimeStamp();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Message message0 = new Message();
      long long0 = message0.getTTL();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Message message0 = new Message("g", "g", (Object) null);
      message0.timetolive = (-1913L);
      long long0 = message0.getTTL();
      assertEquals((-1913L), long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Message message0 = new Message();
      int int0 = message0.getState();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Message message0 = new Message((String) null, (Object) null);
      message0.state = (-534);
      int int0 = message0.getState();
      assertEquals((-534), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Message message0 = new Message();
      message0.setSender("1z.*4jHNj|");
      String string0 = message0.getSender();
      assertEquals("1z.*4jHNj|", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Message message0 = new Message("::~j+?dB\"Sm ", "::~j+?dB\"Sm ");
      message0.set("::~j+?dB\"Sm ", ".::gejG", ".::gejG");
      long long0 = message0.getSID();
      assertEquals(1L, message0.getID());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Message message0 = MessageFactory.createConnectionDroppedMessage(0, "m|ggzo{I9,~c}~|/1#");
      message0.sessionID = (-1913L);
      long long0 = message0.getSID();
      assertEquals((-1913L), long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Message message0 = new Message();
      String string0 = message0.getRecipient();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Action action0 = new Action();
      Message message0 = MessageFactory.createMessage("B?p~NZ`h{f(wI3{U[h", "cJ", (Object) action0);
      String string0 = message0.getRecipient();
      assertFalse(action0.getIsConsumed());
      assertEquals("cJ", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Message message0 = MessageFactory.createConnectionDroppedMessage(0, "m|ggzo{I9,~c}~|/1#");
      DefaultTableModel defaultTableModel0 = new DefaultTableModel((Object[][]) null, (Object[]) null);
      Message message1 = message0.reply(defaultTableModel0);
      long long0 = message1.getID();
      assertEquals(1L, long0);
      assertEquals("*", message0.getRecipient());
      assertEquals(3000L, message0.getTTL());
      assertEquals(0L, message1.getSID());
      assertEquals(1, message1.getState());
      assertEquals("DROPPED", message1.getHeader());
      assertEquals(3000L, message1.getTTL());
      assertEquals(1, message0.getState());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Message message0 = MessageFactory.createConnectionDroppedMessage((-1626), "LX!P}");
      message0.messageID = 1327L;
      message0.messageID = (long) (-1626);
      long long0 = message0.getID();
      assertEquals((-1626L), long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Message message0 = MessageFactory.createConnectionDroppedMessage((-1626), "LX!P}");
      message0.clone();
      assertEquals("*", message0.getRecipient());
      assertEquals("DROPPED", message0.getHeader());
      assertEquals(3000L, message0.getTTL());
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Message message0 = new Message();
      Message message1 = message0.clone();
      assertEquals(0, message1.getState());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Message message0 = new Message();
      // Undeclared exception!
      try { 
        message0.sendFrom((Module) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("module.Message", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Message message0 = new Message();
      Kernel kernel0 = new Kernel();
      try { 
        message0.send((Module) kernel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.NullPointerException
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      Message message0 = MessageFactory.createErrorMessage("*", objectArray0);
      message0.setBody(objectArray0[0]);
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
      assertEquals(3000L, message0.getTTL());
      assertEquals("*", message0.getRecipient());
      assertEquals("ERROR", message0.getHeader());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ActionFactory actionFactory0 = ActionFactory.getInstance();
      Message message0 = new Message(actionFactory0);
      assertFalse(message0.delivered());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Message message0 = new Message();
      message0.setBody(message0);
      message0.consume();
      assertEquals(0, Message.UNDEFINED);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Message message0 = MessageFactory.createConnectionDroppedMessage(0, "m|ggzo{I9,~c}~|/1#");
      message0.unref();
      assertEquals(3000L, message0.getTTL());
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
      assertEquals("*", message0.getRecipient());
      assertEquals("DROPPED", message0.getHeader());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Message message0 = new Message();
      assertFalse(message0.received());
      
      message0.state = 2;
      boolean boolean0 = message0.received();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Message message0 = MessageFactory.createConnectionDroppedMessage(0, "m|ggzo{I9,~c}~|/1#");
      boolean boolean0 = message0.received();
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
      assertEquals("*", message0.getRecipient());
      assertFalse(boolean0);
      assertEquals(3000L, message0.getTTL());
      assertEquals("DROPPED", message0.getHeader());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Message message0 = MessageFactory.createConnectionDroppedMessage(0, "m|ggzo{I9,~c}~|/1#");
      boolean boolean0 = message0.delivered();
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
      assertFalse(boolean0);
      assertEquals("*", message0.getRecipient());
      assertEquals("DROPPED", message0.getHeader());
      assertEquals(3000L, message0.getTTL());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Message message0 = new Message();
      message0.setDelivered(true);
      boolean boolean0 = message0.delivered();
      assertEquals(4, message0.getState());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Message message0 = new Message();
      message0.setDelivered(false);
      assertEquals(0, message0.getState());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Message message0 = new Message((String) null, (Object) null);
      Object object0 = message0.getBody();
      assertEquals(3000L, message0.getTTL());
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Message message0 = MessageFactory.createUnloadMessage("e*vT`n,*00");
      Object object0 = message0.getBody();
      assertEquals("*", message0.getRecipient());
      assertEquals("UNLOAD e*vT`n,*00", object0);
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
      assertEquals(3000L, message0.getTTL());
      assertEquals("KERNEL", message0.getHeader());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Integer integer0 = JLayeredPane.MODAL_LAYER;
      Message message0 = new Message((String) null, integer0);
      String string0 = message0.getHeader();
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
      assertEquals(3000L, message0.getTTL());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Message message0 = MessageFactory.createConnectionDroppedMessage(0, "m|ggzo{I9,~c}~|/1#");
      String string0 = message0.getHeader();
      assertEquals("DROPPED", string0);
      assertEquals(3000L, message0.getTTL());
      assertEquals("*", message0.getRecipient());
      assertNotNull(string0);
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Message message0 = new Message("g", "g", (Object) null);
      long long0 = message0.getTTL();
      assertEquals(3000L, long0);
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
      assertEquals("g", message0.getHeader());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Message message0 = new Message((String) null, (Object) null);
      message0.setRecipient("_CLIENT_CON_IGNORED");
      assertEquals("_CLIENT_CON_IGNORED", message0.getRecipient());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JTable.PrintMode jTable_PrintMode0 = JTable.PrintMode.NORMAL;
      Message message0 = MessageFactory.createMessage("", "", (Object) jTable_PrintMode0);
      String string0 = message0.getRecipient();
      assertNotNull(string0);
      assertEquals(3000L, message0.getTTL());
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Integer integer0 = JLayeredPane.MODAL_LAYER;
      Message message0 = new Message((String) null, integer0);
      // Undeclared exception!
      try { 
        message0.send((Module) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("module.Message", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Message message0 = MessageFactory.createConnectionDroppedMessage(0, "m|ggzo{I9,~c}~|/1#");
      long long0 = message0.getID();
      assertEquals(0L, long0);
      assertEquals("*", message0.getRecipient());
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
      assertEquals(3000L, message0.getTTL());
      assertEquals("DROPPED", message0.getHeader());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Message message0 = MessageFactory.createConnectionDroppedMessage(0, "m|ggzo{I9,~c}~|/1#");
      message0.setSender("");
      String string0 = message0.getSender();
      assertEquals("", string0);
      assertEquals("*", message0.getRecipient());
      assertEquals("DROPPED", message0.getHeader());
      assertEquals(3000L, message0.getTTL());
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Message message0 = new Message();
      // Undeclared exception!
      try { 
        message0.sendTo((Module) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("module.Message", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Message message0 = MessageFactory.createMessage("j8K:+' \"SQ", (Object) "j8K:+' \"SQ");
      long long0 = message0.getSID();
      assertEquals("j8K:+' \"SQ", message0.getHeader());
      assertEquals(3000L, message0.getTTL());
      assertEquals(1, message0.getState());
      assertEquals(0L, long0);
      assertEquals("*", message0.getRecipient());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Message message0 = MessageFactory.createConnectionDroppedMessage(0, "m|ggzo{I9,~c}~|/1#");
      int int0 = message0.getState();
      assertEquals(0L, message0.getSID());
      assertEquals("DROPPED", message0.getHeader());
      assertEquals(3000L, message0.getTTL());
      assertEquals(1, int0);
      assertEquals("*", message0.getRecipient());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Message message0 = MessageFactory.createConnectionDroppedMessage(0, "m|ggzo{I9,~c}~|/1#");
      String string0 = message0.getSender();
      assertEquals("*", message0.getRecipient());
      assertEquals("DROPPED", message0.getHeader());
      assertEquals(3000L, message0.getTTL());
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Object object0 = new Object();
      Message message0 = MessageFactory.createMessage((String) null, "", object0);
      long long0 = message0.getTimeStamp();
      assertEquals(1392409281320L, long0);
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
      assertEquals(3000L, message0.getTTL());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Message message0 = new Message();
      Kernel kernel0 = new Kernel();
      try { 
        message0.sendFrom(kernel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.NullPointerException
         //
         verifyException("module.Kernel", e);
      }
  }
}