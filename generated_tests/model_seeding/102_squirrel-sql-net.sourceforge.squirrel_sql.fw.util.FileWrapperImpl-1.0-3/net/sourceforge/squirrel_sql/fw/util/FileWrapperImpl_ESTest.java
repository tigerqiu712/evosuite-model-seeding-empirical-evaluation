/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 05 14:05:37 GMT 2019
 */

package net.sourceforge.squirrel_sql.fw.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.io.File;
import java.net.URI;
import net.sourceforge.squirrel_sql.fw.util.FileWrapper;
import net.sourceforge.squirrel_sql.fw.util.FileWrapperImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileWrapperImpl_ESTest extends FileWrapperImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileWrapper fileWrapper0 = FileWrapperImpl.createTempFile("Ulr7z,v 30Q", "net.sourceforge.squirrel_sql.fw.util.FileWrapperImpl", (FileWrapper) null);
      assertEquals("/tmp/Ulr7z,v 30Q0net.sourceforge.squirrel_sql.fw.util.FileWrapperImpl", fileWrapper0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl(file0);
      fileWrapperImpl0.deleteOnExit();
      assertNull(fileWrapperImpl0.getPath());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl(uRI0);
      assertEquals(0L, fileWrapperImpl0.lastModified());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn((URI) null).when(file0).toURI();
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl(file0);
      URI uRI0 = fileWrapperImpl0.toURI();
      assertNull(uRI0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl("N^B)\"nnJhWZs");
      URI uRI0 = fileWrapperImpl0.toURI();
      assertFalse(uRI0.isOpaque());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(file0).toString();
      FileWrapperImpl fileWrapperImpl0 = new FileWrapperImpl(file0);
      String string0 = fileWrapperImpl0.toString();
      assertNull(string0);
  }
}