/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 13:58:03 GMT 2019
 */

package oasis.names.tc.ciq.xsdschema.xal._2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails;
import oasis.names.tc.ciq.xsdschema.xal._2.AddressLine;
import oasis.names.tc.ciq.xsdschema.xal._2.AdministrativeArea;
import oasis.names.tc.ciq.xsdschema.xal._2.CountryName;
import oasis.names.tc.ciq.xsdschema.xal._2.Locality;
import oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AddressDetails_ESTest extends AddressDetails_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AddressDetails.PostalServiceElements.SupplementaryPostalServiceData addressDetails_PostalServiceElements_SupplementaryPostalServiceData0 = new AddressDetails.PostalServiceElements.SupplementaryPostalServiceData();
      addressDetails_PostalServiceElements_SupplementaryPostalServiceData0.content = "ii^.AE#e?";
      String string0 = addressDetails_PostalServiceElements_SupplementaryPostalServiceData0.getCode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AddressDetails.PostalServiceElements.SupplementaryPostalServiceData addressDetails_PostalServiceElements_SupplementaryPostalServiceData0 = new AddressDetails.PostalServiceElements.SupplementaryPostalServiceData();
      addressDetails_PostalServiceElements_SupplementaryPostalServiceData0.type = "SOWKZi#HM;U'U";
      String string0 = addressDetails_PostalServiceElements_SupplementaryPostalServiceData0.getCode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AddressDetails.PostalServiceElements.SupplementaryPostalServiceData addressDetails_PostalServiceElements_SupplementaryPostalServiceData0 = new AddressDetails.PostalServiceElements.SupplementaryPostalServiceData();
      addressDetails_PostalServiceElements_SupplementaryPostalServiceData0.content = "";
      String string0 = addressDetails_PostalServiceElements_SupplementaryPostalServiceData0.getContent();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AddressDetails.PostalServiceElements.SortingCode addressDetails_PostalServiceElements_SortingCode0 = new AddressDetails.PostalServiceElements.SortingCode();
      addressDetails_PostalServiceElements_SortingCode0.type = "'c'%Ziq0Z";
      String string0 = addressDetails_PostalServiceElements_SortingCode0.getCode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AddressDetails.PostalServiceElements.KeyLineCode addressDetails_PostalServiceElements_KeyLineCode0 = new AddressDetails.PostalServiceElements.KeyLineCode();
      addressDetails_PostalServiceElements_KeyLineCode0.type = "C.\"YKz1,@w";
      String string0 = addressDetails_PostalServiceElements_KeyLineCode0.getType();
      assertEquals("C.\"YKz1,@w", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AddressDetails.PostalServiceElements.KeyLineCode addressDetails_PostalServiceElements_KeyLineCode0 = new AddressDetails.PostalServiceElements.KeyLineCode();
      addressDetails_PostalServiceElements_KeyLineCode0.setContent("oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType");
      String string0 = addressDetails_PostalServiceElements_KeyLineCode0.getContent();
      assertEquals("oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AddressDetails.PostalServiceElements.EndorsementLineCode addressDetails_PostalServiceElements_EndorsementLineCode0 = new AddressDetails.PostalServiceElements.EndorsementLineCode();
      addressDetails_PostalServiceElements_EndorsementLineCode0.setType("");
      assertNull(addressDetails_PostalServiceElements_EndorsementLineCode0.getCode());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AddressDetails.PostalServiceElements.EndorsementLineCode addressDetails_PostalServiceElements_EndorsementLineCode0 = new AddressDetails.PostalServiceElements.EndorsementLineCode();
      addressDetails_PostalServiceElements_EndorsementLineCode0.type = "oasis.names.tc.ciq.xsdschema.xal._2.Locality";
      String string0 = addressDetails_PostalServiceElements_EndorsementLineCode0.getType();
      assertEquals("oasis.names.tc.ciq.xsdschema.xal._2.Locality", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AddressDetails.PostalServiceElements.EndorsementLineCode addressDetails_PostalServiceElements_EndorsementLineCode0 = new AddressDetails.PostalServiceElements.EndorsementLineCode();
      addressDetails_PostalServiceElements_EndorsementLineCode0.content = "";
      String string0 = addressDetails_PostalServiceElements_EndorsementLineCode0.getContent();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AddressDetails.PostalServiceElements.Barcode addressDetails_PostalServiceElements_Barcode0 = new AddressDetails.PostalServiceElements.Barcode();
      addressDetails_PostalServiceElements_Barcode0.setContent("R`Fv<?<E#R+^%");
      String string0 = addressDetails_PostalServiceElements_Barcode0.getCode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AddressDetails.PostalServiceElements.Barcode addressDetails_PostalServiceElements_Barcode0 = new AddressDetails.PostalServiceElements.Barcode();
      addressDetails_PostalServiceElements_Barcode0.code = "e.]Uc:s0YDnR";
      String string0 = addressDetails_PostalServiceElements_Barcode0.getType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AddressDetails.PostalServiceElements.Barcode addressDetails_PostalServiceElements_Barcode0 = new AddressDetails.PostalServiceElements.Barcode();
      addressDetails_PostalServiceElements_Barcode0.content = "";
      String string0 = addressDetails_PostalServiceElements_Barcode0.getType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AddressDetails.PostalServiceElements.AddressLongitudeDirection addressDetails_PostalServiceElements_AddressLongitudeDirection0 = new AddressDetails.PostalServiceElements.AddressLongitudeDirection();
      addressDetails_PostalServiceElements_AddressLongitudeDirection0.setCode("");
      String string0 = addressDetails_PostalServiceElements_AddressLongitudeDirection0.getCode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AddressDetails.PostalServiceElements.AddressLongitudeDirection addressDetails_PostalServiceElements_AddressLongitudeDirection0 = new AddressDetails.PostalServiceElements.AddressLongitudeDirection();
      addressDetails_PostalServiceElements_AddressLongitudeDirection0.type = "@B";
      String string0 = addressDetails_PostalServiceElements_AddressLongitudeDirection0.getType();
      assertEquals("@B", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AddressDetails.PostalServiceElements.AddressLongitude addressDetails_PostalServiceElements_AddressLongitude0 = new AddressDetails.PostalServiceElements.AddressLongitude();
      addressDetails_PostalServiceElements_AddressLongitude0.code = "CP";
      String string0 = addressDetails_PostalServiceElements_AddressLongitude0.getType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AddressDetails.PostalServiceElements.AddressLongitude addressDetails_PostalServiceElements_AddressLongitude0 = new AddressDetails.PostalServiceElements.AddressLongitude();
      addressDetails_PostalServiceElements_AddressLongitude0.setContent("889BzL");
      String string0 = addressDetails_PostalServiceElements_AddressLongitude0.getType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AddressDetails.PostalServiceElements.AddressLongitude addressDetails_PostalServiceElements_AddressLongitude0 = new AddressDetails.PostalServiceElements.AddressLongitude();
      addressDetails_PostalServiceElements_AddressLongitude0.setContent("oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare");
      String string0 = addressDetails_PostalServiceElements_AddressLongitude0.getContent();
      assertEquals("oasis.names.tc.ciq.xsdschema.xal._2.Thoroughfare", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AddressDetails.PostalServiceElements.AddressLatitudeDirection addressDetails_PostalServiceElements_AddressLatitudeDirection0 = new AddressDetails.PostalServiceElements.AddressLatitudeDirection();
      addressDetails_PostalServiceElements_AddressLatitudeDirection0.setType("");
      String string0 = addressDetails_PostalServiceElements_AddressLatitudeDirection0.getType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AddressDetails.PostalServiceElements.AddressLatitudeDirection addressDetails_PostalServiceElements_AddressLatitudeDirection0 = new AddressDetails.PostalServiceElements.AddressLatitudeDirection();
      addressDetails_PostalServiceElements_AddressLatitudeDirection0.code = "";
      String string0 = addressDetails_PostalServiceElements_AddressLatitudeDirection0.getContent();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AddressDetails.PostalServiceElements.AddressLatitude addressDetails_PostalServiceElements_AddressLatitude0 = new AddressDetails.PostalServiceElements.AddressLatitude();
      addressDetails_PostalServiceElements_AddressLatitude0.code = "%p";
      String string0 = addressDetails_PostalServiceElements_AddressLatitude0.getCode();
      assertEquals("%p", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AddressDetails.PostalServiceElements.AddressLatitude addressDetails_PostalServiceElements_AddressLatitude0 = new AddressDetails.PostalServiceElements.AddressLatitude();
      addressDetails_PostalServiceElements_AddressLatitude0.setType("kSR}ssx:p11_");
      String string0 = addressDetails_PostalServiceElements_AddressLatitude0.getType();
      assertEquals("kSR}ssx:p11_", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AddressDetails.PostalServiceElements.AddressLatitude addressDetails_PostalServiceElements_AddressLatitude0 = new AddressDetails.PostalServiceElements.AddressLatitude();
      addressDetails_PostalServiceElements_AddressLatitude0.setContent("");
      assertNull(addressDetails_PostalServiceElements_AddressLatitude0.getCode());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AddressDetails.PostalServiceElements.AddressLatitude addressDetails_PostalServiceElements_AddressLatitude0 = new AddressDetails.PostalServiceElements.AddressLatitude();
      addressDetails_PostalServiceElements_AddressLatitude0.setCode("t");
      String string0 = addressDetails_PostalServiceElements_AddressLatitude0.getContent();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AddressDetails.PostalServiceElements.AddressLatitude addressDetails_PostalServiceElements_AddressLatitude0 = new AddressDetails.PostalServiceElements.AddressLatitude();
      addressDetails_PostalServiceElements_AddressLatitude0.type = "";
      String string0 = addressDetails_PostalServiceElements_AddressLatitude0.getContent();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AddressDetails.PostalServiceElements.AddressIdentifier addressDetails_PostalServiceElements_AddressIdentifier0 = new AddressDetails.PostalServiceElements.AddressIdentifier();
      addressDetails_PostalServiceElements_AddressIdentifier0.setCode("G,0.nY5XK95PgM?ABuS");
      String string0 = addressDetails_PostalServiceElements_AddressIdentifier0.getCode();
      assertEquals("G,0.nY5XK95PgM?ABuS", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AddressDetails.PostalServiceElements.AddressIdentifier addressDetails_PostalServiceElements_AddressIdentifier0 = new AddressDetails.PostalServiceElements.AddressIdentifier();
      addressDetails_PostalServiceElements_AddressIdentifier0.content = "";
      String string0 = addressDetails_PostalServiceElements_AddressIdentifier0.getType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AddressDetails.PostalServiceElements.AddressIdentifier addressDetails_PostalServiceElements_AddressIdentifier0 = new AddressDetails.PostalServiceElements.AddressIdentifier();
      addressDetails_PostalServiceElements_AddressIdentifier0.setIdentifierType("k!*#Rv*_ToK0 i `0F");
      String string0 = addressDetails_PostalServiceElements_AddressIdentifier0.getIdentifierType();
      assertEquals("k!*#Rv*_ToK0 i `0F", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AddressDetails.PostalServiceElements.AddressIdentifier addressDetails_PostalServiceElements_AddressIdentifier0 = new AddressDetails.PostalServiceElements.AddressIdentifier();
      addressDetails_PostalServiceElements_AddressIdentifier0.type = "rxN";
      String string0 = addressDetails_PostalServiceElements_AddressIdentifier0.getContent();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AddressDetails.PostalServiceElements.AddressIdentifier addressDetails_PostalServiceElements_AddressIdentifier0 = new AddressDetails.PostalServiceElements.AddressIdentifier();
      addressDetails_PostalServiceElements_AddressIdentifier0.setIdentifierType("");
      String string0 = addressDetails_PostalServiceElements_AddressIdentifier0.getContent();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AddressDetails.PostalServiceElements.AddressIdentifier addressDetails_PostalServiceElements_AddressIdentifier0 = new AddressDetails.PostalServiceElements.AddressIdentifier();
      addressDetails_PostalServiceElements_AddressIdentifier0.setCode("G Hz*@dT<RSS4Y{6");
      String string0 = addressDetails_PostalServiceElements_AddressIdentifier0.getContent();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AddressDetails.PostalServiceElements addressDetails_PostalServiceElements0 = new AddressDetails.PostalServiceElements();
      AddressDetails.PostalServiceElements.AddressLatitude addressDetails_PostalServiceElements_AddressLatitude0 = new AddressDetails.PostalServiceElements.AddressLatitude();
      addressDetails_PostalServiceElements0.setAddressLatitude(addressDetails_PostalServiceElements_AddressLatitude0);
      assertNull(addressDetails_PostalServiceElements_AddressLatitude0.getCode());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      AddressDetails.PostalServiceElements addressDetails_PostalServiceElements0 = new AddressDetails.PostalServiceElements();
      AddressDetails.PostalServiceElements.Barcode addressDetails_PostalServiceElements_Barcode0 = new AddressDetails.PostalServiceElements.Barcode();
      addressDetails_PostalServiceElements0.setBarcode(addressDetails_PostalServiceElements_Barcode0);
      assertNull(addressDetails_PostalServiceElements_Barcode0.getCode());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      AddressDetails.PostalServiceElements addressDetails_PostalServiceElements0 = new AddressDetails.PostalServiceElements();
      AddressDetails.PostalServiceElements.KeyLineCode addressDetails_PostalServiceElements_KeyLineCode0 = new AddressDetails.PostalServiceElements.KeyLineCode();
      addressDetails_PostalServiceElements0.setKeyLineCode(addressDetails_PostalServiceElements_KeyLineCode0);
      assertNull(addressDetails_PostalServiceElements_KeyLineCode0.getCode());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      AddressDetails.PostalServiceElements addressDetails_PostalServiceElements0 = new AddressDetails.PostalServiceElements();
      AddressDetails.PostalServiceElements.EndorsementLineCode addressDetails_PostalServiceElements_EndorsementLineCode0 = new AddressDetails.PostalServiceElements.EndorsementLineCode();
      addressDetails_PostalServiceElements0.setEndorsementLineCode(addressDetails_PostalServiceElements_EndorsementLineCode0);
      assertNull(addressDetails_PostalServiceElements_EndorsementLineCode0.getType());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      AddressDetails.Country.CountryNameCode addressDetails_Country_CountryNameCode0 = new AddressDetails.Country.CountryNameCode();
      addressDetails_Country_CountryNameCode0.code = "";
      String string0 = addressDetails_Country_CountryNameCode0.getCode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      AddressDetails.Country.CountryNameCode addressDetails_Country_CountryNameCode0 = new AddressDetails.Country.CountryNameCode();
      addressDetails_Country_CountryNameCode0.content = "{~O;CkpCvp\"/wU&";
      String string0 = addressDetails_Country_CountryNameCode0.getContent();
      assertEquals("{~O;CkpCvp\"/wU&", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Locality locality0 = new Locality();
      AddressDetails.Country addressDetails_Country0 = new AddressDetails.Country();
      addressDetails_Country0.setLocality(locality0);
      assertNull(locality0.getIndicator());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      AddressDetails.Country addressDetails_Country0 = new AddressDetails.Country();
      AdministrativeArea administrativeArea0 = new AdministrativeArea();
      addressDetails_Country0.setAdministrativeArea(administrativeArea0);
      assertNull(administrativeArea0.getUsageType());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      AddressDetails.Address addressDetails_Address0 = new AddressDetails.Address();
      addressDetails_Address0.setType("");
      String string0 = addressDetails_Address0.getCode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      AddressDetails.Address addressDetails_Address0 = new AddressDetails.Address();
      addressDetails_Address0.setContent("t");
      String string0 = addressDetails_Address0.getContent();
      assertEquals("t", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      AddressDetails addressDetails0 = new AddressDetails();
      AdministrativeArea administrativeArea0 = new AdministrativeArea();
      addressDetails0.setAdministrativeArea(administrativeArea0);
      assertNull(administrativeArea0.getType());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      AddressDetails addressDetails0 = new AddressDetails();
      AddressDetails.Country addressDetails_Country0 = new AddressDetails.Country();
      addressDetails0.setCountry(addressDetails_Country0);
      assertNull(addressDetails0.getAddressDetailsKey());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      AddressDetails addressDetails0 = new AddressDetails();
      AddressDetails.Address addressDetails_Address0 = new AddressDetails.Address();
      addressDetails0.setAddress(addressDetails_Address0);
      assertNull(addressDetails0.getAddressType());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      AddressDetails addressDetails0 = new AddressDetails();
      addressDetails0.setValidToDate("oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails$PostalServiceElements$AddressLatitude");
      String string0 = addressDetails0.getValidToDate();
      assertEquals("oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails$PostalServiceElements$AddressLatitude", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      AddressDetails addressDetails0 = new AddressDetails();
      addressDetails0.setValidToDate("");
      String string0 = addressDetails0.getValidToDate();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      AddressDetails addressDetails0 = new AddressDetails();
      addressDetails0.setValidFromDate("oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails$PostalServiceElements$EndorsementLineCode");
      String string0 = addressDetails0.getValidFromDate();
      assertEquals("oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails$PostalServiceElements$EndorsementLineCode", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      AddressDetails addressDetails0 = new AddressDetails();
      addressDetails0.usage = "fdT";
      String string0 = addressDetails0.getUsage();
      assertEquals("fdT", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      AddressDetails addressDetails0 = new AddressDetails();
      addressDetails0.usage = "";
      String string0 = addressDetails0.getUsage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      AddressDetails addressDetails0 = new AddressDetails();
      Thoroughfare thoroughfare0 = new Thoroughfare();
      addressDetails0.thoroughfare = thoroughfare0;
      Thoroughfare thoroughfare1 = addressDetails0.getThoroughfare();
      assertNull(thoroughfare1.getDependentThoroughfaresConnector());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      AddressDetails addressDetails0 = new AddressDetails();
      addressDetails0.setCurrentStatus("oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails$PostalServiceElements$AddressLatitude");
      String string0 = addressDetails0.getCurrentStatus();
      assertEquals("oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails$PostalServiceElements$AddressLatitude", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      AddressDetails addressDetails0 = new AddressDetails();
      addressDetails0.setCurrentStatus("");
      String string0 = addressDetails0.getCurrentStatus();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      AddressDetails addressDetails0 = new AddressDetails();
      AddressDetails.Country addressDetails_Country0 = new AddressDetails.Country();
      addressDetails0.country = addressDetails_Country0;
      AddressDetails.Country addressDetails_Country1 = addressDetails0.getCountry();
      assertSame(addressDetails_Country1, addressDetails_Country0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      AddressDetails addressDetails0 = new AddressDetails();
      addressDetails0.setCode("oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostalCodeNumber");
      String string0 = addressDetails0.getCode();
      assertEquals("oasis.names.tc.ciq.xsdschema.xal._2.PostalCode$PostalCodeNumber", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      AddressDetails addressDetails0 = new AddressDetails();
      AdministrativeArea administrativeArea0 = new AdministrativeArea();
      addressDetails0.administrativeArea = administrativeArea0;
      AdministrativeArea administrativeArea1 = addressDetails0.getAdministrativeArea();
      assertNull(administrativeArea1.getUsageType());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      AddressDetails addressDetails0 = new AddressDetails();
      addressDetails0.addressType = "'xi";
      String string0 = addressDetails0.getAddressType();
      assertEquals("'xi", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      AddressDetails addressDetails0 = new AddressDetails();
      addressDetails0.setAddressDetailsKey("F=feFX>Rx@=bNJ");
      String string0 = addressDetails0.getAddressDetailsKey();
      assertEquals("F=feFX>Rx@=bNJ", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      AddressDetails addressDetails0 = new AddressDetails();
      addressDetails0.setAddressDetailsKey("");
      String string0 = addressDetails0.getAddressDetailsKey();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      AddressDetails addressDetails0 = new AddressDetails();
      AddressDetails.Address addressDetails_Address0 = new AddressDetails.Address();
      addressDetails0.address = addressDetails_Address0;
      AddressDetails.Address addressDetails_Address1 = addressDetails0.getAddress();
      assertNull(addressDetails_Address1.getContent());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      AddressDetails addressDetails0 = new AddressDetails();
      Integer integer0 = new Integer(0);
      addressDetails0.accuracy = integer0;
      Integer integer1 = addressDetails0.getAccuracy();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      AddressDetails addressDetails0 = new AddressDetails();
      Integer integer0 = new Integer((-2298));
      addressDetails0.accuracy = integer0;
      Integer integer1 = addressDetails0.getAccuracy();
      assertEquals((-2298), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      AddressDetails.PostalServiceElements addressDetails_PostalServiceElements0 = new AddressDetails.PostalServiceElements();
      List<Object> list0 = addressDetails_PostalServiceElements0.getAny();
      List<Object> list1 = addressDetails_PostalServiceElements0.getAny();
      assertNotNull(list1);
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      AddressDetails.PostalServiceElements addressDetails_PostalServiceElements0 = new AddressDetails.PostalServiceElements();
      List<AddressDetails.PostalServiceElements.SupplementaryPostalServiceData> list0 = addressDetails_PostalServiceElements0.getSupplementaryPostalServiceData();
      List<AddressDetails.PostalServiceElements.SupplementaryPostalServiceData> list1 = addressDetails_PostalServiceElements0.getSupplementaryPostalServiceData();
      assertNotNull(list1);
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      AddressDetails.PostalServiceElements addressDetails_PostalServiceElements0 = new AddressDetails.PostalServiceElements();
      List<AddressDetails.PostalServiceElements.AddressIdentifier> list0 = addressDetails_PostalServiceElements0.getAddressIdentifier();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      AddressDetails.PostalServiceElements addressDetails_PostalServiceElements0 = new AddressDetails.PostalServiceElements();
      LinkedList<AddressDetails.PostalServiceElements.AddressIdentifier> linkedList0 = new LinkedList<AddressDetails.PostalServiceElements.AddressIdentifier>();
      addressDetails_PostalServiceElements0.addressIdentifier = (List<AddressDetails.PostalServiceElements.AddressIdentifier>) linkedList0;
      List<AddressDetails.PostalServiceElements.AddressIdentifier> list0 = addressDetails_PostalServiceElements0.getAddressIdentifier();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      AddressDetails.Country addressDetails_Country0 = new AddressDetails.Country();
      List<Object> list0 = addressDetails_Country0.getAny();
      List<Object> list1 = addressDetails_Country0.getAny();
      assertNotNull(list1);
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      AddressDetails.Country addressDetails_Country0 = new AddressDetails.Country();
      List<CountryName> list0 = addressDetails_Country0.getCountryName();
      List<CountryName> list1 = addressDetails_Country0.getCountryName();
      assertSame(list1, list0);
      assertNotNull(list1);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      AddressDetails.Country addressDetails_Country0 = new AddressDetails.Country();
      List<AddressDetails.Country.CountryNameCode> list0 = addressDetails_Country0.getCountryNameCode();
      List<AddressDetails.Country.CountryNameCode> list1 = addressDetails_Country0.getCountryNameCode();
      assertNotNull(list1);
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      AddressDetails.Country addressDetails_Country0 = new AddressDetails.Country();
      List<AddressLine> list0 = addressDetails_Country0.getAddressLine();
      List<AddressLine> list1 = addressDetails_Country0.getAddressLine();
      assertSame(list1, list0);
      assertNotNull(list1);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      AddressDetails addressDetails0 = new AddressDetails();
      addressDetails0.getAny();
      List<Object> list0 = addressDetails0.getAny();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      AddressDetails.PostalServiceElements.Barcode addressDetails_PostalServiceElements_Barcode0 = new AddressDetails.PostalServiceElements.Barcode();
      addressDetails_PostalServiceElements_Barcode0.setCode("SC 6*Zk=f?GP\"e");
      assertNull(addressDetails_PostalServiceElements_Barcode0.getContent());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      AddressDetails.PostalServiceElements.Barcode addressDetails_PostalServiceElements_Barcode0 = new AddressDetails.PostalServiceElements.Barcode();
      String string0 = addressDetails_PostalServiceElements_Barcode0.getContent();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      AddressDetails.PostalServiceElements.Barcode addressDetails_PostalServiceElements_Barcode0 = new AddressDetails.PostalServiceElements.Barcode();
      Map<QName, String> map0 = addressDetails_PostalServiceElements_Barcode0.getOtherAttributes();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      AddressDetails.PostalServiceElements.Barcode addressDetails_PostalServiceElements_Barcode0 = new AddressDetails.PostalServiceElements.Barcode();
      addressDetails_PostalServiceElements_Barcode0.setType("&#Ke%<");
      String string0 = addressDetails_PostalServiceElements_Barcode0.getCode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      AddressDetails.PostalServiceElements.Barcode addressDetails_PostalServiceElements_Barcode0 = new AddressDetails.PostalServiceElements.Barcode();
      addressDetails_PostalServiceElements_Barcode0.setContent("R`Fv<?<E#R+^%");
      String string0 = addressDetails_PostalServiceElements_Barcode0.getContent();
      assertEquals("R`Fv<?<E#R+^%", string0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      AddressDetails.PostalServiceElements.AddressLatitude addressDetails_PostalServiceElements_AddressLatitude0 = new AddressDetails.PostalServiceElements.AddressLatitude();
      Map<QName, String> map0 = addressDetails_PostalServiceElements_AddressLatitude0.getOtherAttributes();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      AddressDetails addressDetails0 = new AddressDetails();
      String string0 = addressDetails0.getValidToDate();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      AddressDetails addressDetails0 = new AddressDetails();
      String string0 = addressDetails0.getAddressType();
      assertNull(string0);
  }
}