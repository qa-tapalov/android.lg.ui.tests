package PageObject;

import BaseClass.BaseClass;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class ProfilePage extends BaseClass {
    private final By profile = MobileBy.xpath("//android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout[2]");
    private final By titleScreen = MobileBy.id("com.ladygentleman.app:id/textView3");
    private final By authBtn = MobileBy.id("com.ladygentleman.app:id/button");
    private final By titleEmptyAuth = MobileBy.xpath("//androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[1]");
    private final By descEmptyAuth = MobileBy.xpath("//androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[2]");
    private final By titleAuth = MobileBy.xpath("//android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout[1]/android.widget.TextView");
    private final By closeBtn = MobileBy.id("com.ladygentleman.app:id/exit");
    private final By phoneField = MobileBy.id("com.ladygentleman.app:id/number");
    private final By nextBtn = MobileBy.id("com.ladygentleman.app:id/blade");
    private final By titleConfirmationPhone = MobileBy.id("com.ladygentleman.app:id/title");
    private final By descConfirmationPhone = MobileBy.id("com.ladygentleman.app:id/number");
    private final By codeField = MobileBy.id("com.ladygentleman.app:id/code");
    private final By reSendCode = MobileBy.id("com.ladygentleman.app:id/request_code");

    public By getProfile() {
        return profile;
    }

    public By getTitleScreen() {
        return titleScreen;
    }

    public By getAuthBtn() {
        return authBtn;
    }

    public By getTitleEmptyAuth() {
        return titleEmptyAuth;
    }

    public By getDescEmptyAuth() {
        return descEmptyAuth;
    }

    public By getTitleAuth() {
        return titleAuth;
    }

    public By getCloseBtn() {
        return closeBtn;
    }

    public By getPhoneField() {
        return phoneField;
    }

    public By getNextBtn() {
        return nextBtn;
    }

    public By getTitleConfirmationPhone() {
        return titleConfirmationPhone;
    }

    public By getDescConfirmationPhone() {
        return descConfirmationPhone;
    }

    public By getCodeField() {
        return codeField;
    }

    public By getReSendCode() {
        return reSendCode;
    }
}
