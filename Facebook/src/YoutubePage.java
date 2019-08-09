import java.lang.String;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubePage {
	
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akhalesh\\Desktop\\chromedriver.exe");
			ChromeDriver ChrmDrv =new ChromeDriver();
			ChrmDrv.get("Https://www.youtube.com");
			ChrmDrv.manage().window().maximize();
			String st = ChrmDrv.getCurrentUrl();
			System.out.println("Current URL is :"+ st);
				
	        String str1=ChrmDrv.getWindowHandle();
	        System.out.println("Focoused window URL:"+str1);
	        Set<String> all=ChrmDrv.getWindowHandles();
	        for (String i:all )
	        {
	        System.out.println("All opened window URL's:"+all);
	        }
}
}

