package pages;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utill.Common;
import utill.Driver;

public class HomePageFactory {

	private WebDriver driver;

	public HomePageFactory() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);

	}

	private String homePageTitle = "TestLeaf - Selenium Playground";

	// EDIT BUTTON ELEMENTS
	@FindBy(xpath = "//h5[text()=\"Edit\"]")
	WebElement editButton;

	@FindBy(id = "email")
	WebElement editEmail;

	@FindBy(xpath = "(//input)[2]")
	WebElement EditTab;

	@FindBy(xpath = "(//input)[3]")
	WebElement getDefaltText;

	@FindBy(xpath = "(//input)[4]")
	WebElement clearText;

	@FindBy(xpath = "(//input)[5]")
	WebElement ConfirmDisable;

	// BUTTON BUTTON
	@FindBy(xpath = "//h5[text()=\"Button\"]")
	WebElement ButtonButton;

	@FindBy(id = "home")
	WebElement homeButton;

	@FindBy(id = "position")
	WebElement posision;

	@FindBy(id = "color")
	WebElement colorButton;

	@FindBy(id = "size")
	WebElement sizebutton;

//	HyperLInk BUTTON
	@FindBy(xpath = "//h5[text()='HyperLink']")
	WebElement HyperLinkButton;

	@FindBy(xpath = "//a[text()='Go to Home Page']")
	WebElement GoToHomePage;

	@FindBy(xpath = "//a[text()='Find where am supposed to go without clicking me?']")
	WebElement findWithoutClick;

	@FindBy(xpath = "//a[text()='Verify am I broken?']")
	WebElement VerifyBroken;

	@FindBy(tagName = "a")
	List<WebElement> links;

//	Image BUTTON
	@FindBy(xpath = "//h5[text()='Image']")
	WebElement clikImage;

	@FindBy(xpath = "//div[@class='large-6 small-12 columns']//img")
	WebElement imageLink;

	@FindBy(xpath = "(//img[contains(@src,'images')])[3]")
	WebElement brokenLink;

	@FindBy(xpath = "(//div[@class='large-6 small-12 columns']//img)[3]")
	WebElement UseMouse;

//	DropDown BUTTON
	@FindBy(xpath = "//h5[text()='Drop down']")
	WebElement DropDownButton;

	@FindBy(id = "dropdown1")
	WebElement dropDown1;

	@FindBy(name = "dropdown2")
	WebElement dropDown2;

	@FindBy(id = "dropdown3")
	WebElement dropDown3;

	@FindBy(xpath = "//select[@class ='dropdown']/option")
	List<WebElement> dropDown4;

	@FindBy(xpath = "(//div[@class ='example']/select)[5]")
	WebElement dropDown5;

	@FindBy(xpath = "(//div[@class ='example']/select/option[@value='2'])[6]")
	WebElement dropDown6;

//	Radio Button
	@FindBy(xpath = "//h5[text()='Radio Button']")
	WebElement radioButton;

	@FindBy(id = "yes")
	WebElement yes;

	@FindBy(xpath = "//input[@name = 'news']")
	List<WebElement> ByDefalt;

	@FindBy(xpath = "//input[@name = 'age']")
	WebElement age;

//	Check Box Button
	@FindBy(xpath = "//h5[text()='Checkbox']")
	WebElement CheckBoxButton;

	@FindBy(xpath = "//div[@class= 'example'][1]/input")
	WebElement Java;

	@FindBy(xpath = "//div[@class= 'example'][2]/input")
	WebElement isCheked;

	@FindBy(xpath = "//div[@class= 'example'][3]/input")
	List<WebElement> DeSelect;

	@FindBy(xpath = "//div[@class= 'example'][4]/input")
	List<WebElement> notSelectedBoxes;

//	Table button
	@FindBy(xpath = "//h5[text()='Table']")
	WebElement TableButton;

	@FindBy(tagName = "th")
	List<WebElement> colums;

	@FindBy(tagName = "tr")
	List<WebElement> rows;

	@FindBy(xpath = "(//tr[3]//font)[2]")
	WebElement getValue;

	@FindBy(xpath = "(//td/input[@name = 'vital'])[1]")
	WebElement Vital;

