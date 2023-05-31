package class05.Homework;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
HW2:
goto https://chercher.tech/practice/frames

click on check box
then select bay cat from drop down
then enter text in text box
 */
public class HW2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url = "https://chercher.tech/practice/frames";
        String browser = "safari";
        openBrowserAndLaunchApplication(url, browser);

        driver.switchTo().frame(0);
        WebElement frame3=driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);

        driver.findElement(By.id("a")).click();

        driver.switchTo().defaultContent();

       Thread.sleep(2000);

        driver.switchTo().frame("frame2");

        WebElement dd = driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel = new Select(dd);
        sel.selectByVisibleText("Baby Cat");

        driver.switchTo().defaultContent();

       Thread.sleep(2000);

        driver.switchTo().frame("frame1");
        WebElement textBox= driver.findElement(By.xpath("//input"));
        textBox.sendKeys("abracadabra");

        Thread.sleep(2000);

        driver.quit();
    }
}
