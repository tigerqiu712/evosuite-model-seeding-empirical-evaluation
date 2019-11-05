/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 19:04:12 GMT 2019
 */

package com.eteks.sweethome3d.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.eteks.sweethome3d.model.Camera;
import com.eteks.sweethome3d.model.CatalogDoorOrWindow;
import com.eteks.sweethome3d.model.CatalogLight;
import com.eteks.sweethome3d.model.CollectionListener;
import com.eteks.sweethome3d.model.Compass;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.model.DimensionLine;
import com.eteks.sweethome3d.model.Home;
import com.eteks.sweethome3d.model.HomeDoorOrWindow;
import com.eteks.sweethome3d.model.HomeFurnitureGroup;
import com.eteks.sweethome3d.model.HomeLight;
import com.eteks.sweethome3d.model.HomePieceOfFurniture;
import com.eteks.sweethome3d.model.HomePrint;
import com.eteks.sweethome3d.model.Label;
import com.eteks.sweethome3d.model.Level;
import com.eteks.sweethome3d.model.LightSource;
import com.eteks.sweethome3d.model.ObserverCamera;
import com.eteks.sweethome3d.model.Room;
import com.eteks.sweethome3d.model.Sash;
import com.eteks.sweethome3d.model.Selectable;
import com.eteks.sweethome3d.model.Wall;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Home_ESTest extends Home_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Wall wall0 = new Wall(1500.0F, 1500.0F, 1500.0F, (-5369.324F), 20.966667F, 20.966667F);
      Home home0 = new Home(1500.0F);
      home0.addWall(wall0);
      Wall wall1 = new Wall(0.0F, (-5369.324F), (-5369.324F), (-2171.1118F), 1500.0F, 3700L);
      home0.deleteWall(wall1);
      assertEquals(1500.0F, home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Home home0 = new Home((-4035.0F));
      float[][] floatArray0 = new float[5][8];
      Room room0 = new Room(floatArray0);
      home0.addRoom(room0, 0);
      assertEquals((-4035.0F), home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Home home0 = new Home((-350.8979F));
      home0.setName("PRINT");
      home0.setName("PRINT");
      assertEquals((-350.8979F), home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Home home0 = new Home(0.0F);
      Label label0 = new Label("", 3700L, 0.0F);
      home0.deleteLabel(label0);
      assertEquals(0.0F, home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Home home0 = new Home();
      LightSource[] lightSourceArray0 = new LightSource[6];
      float[][] floatArray0 = new float[6][1];
      float[] floatArray1 = new float[9];
      floatArray0[0] = floatArray1;
      floatArray0[1] = floatArray0[0];
      floatArray0[2] = floatArray1;
      CatalogLight catalogLight0 = new CatalogLight("(CUR^,Y*\"u'0b", "9mf", "", (Content) null, (Content) null, (Content) null, 0.0F, 983.223F, 3700L, 101.7F, false, lightSourceArray0, "9mf", floatArray0, "", false, false, true, (BigDecimal) null, (BigDecimal) null, "9mf");
      HomeLight homeLight0 = new HomeLight(catalogLight0);
      home0.addPieceOfFurniture((HomePieceOfFurniture) homeLight0);
      assertEquals(250.0F, home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Home home0 = new Home((-26.8167F));
      Level level0 = new Level("U2fu2L|1aY*", 0.0F, (-694.0F), 0.0F);
      home0.addLevel(level0);
      assertEquals((-26.8167F), home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Home home0 = new Home();
      Label label0 = new Label((String) null, (-1742.2681F), (-1742.2681F));
      home0.addLabel(label0);
      assertEquals(250.0F, home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Home home0 = new Home();
      home0.setRecovered(true);
      boolean boolean0 = home0.isRecovered();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Home home0 = new Home();
      home0.setModified(true);
      boolean boolean0 = home0.isModified();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Home home0 = new Home();
      home0.setBasePlanLocked(true);
      boolean boolean0 = home0.isBasePlanLocked();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Home home0 = new Home((-350.8979F));
      List<HomePieceOfFurniture> list0 = home0.getFurniture();
      Home.getWallsSubList(list0);
      assertEquals((-350.8979F), home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Home home0 = new Home(0.0F);
      float float0 = home0.getWallHeight();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Home home0 = new Home((-1209.2245F));
      float float0 = home0.getWallHeight();
      assertEquals((-1209.2245F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      LinkedList<HomePieceOfFurniture> linkedList0 = new LinkedList<HomePieceOfFurniture>();
      Home home0 = new Home(linkedList0);
      home0.getObserverCamera();
      assertEquals(250.0F, home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Home home0 = new Home((-350.8979F));
      home0.setName("PRINT");
      String string0 = home0.getName();
      assertEquals((-350.8979F), home0.getWallHeight(), 0.01F);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Home home0 = new Home();
      List<HomePieceOfFurniture> list0 = home0.getFurniture();
      List<Room> list1 = Home.getRoomsSubList(list0);
      Home.getLevelsSubList(list1);
      assertEquals(250.0F, home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Home home0 = new Home();
      HomePieceOfFurniture.SortableProperty homePieceOfFurniture_SortableProperty0 = HomePieceOfFurniture.SortableProperty.HEIGHT;
      home0.setFurnitureSortedProperty(homePieceOfFurniture_SortableProperty0);
      home0.getFurnitureSortedProperty();
      assertEquals(250.0F, home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<HomeLight> linkedList0 = new LinkedList<HomeLight>();
      List<DimensionLine> list0 = Home.getDimensionLinesSubList(linkedList0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<DimensionLine> linkedList0 = new LinkedList<DimensionLine>();
      DimensionLine dimensionLine0 = new DimensionLine(92.791664F, 4075.3142F, 3700L, (-696.7856F), 0.0F);
      linkedList0.add(dimensionLine0);
      List<DimensionLine> list0 = Home.getDimensionLinesSubList(linkedList0);
      assertTrue(list0.contains(dimensionLine0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      System.setCurrentTimeMillis((-889L));
      LinkedList<Label> linkedList0 = new LinkedList<Label>();
      List<HomePieceOfFurniture> list0 = Home.getFurnitureSubList(linkedList0);
      Home home0 = new Home(list0);
      Camera camera0 = home0.getCamera();
      assertEquals(250.0F, home0.getWallHeight(), 0.01F);
      assertNotNull(camera0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Home home0 = new Home();
      ObserverCamera observerCamera0 = new ObserverCamera(3700L, 3700L, 3700L, (-0.0333333F), (-0.0333333F), 0.0F);
      home0.setCamera(observerCamera0);
      home0.getCamera();
      assertEquals(250.0F, home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Home home0 = new Home();
      float[][] floatArray0 = new float[3][7];
      Room room0 = new Room(floatArray0);
      home0.addRoom(room0);
      List<Room> list0 = home0.getRooms();
      List<Selectable> list1 = Home.duplicate(list0);
      assertEquals(1, list1.size());
      assertEquals(250.0F, home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Home home0 = new Home(1500.0F);
      home0.setRecovered(true);
      home0.clone();
      assertTrue(home0.isRecovered());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Home home0 = new Home();
      home0.setModified(true);
      home0.clone();
      assertTrue(home0.isModified());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Home home0 = new Home();
      home0.setFurnitureDescendingSorted(true);
      home0.clone();
      assertTrue(home0.isFurnitureDescendingSorted());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Home home0 = new Home();
      home0.setBasePlanLocked(true);
      home0.clone();
      assertTrue(home0.isBasePlanLocked());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Home home0 = new Home(0.0F);
      Home home1 = home0.clone();
      assertEquals(0.0F, home1.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Home home0 = new Home((-379.90915F));
      Home home1 = home0.clone();
      assertEquals((-379.90915F), home1.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Home home0 = new Home();
      // Undeclared exception!
      try { 
        home0.setSelectedItems((List<? extends Selectable>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<HomeFurnitureGroup> class0 = HomeFurnitureGroup.class;
      // Undeclared exception!
      try { 
        Home.getSubList((List<? extends Selectable>) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.model.Home", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        Home.getRoomsSubList((List<? extends Selectable>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.model.Home", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        Home.getLabelsSubList((List<? extends Selectable>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.model.Home", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        Home.getFurnitureSubList((List<? extends Selectable>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.model.Home", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Home home0 = new Home();
      // Undeclared exception!
      try { 
        home0.deleteWall((Wall) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.model.Home", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Home home0 = new Home();
      // Undeclared exception!
      try { 
        home0.deleteDimensionLine((DimensionLine) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.model.Home", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Home home0 = new Home();
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>();
      linkedList0.add((Camera) null);
      home0.setStoredCameras(linkedList0);
      // Undeclared exception!
      try { 
        home0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.model.Home", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Home home0 = new Home();
      // Undeclared exception!
      try { 
        home0.addWall((Wall) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.model.Home", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Home home0 = new Home();
      // Undeclared exception!
      try { 
        home0.addRoom((Room) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.model.Home", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Home home0 = new Home();
      Sash[] sashArray0 = new Sash[0];
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      CatalogDoorOrWindow catalogDoorOrWindow0 = new CatalogDoorOrWindow("", "", "", (Content) null, (Content) null, (Content) null, 44.81861F, (-16.8724F), 3624.251F, 0.0F, true, 1500.0F, 0.0F, sashArray0, (float[][]) null, "", true, false, false, bigDecimal0, bigDecimal0);
      HomeDoorOrWindow homeDoorOrWindow0 = new HomeDoorOrWindow(catalogDoorOrWindow0);
      // Undeclared exception!
      try { 
        home0.addPieceOfFurniture((HomePieceOfFurniture) homeDoorOrWindow0, 4);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Home home0 = new Home();
      // Undeclared exception!
      try { 
        home0.addDimensionLine((DimensionLine) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.model.Home", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Home home0 = null;
      try {
        home0 = new Home((List<HomePieceOfFurniture>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedList<HomeLight> linkedList0 = new LinkedList<HomeLight>();
      linkedList0.add((HomeLight) null);
      Class<Label> class0 = Label.class;
      List<Label> list0 = Home.getSubList((List<? extends Selectable>) linkedList0, class0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedList<Label> linkedList0 = new LinkedList<Label>();
      List<HomePieceOfFurniture> list0 = Home.getFurnitureSubList(linkedList0);
      Home home0 = new Home(list0);
      Compass compass0 = home0.getCompass();
      home0.deselectItem(compass0);
      assertEquals(250.0F, home0.getWallHeight(), 0.01F);
      assertTrue(compass0.isVisible());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        Home.getWallsSubList((List<? extends Selectable>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.model.Home", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Home home0 = new Home();
      home0.getSelectedItems();
      assertEquals(250.0F, home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Home home0 = new Home();
      // Undeclared exception!
      try { 
        home0.addRoom((Room) null, (-2));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -2, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Home home0 = new Home();
      home0.addLevelsListener((CollectionListener<Level>) null);
      assertEquals(250.0F, home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Home home0 = new Home();
      // Undeclared exception!
      try { 
        home0.addPieceOfFurniture((HomePieceOfFurniture) null, (-861));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.model.Home", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Home home0 = new Home();
      home0.getWalls();
      assertEquals(250.0F, home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Home home0 = new Home();
      home0.getTopCamera();
      assertEquals(250.0F, home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Home home0 = new Home();
      LinkedList<Compass> linkedList0 = new LinkedList<Compass>();
      Compass compass0 = home0.getCompass();
      linkedList0.add(compass0);
      assertTrue(compass0.isVisible());
      assertEquals(250.0F, home0.getWallHeight(), 0.01F);
      
      Class<Compass> class0 = Compass.class;
      List<Compass> list0 = Home.getSubList((List<? extends Selectable>) linkedList0, class0);
      assertTrue(list0.contains(compass0));
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LinkedList<HomeLight> linkedList0 = new LinkedList<HomeLight>();
      linkedList0.add((HomeLight) null);
      // Undeclared exception!
      try { 
        Home.duplicate(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.model.Home", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Home home0 = new Home();
      DimensionLine dimensionLine0 = new DimensionLine(3700L, 3700L, 0.0F, 0.0F, 0.0F);
      home0.addDimensionLine(dimensionLine0);
      Home home1 = home0.clone();
      assertEquals(250.0F, home1.getWallHeight(), 0.01F);
      assertFalse(home1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Home home0 = new Home();
      Wall wall0 = new Wall(3700L, 3700L, 3700L, 3700L, 3700L);
      home0.addWall(wall0);
      Home home1 = home0.clone();
      assertEquals(250.0F, home1.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Home home0 = new Home();
      home0.setBasePlanLocked(true);
      assertTrue(home0.isBasePlanLocked());
      
      home0.setBasePlanLocked(false);
      assertEquals(250.0F, home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Home home0 = new Home();
      home0.setBasePlanLocked(false);
      assertEquals(250.0F, home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Home home0 = new Home();
      HomePrint.PaperOrientation homePrint_PaperOrientation0 = HomePrint.PaperOrientation.PORTRAIT;
      Float float0 = new Float((double) 3700L);
      HomePrint homePrint0 = new HomePrint(homePrint_PaperOrientation0, 0.0F, 0.0F, 3700L, 0.0F, 582.1F, 994.853F, true, true, true, float0, "Db'~>);aJD", "com.eteks.sweethome3d.model.Home");
      home0.setPrint(homePrint0);
      assertEquals(250.0F, home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Home home0 = new Home();
      home0.setPrint((HomePrint) null);
      assertEquals(250.0F, home0.getWallHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Home home0 = new Home();
      // Undeclared exception!
      try { 
        home0.setStoredCameras((List<Camera>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }
}