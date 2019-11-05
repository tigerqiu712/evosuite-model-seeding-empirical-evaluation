/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 22:46:42 GMT 2019
 */

package net.virtualinfinity.atrobots.arena;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.virtualinfinity.atrobots.arena.FrameBuilder;
import net.virtualinfinity.atrobots.snapshots.ArenaObjectSnapshot;
import net.virtualinfinity.atrobots.snapshots.RobotSnapshot;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FrameBuilder_ESTest extends FrameBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FrameBuilder frameBuilder0 = new FrameBuilder();
      frameBuilder0.beginFrame(true);
      RobotSnapshot robotSnapshot0 = new RobotSnapshot();
      frameBuilder0.addObject(robotSnapshot0);
      assertEquals(0, robotSnapshot0.getTotalDeaths());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FrameBuilder frameBuilder0 = new FrameBuilder();
      frameBuilder0.endFrame();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FrameBuilder frameBuilder0 = new FrameBuilder();
      // Undeclared exception!
      try { 
        frameBuilder0.addObject((ArenaObjectSnapshot) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.arena.FrameBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FrameBuilder frameBuilder0 = new FrameBuilder();
      frameBuilder0.beginFrame(false);
      frameBuilder0.endFrame();
  }
}