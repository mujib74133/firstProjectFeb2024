package variousConcept;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	@Before
	public void init() {
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\16463\\eclipse-workspace_JAVA_2024\\session2\\driver\\chromedriver.exe");
	//	System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	//	System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	}
	
	@Test
	public void testLocators() {
		
	}
}
