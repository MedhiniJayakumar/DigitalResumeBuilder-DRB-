package baseclass;

import org.testng.annotations.Test;

import com.drb.pages.MainClass;

public class TestClass extends TestBase {
	
	MainClass main = null;
	
@Test
public void Login() throws InterruptedException
{
	 main = new MainClass(driver);
	 main.setUser("COOL");
	 main.setPass("Cool@123");
	 main.setCheckbox();
	 main.setLogin();
     main.navigation();
     main.setDescription();
     main.setDescribe("Hardworking");
     main.imageChoose("C:\\Users\\Lenovo\\Pictures\\Screenshots\\ADMINDFD.PNG");
     main.tickmark();
     main.createProfile();
     main.popup();
     main.navigateToEdit();
     main.clickOnEdit();
     main.editUsern("COOL");
     main.dob("19");
     main.dob2("10");
     main.dob3("1999");
     main.gender();
     main.mail("Cool123@gmail.com");
     main.phone("7559078056");
     main.setEditDescription();
     main.setEditDescribe("Hardworking and intelligent");
     main.editImageChoose("C:\\Users\\Lenovo\\Pictures\\Screenshots\\Screenshot (145).png");
     main.editTickmark();
     main.updateProfile();
    main.navigateToTemplate();
    main.setUsername("COOL");
    main.setPassword("Cool@123");
    main.setCheckbox1();
    main.setLoginFun();
    main.clickTemplateButton();
    main.selectTemplate();
    main.download();
   
}

}
