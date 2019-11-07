/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 17:27:37 GMT 2019
 */

package module;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import module.Kernel;
import module.Message;
import module.MessageFactory;
import module.Module;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;
import state.Action;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Message_ESTest extends Message_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Message message0 = new Message();
      message0.messageID = 3642L;
      try { 
        message0.send();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // modnull,msg=Message[id=3642,session=0,head=null,recip=null,sender=null,state=0,ttl=0,time=0,body=null]: no source module
         //
         verifyException("module.Message", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Message message0 = new Message("", "");
      message0.setDelivered(false);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Message message0 = new Message("_GAMEEND_MESSAGE", "_GAMEEND_MESSAGE", "_GAMEEND_MESSAGE");
      message0.setDelivered(true);
      message0.setDelivered(true);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Message message0 = MessageFactory.createWarningMessage("module.Message", (Object[]) null);
      Object object0 = new Object();
      message0.set("", "", object0);
      assertEquals(1L, message0.getID());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Message message0 = MessageFactory.createConnectionDroppedMessage((-5), "?#%");
      Kernel kernel0 = new Kernel();
      message0.sendTo(kernel0);
      assertEquals("DROPPED", message0.getHeader());
      assertEquals("*", message0.getRecipient());
      assertEquals(3000L, message0.getTTL());
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Message message0 = new Message();
      System.setCurrentTimeMillis(0);
      Action action0 = new Action(1, 1, (byte)67, (byte)0, (byte)67);
      message0.reply(action0);
      assertEquals(1, action0.getRefCount());
      assertFalse(action0.getIsConsumed());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Message message0 = new Message("", "");
      assertEquals(0L, message0.getSID());
      
      message0.sessionID = 433L;
      Message message1 = message0.reply("");
      assertEquals(1L, message1.getID());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Message message0 = new Message("}eJE$QuGf}Ph>tm3", "}eJE$QuGf}Ph>tm3");
      assertEquals(0L, message0.getSID());
      
      message0.sessionID = (-5080L);
      message0.reply(message0.body);
      assertEquals("}eJE$QuGf}Ph>tm3", message0.getHeader());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Message message0 = new Message();
      long long0 = message0.getTimeStamp();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      System.setCurrentTimeMillis((-2694L));
      Message message0 = new Message("_GUI_MENU_DISCONNECT", "_GUI_MENU_DISCONNECT");
      long long0 = message0.getTimeStamp();
      assertEquals("*", message0.getRecipient());
      assertEquals("_GUI_MENU_DISCONNECT", message0.getHeader());
      assertEquals((-2694L), long0);
      assertEquals(3000L, message0.getTTL());
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Message message0 = new Message();
      long long0 = message0.getTTL();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Message message0 = MessageFactory.createMessage("$PYZz ", (Object) "$PYZz ");
      int int0 = message0.getState();
      assertEquals("*", message0.getRecipient());
      assertEquals("$PYZz ", message0.getHeader());
      assertEquals(1, int0);
      assertEquals(3000L, message0.getTTL());
      assertEquals(0L, message0.getSID());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Message message0 = new Message();
      message0.state = (-903);
      int int0 = message0.getState();
      assertEquals((-903), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      Message message0 = MessageFactory.createWarningMessage("message", objectArray0);
      message0.sender = "Message[id=0,session=-1,head=WARNING,recip=*,sender=null,state=1,ttl=3000,time=0,body=Reading string from locale failed: key=message\nThis probably means that you have an old or otherwise\ninaccurate locale file (maybe it's missing altogether)\nor that the classpath does not contain the directory.]";
      String string0 = message0.getSender();
      assertEquals(0L, message0.getSID());
      assertEquals("*", message0.getRecipient());
      assertEquals(1, message0.getState());
      assertEquals("WARNING", message0.getHeader());
      assertEquals(3000L, message0.getTTL());
      assertEquals("Message[id=0,session=-1,head=WARNING,recip=*,sender=null,state=1,ttl=3000,time=0,body=Reading string from locale failed: key=message\nThis probably means that you have an old or otherwise\ninaccurate locale file (maybe it's missing altogether)\nor that the classpath does not contain the directory.]", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Message message0 = MessageFactory.createErrorMessage("", (Object[]) null);
      message0.setSender("");
      String string0 = message0.getSender();
      assertEquals("ERROR", message0.getHeader());
      assertEquals("*", message0.getRecipient());
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
      assertNotNull(string0);
      assertEquals(3000L, message0.getTTL());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      MessageFactory.createMessage("", "\u0003@9iyu:", (Object) "\u0003@9iyu:");
      Message message0 = MessageFactory.createErrorMessage((String) null, objectArray0);
      long long0 = message0.getSID();
      assertEquals(1, message0.getState());
      assertEquals("ERROR", message0.getHeader());
      assertEquals(3000L, message0.getTTL());
      assertEquals(1L, long0);
      assertEquals("*", message0.getRecipient());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Message message0 = new Message();
      message0.sessionID = (-1252L);
      long long0 = message0.getSID();
      assertEquals((-1252L), long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Message message0 = new Message();
      message0.setRecipient("Qd");
      String string0 = message0.getRecipient();
      assertEquals("Qd", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MessageFactory messageFactory0 = MessageFactory.getInstance();
      Message message0 = messageFactory0.createObject();
      message0.setRecipient("");
      String string0 = message0.getRecipient();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Message message0 = new Message("", "", "_GAMEEND_MESSAGE");
      Message message1 = message0.reply("Y,=;*tFtE");
      long long0 = message1.getID();
      assertEquals(3000L, message1.getTTL());
      assertEquals(0L, message1.getSID());
      assertEquals(1, message1.getState());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Message message0 = MessageFactory.createConnectionDroppedMessage((-2694), "(Zx(Pi");
      message0.messageID = (-1722L);
      long long0 = message0.getID();
      assertEquals((-1722L), long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Message message0 = new Message();
      Message message1 = message0.clone();
      assertEquals(0, message1.getRefCount());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
      Message message0 = new Message();
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
  public void test24()  throws Throwable  {
      MessageFactory messageFactory0 = MessageFactory.getInstance();
      Message message0 = messageFactory0.createObject();
      Action action0 = new Action(1, (-587), (byte)1, (byte)1, (byte)1);
      message0.setBody(action0);
      message0.consume();
      assertTrue(message0.getIsManaged());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Message message0 = new Message();
      Object object0 = new Object();
      message0.setBody(object0);
      assertTrue(message0.getIsConsumed());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MessageFactory messageFactory0 = MessageFactory.getInstance();
      Message message0 = new Message(messageFactory0);
      assertEquals(0L, message0.getSID());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      Message message0 = MessageFactory.createWarningMessage("message", objectArray0);
      String string0 = message0.toString();
      assertEquals("Message[id=0,session=0,head=WARNING,recip=*,sender=null,state=1,ttl=3000,time=1392409281320,body=Reading string from locale failed: key=message\nThis probably means that you have an old or otherwise\ninaccurate locale file (maybe it's missing altogether)\nor that the classpath does not contain the directory.]", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Message message0 = new Message();
      Message message1 = message0.reply(message0);
      assertEquals(1, message0.getRefCount());
      
      message1.consume();
      assertEquals(3000L, message1.getTTL());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MessageFactory messageFactory0 = MessageFactory.getInstance();
      Message message0 = messageFactory0.createMessage();
      assertEquals(1, message0.getState());
      
      message0.state = (-1321);
      boolean boolean0 = message0.received();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      Message message0 = MessageFactory.createWarningMessage("message", objectArray0);
      boolean boolean0 = message0.received();
      assertEquals("*", message0.getRecipient());
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
      assertEquals(3000L, message0.getTTL());
      assertFalse(boolean0);
      assertEquals("WARNING", message0.getHeader());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Message message0 = new Message();
      assertFalse(message0.delivered());
      
      message0.state = (-10);
      boolean boolean0 = message0.delivered();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Message message0 = new Message(",", ",");
      boolean boolean0 = message0.delivered();
      assertEquals(3000L, message0.getTTL());
      assertEquals(",", message0.getHeader());
      assertEquals("*", message0.getRecipient());
      assertFalse(boolean0);
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Message message0 = new Message();
      message0.setDelivered(false);
      assertEquals(0, message0.getState());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Message message0 = new Message();
      Object object0 = message0.getBody();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Message message0 = MessageFactory.createMessage("", "", (Object) "");
      message0.getBody();
      assertEquals(3000L, message0.getTTL());
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      Message message0 = MessageFactory.createWarningMessage("message", objectArray0);
      Message message1 = message0.clone();
      message1.getHeader();
      assertEquals("WARNING", message0.getHeader());
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
      assertEquals(3000L, message0.getTTL());
      assertEquals("*", message0.getRecipient());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Message message0 = MessageFactory.createMessage("5StfB|X:T14p%t+", (Object) "5StfB|X:T14p%t+");
      String string0 = message0.getHeader();
      assertEquals(3000L, message0.getTTL());
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
      assertEquals("*", message0.getRecipient());
      assertNotNull(string0);
      assertEquals("5StfB|X:T14p%t+", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MessageFactory messageFactory0 = MessageFactory.getInstance();
      Message message0 = messageFactory0.createMessage();
      long long0 = message0.getTTL();
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
      assertEquals(3000L, long0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Message message0 = new Message();
      String string0 = message0.getRecipient();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Message message0 = MessageFactory.createConnectionDroppedMessage(2, "?#%");
      Kernel kernel0 = new Kernel();
      try { 
        message0.send((Module) kernel0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: modnull,msg=Message[id=0,session=0,head=DROPPED,recip=*,sender=null,state=1,ttl=3000,time=1392409281320,body=ID: 2 IP: ?#%]
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Message message0 = new Message("_GAMEEND_MESSAGE", "_GAMEEND_MESSAGE", "_GAMEEND_MESSAGE");
      assertEquals("_GAMEEND_MESSAGE", message0.getHeader());
      
      message0.setHeader("");
      assertEquals("", message0.getHeader());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Message message0 = MessageFactory.createConnectionDroppedMessage((-2694), "(Zx(Pi");
      long long0 = message0.getID();
      assertEquals(0L, long0);
      assertEquals("DROPPED", message0.getHeader());
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
      assertEquals(3000L, message0.getTTL());
      assertEquals("*", message0.getRecipient());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
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
  public void test44()  throws Throwable  {
      Message message0 = new Message();
      long long0 = message0.getSID();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Message message0 = new Message();
      int int0 = message0.getState();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      Message message0 = MessageFactory.createWarningMessage("message", objectArray0);
      String string0 = message0.getSender();
      assertEquals("*", message0.getRecipient());
      assertEquals(0L, message0.getSID());
      assertNull(string0);
      assertEquals(1, message0.getState());
      assertEquals(3000L, message0.getTTL());
      assertEquals("WARNING", message0.getHeader());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Message message0 = new Message("_GUI_MENU_DISCONNECT", "_GUI_MENU_DISCONNECT");
      long long0 = message0.getTimeStamp();
      assertEquals("*", message0.getRecipient());
      assertEquals("_GUI_MENU_DISCONNECT", message0.getHeader());
      assertEquals(1392409281320L, long0);
      assertEquals(0L, message0.getSID());
      assertEquals(1, message0.getState());
      assertEquals(3000L, message0.getTTL());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
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
