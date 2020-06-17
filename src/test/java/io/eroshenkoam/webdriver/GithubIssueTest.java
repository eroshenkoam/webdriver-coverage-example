package io.eroshenkoam.webdriver;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.IOException;
import java.util.Objects;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class GithubIssueTest {

    private LocatorListener locatorsListener;

    private final static int ISSUE_NUMBER = 12;

    @BeforeEach
    public void initDriver() {
        final EventFiringWebDriver driver = new EventFiringWebDriver(new ChromeDriver());
        locatorsListener = new LocatorListener();
        driver.register(locatorsListener);
        WebDriverRunner.setWebDriver(driver);
    }

    @Test
    public void testIssueCreate() {
        step("Открываем главную страницу", () -> {
            open("https://github.com");
        });
        step("Открываем страницу с репозиторием", () -> {
            $x("//*[contains(@class, 'header-search-input')]").click();
            $x("//*[contains(@class, 'header-search-input')]").sendKeys("eroshenkoam/allure-example");
            $x("//*[contains(@class, 'header-search-input')]").submit();
            $x("//a[@href='/eroshenkoam/allure-example']").click();
        });
        step("Открываем страницу с задачами в репозитории", () -> {
            $x("//a[contains(@data-selected-links, 'repo_issues')]").click();
        });
        step("Проверяем наличие задачи с ID=" + ISSUE_NUMBER, () -> {
            $x("//a[@id='issue_12_link']").exists();
        });
    }

    @AfterEach
    public void stopDriver() throws IOException {
        locatorsListener.addAttachment();
        if (Objects.nonNull(WebDriverRunner.getWebDriver())) {
            WebDriverRunner.getWebDriver().quit();
        }
    }

}
