/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Nov 06 20:58:29 GMT 2019
 */

package net.virtualinfinity.atrobots.arena;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SimulationFrameBuffer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "net.virtualinfinity.atrobots.arena.SimulationFrameBuffer"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.home", "/home/pderakhshanfar"); 
    java.lang.System.setProperty("user.dir", "/home/pderakhshanfar/evosuite-model-seeding-ee/evosuite-model-seeding-empirical-evaluation"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SimulationFrameBuffer_ESTest_scaffolding.class.getClassLoader() ,
      "net.virtualinfinity.atrobots.snapshots.ArenaObjectSnapshot",
      "net.virtualinfinity.atrobots.gui.ArenaPane",
      "net.virtualinfinity.atrobots.gui.renderers.SimpleExplosionRenderer",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane$RobotItem",
      "net.virtualinfinity.atrobots.arena.SimulationFrameBuffer",
      "net.virtualinfinity.atrobots.gui.renderers.RobotRenderer",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane$Bar",
      "net.virtualinfinity.atrobots.measures.Vector",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane$UpdateRobotList$1",
      "net.virtualinfinity.atrobots.measures.AngleBracket$1",
      "net.virtualinfinity.atrobots.measures.Duration",
      "net.virtualinfinity.atrobots.gui.renderers.MissileRenderer",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane$Bar$1",
      "net.virtualinfinity.atrobots.measures.CartesianVector",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane$UpdateRobotList",
      "net.virtualinfinity.atrobots.gui.renderers.ScanRenderer",
      "net.virtualinfinity.atrobots.measures.AbsoluteAngle",
      "net.virtualinfinity.atrobots.snapshots.SnapshotVisitor",
      "net.virtualinfinity.atrobots.gui.renderers.SnapshotRenderer",
      "net.virtualinfinity.atrobots.snapshots.RobotSnapshot",
      "net.virtualinfinity.atrobots.measures.RelativeAngle",
      "net.virtualinfinity.atrobots.arena.SimulationFrame",
      "net.virtualinfinity.atrobots.snapshots.MineSnapshot",
      "net.virtualinfinity.atrobots.measures.Temperature",
      "net.virtualinfinity.atrobots.snapshots.SnapshotAdaptor",
      "net.virtualinfinity.atrobots.gui.ArenaRenderer",
      "net.virtualinfinity.atrobots.snapshots.UnknownSnapshot",
      "net.virtualinfinity.atrobots.measures.AbsoluteAngle$AbsoluateBygreeAngle",
      "net.virtualinfinity.atrobots.gui.ArenaPane$UpdateFrame",
      "net.virtualinfinity.atrobots.snapshots.ScanSnapshot",
      "net.virtualinfinity.atrobots.measures.RelativeAngle$RelativeBygreeAngle",
      "net.virtualinfinity.atrobots.arena.SimulationObserver",
      "net.virtualinfinity.atrobots.arena.SimulationFrame$1",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane$RobotStatusRenderer",
      "net.virtualinfinity.atrobots.measures.PolarVector",
      "net.virtualinfinity.atrobots.snapshots.ExplosionSnapshot",
      "net.virtualinfinity.atrobots.measures.AngleBracket",
      "net.virtualinfinity.atrobots.snapshots.MissileSnapshot",
      "net.virtualinfinity.atrobots.gui.renderers.MineRenderer"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SimulationFrameBuffer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "net.virtualinfinity.atrobots.arena.SimulationFrameBuffer",
      "net.virtualinfinity.atrobots.snapshots.SnapshotAdaptor",
      "net.virtualinfinity.atrobots.arena.SimulationFrame$1",
      "net.virtualinfinity.atrobots.snapshots.MissileSnapshot",
      "net.virtualinfinity.atrobots.gui.ArenaPane",
      "net.virtualinfinity.atrobots.gui.ArenaRenderer",
      "net.virtualinfinity.atrobots.gui.renderers.RobotRenderer",
      "net.virtualinfinity.atrobots.gui.renderers.MissileRenderer",
      "net.virtualinfinity.atrobots.gui.renderers.MineRenderer",
      "net.virtualinfinity.atrobots.gui.renderers.SimpleExplosionRenderer",
      "net.virtualinfinity.atrobots.gui.renderers.ScanRenderer",
      "net.virtualinfinity.atrobots.gui.ArenaPane$UpdateFrame",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane$RobotStatusRenderer",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane$Bar",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane$Bar$1",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane$RobotItem",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane$UpdateRobotList",
      "net.virtualinfinity.atrobots.gui.RobotStatusPane$UpdateRobotList$1",
      "net.virtualinfinity.atrobots.snapshots.ExplosionSnapshot",
      "net.virtualinfinity.atrobots.measures.AbsoluteAngle$AbsoluateBygreeAngle",
      "net.virtualinfinity.atrobots.measures.RelativeAngle$RelativeBygreeAngle",
      "net.virtualinfinity.atrobots.measures.RelativeAngle",
      "net.virtualinfinity.atrobots.measures.AbsoluteAngle",
      "net.virtualinfinity.atrobots.measures.AngleBracket",
      "net.virtualinfinity.atrobots.snapshots.MineSnapshot",
      "net.virtualinfinity.atrobots.measures.CartesianVector",
      "net.virtualinfinity.atrobots.snapshots.UnknownSnapshot",
      "net.virtualinfinity.atrobots.measures.PolarVector",
      "net.virtualinfinity.atrobots.snapshots.ArenaObjectSnapshot",
      "net.virtualinfinity.atrobots.snapshots.RobotSnapshot",
      "net.virtualinfinity.atrobots.arena.SimulationFrame"
    );
  }
}
