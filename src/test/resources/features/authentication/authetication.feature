Feature: Access to system
  Story: As a signed chef, I wan to login the system that I can access the information

  Scenario: Should let authenticated architect enter his workspace

    Given At the login page
    When I login by my username 'admin@mail.com' and password '123456'
    Then I can access the my workspace
    And My name 'Admin User' in the top of the page


#  Scenario: Should reject failed logging chef
#  As a signed chef, I must see the home page of the system when I login correctly by my user name and password
#    Given At the home page
#    When I login by my username 'first1@cmail.com' and password '123456'
#    Then I still see error message ''


