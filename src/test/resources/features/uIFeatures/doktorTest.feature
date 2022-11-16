Feature: Request A Test

  @gb1

  Scenario: Doktor hesabi ile hastalarda test isteme

    Given kullanici "medunna" sayfasina gider
    Then kullanici Sign in butonuna tiklar
    And Username ve Password girer
    And kullanici doktor hesabi ile giris yapar
    And kullanici atanan hastalari goruntuler
    And kullanici hasta duzenleye tiklar
    And kullanici request a test botununa tiklar
    And kullanici sayfayi kapatir

