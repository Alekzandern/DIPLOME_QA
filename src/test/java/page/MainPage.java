package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
public class MainPage {

    private final SelenideElement buyForm = $(byText("Купить"));
    private final SelenideElement buyByCreditForm = $(byText("Купить в кредит"));

    public PaymentFormBuyPage payWithDebitCard() {
        buyForm.click();
        return new PaymentFormBuyPage();
    }

    public PaymentFormBuyByCreditPage payWithCreditCard() {
        buyByCreditForm.click();
        return new PaymentFormBuyByCreditPage();
    }

}



