package ru.stqa.ptf.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.ptf.addressbook.TestBase;
import ru.stqa.ptf.addressbook.model.ContactData;
import ru.stqa.ptf.addressbook.model.Contacts;
import ru.stqa.ptf.addressbook.model.GroupData;
import ru.stqa.ptf.addressbook.model.Groups;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class AddContactInGroupTest extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
    if (app.db().groups().size() == 0) {
      app.goTo().groupPage();
      app.group().create(new GroupData().withName("test1"));
    }

    if (app.db().contacts().size() == 0) {
      app.goTo().homePage();
      app.contact().create(new ContactData().withName("Vikadim").withMiddle_name("Sergeevich")
              .withLast_name("Vikodinov").withNickname("vik").withAddress("SPb").withMobilePhone("+79118594468")
              .withEmail1("rr@gmail.com"));
    }
  }

  @Test
  public void testAddContactInGroup() {
    Groups groups = app.db().groups();
    Contacts contacts = app.db().contacts();
    ContactData contact = getContactWithoutGroup(contacts);
    if (contact == null) {
      app.goTo().homePage();
      app.contact().create(new ContactData().withName("Vikadim").withMiddle_name("Sergeevich")
              .withLast_name("Vikodinov").withNickname("vik").withAddress("SPb").withMobilePhone("+79118594468")
              .withEmail1("rr@gmail.com"));
    }
    GroupData group = groups.iterator().next();
    app.goTo().homePage();
    app.contact().addContactInGroup(contact, group);
    Contacts after = app.db().contacts();
    assertThat(after, equalTo(contacts.without(contact).withAdded(contact.inGroup(group))));
  }

  private ContactData getContactWithoutGroup(Contacts contacts) {
    for (ContactData contact: contacts) {
      if (contact.getGroups().size() == 0) {
        return contact;
      }
    }
    return null;
  }
}
