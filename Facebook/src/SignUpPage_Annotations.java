import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage_Annotations {
     //Browser launch
	 // Fill the information for signup
	 // close the browser
	
	ChromeDriver ChrmDrv;
	@Before
	public void BrowserLaunch()
	{
		ChrmDrv=new ChromeDriver();		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akhalesh\\Desktop\\chromedriver.exe");
		ChrmDrv.manage().window().maximize();
		System.out.println("Browser launch");
		ChrmDrv.get("https://www.facebook.com");
		System.out.println("Facebook registration page open");
		
	}
	@Test
	public void DataFilling()
	{   
		WebElement Fname =ChrmDrv.findElement(By.name("firstname"));
		Fname.sendKeys("Akhi");
		
		WebElement Sname = ChrmDrv.findElement(By.name("lastname"));
		Sname.sendKeys("Anderson");
		
		WebElement Mnumber =ChrmDrv.findElement(By.id("u_0_q"));
		Mnumber.sendKeys("9555717928");
		
		WebElement Pwd = ChrmDrv.findElement(By.name("reg_passwd__"));
		Pwd.sendKeys("Y@dav123456");
		
		WebElement DDL1=ChrmDrv.findElement(By.cssSelector("Select#day"));
		Reg_page obj=new Reg_page();
		obj.DropDown(DDL1, "5");
		WebElement DDL2=ChrmDrv.findElement(By.cssSelector("Select#month"));
		obj.DropDown(DDL2, "Nov");
		WebElement DDL3=ChrmDrv.findElement(By.cssSelector("Select#year"));
		obj.DropDown(DDL3, "2000");
		
		WebElement ClckGender =ChrmDrv.findElement(By.name("sex"));
		ClckGender.click();
		
		WebElement SignupBtn = ChrmDrv.findElement(By.name("websubmit"));
		SignupBtn.click();
		System.out.println("Data filled on registration page");
		
	}
	public static void DropDown(WebElement element,String Visibletext)
	{
	Select s =new Select(element);
	s.selectByVisibleText(Visibletext);
	}
	
	@After
	public void BrowserClose()
	{
		ChrmDrv.close();
		System.out.println("Browser Closed");
	}
	

		
	
}






