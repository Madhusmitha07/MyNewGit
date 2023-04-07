package Gluecode;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
	
	
	@Before("@Smoke")
	public void test1()
	{
		System.out.println("I am @before block");
	}

	@Before(value="@Sanity",order=0)
	public void test5()
	{
		System.out.println("I am @before2 block");
	}
	
	@After(value="@Smoke and @Sanity",order=1)
	public void test2()
	{
		System.out.println("I am @After block");
	}
	
	@After()
	public void test6()
	{
		System.out.println("I am @After2 block");
	}
	
	@BeforeStep
	public void test3()
	{
		System.out.println("I am @Beforestep block");
	}
	
	@AfterStep
	public void test4()
	{
		System.out.println("I am @Afterstep block");
	}
}
