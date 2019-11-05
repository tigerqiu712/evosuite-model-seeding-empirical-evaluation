/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 00:23:32 GMT 2019
 */

package net.virtualinfinity.atrobots.arena;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.virtualinfinity.atrobots.arena.Explosion;
import net.virtualinfinity.atrobots.arena.LinearDamageFunction;
import net.virtualinfinity.atrobots.arena.Position;
import net.virtualinfinity.atrobots.arenaobjects.ArenaObject;
import net.virtualinfinity.atrobots.measures.AbsoluteAngle;
import net.virtualinfinity.atrobots.measures.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinearDamageFunction_ESTest extends LinearDamageFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vector vector0 = Vector.createCartesian(0.0, 0.0);
      Explosion explosion0 = new Explosion(vector0, (-4526.9));
      Position position0 = explosion0.getPosition();
      LinearDamageFunction linearDamageFunction0 = new LinearDamageFunction(position0, (-1891.83851056), 0.0);
      double double0 = linearDamageFunction0.getRadius();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector vector0 = Vector.createCartesian(0.0, 0.0);
      Explosion explosion0 = new Explosion(vector0, (-4526.9));
      Position position0 = explosion0.getPosition();
      LinearDamageFunction linearDamageFunction0 = new LinearDamageFunction(position0, 1863.9305273369, 1863.9305273369);
      double double0 = linearDamageFunction0.getRadius();
      assertEquals(1863.9305273369, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Position position0 = Position.random((-1093.2991665294721), 0.5, (-1093.2991665294721), 0.04);
      AbsoluteAngle absoluteAngle0 = AbsoluteAngle.fromRadians(1.0);
      Vector vector0 = Vector.createPolar(absoluteAngle0, (-984));
      Explosion explosion0 = new Explosion(vector0, 0.0);
      LinearDamageFunction linearDamageFunction0 = new LinearDamageFunction(position0, 1.0, 44.23992897);
      double double0 = linearDamageFunction0.getDamageAmount(explosion0);
      assertEquals(44.23992897, linearDamageFunction0.getRadius(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Vector vector0 = Vector.createCartesian(0.0, 0.0);
      Explosion explosion0 = new Explosion(vector0, (-4526.9));
      Position position0 = explosion0.getPosition();
      LinearDamageFunction linearDamageFunction0 = new LinearDamageFunction(position0, (-243.1066638), (-2650.700511));
      double double0 = linearDamageFunction0.getDamageAmount(explosion0);
      assertEquals(644402.9579621652, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Position position0 = new Position();
      LinearDamageFunction linearDamageFunction0 = new LinearDamageFunction(position0, (-1.0), (-1.0));
      linearDamageFunction0.getCenter();
      assertEquals((-1.0), linearDamageFunction0.getRadius(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Vector vector0 = Vector.createCartesian(0.0, 0.0);
      Explosion explosion0 = new Explosion(vector0, (-4526.9));
      Position position0 = explosion0.getPosition();
      LinearDamageFunction linearDamageFunction0 = new LinearDamageFunction(position0, 1863.9305273369, 1863.9305273369);
      linearDamageFunction0.getCenter();
      assertEquals(1863.9305273369, linearDamageFunction0.getRadius(), 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LinearDamageFunction linearDamageFunction0 = new LinearDamageFunction((Position) null, 1.3, 1.3);
      // Undeclared exception!
      try { 
        linearDamageFunction0.getDamageAmount((ArenaObject) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.arena.LinearDamageFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LinearDamageFunction linearDamageFunction0 = new LinearDamageFunction((Position) null, (-1196), (-1196));
      // Undeclared exception!
      try { 
        linearDamageFunction0.getCenter();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.arena.LinearDamageFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Position position0 = new Position();
      LinearDamageFunction linearDamageFunction0 = new LinearDamageFunction(position0, (-1.0), (-1.0));
      double double0 = linearDamageFunction0.getRadius();
      assertEquals((-1.0), double0, 0.01);
  }
}