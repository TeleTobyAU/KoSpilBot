import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

class BiSpil {
    private ChromeDriver driver;
    private WebDriverWait wait;

    BiSpil() {
        System.setProperty("webdriver.chrome.driver", ".idea\\Dependencies\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("https://game.scratcher.io/bistik-1");
    }

    void run() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/div[4]/div[2]/div[2]/button[1]")));

        //Start the quiz
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[4]/div[2]/div[2]/button[1]")).click();
        //Add all pieces to list in order
        List<WebElement> es = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            es.addAll(driver.findElements(By.cssSelector("[data-id=\"" + (i + 1) + "\"")));
        }
        //Flip pieces
        for (int i = 0; i < es.size(); i++) {
            clickElement(es.get(i));

            if ((i + 1) % 2 == 0) {
                try {
                    Thread.sleep(950);
                } catch (Exception e) {
                    //Hafla
                }
            }
        }
        //Restart
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div[4]/div[2]/div[1]/div/div[3]/div[3]/div/a[1]")));
        driver.get("https://game.scratcher.io/bistik-1");
    }

    private void clickElement(WebElement e) {
        wait.until(ExpectedConditions.elementToBeClickable(e)).click();
    }

    void stop() {
        driver.close();
    }
}