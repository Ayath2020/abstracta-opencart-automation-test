package us.abstracta.opencart.Steps;

import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.Keys;
import us.abstracta.opencart.Pages.HomePageOpenCart;
import us.abstracta.opencart.Utils.Dictionary;

public class CarritoComprasSteps {


    @Page
    HomePageOpenCart homepage;

    @Step("Open Page")
    public void openPage() {
        homepage.openUrl(Dictionary.getUrl());
    }

    @Step("Search iPhone")
    public void searchIPhone() {
        homepage.getSearchBar().waitUntilVisible().clear();
        homepage.getSearchBar().sendKeys(Dictionary.getNameProduct());
        homepage.getSearchBar().sendKeys(Keys.ENTER);
    }

    @Step("Seleccionar primer elemento de la busqueda")
    public void selectPrimerElemento() {
        homepage.getIphoneImg().waitUntilClickable().click();
    }

    @Step("Add to Cart")
    public void addToCart() {
        homepage.getBtnAddCart().waitUntilClickable().click();
    }

    @Step("Go to Cart")
    public void goToCart() {
        homepage.getCartTotal().waitUntilClickable().click();
        homepage.getViewCarTotal().waitUntilClickable().click();
    }

    @Step("Validar que el producto '{0}' se agrega")
    public void validarProductoAgregado(String textoEsperado) {
        homepage.getTxtProductName().waitUntilVisible().shouldContainText(textoEsperado);
    }

    @Step("Eliminar producto")
    public void eliminarProducto() {
        homepage.getBtnEliminar().waitUntilVisible().click();
    }

    @Step("Validar que el producto '{0}' se elimina")
    public void validarProductoEliminado(String textoEsperado) {
        homepage.getTxtEmptyCar().waitUntilVisible().shouldContainText(Dictionary.getMsjEmptyCar());
    }

}