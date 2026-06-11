package seleniumframework.tests;



import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import seleniumframework.base.TestBase;
import seleniumframework.managers.PageObjectManager;
import seleniumframework.utils.TestListener;

@Listeners(TestListener.class)
public class GUIElementsTest extends TestBase {

    @Test
    public void verifyGUIElements() {

        PageObjectManager pom = new PageObjectManager(driver);

        TestListener.test.info("Entering Name, Email, Phone and Address");
        pom.textFields.enterDetails();

        TestListener.test.info("Selecting Gender");
        pom.radioButtons.selectGender();

        TestListener.test.info("Selecting Days Checkboxes");
        pom.checkboxes.selectDays();

        TestListener.test.info("Selecting Country");
        pom.dropdowns.selectCountry();

        TestListener.test.info("Selecting Color");
        pom.dropdowns.selectColor();

        TestListener.test.info("Selecting Animal");
        pom.dropdowns.selectAnimal();

        TestListener.test.info("Selecting Date");
        pom.datePicker.selectDate();

        TestListener.test.info("Uploading File");
        pom.fileUpload.uploadFile(
                System.getProperty("user.dir")+"\\TestData\\sample.txt");
        
        TestListener.test.info("Uploading Multiple Files");
        pom.multiFile.uploadFiles();
        
        
        TestListener.test.info("Reading Table Data");
        pom.tables.printTableData();
        
        TestListener.test.info("Verifying Dynamic Web Table");
        	pom.dynamicTable.verifyChromeCPUUsage();
        //Assert.assertTrue(dynamicStatus,"Chrome CPU Validation Failed");
        
        
        TestListener.test.info("Printing Pagination Table Data");
        pom.paginationTable.printAllProducts();

        TestListener.test.info("Selecting All Product Checkboxes");
        pom.paginationTable.selectAllProducts();
        
        
        TestListener.test.info("Verifying SVG Elements");
        pom.svgPage.verifySvgElements();
        


        TestListener.test.info("Moving Slider");
        pom.sliders.moveSlider();

        TestListener.test.info("Handling Alert");
        pom.alerts.handleAlert1();
        pom.alerts.handleAlert2();
        pom.alerts.handleAlert3();

        TestListener.test.info("Performing Double Click");
        pom.actions.performDoubleClick();
        
        TestListener.test.info("Performing Drag and Drop");
        pom.dragDrop.performDragDrop();
        
        TestListener.test.info("Selecting scroll down items");
        pom.comboBox.selectValue("Item 75");
        
        TestListener.test.info("Selecting laptop using navigation");
        pom.laptop.selectLaptopsUsingNavigation();
        
        TestListener.test.info("Checking Broken Link");
        pom.brokenlink.verifyBrokenLink();
        
        TestListener.test.info("Entering inputs");
        pom.input.enterInput1();
        pom.input.enterInput2();
        pom.input.enterInput3();
        
        TestListener.test.info("Handling Shadow DOM");
        pom.shadowDOM.enterTextInShadowDOM("Arfin");
        String value =pom.shadowDOM.getShadowText();
        Assert.assertEquals(value,"Arfin");
        
        
        
      

        TestListener.test.pass("All GUI Elements Executed Successfully");

        Assert.assertTrue(true);
    }
}