package Integration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testgithub {



        WebDriver driver;
        @BeforeMethod
        public void launch(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://www.python.org/");
            driver.manage().window().maximize();

        }
        @Test

        public void checkone(){

            WebElement one = driver.findElement(By.xpath("//*[@id=\"id-search-field\"]"));
            one.sendKeys("java");
            WebElement two = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
            two.click();
        }
        @Test
        public void checktwo (){
            String three = driver.getCurrentUrl();
            System.out.println(three);
        }
        @AfterMethod
        public  void checkthree (){
            driver.close();
        }
    }


