package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.drb.pages.MainClass;

public class TestBase {

MainClass obj =null;
WebDriver driver = null;


@BeforeTest
public void browser() 
{
	

    driver = new ChromeDriver();
	driver.get("http://167.71.226.96/");
	driver.manage().window().maximize();
	driver.navigate().to("http://167.71.226.96/login");
}
}