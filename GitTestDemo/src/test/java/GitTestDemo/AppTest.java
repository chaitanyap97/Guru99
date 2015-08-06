package GitTestDemo;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;



public class AppTest {
	
	protected WebDriver driver;
	@Test
  public void f() throws InterruptedException {
		Capabilities caps = new DesiredCapabilities();
        ((DesiredCapabilities) caps).setJavascriptEnabled(true);                
        ((DesiredCapabilities) caps).setCapability("takesScreenshot", true);
     ((DesiredCapabilities) caps).setCapability(
                PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
                "phantomjs.exe"
            );
      // File file = new File("http://hkesihub.com/about_us/phantomjs.exe");             
      // System.setProperty("phantomjs.binary.path", file.getAbsolutePath());        
      WebDriver d = new PhantomJSDriver(caps); 

//WebDriver d=new HtmlUnitDriver();
       
       d.get("https://www.gmail.com/intl/en/mail/help/about.html");
       System.out.println("navigated to gmail");
       d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       d.manage().window().setSize(new Dimension(1576, 798));;

       d.findElement(By.id("gmail-sign-in")).click();
       System.out.println("Clicked on Signin");
       Thread.sleep(9000);


       d.findElement(By.id("Email")).sendKeys("chaitanyapujari97@gmail.com");
       System.out.println("Entered Email");

       Thread.sleep(9000);
       d.findElement(By.id("next")).click();


       System.out.println("Clicked next");
       d.findElement(By.id("Passwd")).sendKeys("mindssolvit");
       System.out.println("Entered password");
       Thread.sleep(9000);
       d.findElement(By.id("signIn")).click();
       System.out.println("Clicked on signin");
       Thread.sleep(9000);


       d.findElement(By.xpath("html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/div/div")).click();
       System.out.println("Clicked on Compose email");
       //Thread.sleep(9000);
       Thread.sleep(9000);


       d.findElement(By.name("to")).sendKeys("chaitanyapujari97@gmail.com");
       System.out.println("Entered To address");

       Thread.sleep(9000);
       d.findElement(By.name("q")).click();
       d.findElement(By.name("subjectbox")).sendKeys("PHANTOm Js");

       System.out.println("Entered Subject");
       //WebElement webElement=d.findElement(By.name("subjectbox"));

       /*String keysPressed =  Keys.chord(Keys.CONTROL, Keys.RETURN);
        WebElement element=d.findElement(By.xpath("html/body"));
        element.sendKeys(keysPressed) ;*/
        Thread.sleep(9000);
        d.findElement(By.xpath(".//tr[@class='n1tfz']/td[1]/div[1]/div[2]")).click();
       System.out.println("Clicked On send"); 
		
	}
}

