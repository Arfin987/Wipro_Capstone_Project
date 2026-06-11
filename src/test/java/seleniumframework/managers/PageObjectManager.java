package seleniumframework.managers;

import org.openqa.selenium.WebDriver;

import seleniumframework.pages.*;

public class PageObjectManager {

    public TextFieldsPage textFields;
    public RadioButtonsPage radioButtons;
    public CheckboxesPage checkboxes;
    public DropdownsPage dropdowns;
    public DatePickerPage datePicker;
    public FileUploadPage fileUpload;
    public SlidersPage sliders;
    public AlertsPage alerts;
    public ActionsPage actions;
    public DragDropPage dragDrop;
    public WebTablesPage tables;
    public DynamicWebTablePage dynamicTable;
    public PaginationTablePage paginationTable;
    public MultiFileUploadPage multiFile;
    public ComboBoxPage comboBox;
    public LaptopPage laptop;
    public BrokenLinkPage brokenlink;
    public ShadowDOMPage shadowDOM;
    public InputFieldsPage input;
    public SvgPage svgPage;


    public PageObjectManager(WebDriver driver) {

        textFields = new TextFieldsPage(driver);
        radioButtons = new RadioButtonsPage(driver);
        checkboxes = new CheckboxesPage(driver);
        dropdowns = new DropdownsPage(driver);
        datePicker = new DatePickerPage(driver);
        fileUpload = new FileUploadPage(driver);
        sliders = new SlidersPage(driver);
        alerts = new AlertsPage(driver);
        actions = new ActionsPage(driver);
        dragDrop = new DragDropPage(driver);
        tables = new WebTablesPage(driver);
        dynamicTable = new DynamicWebTablePage(driver);
        paginationTable = new PaginationTablePage(driver);
        multiFile = new MultiFileUploadPage(driver);
        comboBox=new ComboBoxPage(driver);
        laptop=new LaptopPage(driver);
        brokenlink=new BrokenLinkPage(driver);
        shadowDOM = new ShadowDOMPage(driver);
        input=new InputFieldsPage(driver);
        svgPage = new SvgPage(driver);
    }
}