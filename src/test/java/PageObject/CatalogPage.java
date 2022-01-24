package PageObject;

import BaseClass.BaseClass;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class CatalogPage extends BaseClass {
    private final By catalog = MobileBy.xpath("//android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout[2]");
    private final By titleScreen = MobileBy.id("com.ladygentleman.app:id/toolbar_only_title_container");
    private final By womanBtn = MobileBy.id("com.ladygentleman.app:id/woman_radio_button");
    private final By menBtn = MobileBy.id("com.ladygentleman.app:id/men_radio_button");
    private final By searchBar = MobileBy.id("com.ladygentleman.app:id/cardView");
    private final By category = MobileBy.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[1]");
    private final By backBtn = MobileBy.id("com.ladygentleman.app:id/navigation_icon");
    private final By categoryTitle = MobileBy.id("com.ladygentleman.app:id/toolbar_title");
    private final By countProduct = MobileBy.id("com.ladygentleman.app:id/toolbar_subtitle");
    private final By searchIcon = MobileBy.id("com.ladygentleman.app:id/menu_icon");
    private final By openAllProductsBtn = MobileBy.xpath("/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[1]");
    private final By subCategory = MobileBy.xpath("//android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[2]");

    public By getBackBtn() {
        return backBtn;
    }

    public By getCategoryTitle() {
        return categoryTitle;
    }

    public By getCountProduct() {
        return countProduct;
    }

    public By getSearchIcon() {
        return searchIcon;
    }

    public By getOpenAllProductsBtn() {
        return openAllProductsBtn;
    }

    public By getSubCategory() {
        return subCategory;
    }

    public By getCatalog() {
        return catalog;
    }

    public By getTitleScreen() {
        return titleScreen;
    }

    public By getWomanBtn() {
        return womanBtn;
    }

    public By getMenBtn() {
        return menBtn;
    }

    public By getSearchBar() {
        return searchBar;
    }

    public By getCategory() {
        return category;
    }
}
