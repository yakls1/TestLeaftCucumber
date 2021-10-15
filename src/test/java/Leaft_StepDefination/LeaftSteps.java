package Leaft_StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePageFactory;
import utill.Common;

public class LeaftSteps {

	HomePageFactory pageFactory = new HomePageFactory();

	@Given("check inside home page, if not , then go to home page") // background method
	public void check_inside_home_page_if_not_then_go_to_home_page() {
		pageFactory.HomePageMain();

	}

//	EDIT BUTTON
	@Given("Click edit button")
	public void click_edit_button() {
		pageFactory.clickEdit();

	}

	@Then("Enter your email address and check- field one")
	public void enter_your_email_address_and_check_field_one() {
		pageFactory.EditFieldOne();

	}

	@Then("Append a text and press keyboard tab field two")
	public void append_a_text_and_press_keyboard_tab_field_two() {
		pageFactory.EditFieldTwo();

	}

	@Then("Get default text entered - field three")
	public void get_default_text_entered_field_three() {
		pageFactory.defaltText();

	}

	@Then("Clear the text - field four")
	public void clear_the_text_field_four() {
		pageFactory.clearMe();

	}

	@Then("Confirm that edit field is disabled - field five")
	public void confirm_that_edit_field_is_disabled_field_five() {
		pageFactory.isDisable();

	}

	@Then("go to home page")
	public void go_to_home_page() {
		pageFactory.goToHomePage();
		Common.sleep(1);

	}

// BUTTON BUTTON

	@Given("Click button button")
	public void click_button_button() {
		pageFactory.clickButton();
		Common.sleep(1);
	}

	@Then("Click button to travel home page")
	public void click_button_to_travel_home_page() {
		pageFactory.clickHomeButton();
	}

	@Then("Find position of button \\(x,y)")
	public void find_position_of_button_x_y() {
		pageFactory.getPosision();
	}

	@Then("Find button color")
	public void find_button_color() {
		pageFactory.getColor();
	}

	@Then("Find the height and width")
	public void find_the_height_and_width() {
		pageFactory.GetSize();

	}

//	HyperLink BUTTON
	@Given("Click HyperLink button")
	public void click_hyper_link_button() {
		pageFactory.clickHyperLink();
	}

	@Then("Click Go to Home Page")
	public void click_go_to_home_page() {
		pageFactory.home();
	}

	@Then("Find where am supposed to go without clicking me?")
	public void find_where_am_supposed_to_go_without_clicking_me() {
		pageFactory.findNoClick();
	}

	@Then("Verify am I broken?")
	public void verify_am_i_broken() {
		pageFactory.verifyImBroke();
	}

	@Then("Go to Home Page \\(Interact with same link name)")
	public void go_to_home_page_interact_with_same_link_name() {
		pageFactory.home();
	}

	@Then("How many links are available in this page?")
	public void how_many_links_are_available_in_this_page() {
		pageFactory.howManyLinks();
		
	}
	
//	Image BUTTON
	@Given("Clic image button")
	public void clic_image_button() {
	    pageFactory.ClickImageButton();
	}
	@Given("Click on this image to go home page")
	public void click_on_this_image_to_go_home_page() {
	    pageFactory.ClikImageLink();
	}

	@Then("Am I Broken Image?")
	public void am_i_broken_image() {
	    pageFactory.ImBroken();
	}

	@Then("Click me using Keyboard or Mouse")
	public void click_me_using_keyboard_or_mouse() {
	    pageFactory.keyboardOrMouse();
	    Common.sleep(1);
	}
	
//	DropDown BUTTON
	
	@Given("Click DropDown button")
	public void click_drop_down_button() {
	   pageFactory.ClickDropDown();
	}

	@Then("Select training program using Index")
	public void select_training_program_using_index() {
	    pageFactory.selectDropDown1();
	}

	@Then("Select training program using Text")
	public void select_training_program_using_text() {
		 pageFactory.selectDropDown2();
	}

	@Then("Select training program using Value")
	public void select_training_program_using_value() {
		 pageFactory.selectDropDown3();
	}

	@Then("Get the number of dropdown options")
	public void get_the_number_of_dropdown_options() {
		 pageFactory.selectDropDown4();
	}

	@Then("You can also use sendKeys to select")
	public void you_can_also_use_send_keys_to_select() {
		 pageFactory.selectDropDown5();
	}

	@Then("Select your programs")
	public void select_your_programs() {
	    pageFactory.selectDropDown6();
	}
//	Radio BUTTON
	
