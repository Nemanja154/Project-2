package baseClass;

import alertsFarmeWindowsPages.*;
import bookStoreApplicationPages.BookStoreApiPage;
import bookStoreApplicationPages.BookStorePage;
import bookStoreApplicationPages.LoginPage;
import bookStoreApplicationPages.ProfilePage;
import elementsPages.*;
import formsPages.PracticeFormPage;
import homePage.HomePageWebElements;
import interactionsPages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import widgetsPages.*;

import java.time.Duration;

public class BaseClass {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected JavascriptExecutor js;

    //Objects

    protected AlertsPage alertsPage;
    protected BrowserWindowsPage browserWindowsPage;
    protected FramesPage framesPage;
    protected ModalDialogsPage modalDialogsPage;
    protected NestedFramesPage nestedFramesPage;
    protected BookStoreApiPage bookStoreApiPage;
    protected BookStorePage bookStorePage;
    protected LoginPage loginPage;
    protected ProfilePage profilePage;
    protected BrokenLinksPage brokenLinksPage;
    protected ButtonsPage buttonsPage;
    protected CheckBoxPage checkBoxPage;
    protected DynamicProperties dynamicProperties;
    protected LinksPage linksPage;
    protected RadioButtonPage radioButtonPage;
    protected TextBoxPage textBoxPage;
    protected UploadAndDownloadPage uploadAndDownloadPage;
    protected WebTablesPage webTablesPage;
    protected PracticeFormPage practiceFormPage;
    protected HomePageWebElements homePageWebElements;
    protected DragabblePage dragabblePage;
    protected DroppablePage droppablePage;
    protected ResizableTablePage resizableTablePage;
    protected SelectablePage selectablePage;
    protected SortablePage sortablePage;
    protected AccordianPage accordianPage;
    protected AutoCompletePage autoCompletePage;
    protected DataPickerPage dataPickerPage;
    protected MenuPage menuPage;
    protected ProgressBarPage progressBarPage;
    protected SelectMenuPage selectMenuPage;
    protected SliderPage sliderPage;
    protected TabsPage tabsPage;
    protected ToolTipsPage toolTipsPage;

    //----------------------------------------------

    protected Actions actions;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        wait = new WebDriverWait(driver,Duration.ofSeconds(15));

        js = (JavascriptExecutor) driver;



        //-----------------------------------------------
        //Objects
        alertsPage = new AlertsPage(driver);
        browserWindowsPage = new BrowserWindowsPage(driver);
        framesPage = new FramesPage(driver);
        modalDialogsPage = new ModalDialogsPage(driver);
        nestedFramesPage = new NestedFramesPage(driver);
        bookStoreApiPage = new BookStoreApiPage(driver);
        bookStorePage = new BookStorePage(driver);
        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);
        brokenLinksPage = new BrokenLinksPage(driver);
        linksPage = new LinksPage(driver);
        radioButtonPage = new RadioButtonPage(driver);
        textBoxPage = new TextBoxPage(driver);
        buttonsPage = new ButtonsPage(driver);
        checkBoxPage = new CheckBoxPage(driver);
        dynamicProperties = new DynamicProperties(driver);
        uploadAndDownloadPage = new UploadAndDownloadPage(driver);
        webTablesPage = new WebTablesPage(driver);
        practiceFormPage = new PracticeFormPage(driver);
        homePageWebElements = new HomePageWebElements(driver);
        practiceFormPage  = new PracticeFormPage(driver);
        dragabblePage = new DragabblePage(driver);
        droppablePage = new DroppablePage(driver);
        resizableTablePage = new ResizableTablePage(driver);
        selectablePage = new SelectablePage(driver);
        sortablePage = new SortablePage(driver);
        accordianPage = new AccordianPage(driver);
        autoCompletePage = new AutoCompletePage(driver);
        dataPickerPage = new DataPickerPage(driver);
        menuPage = new MenuPage(driver);
        progressBarPage = new ProgressBarPage(driver);
        selectMenuPage = new SelectMenuPage(driver);
        sliderPage = new SliderPage(driver);
        tabsPage = new TabsPage(driver);
        toolTipsPage = new ToolTipsPage(driver);

        //------------------------------------------------
        actions = new Actions(driver);

    }


    @AfterClass
    public void tearDown(){
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }

}
