package seleniumframework.tests;

import org.testng.TestNG;

public class RegressionSuite {

    public static void main(String[] args) {

        TestNG testng = new TestNG();

        testng.setTestClasses(
                new Class[] {
                        GUIElementsTest.class
                });

        testng.run();
    }
}