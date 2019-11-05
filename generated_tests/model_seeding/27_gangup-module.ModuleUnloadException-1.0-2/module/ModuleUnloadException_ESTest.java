/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 16:18:25 GMT 2019
 */

package module;

import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.SQLDataException;
import module.Module;
import module.ModuleUnloadException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ModuleUnloadException_ESTest extends ModuleUnloadException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ModuleUnloadException moduleUnloadException0 = new ModuleUnloadException((Module) null);
      ModuleUnloadException moduleUnloadException1 = new ModuleUnloadException("mod=", moduleUnloadException0);
      assertFalse(moduleUnloadException1.equals((Object)moduleUnloadException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ModuleUnloadException moduleUnloadException0 = new ModuleUnloadException((Module) null);
      ModuleUnloadException moduleUnloadException1 = new ModuleUnloadException((Module) null, (String) null, moduleUnloadException0);
      assertFalse(moduleUnloadException1.equals((Object)moduleUnloadException0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ModuleUnloadException moduleUnloadException0 = new ModuleUnloadException((Module) null, "mod=");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SQLDataException sQLDataException0 = new SQLDataException((String) null, (String) null);
      ModuleUnloadException moduleUnloadException0 = new ModuleUnloadException(sQLDataException0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ModuleUnloadException moduleUnloadException0 = new ModuleUnloadException((Module) null);
      ModuleUnloadException moduleUnloadException1 = new ModuleUnloadException((Module) null, moduleUnloadException0);
      assertFalse(moduleUnloadException1.equals((Object)moduleUnloadException0));
  }
}