package PageObject;

import BaseClass.BaseClass;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class BasketPage extends BaseClass {
    private final By titleBasket = MobileBy.id("com.ladygentleman.app:id/toolbar_title");
    private final By emptyBasketImage = MobileBy.xpath("//androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ImageView");
    private final By emptyBasketDesc = MobileBy.xpath("//android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView");
    private final By emptyBasketBtn = MobileBy.id("com.ladygentleman.app:id/button");
    private final By orderNumber= MobileBy.id("");
    private final By imageProduct= MobileBy.id("");
    private final By brandName= MobileBy.id("");
    private final By productName= MobileBy.id("");
    private final By color= MobileBy.id("");
    private final By itemColor = MobileBy.id("");
    private final By size= MobileBy.id("");
    private final By deleteBtn= MobileBy.id("");
    private final By priceProduct= MobileBy.id("com.ladygentleman.app:id/price_text");
    private final By oldPrice= MobileBy.id("");
    private final By titleOrder = MobileBy.id("");
    private final By countProducts= MobileBy.id("");
    private final By countValue= MobileBy.id("");
    private final By priceOrder= MobileBy.id("");
    private final By priceValue= MobileBy.id("");
    private final By delivery= MobileBy.id("");
    private final By deliveryValue= MobileBy.id("");
    private final By pointCard= MobileBy.id("");
    private final By pointsCardValue= MobileBy.id("");
    private final By discount= MobileBy.id("");
    private final By discountValue= MobileBy.id("");
    private final By totalPrice= MobileBy.id("");
    private final By totalPriceValue= MobileBy.id("");
    private final By orderBtn= MobileBy.id("com.ladygentleman.app:id/button");

    public By getTitleBasket() {
        return titleBasket;
    }

    public By getEmptyBasketImage() {
        return emptyBasketImage;
    }

    public By getEmptyBasketDesc() {
        return emptyBasketDesc;
    }

    public By getEmptyBasketBtn() {
        return emptyBasketBtn;
    }

    public By getOrderNumber() {
        return orderNumber;
    }

    public By getImageProduct() {
        return imageProduct;
    }

    public By getBrandName() {
        return brandName;
    }

    public By getProductName() {
        return productName;
    }

    public By getColor() {
        return color;
    }

    public By getItemColor() {
        return itemColor;
    }

    public By getSize() {
        return size;
    }

    public By getDeleteBtn() {
        return deleteBtn;
    }

    public By getPriceProduct() {
        return priceProduct;
    }

    public By getOldPrice() {
        return oldPrice;
    }

    public By getTitleOrder() {
        return titleOrder;
    }

    public By getCountProducts() {
        return countProducts;
    }

    public By getCountValue() {
        return countValue;
    }

    public By getPriceOrder() {
        return priceOrder;
    }

    public By getPriceValue() {
        return priceValue;
    }

    public By getDelivery() {
        return delivery;
    }

    public By getDeliveryValue() {
        return deliveryValue;
    }

    public By getPointCard() {
        return pointCard;
    }

    public By getPointsCardValue() {
        return pointsCardValue;
    }

    public By getDiscount() {
        return discount;
    }

    public By getDiscountValue() {
        return discountValue;
    }

    public By getTotalPrice() {
        return totalPrice;
    }

    public By getTotalPriceValue() {
        return totalPriceValue;
    }

    public By getOrderBtn() {
        return orderBtn;
    }
}
