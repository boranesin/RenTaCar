import business.UserManager;
import core.Db;
import core.Helper;
import entity.User;
import view.AdminView;
import view.LoginView;

import java.sql.Connection;
import java.sql.DriverManager;

public class App {
    public static void main(String[] args) {
       //connection sağlanabilir mi denemek için ekledik.
       //Connection conn = Db.getInstance();

        Helper.setTheme();

        //LoginView loginView = new LoginView();
        UserManager userManager = new UserManager();
        AdminView adminView = new AdminView(userManager.findByLogin("admin","1234"));
    }
}