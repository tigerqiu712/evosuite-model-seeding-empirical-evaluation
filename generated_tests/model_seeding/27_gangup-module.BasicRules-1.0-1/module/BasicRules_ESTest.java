/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 09:47:31 GMT 2019
 */

package module;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import module.BasicRules;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import state.Action;
import state.GameState;
import state.Party;
import state.Player;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasicRules_ESTest extends BasicRules_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicRules basicRules0 = new BasicRules();
      GameState gameState0 = new GameState();
      gameState0.setGameState((-112));
      Player player0 = new Player(1, ">XH;SKU#sU^s|4!LR/", 1);
      gameState0.addPlayer(player0);
      Action action0 = new Action();
      action0.set(2, 1, 1, (byte)109, (byte)18, (byte)82);
      boolean boolean0 = basicRules0.checkRules(action0, gameState0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicRules basicRules0 = new BasicRules();
      Action action0 = new Action();
      // Undeclared exception!
      try { 
        basicRules0.checkRules(action0, (GameState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("module.BasicRules", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicRules basicRules0 = new BasicRules();
      GameState gameState0 = new GameState();
      gameState0.setGameState(2);
      Player player0 = new Player(1);
      Action action0 = new Action(2, 1, 1);
      gameState0.addPlayer(player0);
      boolean boolean0 = basicRules0.checkRules(action0, gameState0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicRules basicRules0 = new BasicRules();
      GameState gameState0 = new GameState();
      gameState0.setGameState(4);
      Player player0 = new Player(3, "t<", "t<", 4);
      player0.boss = (Party) player0;
      Action action0 = new Action(1, 3, 128);
      gameState0.addPlayer(player0);
      boolean boolean0 = basicRules0.checkRules(action0, gameState0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BasicRules basicRules0 = new BasicRules();
      GameState gameState0 = new GameState();
      gameState0.setGameState(3);
      Player player0 = new Player(1);
      Action action0 = new Action(128, 1, 1);
      gameState0.addPlayer(player0);
      boolean boolean0 = basicRules0.checkRules(action0, gameState0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicRules basicRules0 = new BasicRules();
      GameState gameState0 = new GameState();
      gameState0.setGameState(3);
      Player player0 = new Player(1);
      Action action0 = new Action(8, 1, 1);
      gameState0.addPlayer(player0);
      boolean boolean0 = basicRules0.checkRules(action0, gameState0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicRules basicRules0 = new BasicRules();
      GameState gameState0 = new GameState();
      gameState0.setGameState(3);
      Player player0 = new Player(1);
      Action action0 = new Action(6, 1, 1);
      gameState0.addPlayer(player0);
      boolean boolean0 = basicRules0.checkRules(action0, gameState0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicRules basicRules0 = new BasicRules();
      GameState gameState0 = new GameState();
      gameState0.setGameState(3);
      Player player0 = new Player(1);
      Action action0 = new Action(5, 1, 1);
      gameState0.addPlayer(player0);
      boolean boolean0 = basicRules0.checkRules(action0, gameState0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasicRules basicRules0 = new BasicRules();
      GameState gameState0 = new GameState();
      gameState0.setGameState(3);
      Player player0 = new Player(1);
      Action action0 = new Action(4, 1, 1);
      gameState0.addPlayer(player0);
      boolean boolean0 = basicRules0.checkRules(action0, gameState0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicRules basicRules0 = new BasicRules();
      GameState gameState0 = new GameState();
      gameState0.setGameState(3);
      Player player0 = new Player(1);
      Action action0 = new Action(3, 1, 1);
      gameState0.addPlayer(player0);
      boolean boolean0 = basicRules0.checkRules(action0, gameState0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicRules basicRules0 = new BasicRules();
      GameState gameState0 = new GameState();
      gameState0.setGameState(3);
      Player player0 = new Player(1);
      Action action0 = new Action(0, 1, 1);
      gameState0.addPlayer(player0);
      boolean boolean0 = basicRules0.checkRules(action0, gameState0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BasicRules basicRules0 = new BasicRules();
      GameState gameState0 = new GameState();
      gameState0.setGameState(3);
      Player player0 = new Player(1);
      Action action0 = new Action(2, 1, 1);
      gameState0.addPlayer(player0);
      boolean boolean0 = basicRules0.checkRules(action0, gameState0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BasicRules basicRules0 = new BasicRules();
      GameState gameState0 = new GameState();
      gameState0.setGameState(3);
      Player player0 = new Player(1);
      Action action0 = new Action(7, 1, 4);
      gameState0.addPlayer(player0);
      boolean boolean0 = basicRules0.checkRules(action0, gameState0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasicRules basicRules0 = new BasicRules();
      GameState gameState0 = new GameState();
      gameState0.setGameState(3);
      Player player0 = new Player(1);
      Action action0 = new Action(1, 1, 1);
      gameState0.addPlayer(player0);
      boolean boolean0 = basicRules0.checkRules(action0, gameState0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BasicRules basicRules0 = new BasicRules();
      GameState gameState0 = new GameState();
      gameState0.setGameState(4);
      Player player0 = new Player(3, "kd<x>", "kd<x>", 4);
      player0.setDead((-56L), false);
      gameState0.addPlayer(player0);
      Action action0 = new Action();
      action0.set((-16), 3, 2, (byte)48, (byte)10, (byte)28);
      boolean boolean0 = basicRules0.checkRules(action0, gameState0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BasicRules basicRules0 = new BasicRules();
      GameState gameState0 = new GameState();
      gameState0.setGameState(4);
      Player player0 = new Player(3, "kd<x>", "kd<x>", 4);
      gameState0.addPlayer(player0);
      Action action0 = new Action();
      action0.set((-16), 3, 2, (byte)48, (byte)10, (byte)28);
      boolean boolean0 = basicRules0.checkRules(action0, gameState0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BasicRules basicRules0 = new BasicRules();
      GameState gameState0 = new GameState();
      Action action0 = new Action();
      boolean boolean0 = basicRules0.checkRules(action0, gameState0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BasicRules basicRules0 = new BasicRules();
      GameState gameState0 = new GameState();
      gameState0.setGameState(4);
      Action action0 = new Action();
      boolean boolean0 = basicRules0.checkRules(action0, gameState0);
      assertFalse(boolean0);
  }
}