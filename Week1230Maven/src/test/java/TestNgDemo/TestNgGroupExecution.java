package TestNgDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgGroupExecution {
	WebDriver driver;
	@BeforeClass(groups ="Smoke")
	public void setup()
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://automationexercise.com/login");
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
@Test(groups ="Smoke",priority = 1)
public void fullname() 
{
	driver.findElement(By.name("name")).sendKeys("shivani srivastava");
	
}
@Test(groups ="regretion",priority = 2)
public void Enteremail() 
{
	driver.findElement(By.name("email")).sendKeys("shivani023@gmail.com");
	
	
}
@Test(groups ="regretion",priority = 3)
void click_on_Signup_button()

{
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
}

@Test(groups ="sanity",priority = 3)

public void teardown() {
	driver.close();

	
}
}



