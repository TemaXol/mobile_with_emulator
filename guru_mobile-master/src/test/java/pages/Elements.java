package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static org.openqa.selenium.By.xpath;

public class Elements {

    private SelenideElement

            selectRussia = $(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewSwitcher/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[10]    ")),
            firstTitle = $(id("ru.dodopizza.app:id/title")),
            delivery = $(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewSwitcher/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView")),
            onDinner = $(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewSwitcher/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.TextView")),
            selectDelivery = $(id("ru.dodopizza.app:id/delivery_button")),
            location = $(id("ru.dodopizza.app:id/delivery_location_address")),
            chooseLocation = $(id("ru.dodopizza.app:id/delivery_location_title")),
            address = $(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewSwitcher/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView")),
            checkTown = $(id("ru.dodopizza.app:id/food_menu_city_btn")),
            selectComboItem = $(xpath("//android.widget.LinearLayout[@content-desc='Комбо']")),
            checkCombo = $(id("ru.dodopizza.app:id/menu_item_product_title")),
            selectCombo = $(id("ru.dodopizza.app:id/menu_item_select_button")),
            banner = $(id("ru.dodopizza.app:id/combo_slot_title"));

    public Elements selectRus() {
        selectRussia.click();
        return this;
    }

    public Elements firstTitleCheck(String value) {
        firstTitle.shouldHave(text(value));
        return this;
    }

    public Elements deliveryCheck(String value) {
        delivery.shouldHave(text(value));
        return this;
    }

    public Elements onDinnerCheck(String value) {
        onDinner.shouldHave(text(value));
        return this;
    }

    public Elements selectDeliver() {
        selectDelivery.click();
        return this;
    }

    public Elements selectLocation(String value) {
        location.sendKeys(value);
        return this;
    }

    public Elements clickOnLocation() {
        chooseLocation.click();
        return this;
    }

    public Elements checkAddress(String value) {
        address.shouldHave(text(value));
        return this;
    }

    public Elements checkTown(String value) {
        checkTown.shouldHave(text(value));
        return this;
    }

    public Elements selectComboItem() {
        selectComboItem.click();
        return this;
    }

    public Elements checkCombo(String value) {
        checkCombo.shouldHave(text(value));
        return this;
    }

    public Elements selectCombo() {
        selectCombo.click();
        return this;
    }

    public Elements checkBanner(String value) {
        banner.shouldHave(text(value));
        return this;
    }
}
