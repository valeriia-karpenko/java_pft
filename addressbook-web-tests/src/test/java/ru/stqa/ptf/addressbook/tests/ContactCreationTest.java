package ru.stqa.ptf.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.ptf.addressbook.TestBase;
import ru.stqa.ptf.addressbook.model.ContactData;
import ru.stqa.ptf.addressbook.model.GroupData;


public class ContactCreationTest  extends TestBase {

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    }
    app.getContactHelper().initNewContactPage();
    app.getContactHelper().fillContactForm(new ContactData("Vikad", "Sergeevich",
            "Vikodinov", "vik", "SPb", "+79118594468", "rr@gmail.com"), true);
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().goToHomePage();
  }

}
