package stepDefinitions.uiSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class MedunnaStepDefinition {
    MedunnaPage medunnaPage = new MedunnaPage();
    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("kullanici Sign in butonuna tiklar")
    public void kullaniciSignInButonunaTiklar() {
        medunnaPage.signIn.click();
        medunnaPage.login.click();
    }

    @And("Username ve Password girer")
    public void usernameVePasswordGirer() throws InterruptedException {
        medunnaPage.username.sendKeys(ConfigReader.getProperty("drUsername"));
        medunnaPage.password.sendKeys(ConfigReader.getProperty("drPassword"));

    }

    @And("kullanici doktor hesabi ile giris yapar")
    public void kullaniciDoktorHesabiIleGirisYapar() {
        medunnaPage.signInGiris.click();

    }

    @And("kullanici atanan hastalari goruntuler")
    public void kullaniciAtananHastalariGoruntuler() {
        medunnaPage.myPages.click();
        medunnaPage.myAppoitments.click();
    }

    @And("kullanici hasta duzenleye tiklar")
    public void kullaniciHastaDuzenleyeTiklar() {
        medunnaPage.edit.click();
    }

    @And("kullanici request a test botununa tiklar")
    public void kullaniciRequestATestBotununaTiklar() {
        medunnaPage.requestATest.click();
    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
    }


}
