package io.eroshenkoam.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public interface BaseWebDriverListener extends WebDriverEventListener {

    default void beforeAlertAccept(WebDriver driver) {
    }

    default void afterAlertAccept(WebDriver driver) {
    }

    default void afterAlertDismiss(WebDriver driver) {
    }

    default void beforeAlertDismiss(WebDriver driver) {
    }

    default void beforeNavigateTo(String url, WebDriver driver) {
    }

    default void afterNavigateTo(String url, WebDriver driver) {
    }

    default void beforeNavigateBack(WebDriver driver) {
    }

    default void afterNavigateBack(WebDriver driver) {
    }

    default void beforeNavigateForward(WebDriver driver) {
    }

    default void afterNavigateForward(WebDriver driver) {
    }

    default void beforeNavigateRefresh(WebDriver driver) {
    }

    default void afterNavigateRefresh(WebDriver driver) {
    }

    default void beforeFindBy(By by, WebElement element, WebDriver driver) {
    }

    default void afterFindBy(By by, WebElement element, WebDriver driver) {
    }

    default void beforeClickOn(WebElement element, WebDriver driver) {
    }

    default void afterClickOn(WebElement element, WebDriver driver) {
    }

    default void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
    }

    default void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
    }

    default void beforeScript(String script, WebDriver driver) {
    }

    default void afterScript(String script, WebDriver driver) {
    }

    default void beforeSwitchToWindow(String windowName, WebDriver driver) {
    }

    default void afterSwitchToWindow(String windowName, WebDriver driver) {
    }

    default void onException(Throwable throwable, WebDriver driver) {
    }

    default <X> void beforeGetScreenshotAs(OutputType<X> target) {
    }

    default <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
    }

    default void beforeGetText(WebElement element, WebDriver driver) {
    }

    default void afterGetText(WebElement element, WebDriver driver, String text) {
    }

}
