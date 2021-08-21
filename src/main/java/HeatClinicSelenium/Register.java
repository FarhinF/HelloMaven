package HeatClinicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Register {

    public static void main(String [] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","/Users/farhinf.f/Desktop/Driver/geckodriver");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.broadleafcommerce.org/");
        Thread.sleep(2000);

        //REGISTER

        //Formula: //tagName[@attribute=‘value’]

        //login
        WebElement myElementLoginOne = driver.findElement(By.xpath("//a[@href='/login']"));
        myElementLoginOne.click();
        Thread.sleep(2000);

        //email
        WebElement myElementEmailOne = driver.findElement(By.id("customer.emailAddress"));
        myElementEmailOne.sendKeys("ffardous96@gmail.com");
        Thread.sleep(2000);

        //first name
        WebElement myElementFirstName = driver.findElement(By.id("customer.firstName"));
        myElementFirstName.sendKeys("Farhin");
        Thread.sleep(2000);

        //last name
        WebElement myElementLastName = driver.findElement(By.id("customer.lastName"));
        myElementLastName.sendKeys("Fardous");
        Thread.sleep(2000);

        //password
        WebElement myElementPasswordOne = driver.findElement(By.xpath("(//input[@id='password'])[2]"));
        myElementPasswordOne.sendKeys("heatclinic101");
        Thread.sleep(2000);

        //confirm password
        WebElement myElementConfirmPassword = driver.findElement(By.id("passwordConfirm"));
        myElementConfirmPassword.sendKeys("heatclinic101");
        Thread.sleep(2000);

        //register
        WebElement myElementRegister = driver.findElement(By.xpath("(//button[@class='btn btn-primary pull-right'])[2]"));
        myElementRegister.click();
        Thread.sleep(2000);

        driver.quit();
    }
}
