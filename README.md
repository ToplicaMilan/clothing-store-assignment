# clothing-store-assignment

Clothing Store

Assignment

In a clothing store, you can buy shoes, shirts, suit jackets and trousers.

Each product has a name, brand, price, and color. 

All clothes have sizes but they use different standards:

for shirts - XS, S, M, L, XL, 2XL

for shoes - 39 - 46

for jackets and trousers - 42-66 (using only the even numbers - eg. 42, 44, 46, etc.)

If a client buys 3 or more products they get a 20% discount. On Tuesday all shirts have a 10% discount and all shoes have a 25% discount. Both discounts can’t be applied for the same item. If a product is applicable for both discounts, only the bigger one is applied.

Create a class Cashier that has a method to print a receipt. The method accepts a cart (collection of products) and the date and time of purchase. It should print in the console, all purchased products with their price, the total sum, and the total discount in the format:

Date: (date and time of purchase)

---Products---


(name) (brand)

(price)

#discount (discount %) (discount sum) (if applicable)

-----------------------------------------------------------------------------------

SUBTOTAL: total sum for all products

DISCOUNT: - sum of all discounts

TOTAL: sum to pay


Your task is to model the whole structure of the store - products, purchase, cart, cashier - following the object-oriented principles. You can use the examples below to test your application. No user input is needed, the data should be predefined.
