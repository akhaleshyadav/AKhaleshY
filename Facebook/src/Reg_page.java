
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Reg_page {
public void DropDown(WebElement element,String Visibletext)
{
Select s =new Select(element);
s.selectByVisibleText(Visibletext);
}


public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akhalesh\\Desktop\\chromedriver.exe");
	ChromeDriver ChrmDrv = new ChromeDriver();
	ChrmDrv.manage().window().maximize();
	ChrmDrv.get("https://www.facebook.com");
	System.out.println("Facebook registration page open");
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
	
	
	
	
	
	
}
}
