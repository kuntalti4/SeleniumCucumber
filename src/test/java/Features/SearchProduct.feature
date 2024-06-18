Feature: Search and place the order for products

@OfferPage
Scenario Outline: Serach experince for home and offer
Given User is on GreenCart landing page
When User serach for short name <Product> and extract actual name of the product
Then User searched for the same short name <Product> in offerpage 
And check if product exist

Examples:

|Product|
|Tom    |
|Cucu   |