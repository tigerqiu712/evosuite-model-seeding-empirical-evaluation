/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Oct 25 11:10:09 GMT 2019
 */

package visu.handball.moves.actions;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class DeleteEventAction_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "visu.handball.moves.actions.DeleteEventAction"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DeleteEventAction_ESTest_scaffolding.class.getClassLoader() ,
      "visu.handball.moves.model.player.Ball",
      "visu.handball.moves.resources.Resources",
      "visu.handball.moves.views.BallDrawer",
      "visu.handball.moves.model.player.MovePoint",
      "visu.handball.moves.Main",
      "visu.handball.moves.views.Field",
      "visu.handball.moves.actions.SetMoveNameAction",
      "visu.handball.moves.model.ColorModelListener",
      "visu.handball.moves.model.ColorModel",
      "visu.handball.moves.model.MoveEvent",
      "visu.handball.moves.views.EventDrawer",
      "visu.handball.moves.model.player.HighlightableItem",
      "visu.handball.moves.views.PlayerToolBar",
      "visu.handball.moves.views.CommentView",
      "visu.handball.moves.model.PlayerRemovedListener",
      "visu.handball.moves.views.DefenderDrawer",
      "visu.handball.moves.model.TableHandballModel",
      "visu.handball.moves.model.PassEvent",
      "visu.handball.moves.model.HandballModelListener",
      "visu.handball.moves.model.player.Player",
      "visu.handball.moves.model.player.Circle",
      "visu.handball.moves.model.animation.Animator",
      "visu.handball.moves.views.FieldDrawer",
      "visu.handball.moves.actions.CloseAction",
      "visu.handball.moves.views.CircleDrawer",
      "visu.handball.moves.actions.DeleteEventAction",
      "visu.handball.moves.model.animation.AnimationModel",
      "visu.handball.moves.model.player.Offender",
      "visu.handball.moves.views.StatusBar",
      "visu.handball.moves.views.OffenderDrawer",
      "visu.handball.moves.views.EventPointDrawer",
      "visu.handball.moves.views.AbstractPlayerDrawer",
      "visu.handball.moves.views.ColoredShape",
      "visu.handball.moves.model.player.Defender",
      "visu.handball.moves.model.HandballModel",
      "visu.handball.moves.actions.AbstractSupportSaveAction",
      "visu.handball.moves.controller.HandballFileFilter",
      "visu.handball.moves.actions.SaveAction",
      "visu.handball.moves.model.HandballModel$State"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("visu.handball.moves.model.MoveEvent", false, DeleteEventAction_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DeleteEventAction_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "visu.handball.moves.actions.DeleteEventAction",
      "visu.handball.moves.Main",
      "visu.handball.moves.model.HandballModel$State",
      "visu.handball.moves.model.player.Player",
      "visu.handball.moves.model.player.Defender",
      "visu.handball.moves.model.player.Offender",
      "visu.handball.moves.model.player.Circle",
      "visu.handball.moves.model.player.Ball",
      "visu.handball.moves.model.ColorModel",
      "visu.handball.moves.views.AbstractPlayerDrawer",
      "visu.handball.moves.views.OffenderDrawer",
      "visu.handball.moves.views.CircleDrawer",
      "visu.handball.moves.views.BallDrawer",
      "visu.handball.moves.resources.Resources",
      "visu.handball.moves.model.player.MovePoint",
      "visu.handball.moves.model.animation.AnimationModel",
      "visu.handball.moves.model.animation.Animator",
      "visu.handball.moves.views.DefenderDrawer",
      "visu.handball.moves.views.Field",
      "visu.handball.moves.views.FieldDrawer",
      "visu.handball.moves.views.ColoredShape",
      "visu.handball.moves.views.EventDrawer",
      "visu.handball.moves.views.EventPointDrawer",
      "visu.handball.moves.model.TableHandballModel",
      "visu.handball.moves.model.HandballModel",
      "visu.handball.moves.model.MoveEvent"
    );
  }
}
