package com.drb.pages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class MainClass {

WebDriver driver;

public MainClass(WebDriver driver)
{
	this.driver=driver;
}

public void setUser(String user)
{
	WebElement usrname=driver.findElement(By.xpath("//input[@name='Username']"));
	usrname.sendKeys(user);
}
public void setPass(String pass)
{
	WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
	password.sendKeys(pass);
}
public void setCheckbox()
{
	WebElement checkbox =driver.findElement(By.xpath("//label[@for='checkbox']"));
	checkbox.click();
}

public void setLogin()
{
WebElement login=driver.findElement(By.xpath("//button[@class='login100-form-btn']"));
login.click();
}

public void navigation()
{
	  driver.navigate().to("http://167.71.226.96/sampleform");
}
public void setDescription()
{
WebElement textarea = driver.findElement(By.cssSelector("textarea#yourself"));
Actions actions = new Actions(driver);
actions.moveToElement(textarea).click().perform();
}


public void setDescribe(String describe)
{
WebElement textarea = driver.findElement(By.cssSelector("textarea#yourself"));
textarea.sendKeys(describe);
System.out.println("Current description    :" + textarea.getAttribute("value"));
}

public void imageChoose(String Path)
{
	 WebElement chooseFileInput = driver.findElement(By.cssSelector("input[type='file'][name='image']"));
	 chooseFileInput.sendKeys(Path);
	 System.out.println("Current image path : " + chooseFileInput.getAttribute("value"));
}
public void tickmark()
{
	WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkbox'][formcontrolname='checkbox']"));
	 Actions checkBoxActions = new Actions(driver);
   checkBoxActions.moveToElement(checkbox).click().perform();
}

public void createProfile()
{
	WebElement profile = driver.findElement(By.cssSelector("button.btn.btn-success"));
	Actions action = new Actions(driver);
	action.moveToElement(profile).click().perform();
}

public void popup()
{
    Alert alert = driver.switchTo().alert();
    String alertText = alert.getText();
    System.out.println("Alert message: " + alertText);
    alert.accept(); 
}
public void navigateToEdit()
{
	driver.navigate().to("http://167.71.226.96/profile");
}
public void clickOnEdit()
{
	WebElement editProfileButton = driver.findElement(By.linkText("Edit Profile"));
	Actions editAction = new Actions(driver);
	editAction.moveToElement(editProfileButton).click().perform();
}
public void editUsern(String name) 
{
	WebElement user=driver.findElement(By.xpath("//input[@id='name']"));
	user.sendKeys(name);
}
public void dob(String dd) 
{
	WebElement birth=driver.findElement(By.xpath("//input[@id='date']"));
birth.sendKeys(dd);
}
public void dob2(String mm) 
{
WebElement birth2=driver.findElement(By.xpath("//input[@id='date']"));
birth2.sendKeys(mm);
}
public void dob3(String yyyy) 
{
WebElement birth2=driver.findElement(By.xpath("//input[@id='date']"));
birth2.sendKeys(yyyy);
}
public void gender() 
{
WebElement gen=driver.findElement(By.xpath("//p[contains(text(),'Male')]//input[2]"));
gen.click();
}
public void mail (String id) 
{
	WebElement email=driver.findElement(By.xpath("//input[@id='email_id']"));
email.sendKeys(id);
	
}
public void phone(String mob) 
{
	WebElement ph=driver.findElement(By.xpath("//input[@id='phone']"));
ph.sendKeys(mob);
}
public void setEditDescription()
{
WebElement textarea = driver.findElement(By.cssSelector("textarea#yourself"));
//textarea.click();
Actions actions = new Actions(driver);
actions.moveToElement(textarea).click().perform();
}

public void setEditDescribe(String describe)
{
WebElement textarea = driver.findElement(By.cssSelector("textarea#yourself"));
textarea.clear();
textarea.sendKeys(describe);
System.out.println("Updated description   : " + textarea.getAttribute("value"));
}
public void editImageChoose(String Path)
{
	 WebElement chooseFileInput = driver.findElement(By.cssSelector("input[type='file'][name='image']"));
	 chooseFileInput.sendKeys(Path);
	 System.out.println("Image updated");
	 System.out.println("Updated image : "+chooseFileInput.getAttribute("value"));
}

public void editTickmark()
{
	WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkbox'][formcontrolname='checkbox']"));
	 Actions checkBoxActions = new Actions(driver);
   checkBoxActions.moveToElement(checkbox).click().perform();
}
public void updateProfile()
{
	WebElement profile = driver.findElement(By.cssSelector("button.btn.btn-success"));
	Actions action = new Actions(driver);
	action.moveToElement(profile).click().perform();
}
public void navigateToTemplate() {
    driver.navigate().to("http://167.71.226.96/templatehome");
    driver.navigate().to("http://167.71.226.96/login");

}
public void setUsername(String user)
{
	WebElement usrname=driver.findElement(By.xpath("//input[@name='Username']"));
	usrname.sendKeys(user);
}
public void setPassword(String pass)
{
	WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
	password.sendKeys(pass);
}
public void setCheckbox1()
{
	WebElement checkbox =driver.findElement(By.xpath("//label[@for='checkbox']"));
	checkbox.click();
}

public void setLoginFun()
{
WebElement login=driver.findElement(By.xpath("//button[@class='login100-form-btn']"));
login.click();
}
public void clickTemplateButton() throws InterruptedException{
	WebElement templateLink = driver.findElement(By.xpath("//a[@routerlink='templatehome']"));
	Thread.sleep(1000);
	templateLink.click();//templateButton.click();
    Actions templateAction = new Actions(driver);
    templateAction.moveToElement(templateLink).click().perform();
    Thread.sleep(1000);
}

public void selectTemplate() throws InterruptedException{
WebElement templateElement = driver.findElement(By.xpath("//div[@class='h4' and text()='MULBERRY WHITE']"));
Thread.sleep(3000);
Actions templateActions = new Actions(driver);
templateActions.moveToElement(templateElement).click().perform();
System.out.println("Temple Selected Sucessfully");
Thread.sleep(3000);
}

public void download() throws InterruptedException 
{
WebElement downloadButton =driver.findElement(By.cssSelector("section[class='col-lg-12 col-sm-12 col-md-12 justify-content-center text-center mt-3 mb-3'] button[class='btn btn btn-dark m-1']"));
Thread.sleep(3000);
Actions downloadActions = new Actions(driver);	
downloadActions.moveToElement(downloadButton).click().perform();
Thread.sleep(5000);
System.out.println("Resume Downloaded Sucessfully...!!!!!!!!");
}

}