//	Alert BOTTON

	@FindBy(xpath = "//h5[text()='Alert']")
	WebElement AlertButton;

	@FindBy(xpath = "//button[text()='Alert Box']")
	WebElement alertBox;

	@FindBy(xpath = "//button[text()='Confirm Box']")
	WebElement confirmBox;
	@FindBy(id = "result")
	WebElement resultOfComfirmBox;

	@FindBy(xpath = "//button[text()='Prompt Box']")
	WebElement PromptBox;
	@FindBy(id = "result1")
	WebElement resultPrompt;

	@FindBy(xpath = "//button[text()='Line Breaks?']")
	WebElement LineBreaks;

//	Frame BUTTON

	@FindBy(xpath = "//h5[text()='Frame']")
	WebElement frameButton;

	@FindBy(id = "Click")
	WebElement frame1;

	@FindBy(id = "Click1")
	WebElement frame2;

	@FindBy(xpath = "//iframe")
	List<WebElement> Listframes;

//	Window BUTTON

	@FindBy(xpath = "//h5[text()='Window']")
	WebElement WindowButton;

	@FindBy(id = "home")
	WebElement OpenHomePage;

	@FindBy(xpath = "//button[text()='Open Multiple Windows']")
	WebElement OpenMultipleWindows;

	@FindBy(xpath = "//button[text()='Do not close me ']")
	WebElement DoNotCloseMe;

	@FindBy(xpath = "//button[text()='Wait for 5 seconds']")
	WebElement WaitFor5Seconds;
	
//	Calendar BUTTON
	
	@FindBy(xpath = "//h5[text()='Calendar']")
	WebElement CalendarButton;
	
	@FindBy(id = "datepicker")
	WebElement inputField;
	
	@FindBy(xpath = "//a[text()='10']")
	WebElement Ten;
	
	
	

//	@Before
//	public void setup() {

//	}

//	@After
//	public void tearDown() {
//		driver.close();
//		
//	}

	public void HomePageMain() { // background method
		String title = driver.getTitle();
		if (!title.equals("TestLeaf - Selenium Playground")) {
			driver.get("http://testleaf.herokuapp.com/home.html");
		}
	}

//	EDIT BUTTON METHODS

	public void clickEdit() {
		editButton.click();
	}

	public void EditFieldOne() {
		String myEmail = "yakls@mail.ru";
		editEmail.sendKeys(myEmail);
		String checkEmailField = editEmail.getAttribute("value");
		assertEquals(myEmail, checkEmailField);

	}

	public void EditFieldTwo() {
		EditTab.sendKeys("Hello");
		String getValue = EditTab.getAttribute("value");
		assertEquals("Append Hello", getValue);
		EditTab.sendKeys(Keys.TAB);
	}

	public void defaltText() {
		String text = getDefaltText.getAttribute("value");
		assertEquals("TestLeaf", text);

	}

	public void clearMe() {
		clearText.clear();
		String actual = clearText.getAttribute("value");
		assertEquals("", actual);
	}

	public void isDisable() {
		boolean actual = ConfirmDisable.isEnabled();
		assertEquals(false, actual);
	}

	public void goToHomePage() {
		driver.get("http://testleaf.herokuapp.com/home.html");
	}

	// BUTTON BUTTON METHODS

	public void clickButton() {
		ButtonButton.click();
	}

	public void clickHomeButton() {
		homeButton.click();
		String title = driver.getTitle();
		assertEquals("TestLeaf - Selenium Playground", title);
		driver.navigate().back();
	}

	public void getPosision() {
		Point point = posision.getLocation();
		int x = point.getX();
		int y = point.getY();
		System.err.println(x + " X " + y);

	}

	public void getColor() {
		String color = colorButton.getAttribute("style");
		String codeColor = colorButton.getCssValue("color");
		System.err.println(color + "  code = " + codeColor);
	}

	public void GetSize() {
		int Height = sizebutton.getSize().getHeight();
		int Width = sizebutton.getSize().getWidth();
		System.err.println("size= " + Height + "X" + Width);

	}

