 Feature: check Need Help Functionality

#  Scenario: Check change cancel help title
#    Given user is on the Delta Home Page
#    When user mouse hover on need help feature
#    And  user clicks on change cancel help link
#    Then user should see Flight Help : Delta Air Lines "Flight Help : Delta Air Lines" window displayed
#
#     Scenario: Check refund help title
#    Given user is on the Delta Home Page
#    When user mouse hover on need help feature
#    And  user clicks on refund help link
#    Then user should see Delta Cancellation & Refund Policy : Delta Air Lines "Delta Cancellation & Refund Policy : Delta Air Lines" window displayed
#
#         Scenario: Check seats help title
#    Given user is on the Delta Home Page
#    When user mouse hover on need help feature
#    And  user clicks on seats help link
#    Then user should see Seat Support : Delta Air Lines "Seat Support : Delta Air Lines" window displayed
#
#    Scenario: Check baggage help title
#    Given user is on the Delta Home Page
#    When user mouse hover on need help feature
#    And  user clicks on baggage help link
#    Then user should see Baggage Policy and Fees | Delta Air Lines "Baggage Policy and Fees | Delta Air Lines" window displayed
#
#  Scenario: Check comment/complaint title
#    Given user is on the Delta Home Page
#    When user mouse hover on need help feature
#    And  user clicks on comment complaint link
#    Then user should see Help Center : Get Help with Reservations, Baggage & More : Delta Air Lines "Help Center : Get Help with Reservations, Baggage & More : Delta Air Lines" window displayed

   Scenario: Check Coronavirus Travel FAQs  title
     Given user is on the Delta Home Page
     When user mouse hover on need help feature
     And  user clicks on Coronavirus Travel FAQs link
     Then user should see Coronavirus Travel: FAQs | Delta Air Lines | Delta Air Lines "Coronavirus Travel: FAQs | Delta Air Lines" window displayed

   Scenario: Check Coronavirus Need Help title
     Given user is on the Delta Home Page
     When user mouse hover on need help feature
     And  user clicks on Need Help ? link
     Then user should see Need Help "Help Center : Get Help with Reservations, Baggage & More : Delta Air Lines" window displayed

   Scenario: Check Receipts title
     Given user is on the Delta Home Page
     When user mouse hover on need help feature
     And  user clicks on receipts link
     Then user should see Other Information : Delta Need Help "Other Information : Delta Need Help" window displayed

   @Regression
   Scenario: Check Certificates And eCredits title
     Given user is on the Delta Home Page
     When user mouse hover on need help feature
     And  user clicks on Certificates And eCredits link
     Then user should see View or Redeem Multiple Certificates or Ecredits or Gift Cards : Delta Air  Lines "View or Redeem Multiple Certificates or Ecredits or Gift Cards : Delta Air Lines" window displayed

   @Regression
   Scenario: Check Child And Enfant Travel title
     Given user is on the Delta Home Page
     When user mouse hover on need help feature
     And  user clicks on Child And Enfant Travel  link
     Then user should see Children & Infant Travel Policy : Delta Air Lines "Children & Infant Travel Policy : Delta Air Lines" window displayed