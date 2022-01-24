package PageObject;

import BaseClass.BaseClass;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class MainPage extends BaseClass {
    private final By main = MobileBy.xpath("//android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout[1]");
    private final By searchBar = MobileBy.id("com.ladygentleman.app:id/cardView");
    private final By segmentsGroup = MobileBy.id("com.ladygentleman.app:id/segments_radio_group");
    private final By womanBtn = MobileBy.id("com.ladygentleman.app:id/woman_radio_button");
    private final By menBtn = MobileBy.id("com.ladygentleman.app:id/men_radio_button");
    private final By slider = MobileBy.id("com.ladygentleman.app:id/slider");
    private final By sliderDots= MobileBy.id("com.ladygentleman.app:id/slider_dots");
    private final By titleSale = MobileBy.id("com.ladygentleman.app:id/title");
    private final By descSale = MobileBy.id("com.ladygentleman.app:id/description");
    private final By carouselCollections = MobileBy.id("com.ladygentleman.app:id/compilation_recycler");
    private final By popularItems= MobileBy.id("com.ladygentleman.app:id/section_title_text");
    private final By allItemsBtn= MobileBy.id("com.ladygentleman.app:id/selected_map");
    private final By carouselPopularProducts= MobileBy.id("com.ladygentleman.app:id/popular_products_recycler");
    private final By itemPopularProduct= MobileBy.id("//androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");
//    private final By = MobileBy.id("");
//    private final By = MobileBy.id("");
//    private final By = MobileBy.id("");


    public By getMain() {
        return main;
    }

    public By getSearchBar() {
        return searchBar;
    }

    public By getSegmentsGroup() {
        return segmentsGroup;
    }

    public By getWomanBtn() {
        return womanBtn;
    }

    public By getMenBtn() {
        return menBtn;
    }

    public By getSlider() {
        return slider;
    }

    public By getSliderDots() {
        return sliderDots;
    }

    public By getTitleSale() {
        return titleSale;
    }

    public By getDescSale() {
        return descSale;
    }

    public By getCarouselCollections() {
        return carouselCollections;
    }

    public By getPopularItems() {
        return popularItems;
    }

    public By getAllItemsBtn() {
        return allItemsBtn;
    }

    public By getCarouselPopularProducts() {
        return carouselPopularProducts;
    }

    public By getItemPopularProduct() {
        return itemPopularProduct;
    }
}