	@Given("Click rudio button")
	public void click_rudio_button() {
	    pageFactory.ClickRadioButton();
	}

	@Then("Are you enjoying the classes?")
	public void are_you_enjoying_the_classes() {
	    pageFactory.enjoying();
	}

	@Then("Find default selected radio button")
	public void find_default_selected_radio_button() {
	  pageFactory.defaultSelected();
	}

	@Then("Select your age group \\(Only if choice was not selected)")
	public void select_your_age_group_only_if_choice_was_not_selected() {
	   pageFactory.Selectyourage();
	}
	
//	Check Box Button 
	
	@Given("Click CheckBox button")
	public void click_check_box_button() {
	    pageFactory.ClickCheckBox();
	}

	@Then("Select the languages that you know?")
	public void select_the_languages_that_you_know() {
	    pageFactory.Select_the_languages();
	}

	@Then("Confirm Selenium is checked")
	public void confirm_selenium_is_checked() {
	   pageFactory.Confirm_is_checked();
	}

	@Then("DeSelect only checked")
	public void de_select_only_checked() {
	   pageFactory.DeSelect_checked();
	}

	@Then("Select all below checkboxes")
	public void select_all_below_checkboxes() {
	    pageFactory.Select_all();
	}
// Table Button
	
	@Given("Clikc table button")
	public void clikc_table_button() {
	    pageFactory.ClickTable();
	}

	@Then("Get the count of number of columns")
	public void get_the_count_of_number_of_columns() {
		pageFactory.number_of_columns();
	}

	@Then("Get the count of number of rows")
	public void get_the_count_of_number_of_rows() {
		pageFactory.number_of_rows();
	}

	@Then("Get the progress value of Learn to interact with Elements")
	public void get_the_progress_value_of_learn_to_interact_with_elements() {
		pageFactory.Get_the_progress();
	}

	@Then("Check the vital task for the least completed progress")
	public void check_the_vital_task_for_the_least_completed_progress() {
		pageFactory.Check_the_vital_task();
	}
	
//	Alert Button
	
	@Given("Click alert button")
	public void click_alert_button() {
	    pageFactory.ClickAlertButton();
	}

	@Then("Click the button to display a alert box.")
	public void click_the_button_to_display_a_alert_box() {
	    pageFactory.Click_to_display_a_alert_box();
	}

	@Then("Click the button to display a confirm box")
	public void click_the_button_to_display_a_confirm_box() {
	   pageFactory.Click_to_display_a_confirm_box();
	}

	@Then("Click the button to display a prompt box.")
	public void click_the_button_to_display_a_prompt_box() {
	   pageFactory.Click_to_display_a_prompt_box();
	}

	@Then("Click the button to learn line-breaks in an alert.")
	public void click_the_button_to_learn_line_breaks_in_an_alert() {
	   pageFactory.Click_to_learn_line_breaks_in_an_alert();
	}
	
	
//	Frame BUTTON
	
	@Given("Click Frame button")
	public void click_frame_button() {
	    pageFactory.clickFrame();
	}

	@Then("I am inside a frame")
	public void i_am_inside_a_frame() {
	   pageFactory.insideAframe();
	}

	@Then("I am inside a nested frame")
	public void i_am_inside_a_nested_frame() {
	    pageFactory.nestedFrame();
	}

	@Then("Find total number of frames.")
	public void find_total_number_of_frames() {
	    pageFactory.numberOfFrames();
	}
// Windows BUTTON
	
	@Given("Click Window button")
	public void click_window_button() {
	   pageFactory.ClickWindowButton();
	}

	@Then("Click button to open home page in New Window")
	public void click_button_to_open_home_page_in_new_window() {
	  pageFactory.open_home_page_in_New_Window();
	}

	@Then("Find the number of opened windows")
	public void find_the_number_of_opened_windows() {
	    pageFactory.number_of_opened_windows();
	}

	@Then("Close all except this window")
	public void close_all_except_this_window() {
	   pageFactory.CloseAllExceptThisWindow();
	}

	@Then("Wait for {int} new Windows to open")
	public void wait_for_new_windows_to_open(Integer int1) {
	    pageFactory.WaitFor5Sec();
	}
	
//	Calendar BUTTON
	
	@Given("Clikc calendar button")
	public void clikc_calendar_button() {
	   pageFactory.clickCalendarBatton();
	}

	@Then("Select 10th day of following month")
	public void select_10th_day_of_following_month() {
	    pageFactory.day_of_followingMonth();
	   
	}
	
//	close driver
	@Then("driver close")
	public void driver_close() {
	    pageFactory.Close();
	}

	



}