//	HyperLink BUTTON Methods

	public void clickHyperLink() {
		HyperLinkButton.click();
	}

	public void home() {
		GoToHomePage.click();
		String actual = driver.getTitle();
		assertEquals("TestLeaf - Selenium Playground", actual);
		driver.navigate().back();

	}

	public void findNoClick() {
		String location = findWithoutClick.getAttribute("href");
		System.err.println(location);
	}

	public void verifyImBroke() {
		VerifyBroken.click();
		String title = driver.getTitle();
		if (title.equals("404 Not Found")) {
			System.err.println("Link doesn't work");
			driver.navigate().back();

		}

	}

	public void howManyLinks() {
		int sizeList = links.size();
		System.err.println("number of links = " + sizeList);

	}

//	Image BUTTON methods

	public void ClickImageButton() {
		clikImage.click();
	}

	public void ClikImageLink() {
		imageLink.click();
		String actual = driver.getTitle();
		assertEquals(homePageTitle, actual);
		driver.navigate().back();
	}

	public void ImBroken() {
		String broke = brokenLink.getAttribute("src");
		driver.get(broke);
		String checkbroke = driver.getTitle();
		boolean finalCheckbroke;
		if (checkbroke.equals("404 Not Found")) {
			finalCheckbroke = false;
			System.err.println("Link 2 in Image doesn't work");
		} else {
			finalCheckbroke = true;
		}
		driver.navigate().back();
//	    assertEquals(true, finalCheckbroke);
	}

	public void keyboardOrMouse() {
		Actions action = new Actions(driver);
		action.moveToElement(UseMouse).click().perform();
		String actual = driver.getTitle();
		assertEquals(homePageTitle, actual);
	}

//	 DropDown BUTTTON  Methods

	public void ClickDropDown() {
		DropDownButton.click();
	}

	public void selectDropDown1() {
		Select select = new Select(dropDown1);
		select.selectByIndex(3);
	}

	public void selectDropDown2() {
		Select select = new Select(dropDown2);
		select.selectByVisibleText("Loadrunner");
	}

	public void selectDropDown3() {
		Select select = new Select(dropDown3);
		select.selectByValue("1");
	}

	public void selectDropDown4() {
		int sizeOfdropDown = dropDown4.size();
		System.err.println("Drop Down Size = " + sizeOfdropDown);

	}

	public void selectDropDown5() {
		dropDown5.sendKeys(Keys.ENTER, Keys.ARROW_DOWN, Keys.ENTER);
	}

	public void selectDropDown6() {
		dropDown6.click();
	}

//	 Radio BUTTON methods

	public void ClickRadioButton() {
		radioButton.click();
	}

	public void enjoying() {
		yes.click();
	}

	public void defaultSelected() {
		List<WebElement> list = ByDefalt;
		String selected = "";

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).isSelected()) {
				selected = list.get(i).getAttribute("value");
				System.err.println("Selected value = " + selected);

			}
		}

	}

	public void Selectyourage() {
		age.click();
	}

//	Check Box BUTTON methods

	public void ClickCheckBox() {
		CheckBoxButton.click();
	}

	public void Select_the_languages() {

		Java.click();
	}

	public void Confirm_is_checked() {
		boolean actual = isCheked.isSelected();
		assertEquals(true, actual);

	}

	public void DeSelect_checked() {
		List<WebElement> list = DeSelect;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).isSelected()) {
				list.get(i).click();
			}
		}
	}

	public void Select_all() {
		List<WebElement> list = notSelectedBoxes;
		for (int i = 0; i < list.size(); i++) {
			list.get(i).click();
		}
	}

//	Table button methods

	public void ClickTable() {
		TableButton.click();
	}

	public void number_of_columns() {
		List<WebElement> list = colums;
		int sizeC = list.size();
		System.err.println("Numbr of colums = " + sizeC);

	}

	public void number_of_rows() {
		List<WebElement> list = rows;
		int sizeR = list.size();
		System.err.println("Number of rows = " + sizeR);

	}

	public void Get_the_progress() {
		String actual = getValue.getText();
		System.err.println(actual);
		assertEquals("80%", actual);

	}

	public void Check_the_vital_task() {

		Vital.click();
		boolean actual = Vital.isSelected();
		assertEquals(true, actual);

	}

