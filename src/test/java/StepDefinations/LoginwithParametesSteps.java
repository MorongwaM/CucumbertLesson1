package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class LoginwithParametesSteps {

    WebDriver driver=null;

    @Given("browser is openeds")
    public void browser_is_openeds() {
        String projectPath=System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/java/drivers/chromedriver2.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @And("user is on home pages")
    public void user_is_on_home_pages() { driver.get("https://demo.guru99.com/test/newtours");}

    @When("user click login links")
    public void user_click_login_links() {
        driver.findElement(By.xpath("//a[contains(.,'SIGN-ON')]")).click();
    }
    @And("^the user enter (.*) and (.*)$")
    public void the_user_enter_test1_and_test1(String usernames,String passwords) {
        driver.findElement(By.xpath("//input[contains(@name,'userName')]")).sendKeys(usernames);
        driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys(passwords);

    }
    @And("user click submit buttons")
    public void user_click_submit_buttons() {
        driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
    }
    @Then("user is navigated to the Mercury home pages")
    public void user_is_navigated_to_the_mercury_home_pages() {
        System.out.println(driver.getCurrentUrl());
        driver.quit();

    }
     public  static String getScreenshot(WebDriver driver){
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src =ts.getScreenshotAs(OutputType.FILE);
        String path =System.getProperty("user.dir") + "/MyScreenshots/"+ System.currentTimeMillis() +".png";
        File destination = new File(path);
        try{
            FileUtils.copyFile(src, destination);
        } catch (IOException e) {
            System.out.println("Capture Failed"+ e.getMessage());
        }

        return path;

    }
}
