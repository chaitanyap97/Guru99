package guru99.tutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {
	
	protected WebDriver driver;
	@Test
  public void guru99tutorials() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		        "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
       
        String eTitle = "Meet Guru99";
        String aTitle = "";
 
        // launch Firefox and redirect it to the Base URL
        driver.get("http://www.guru99.com/");
        //maximises the browser window
        driver.manage().window().maximize();
        // get the actual value of the title
        aTitle = driver.getTitle();
 
        
         // compare the actual title  with the expected title
         
        if (aTitle.contentEquals(eTitle)){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        
        //close Firefox browser
        driver.close();
		
	}
}

