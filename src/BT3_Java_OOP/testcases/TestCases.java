package BT3_Java_OOP.testcases;

import BT3_Java_OOP.common.BaseTest;

public class TestCases extends BaseTest {
    public void login(String email, String password) {
        System.out.println("Nhập URL: https://cms.anhtester.com/login");
        System.out.println("- Step 1: Enter Email: " + email);
        System.out.println("- Step 2: Enter Password: " + password);
        System.out.println("- Step 3: Click Login button");
    }

    public void testLogin(){
        TestCases test = new TestCases();
        createDriver();
        test.login(test.getEmail(), test.getPassword());
        closeDriver();
    }

    public void addCategory(String email, String password) {
        createDriver();
        login(email, password);
        System.out.println("\nSteps to add category");
        System.out.println("- Step 1: Click Product on the Menu");
        System.out.println("- Step 2: Click on Category");
        System.out.println("- Step 3: Click Add New category button");
        System.out.println("- Step 4: Enter field information...");
        System.out.println("- Step 5: Click Save button");
        closeDriver();
    }

    public static void main(String[] args) {
        TestCases testCases = new TestCases();

        testCases.setEmail("admin@example.com");
        testCases.setPassword("123456");
        testCases.testLogin();

        System.out.println("\n===================================\n");

        testCases.addCategory(testCases.getEmail(), testCases.getPassword());
    }
}
