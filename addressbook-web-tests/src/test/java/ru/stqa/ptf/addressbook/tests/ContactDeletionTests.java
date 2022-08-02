package ru.stqa.ptf.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.ptf.addressbook.TestBase;
import ru.stqa.ptf.addressbook.model.ContactData;
import ru.stqa.ptf.addressbook.model.GroupData;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() {
    app.getNavigationHelper().gotoGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    }
    app.getNavigationHelper().goToHomePage();
    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Vikadim", "Sergeevich",
              "Vikodinov", "vik", "SPb", "+79118594468", "rr@gmail.com"));
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContacts();
    app.getContactHelper().closeAlertAndGetItsText();
  }
}