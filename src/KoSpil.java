import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KoSpil {

    ChromeDriver driver;
    WebDriverWait wait;

    public KoSpil () {
        System.setProperty("webdriver.chrome.driver", ".idea\\Dependencies\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    public void run() {
        driver.get("https://game.scratcher.io/quiz-ko");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/div[3]/div[2]/div[2]/button[1]")));

        //Start the quiz
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div[2]/div[2]/button[1]")).click();
        //First question
        clickElement(driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div[2]/div[1]/div/div[2]/div[1]/div[1]/div[3]/div[2]/p[2]")));
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div[2]/div[1]/div/div[2]/div[1]/div[1]/button")).click();
        //Second question
        clickElement(driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[3]/div[2]/p[3]")));
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div[2]/div[1]/div/div[2]/div[1]/div[2]/button")).click();
        //Third question
        clickElement(driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div[2]/div[1]/div/div[2]/div[1]/div[3]/div[3]/div[2]/p[2]")));
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div[2]/div[1]/div/div[2]/div[1]/div[3]/button")).click();
        //Fourth question
        clickElement(driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div[2]/div[1]/div/div[2]/div[1]/div[4]/div[3]/div[2]/p[2]")));
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div[2]/div[1]/div/div[2]/div[1]/div[4]/button")).click();
        //Fifth question
        clickElement(driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div[2]/div[1]/div/div[2]/div[1]/div[5]/div[3]/div[2]/p[1]")));
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div[2]/div[1]/div/div[2]/div[1]/div[5]/button")).click();
    }

    private void clickElement(WebElement e) {
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(e)).click();
    }
}
