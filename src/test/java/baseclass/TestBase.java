package baseclass;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import com.drb.pages.MainClass;

public class TestBase {

MainClass obj =null;
WebDriver driver = null;


@BeforeTest
public void browser() 
{
	

    driver = new ChromeDriver();
  //  obj = new MainClass(driver);
	driver.get("http://167.71.226.96/");
	driver.manage().window().maximize();
	driver.navigate().to("http://167.71.226.96/login");
	//driver.navigate().to("http://167.71.226.96/sampleform");
	
	//public void Setusername(String Uname) 
	//{
//		WebElement usrname=driver.findElement(By.xpath("//input[@name='Username']"));
//		usrname.sendKeys("Ammu");
	//}
	//public void Setpassword(String Pssd)
	//{
//		WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
//		password.sendKeys("Ammu@123");
		
//		WebElement check=driver.findElement(By.xpath("//label[@for='checkbox']"));
//		check.click();
		
//		WebElement login=driver.findElement(By.xpath("//button[@class='login100-form-btn']"));
//		login.click();
//        driver.navigate().to("http://167.71.226.96/sampleform"); 
        
        

        
        
        
        
    /*         Describe your self  */   
        
//        WebElement textarea = driver.findElement(By.cssSelector("textarea#yourself"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(textarea).click().perform();
//        textarea.sendKeys("Your text goes here");
//        
//     /*        Choose Image   */   
//        // Locate the "Choose file" input element
//        WebElement chooseFileInput = driver.findElement(By.cssSelector("input[type='file'][name='image']"));
//
//        // Click on the "Choose file" button to trigger the file selection dialog
////        Actions chooseFileActions = new Actions(driver);
////        chooseFileActions.moveToElement(chooseFileInput).click().perform();
//        chooseFileInput.sendKeys("C:\\Users\\Lenovo\\Pictures\\Screenshots\\ADMINDFD.PNG");
//        
//        
//         /*         Click on the checkbox                 */        
//        
//        WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkbox'][formcontrolname='checkbox']"));
//        Actions checkBoxActions = new Actions(driver);
//        checkBoxActions.moveToElement(checkbox).click().perform();
        
        
        
        
        // Locate and click the "Add" button for Skill
//        WebElement addButtonSkills = driver.findElement(By.cssSelector("table[formarrayname='skills'] button.btn.btn-primary"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(addButtonSkills).click().perform();
//        
//        // Wait for the input field to be present
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        WebElement addSkill = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("table[formarrayname='skills'] input[formcontrolname='skills']")));
//
//        // Wait for the input field to be visible and clickable
//        addSkill = wait.until(ExpectedConditions.visibilityOf(addSkill));
//
//        // Enter text into the input field
//        addSkill.sendKeys("hai");
//        driver.quit();

        

   //   // Locate and click the "Add" button  for language known
// 	 WebElement addButtonLanguages = driver.findElement(By.cssSelector("table[formarrayname='languages'] button.btn.btn-primary"));
// 	  Actions actionsLanguage = new Actions(driver);
// 	  actionsLanguage.moveToElement(addButtonLanguages).click().perform();
//     
// 	 // Wait for the input field to be present
//     WebDriverWait waitLanguage = new WebDriverWait(driver, Duration.ofSeconds(10));
//     WebElement addLanguage = waitLanguage.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("table[formarrayname='languages'] input[formcontrolname='languages']")));
//        
//  // Wait for the input field to be visible
//     addLanguage = waitLanguage.until(ExpectedConditions.visibilityOf(addLanguage));
//
//     addLanguage.sendKeys("english");

//     // Locate and click the "Add" button for Skill
//        WebElement addButtonSkills = driver.findElement(By.cssSelector("table[formarrayname='skills'] button.btn.btn-primary"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(addButtonSkills).click().perform();
//        
//        
//        // Wait for the input field to be present
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        WebElement addSkill = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("table[formarrayname='skills'] input[formcontrolname='skills']")));
//        
//        // Wait for the input field to be visible and clickable
//        addSkill = wait.until(ExpectedConditions.visibilityOf(addSkill));
//        
//        
//        // Enter text into the input field
//        addSkill.sendKeys("hai");
        
//      

////      
       
      
////   // Locate and click the "Add" button for Skill
//      WebElement addButtonSkills = driver.findElement(By.cssSelector("table[formarrayname='skills'] button.btn.btn-primary"));
//      Actions actions = new Actions(driver);
//      actions.moveToElement(addButtonSkills).click().perform();
//
//      // Wait for the input field to be present
//      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//      WebElement addSkill = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("table[formarrayname='skills'] input[formcontrolname='skills']")));
//
//      // Wait for the input field to be visible
//      addSkill = wait.until(ExpectedConditions.visibilityOf(addSkill));
//      addSkill = wait.until(ExpectedConditions.elementToBeClickable(addSkill));
//      // Enter text into the input field
//      addSkill.sendKeys("hai");
//      driver.close();
      
      
      
        //achievements
        // Locate and click the "Add" button for Skill
//      WebElement addButtonSkills = driver.findElement(By.cssSelector("table[formarrayname='achievements'] button.btn.btn-primary"));
//      Actions actionsAddButtonSkills = new Actions(driver);
//      actionsAddButtonSkills.moveToElement(addButtonSkills).click().perform();
//      
//      // Wait for the input field to be present
//      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//      WebElement addSkill = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("table[formarrayname='achievements'] input[formcontrolname='achievements']")));
//
//      // Wait for the input field to be visible and clickable
//      addSkill = wait.until(ExpectedConditions.visibilityOf(addSkill));
//
//      // Enter text into the input field
//      addSkill.sendKeys("hai");
      
      
      


      

	

//	// Locate the "Add" button under the achievements table
//	WebElement addButtonAchievements = driver.findElement(By.cssSelector("table[formarrayname='achievements'] button.btn.btn-primary"));
//	addButtonAchievements.click();
//	// Locate the "Add" button under the progs table
//	WebElement addButtonProgs = driver.findElement(By.cssSelector("table[formarrayname='progs'] button.btn.btn-primary"));
//	addButtonProgs.click();
//	
//	WebElement describeYourselfTextarea = driver.findElement(By.cssSelector("p[_ngcontent-rgn-c34] textarea#yourself"));
//	describeYourselfTextarea.sendKeys(null);
//	WebElement imageInput = driver.findElement(By.cssSelector("p[_ngcontent-rgn-c34] input[type='file'][name='image']"));

	


}
}