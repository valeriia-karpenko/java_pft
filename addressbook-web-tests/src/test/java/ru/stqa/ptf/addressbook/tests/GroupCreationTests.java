package ru.stqa.ptf.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.ptf.addressbook.model.GroupData;
import ru.stqa.ptf.addressbook.TestBase;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getGroupHelper().createGroup(new GroupData("test1", null, null));
  }

}
