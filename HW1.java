package class05.Homework;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
@here
http://practice.syntaxtechs.net/javascript-alert-box-demo.php
click on the last alert
send keys and accept it

Note: dont worry if the text u send doesnt appears up in the textbox
 */
public class HW1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url = "http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser = "safari";
        openBrowserAndLaunchApplication(url, browser);

        WebElement alert2Btn=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert2Btn.click();
        Thread.sleep(2000);

        Alert confirmationAlert3=driver.switchTo().alert();
        confirmationAlert3.sendKeys("abracadabra");
        Thread.sleep(2000);
        confirmationAlert3.accept();

        driver.quit();
    }
}
