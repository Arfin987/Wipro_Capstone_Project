# Selenium Automation Framework Capstone Project

## Project Overview

This project is a Selenium WebDriver Automation Framework developed using Java, TestNG, Maven, and Page Object Model (POM) design pattern.

The framework automates various web elements and user interactions available on the Test Automation Practice website:

https://testautomationpractice.blogspot.com/

The project demonstrates real-world automation framework development practices including reusable page objects, utility classes, reporting, and test execution management.

---

## Technology Stack

| Technology         | Purpose                  |
| ------------------ | ------------------------ |
| Java               | Programming Language     |
| Selenium WebDriver | Browser Automation       |
| TestNG             | Test Execution Framework |
| Maven              | Dependency Management    |
| Extent Reports     | Reporting                |
| Page Object Model  | Framework Design Pattern |
| Git & GitHub       | Version Control          |

---

## Framework Architecture

The framework follows the Page Object Model (POM) design pattern.

Project Structure:

Capstone_Project

src/test/java

seleniumframework

base

* TestBase.java

managers

* DriverManager.java
* PageObjectManager.java

pages

* TextFieldsPage.java
* RadioButtonsPage.java
* CheckboxesPage.java
* DropdownsPage.java
* DatePickerPage.java
* FileUploadPage.java
* SlidersPage.java
* AlertsPage.java
* ActionsPage.java
* TabsPage.java
* DynamicWebTablePage.java
* PaginationTablePage.java
* ShadowDOMPage.java
* SvgPage.java

tests

* GUIElementsTest.java
* RegressionSuite.java

utils

* ConfigReader.java
* WaitUtils.java
* ScrollUtil.java
* ScreenshotUtil.java
* ReportManager.java
* TestListener.java

src/test/resources

* config.properties

TestData

* sample.txt

reports

* AutomationReport.html

testng.xml

pom.xml

README.md

---

## Automated Test Scenarios

### Form Automation

* Enter Name
* Enter Email
* Enter Phone Number
* Enter Address

### Radio Button Automation

* Select Gender

### Checkbox Automation

* Select Days
* Select Laptop Checkboxes

### Dropdown Automation

* Country Dropdown
* Color Multi-Select Dropdown
* Animal Dropdown
* Combo Box Selection

### Date Picker Automation

* Select Date
* Handle Calendar Controls

### File Upload

* Upload Single File
* Upload Multiple Files

### Slider Automation

* Move Slider Using Actions Class

### Alert Automation

* Handle JavaScript Alert
* Handle Confirmation Alert
* Handle Prompt Alert

### Mouse Actions

* Double Click
* Mouse Hover
* Right Click
* Drag and Drop

### Tabs Automation

* Navigate Between Tabs
* Verify Tab Content

### Dynamic Web Table

* Read Dynamic Table Data
* Validate Chrome CPU Usage

### Pagination Web Table

* Read Data Across Multiple Pages
* Select All Product Checkboxes

### Shadow DOM

* Access Elements Inside Shadow Root
* Validate Shadow DOM Elements

### SVG Elements

* Verify SVG Shapes
* Validate Circle, Rectangle, and Polygon Elements

---

## Framework Features

### Page Object Model

All locators and actions are maintained in separate page classes to improve maintainability.

### Extent Reports

The framework generates detailed HTML reports with:

* Test Name
* Execution Status
* Pass/Fail Details
* Execution Logs

### Screenshot Utility

Screenshots can be captured during failures for debugging.

### Scroll Utility

Reusable utility for scrolling to web elements using JavaScriptExecutor.

### Wait Utility

Reusable explicit wait methods to synchronize test execution.

---

## Reporting

Extent Report Location:

reports/AutomationReport.html

Open the report in any browser after execution.

---

## Test Execution

### Run Using TestNG

Right Click:

testng.xml

Run As → TestNG Suite

### Run Individual Test

Right Click:

GUIElementsTest.java

Run As → TestNG Test

### Run Regression Suite

Run:

RegressionSuite.java

As Java Application

---

## Maven Commands

Clean Project:

mvn clean

Compile Project:

mvn compile

Run Tests:

mvn test

Generate Project:

mvn install

---

## Git Commands

Initialize Repository:

git init

Add Files:

git add .

Commit Changes:

git commit -m "Initial Selenium Framework"

Push Code:

git push origin main

---

## Future Enhancements

* Data Driven Testing using Excel
* Apache POI Integration
* Cross Browser Testing
* Parallel Execution
* Selenium Grid

---

## Author

Arfin

Selenium Automation Framework Capstone Project

Built using Java, Selenium WebDriver, TestNG, Maven, and Page Object Model.
