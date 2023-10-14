package Sample;

import java.util.concurrent.ForkJoinPool.ManagedBlocker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass 
{
	WebDriver driver;
	
	@BeforeMethod
    public void setup()
    {
    	
    		 driver = new ChromeDriver();
    	 
    	 
    	 driver.get("https://www.google.com/");
    	 driver.manage().window().maximize();
    	 System.out.println("browser launch successfully..");
    	 System.out.println("browser open......");
    }

    
	@Test
	public void test1()
	{
		System.out.println("This is test case 1");
		System.out.println("Welcom To Zimetrics Harshal Wankhede AS a QA Engineer");
	}

	@Test
	public void test2()
	{
		System.out.println("This is test case 2");
	}

	@Test
	public void test3()
	{
		System.out.println("This is test case 3");
	}

    @AfterMethod
	public void tearDown()
	{
		driver.close();
	}











}