//	Alert BUTTON METHODS

	public void ClickAlertButton() {
		AlertButton.click();
	}

	public void Click_to_display_a_alert_box() {
		alertBox.click();
		driver.switchTo().alert().accept();

	}

	public void Click_to_display_a_confirm_box() {
		confirmBox.click();
		driver.switchTo().alert().dismiss();
		String actual = resultOfComfirmBox.getText();
		assertEquals("You pressed Cancel!", actual);

	}

	public void Click_to_display_a_prompt_box() {
		PromptBox.click();
		String past = "Java";
		driver.switchTo().alert().sendKeys(past);
		driver.switchTo().alert().accept();
		String actual = resultPrompt.getText();
		assertEquals("You should not have enjoyed learning at " + past + " as compared to TestLeaf! Right?", actual);

	}

	public void Click_to_learn_line_breaks_in_an_alert() {
		LineBreaks.click();
		String alert = driver.switchTo().alert().getText();
		System.err.println(alert);
		driver.switchTo().alert().accept();

	}

//	Frame BUTTON methods

	public void clickFrame() {
		frameButton.click();

	}

	public void insideAframe() {
		driver.switchTo().frame(0);
		frame1.click();
		String actual = frame1.getText();
		assertEquals("Hurray! You Clicked Me.", actual);
		driver.switchTo().parentFrame();

	}

	public void nestedFrame() {

		driver.switchTo().frame(1).switchTo().frame("frame2");
		frame2.click();
		String actual = frame2.getText();
		assertEquals("Hurray! You Clicked Me.", actual);
		driver.switchTo().parentFrame();
		driver.get("http://testleaf.herokuapp.com/pages/frame.html");

	}

	public void numberOfFrames() {

		List<WebElement> listFrame = Listframes;
		int frame = listFrame.size();
		System.err.println(frame);

	}

//	Windows BUTTON methods
	public void ClickWindowButton() {
		WindowButton.click();
	}

	public void open_home_page_in_New_Window() {
		OpenHomePage.click();
		List<String> list = new ArrayList<String>();
		Common.handle1(driver, list);
		Common.sleep(1);
		driver.switchTo().window(list.get(1));
		String actual = driver.getTitle();
		assertEquals(homePageTitle, actual);
		driver.switchTo().window(list.get(0));

	}

	public void number_of_opened_windows() {
		OpenMultipleWindows.click();
		List<String> list = new ArrayList<>();
		Common.handle1(driver, list);
		System.err.println("Number of windows = " + list.size());
		Common.sleep(1);
	}

	public void CloseAllExceptThisWindow() {
		DoNotCloseMe.click();
		List<String> list = new ArrayList<>();
		Common.handle1(driver, list);
		for (int i = 1; i < list.size(); i++) {
			driver.switchTo().window(list.get(i)).close();
			driver.switchTo().window(list.get(0));

		}
	}
	public void WaitFor5Sec() {
		WaitFor5Seconds.click();
		List<String> list = new ArrayList<>();
		Common.handle1(driver, list);
		driver.switchTo().window(list.get(1));
		String actual = driver.getTitle();
		assertEquals("TestLeaf - Interact with HyperLinks", actual);
		driver.switchTo().window(list.get(2));
		actual = driver.getTitle();
		assertEquals("TestLeaf - Interact with Buttons", actual);
		Common.sleep(1);
		for (int i = 1; i < list.size(); i++) {
			driver.switchTo().window(list.get(i)).close();
		}
		driver.switchTo().window(list.get(0));
		
	}
	
//	Calendar BUTTON methods
	
	public void clickCalendarBatton() {
		CalendarButton.click();
	}
	
	public void day_of_followingMonth() {
		inputField.click();
		Ten.click();
		String date = inputField.getAttribute("value");
		assertEquals("10/10/2021", date);
	}
	
	public void Close() {
		driver.close();
	}
}
