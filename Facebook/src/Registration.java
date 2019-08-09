import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akhalesh\\Desktop\\chromedriver.exe");
	ChromeDriver ChrmDrv = new ChromeDriver();
	ChrmDrv.get("https://www.facebook.com");
	ChrmDrv.manage().window().maximize();
	WebElement Fname=ChrmDrv.findElementByName("firstname");
	Fname.sendKeys("QAone");
    WebElement Sname=ChrmDrv.findElementById("u_0_n");
    Sname.sendKeys("Person");
  //  WebElement MobNum= ChrmDrv.findElementByTagName("input").getAttribute(By.name("reg_email__"));
   // MobNum.sendKeys("9555717928");
    WebElement NewPwd= ChrmDrv.findElementByTagName("password").findElement(By.name("reg_passwd__"));
   // Webelement Sex = ChrmDrv.findElementByTagName("radio").findElement(By.name("sex"));
    
    

	
	
	
	
	
	
}
}
