package ru.stqa.pft.mantis.appmanager;

import org.openqa.selenium.By;

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

  public void changePassword(String username) {
    click(By.xpath("//span[contains(text(),'Manage')]"));
    click(By.xpath("//a[contains(text(),'Manage Users')]"));
    click(By.linkText(username));
    click(By.cssSelector("input[value='Reset Password']"));
  }
}
