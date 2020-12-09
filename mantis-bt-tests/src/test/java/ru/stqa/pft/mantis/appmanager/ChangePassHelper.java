package ru.stqa.pft.mantis.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.mantis.tests.TestBase;

public class ChangePassHelper extends HelperBase {

    public ChangePassHelper(ApplicationManager app) {
        super(app);
    }

    public void signIn(String username, String password) {
        type(By.name("username"), username);
        type(By.name("password"), password);
        click(By.cssSelector("input[value='Login']"));
    }
    public void manageUsers(String user) {
        click(By.cssSelector("body > div:nth-child(4) > p > span:nth-child(1) > a"));
        click(By.xpath("//html/body/table[3]/tbody/tr/td/a[contains(.,\"" + user + "\")]"));
        click(By.cssSelector("input[value='Reset Password']"));
    }
    public void finish(String confirmationLink, String password) {
        wd.get(confirmationLink);
        type(By.name("password"), password);
        type(By.name("password_confirm"), password);
        click(By.cssSelector("input[value='Update User']"));
    }

}
