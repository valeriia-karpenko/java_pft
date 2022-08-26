package ru.stqa.pft.mantis.appmanager;

import org.openqa.selenium.By;
import ru.lanwen.verbalregex.VerbalExpression;
import ru.stqa.pft.mantis.model.MailMessage;

import java.util.List;

public class ChangePasswordHelper extends HelperBase {

  public ChangePasswordHelper(ApplicationManager app) {
    super(app);
  }

  public void loginAsAdmin() {
    wd.get(app.getProperty("web.baseUrl") + "login_page.php");
    type(By.name("username"), "administrator");
    click(By.cssSelector("input[value='Login']"));
    type(By.id("password"), "root");
    click(By.cssSelector("input[value='Login']"));
  }

  public String changePasswordAndReturnEmail(String username) {
    click(By.xpath("//span[contains(text(),'Manage')]"));
    click(By.xpath("//a[contains(text(),'Manage Users')]"));
    click(By.linkText(username));
    String email = wd.findElement(By.name("email")).getAttribute("value");
    click(By.cssSelector("input[value='Reset Password']"));
    return email;
  }

}
