package ru.stqa.pft.mantis.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.mantis.model.MailMessage;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.List;

public class ChangePasswordTests extends  TestBase{

  @BeforeMethod
  public void startBeforeMailServer() {
    app.mail().start();
  }

  @Test
  public void testChangePassword() throws IOException, MessagingException {
//    app.changePassword().login(getProperty("web.adminLogin"), getProperty("web.adminPassword"));
    app.changePassword().loginAsAdmin();
    app.changePassword().changePassword("user1");
    List<MailMessage> mailMessages = app.mail().waitForMail(1, 10000);
  }

  @AfterMethod(alwaysRun = true)
  public void stopBeforeMailServer() {
    app.mail().stop();
  }
}
