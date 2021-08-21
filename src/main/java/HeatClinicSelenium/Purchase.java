package HeatClinicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Purchase {

    public static void main(String [] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","/Users/farhinf.f/Desktop/Driver/geckodriver");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.broadleafcommerce.org/login");
        Thread.sleep(1000);


        //LOGIN

        //Formula: //tagName[@attribute=‘value’]

        //enter email
        WebElement myElementEmailTwo = driver.findElement(By.id("username"));
        myElementEmailTwo.sendKeys("ffardous96@gmail.com");
        Thread.sleep(1000);

        //enter password
        WebElement myElementPasswordTwo = driver.findElement(By.xpath("(//input[@id='password'])[1]"));
        myElementPasswordTwo.sendKeys("heatclinic101");
        Thread.sleep(1000);

        //click remember me button
        WebElement myElementRememberMe = driver.findElement(By.xpath("//span[@class='checkbox-material']"));
        myElementRememberMe.click();
        Thread.sleep(1000);

        //click login button
        WebElement myElementLoginTwo = driver.findElement(By.xpath("(//button[@class='btn btn-primary pull-right'])[1]"));
        myElementLoginTwo.click();
        Thread.sleep(1000);


        //ADD TO CART

        //Formula: //tagName[@attribute=‘value’]

        WebElement elementGreenGhost = driver.findElement(By.xpath("//a[@href='/hot-sauces/green_ghost']/div"));
        elementGreenGhost .click();
        Thread.sleep(3000);

        driver.switchTo().alert().accept();

        WebElement elementAddToCart = driver.findElement(By.xpath("(//div/button/span)[5]"));
        elementAddToCart.click();
        Thread.sleep(3000);

        WebElement elementViewYourCart = driver.findElement(By.xpath("//a[@class='btn btn-primary goto-full-cart']"));
        elementViewYourCart.click();
        Thread.sleep(3000);


        //CHECKOUT

        //Formula: //tagName[@attribute=‘value’]

        //checkout
        WebElement elementCheckout = driver.findElement(By.xpath("//a[@href='/checkout']"));
        elementCheckout.click();
        Thread.sleep(4000);

        String elementShippingText = driver.findElement(By.xpath("//*[@id='shippingInfo']/div/div[1]/h4/span")).getText();
        System.out.println("Shipping Text: " + elementShippingText);

        //full name
        WebElement elementFullName = driver.findElement(By.id("fullName"));
        elementFullName.sendKeys("Farhin Fardous");
        Thread.sleep(1000);

        //address
        WebElement elementAddress = driver.findElement(By.id("addressLine1"));
        elementAddress.sendKeys("13 Pomander Loop");
        Thread.sleep(1000);

        //city
        WebElement elementCity = driver.findElement(By.id("city"));
        elementCity.sendKeys("Alexandria");
        Thread.sleep(1000);

        //state
        WebElement elementState = driver.findElement(By.id("stateProvinceRegion"));
        elementState.click();
        Thread.sleep(2000);

        //select state
        Select stateSelection = new Select(driver.findElement(By.name("address.stateProvinceRegion")));
        stateSelection.selectByVisibleText("VA");

//        //zip code
//        WebElement elementPostalCode = driver.findElement(By.id("postalCode"));
//        elementPostalCode.sendKeys("22192");
//        Thread.sleep(2000);

        //phone number
        WebElement elementPhone = driver.findElement(By.id("phonePrimary"));
        elementPhone.sendKeys("7169736090");
        Thread.sleep(2000);

//        //default address checkbox
//        WebElement elementDefaultAddressCheckbox = driver.findElement(By.xpath("//span[@class='check']"));
//        elementDefaultAddressCheckbox.click();
//        Thread.sleep(1000);

        //shipping method
        WebElement elementStandard = driver.findElement(By.xpath("(//span[@class='circle'])[1]"));
        elementStandard.click();
        Thread.sleep(3000);

        //continue
        WebElement elementContinue = driver.findElement(By.xpath("//a[@class='btn btn-primary pull-right js-submitCheckoutStage']"));
        elementContinue.click();
        Thread.sleep(3000);


        //PAYMENT

        //Formula: //tagName[@attribute=‘value’]

        //same as my shipping address
        WebElement elementCheckbox = driver.findElement(By.xpath("//span[@class='checkbox-material']"));
        elementCheckbox.click();
        Thread.sleep(3000);

        //continue with payment
        WebElement elementContinuePayment = driver.findElement(By.xpath("//a[@class='btn btn-primary pull-right js-submitPaymentCheckoutStage']"));
        elementContinuePayment.click();
        Thread.sleep(3000);

        //place your order
        WebElement elementPlaceOrder = driver.findElement(By.xpath("//a[@class='btn btn-primary pull-right js-performCheckout']"));
        elementPlaceOrder.click();
        Thread.sleep(9000);

        driver.quit();

        //ORDER CONFIRMATION # - 202108202239566933289
    }
}