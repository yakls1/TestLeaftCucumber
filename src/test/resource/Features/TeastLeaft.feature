@Run
Feature: TestLeaf buttons functionality

  Background: home page
    Given check inside home page, if not , then go to home page

  @Edit
  Scenario: test edit button
    Given Click edit button
    Then Enter your email address and check- field one
    Then Append a text and press keyboard tab field two
    Then Get default text entered - field three
    Then Clear the text - field four
    Then Confirm that edit field is disabled - field five
    Then go to home page

  @Button
  Scenario: test button button
    Given Click button button
    Then Click button to travel home page
    Then Find position of button (x,y)
    Then Find button color
    Then Find the height and width

  @HyperLink
  Scenario: test hyperlink button
    Given Click HyperLink button
    Then Click Go to Home Page
    Then Find where am supposed to go without clicking me?
    Then Verify am I broken?
    Then Go to Home Page (Interact with same link name)
    Then How many links are available in this page?

  @Image
  Scenario: test Image button
    Given Clic image button
    Given Click on this image to go home page
    Then Am I Broken Image?
    Then Click me using Keyboard or Mouse

  @DropDown
  Scenario: test DropDown button
    Given Click DropDown button
    Then Select training program using Index
    Then Select training program using Text
    Then Select training program using Value
    Then Get the number of dropdown options
    Then You can also use sendKeys to select
    Then Select your programs

  @RadioButton
  Scenario: test Rudio button
    Given Click rudio button
    Then Are you enjoying the classes?
    Then Find default selected radio button
    Then Select your age group (Only if choice was not selected)

  @CheckBox
  Scenario: test Check Boxes
    Given Click CheckBox button
    Then Select the languages that you know?
    Then Confirm Selenium is checked
    Then DeSelect only checked
    Then Select all below checkboxes

  @Table
  Scenario: test Table button
    Given Clikc table button
    Then Get the count of number of columns
    Then Get the count of number of rows
    Then Get the progress value of Learn to interact with Elements
    Then Check the vital task for the least completed progress

  @Alert
  Scenario: test Alert button
    Given Click alert button
    Then Click the button to display a alert box.
    Then Click the button to display a confirm box
    Then Click the button to display a prompt box.
    Then Click the button to learn line-breaks in an alert.

  @Frame
  Scenario: test Frame button
    Given Click Frame button
    Then I am inside a frame
    Then I am inside a nested frame
    Then Find total number of frames.

  @Window
  Scenario: test Frame button
    Given Click Window button
    Then Click button to open home page in New Window
    Then Find the number of opened windows
    Then Close all except this window
    Then Wait for 2 new Windows to open

  @Calendar
  Scenario: test calendar button
    Given Clikc calendar button
    Then Select 10th day of following month
    Then driver close
