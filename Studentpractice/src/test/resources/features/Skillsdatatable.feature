Feature: I am automation functionality of Add Skills in Orange HRM application
	
Background: Common step
    Given User launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

  Scenario: Successful Login with valid page
    And User enters username as "Admin" and password as "admin123"
    Then Creating Skills Record1
        	|SkillName|SkillDescr|
					|Sales5001|Sales5001 descr|
					|Sales5002|Sales5002 descr|
					|Sales5003|Sales5003 descr|
    When Click on logout button
    Then Close Browser
    
    
    

    