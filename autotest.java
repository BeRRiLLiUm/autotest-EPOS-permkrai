package LoginSite;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class LoginTest extends Settings {
    @Test
    public void loginTest() throws InterruptedException {
        String currentWindow = driver.getWindowHandle();

        driver.get("https://epos.permkrai.ru/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(3000);
        Assert.assertEquals("ЭПОС Информационный портал – Электронная Пермская Образовательная Система", driver.getTitle());
        Thread.sleep(500);

        WebElement element1 = driver.findElement(By.linkText("Вход"));
        element1.click();
        Thread.sleep(1000);

        WebElement element2 = driver.findElement(By.linkText("Для обучающихся и законных представителей"));
        element2.click();
        Thread.sleep(1000);
        Assert.assertEquals("Региональный сервис аутентификации и авторизации гражданина Пермского края", driver.getTitle());

        WebElement element3 = driver.findElement(By.linkText("Вход через профиль Госуслуги"));
        element3.click();
        Thread.sleep(1000);
        Assert.assertEquals("Авторизация", driver.getTitle());

        WebElement element4 = driver.findElement(By.id("login"));
        element4.sendKeys("irinalybaeva395@gmail.com");
        Thread.sleep(1000);

        WebElement element5 = driver.findElement(By.id("password"));
        element5.sendKeys(                                                                                                  "NT,TKTYMq1+");
        Thread.sleep(1000);

        WebElement element6 = driver.findElement(By.id("loginByPwdButton"));
        element6.click();
        Thread.sleep(1000);
        Assert.assertEquals("ЭПОС Информационный портал – Электронная Пермская Образовательная Система", driver.getTitle());

        WebElement element7 = driver.findElement(By.linkText("19"));
        element7.click();
        Thread.sleep(1000);

        WebElement element8 = driver.findElement(By.linkText("19.05.2022 в 16.00 состоится вебинар для администраторов ЭПОС. Тема вебинара: «Итоги работы в ЭПОС.Школа за апрель 2022 года. Архивирование данных в ЭЖД ЭПОС.Школа»."));
        element8.click();
        Thread.sleep(1000);
        Assert.assertEquals("19.05.2022 в 16.00 состоится вебинар для администраторов ЭПОС. Тема вебинара: «Итоги работы в ЭПОС.Школа за апрель 2022 года. Архивирование данных в ЭЖД ЭПОС.Школа». – ЭПОС Информационный портал", driver.getTitle());

        WebElement element81 = driver.findElement(By.linkText("Главная"));
        element81.click();
        Thread.sleep(1000);
        Assert.assertEquals("ЭПОС Информационный портал – Электронная Пермская Образовательная Система", driver.getTitle());

        WebElement element9 = driver.findElement(By.cssSelector(".block-item.small.light-orange"));
        element9.click();
        Thread.sleep(1000);
        //public void windowSwitch();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(currentWindow)) {
                driver.switchTo().window(handle); }
        }
            Assert.assertEquals("Дополнительное образование – ЭПОС Информационный портал", driver.getTitle());

        WebElement element10 = driver.findElement(By.linkText("Административной команде"));
        element10.click();
        Thread.sleep(1000);
        Assert.assertEquals("Административной команде – ЭПОС Информационный портал", driver.getTitle());

        WebElement element11 = driver.findElement(By.linkText("Перейти в ЕСЗ"));
        element11.click();
        Thread.sleep(2000);
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(currentWindow)) {
                driver.switchTo().window(handle); }
        }
        Assert.assertEquals("Государственные и муниципальные услуги и сервисы Пермского края", driver.getTitle());
        Thread.sleep(2000);
        driver.close();

        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(currentWindow)) {
                driver.switchTo().window(handle); }
        }
        Thread.sleep(2000);
        driver.close();
        driver.switchTo().window(currentWindow);
        Thread.sleep(2000);
        Assert.assertEquals("ЭПОС Информационный портал – Электронная Пермская Образовательная Система", driver.getTitle());
    }
}
