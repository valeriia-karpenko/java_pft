package ru.stqa.ptf.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.ptf.addressbook.TestBase;
import ru.stqa.ptf.addressbook.model.ContactData;
import ru.stqa.ptf.addressbook.model.GroupData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getNavigationHelper().gotoGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    }
    app.getNavigationHelper().goToHomePage();
    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Vikadim","Sergeevich","Vikodinov",
              "vik","SPb","+79118594468","rr@gmail.com"));
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Vasya", "Sergeevich",
            "Vikodinov", "vik", "Msk", "+79118594468", "test@gmail.com"), false);
    app.getContactHelper().updateContactModification();
  }
}
