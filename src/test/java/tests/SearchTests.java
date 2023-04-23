package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.Elements;
import pages.Pages;
import utils.RandomData;

import static io.qameta.allure.Allure.step;

public class SearchTests extends TestBase {

    Pages pages = new Pages();
    Elements elements = new Elements();
    RandomData randomData = new RandomData();

    @Test
    @Tag("android")
    void checkTollBar() {
        step("Select Catalog", () -> {
            elements.skipAdd();
            elements.selectCatalog();
        });
        step("Select Map Item", () -> {
            elements.selectMap();
            elements.checkSale(randomData.saleVcus);
        });
        step("Select Profile", () -> {
            elements.selectProfile();
            elements.checkSale(randomData.saleVcus);
        });
        step("select Support", () -> {
            elements.selectSupport();
            elements.checkSupport(randomData.support);
        });
    }

    @Test
    @Tag("android")
    void checkInsertNumberPage() {
        step("Select Map Item", () -> {
            elements.skipAdd();
            elements.selectMap();
            elements.checkSale(randomData.saleVcus);
        });
        step("Check insert number page", () -> {
            elements.inputNumberPage();
            elements.checkAgreement(randomData.agreementText);
        });
        step("Check back from the Numbers page", () -> {
            elements.clickBackButton();
            elements.checkSale(randomData.saleVcus);
        });
    }


    @Test
    @Tag("android")
    void checkSupport() {
        step("Select Support Item", () -> {
            elements.skipAdd();
            elements.selectSupport();
            elements.checkSupport(randomData.support);
        });
        step("Check support chat", () -> {
            elements.selectSupportChat();
            elements.checkSupportTitle(randomData.supportTitle);
        });
        step("Return to support", () -> {
            elements.clickBackFromChat();
            elements.checkSupport(randomData.support);
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
    @Tag("local")
    void successCitySelect() {

        step("Check " + pages.pageOne + " text and tap Skip", () -> {
            elements.selectRus();
            elements.firstTitleCheck(randomData.firstTit);
        });
        step("Check " + pages.pageTwo + " text and tap Got It", () -> {
            elements.selectDeliver();
            elements.checkAddress(randomData.address);
            elements.selectLocation(randomData.location);
        });
        step("Check " + pages.pageFour + " text", () ->
                elements.clickOnLocation());
        elements.checkTown(randomData.town);
    }

    @Test
    @Tag("local")
    void makeOrder() {

        step("Open App and select location", () -> {
            elements.selectRus();
            elements.selectDeliver();
            elements.selectLocation(randomData.location);
            elements.clickOnLocation();
            elements.checkTown(randomData.town);
        });
        step("Select Combo menu item", () -> {
            elements.selectComboItem();
            elements.checkCombo(randomData.comboSale);

        });
        step("Open sale Combo", () -> {
            elements.selectCombo();
            elements.checkBanner(randomData.pizzaBanner);
        });

    }
}