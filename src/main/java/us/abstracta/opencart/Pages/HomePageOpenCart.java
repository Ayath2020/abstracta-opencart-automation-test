package us.abstracta.opencart.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePageOpenCart extends PageObject {



    @FindBy(name = "search")
    private WebElementFacade searchBar;

    @FindBy(xpath = "//a[text()='iPhone']")
    private WebElementFacade IphoneImg;

    @FindBy(id = "button-cart")
    private WebElementFacade btnAddCart;

    @FindBy(id = "cart")
    private WebElementFacade cartTotal;

    @FindBy(xpath = "//a[contains(@href, 'checkout/cart')]//strong[text()=' View Cart']")
    private WebElementFacade viewCarTotal;

    @FindBy(xpath = "/html/body/div[2]/div/div/form/div/table/tbody/tr/td[2]/a")
    private WebElementFacade txtProductName;

    @FindBy(xpath = "//button[.//i[contains(@class, 'fa-times-circle')]]")
    private WebElementFacade btnEliminar;

    @FindBy(xpath = "//p[not(@class) and normalize-space()='Your shopping cart is empty!']")
    private WebElementFacade txtEmptyCar;

    public WebElementFacade getSearchBar() { return searchBar; }
    public WebElementFacade getIphoneImg() { return IphoneImg; }
    public WebElementFacade getBtnAddCart() { return btnAddCart; }
    public WebElementFacade getCartTotal() { return cartTotal; }
    public WebElementFacade getViewCarTotal() { return viewCarTotal; }
    public WebElementFacade getTxtProductName() { return txtProductName; }
    public WebElementFacade getBtnEliminar() { return btnEliminar; }
    public WebElementFacade getTxtEmptyCar() { return txtEmptyCar; }
}
