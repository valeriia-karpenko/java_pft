package ru.stqa.ptf.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.ptf.addressbook.TestBase;
import ru.stqa.ptf.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getNavigationHelper().goToHomePage();
    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Vikadim", "Sergeevich",
              "Vikodinov", "vik", "SPb", "+79118594468", "rr@gmail.com",
              "test1"), true);
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Ivan", "Sergeevich",
            "Vikodinov", "vik", "Msk", "+79118594468", "test@gmail.com",
            null), false);
    app.getContactHelper().updateContactModification();
  }
}
