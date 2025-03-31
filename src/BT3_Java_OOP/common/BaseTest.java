package BT3_Java_OOP.common;

public class BaseTest {

    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void createDriver() {
        System.out.println("Browser name: " + Constants.browser);
        System.out.println("Report type: " + Constants.report);
        System.out.println("Headless: " + Constants.headless);
    }

    public void closeDriver() {
        System.out.println("Closed Browser: " + Constants.browser);
    }
}
