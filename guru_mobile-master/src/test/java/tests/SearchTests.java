package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.Elements;
import pages.Pages;
import utils.RandomData;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.xpath;

public class SearchTests extends TestBase {

    Pages pages = new Pages();
    Elements elements = new Elements();

    RandomData randomData = new RandomData();

    @Test
    @Tag("android")
    void successfulSearchTest() {
        step("Type search", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Java");
        });
        step("Verify content", () -> {
            $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                    .shouldHave(sizeGreaterThan(0));
        });
    }

    @Test
    @Tag("local")
    void successCountrySelect() {

        step("Check correct selecting Country", () -> {
           elements.selectRus();
            elements.firstTitleCheck(randomData.firstTit);
            elements.deliveryCheck(randomData.delivery);
            elements.onDinnerCheck(randomData.onDinner);
        });

    }

    @Test
    @Tag("local1")
    void successCitySelect() {

        step("Check " + pages.pageOne + " text and tap Skip", () -> {
            sleep(3000);
            $(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewSwitcher/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[10]    ")).click();

        });
        step("Check " + pages.pageTwo + " text and tap Got It", () -> {
            $(id("ru.dodopizza.app:id/delivery_button")).click();
//            $(id("org.wikipedia.alpha:id/view_announcement_action_negative")).click();
            $(id("ru.dodopizza.app:id/delivery_location_address")).sendKeys("Moscow-city");

        });
        step("Check " + pages.pageFour + " text", () ->
                $(id("ru.dodopizza.app:id/delivery_location_title")).click());
        sleep(3000);
    }

//    @Test
//    @Tag("local")
//    void successfulWikiTest() {
//
//        step("Check " + pages.pageOne + " text and tap Skip", () -> {
//            $(id("org.wikipedia.alpha:id/primaryTextView"))
//                    .shouldHave(text(pages.pageOne));
//            $(id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")).click();
//        });
//        step("Check " + pages.pageTwo + " text and tap Got It", () -> {
//            $(id("org.wikipedia.alpha:id/view_announcement_text"))
//                    .shouldHave(text(pages.pageTwo));
////            $(id("org.wikipedia.alpha:id/view_announcement_action_negative")).click();
//            $(id("org.wikipedia.alpha:id/view_announcement_action_positive")).click();
//        });
//        step("Check " + pages.pageFour + " text", () ->
//                $(id("org.wikipedia.alpha:id/feed_content_type_title"))
//                        .shouldHave(text(pages.pageFour)));
//        back();
//        step("Check " + pages.pageThree + " tap on the image", () -> {
//            $(id("org.wikipedia.alpha:id/view_card_header_title"))
//                    .shouldHave(text(pages.pageThree));
//        });
//    }

    @Tag("android1")
    @Test
    void checkGoogle() {

        step("Type search", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("google");
        });
        step("Verify content", () -> {
            $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                    .shouldHave(sizeGreaterThan(0));
        });
    }

    @Test()
    @Tag("android")
    void checkSettingsTest() {
        step("Type search", () -> {
            $(id("org.wikipedia.alpha:id/menu_overflow_button")).click();
        });
        step("Check button log in", () -> {
            $(id("org.wikipedia.alpha:id/explore_overflow_settings")).shouldHave(text("Settings"));
            $(id("org.wikipedia.alpha:id/explore_overflow_settings")).click();
        });
        step("Verify content", () -> {
            $(id("android:id/title")).shouldHave(text("Wikipedia language"));
        });
    }

    @Test()
    @Tag("ios")
    void loginTestFlight() {

        step("Type search", () -> {
            $(accessibilityId("Text Button")).click();
            $(accessibilityId("Text Input")).sendKeys("test@browserstack.com");
        });
        step("Verify content found", () ->
                $(accessibilityId("Text Output")).shouldBe(visible));
    }
}