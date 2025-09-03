package javapackage;

import org.testng.annotations.*;
public class TestNG02 {
@BeforeSuite
public void a() {
	System.out.println(" a test method");
}
@BeforeTest
public void b() {
	System.out.println(" b test method");
}
@BeforeMethod
public void c() {
	System.out.println("c test method");
}
@BeforeClass
public void d() {
	System.out.println("d test method");
}
@Test
public void e() {
	System.out.println("test checking");
}

@AfterClass
public void f() {
	System.out.println("f test method");
}

@AfterMethod
public void g() {
	System.out.println("g test method");
}
}
