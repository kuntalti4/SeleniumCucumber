Feature: Add to cart for products

@Cart
Scenario Outline: Add product in cart
Given User is on GreenCart landing page
When User serach for short name <Product> and extract actual name of the product
And User add product 3 time on cart
Then User navigate to checkout page
And check if <Product> exist on cart
And apply and place order button is working

@AddProdCart
Scenario Outline: Add product to cart
Given User is on GreenCart landing page
When User add <Product> on the cart
Then User navigate to checkout page
And check if <Product> exist on cart


Examples:

|Product    |
|Walnuts    |
|Cucumber   |
