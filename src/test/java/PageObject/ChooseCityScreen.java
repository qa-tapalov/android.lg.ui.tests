package PageObject;

import BaseClass.BaseClass;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class ChooseCityScreen extends BaseClass {
    private final By titleCity = MobileBy.id("com.ladygentleman.app:id/title");



    private final By descCity = MobileBy.id("com.ladygentleman.app:id/subtitle");
    private final By cityConteiner = MobileBy.id("com.ladygentleman.app:id/cities_recycler");
    private final By cityMoscow = MobileBy.id("//android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[1]");
    private final By cityStP = MobileBy.id("//android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[2]");
    private final By cityOther = MobileBy.id("//android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[6]");
    private final By alertGoogleGeo = MobileBy.id("com.android.permissioncontroller:id/grant_dialog");
    private final By duringUseGoogleGeo = MobileBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    private final By oneTimeGoogleGeo = MobileBy.id("com.android.permissioncontroller:id/permission_allow_one_time_button");
    private final By denyGoogleGeo = MobileBy.id("com.android.permissioncontroller:id/permission_deny_button");
    private final By backBtn = MobileBy.id("com.ladygentleman.app:id/navigation_icon");
    private final By searchBar = MobileBy.id("com.ladygentleman.app:id/toolbar_search_container");

    public By getAlertGoogleGeo() {
        return alertGoogleGeo;
    }

    public By getDuringUseGoogleGeo() {
        return duringUseGoogleGeo;
    }

    public By getOneTimeGoogleGeo() {
        return oneTimeGoogleGeo;
    }

    public By getDenyGoogleGeo() {
        return denyGoogleGeo;
    }

    public By getBackBtn() {
        return backBtn;
    }

    public By getSearchBar() {
        return searchBar;
    }

    public By getChooseCity() {
        return chooseCity;
    }

    public By getRemoveSearch() {
        return removeSearch;
    }

    private final By chooseCity = MobileBy.id("//android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout");
    private final By removeSearch = MobileBy.id("com.ladygentleman.app:id/menu_icon");


    public By getTitleCity() {
        return titleCity;
    }

    public By getDescCity() {
        return descCity;
    }

    public By getCityConteiner() {
        return cityConteiner;
    }

    public By getCityMoscow() {
        return cityMoscow;
    }

    public By getCityStP() {
        return cityStP;
    }

    public By getCityOther() {
        return cityOther;
    }

    public By getGeoBtn() {
        return geoBtn;
    }

    private final By geoBtn = MobileBy.id("com.ladygentleman.app:id/button");

}
