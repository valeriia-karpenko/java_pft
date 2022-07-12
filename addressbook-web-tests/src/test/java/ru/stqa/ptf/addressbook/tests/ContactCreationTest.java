package ru.stqa.ptf.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.ptf.addressbook.TestBase;
import ru.stqa.ptf.addressbook.model.ContactData;


public class ContactCreationTest  extends TestBase {

  @Test
  public void testContactCreation() {
    app.getContactHelper().initNewContactPage();
    app.getContactHelper().fillContactForm(new ContactData("Vikadim", "Sergeevich", "Vikodinov", "vik", "SPb", "+79118594468", "rr@gmail.com", "test1"), true);
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().goToHomePage();
  }

}
