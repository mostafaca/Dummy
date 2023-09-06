@Chrome
Feature: Home page of Facebook

  Scenario Outline: As a user, I want to go to the login page and access the application.
    Given I am in the Home page "https://www.facebook.com"
    When I entered "<username>" and "<password>"
    And I click on the login button
    Then I am in the incorrect message page, the "<message>" will show up.

    Examples: 
      | username | password | message                                |
      | user1    | sgsh$weW | The password you entered is incorrect. |



# Now, we need to right-click here and select "pretty format" to make the above statement looks arranged. 
# Now, we need to define the above statement into Step-Definition file, and For the codes, we need to run this feature file and get the dummy codes from the console. 
# Also, we need to create a class as StepBase to get the browser and run the Chrome browser from feature file. 
# In StepBase, we will take WebDriver as Static varibale, create OBJECT of Homepage and take Homepage as Static, 
# To call the driver, we will create a method and call it under @bBefore annotation, here @Before tag work as Cucumber not JUNIT. 
