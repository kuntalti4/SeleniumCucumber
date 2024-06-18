Feature: Search in Spicejet

@SpiceJetSearch
Scenario Outline: Serach in spicejet portals
Given User is on SpiceJet landing page
When User serach for "<Source>" and "<Destination>" for 3 Aduls
And User select todays date
Then User navigated to flight info page

Examples:

|Source |Destination|
|Delhi  |Bhopal     |

