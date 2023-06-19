/*

Candy Machine is used as interface to show customer what we have and let them to make selections
Dispenser is used to control the stock
Cash Register is used to control the finance stuff

Dispenser:

Instance Variable: 
- itemName : the name of this item in machine
- itemCount : the amount of items left in the machine
- itemPrice : the price of the product

Methods/Operations:
- addToCart(amount : int) : add item to cart, remove item from stock

UML Class Diagram:

|------------------------------------|
│              Dispenser             |
|------------------------------------|
│ - itemName: String                 | 
│ - itemCount: int                   │
│ - itemPrice: double                |
│ - cart : int                       |
|------------------------------------|
│ + addToCart(amount : int): void    |
│                                    |
|------------------------------------|

Cash Register:

Instance Variables: 
- cashIn : cash obtained from buyer
- total : total price of items
- change : cash deduct balance

Methods/Operations:
- pay() : adds cash to cashIn, subtracts total from cashIn
- change() : returns change
- total() : returns total
- check() : checks if cashIn is greater than total

UML:
|---------------------------------------------------|
|                   Cash Register                   |
|---------------------------------------------------|
| - cashIn: double                                  |
| - total: double                                   |
| - change: double                                  |
|---------------------------------------------------|
| + pay(): void                                     |
| + change(): double                                |
| + total(price: double): void                      |
| + check(): boolean                                |
|---------------------------------------------------|

Candy Machine:

Instance Variables: 
- disps
- cashReg

Methods/Operations:
- display() : display stock in machine
- select() : selects items, calls addToCart() and total()
- pay() : payment, calls check(), pay() and change()
- dispense() : dispense item

UML:
|---------------------------------------------------|
| Candy Machine                                     |
|---------------------------------------------------|
| - disps: Dispenser[]                              |
| - cashReg: Cash Register                          |
|---------------------------------------------------|
| + dispItem(): void                                |
| + select(): void                                  |
| + total(): double                                 |
| + pay(): void                                     |
| + change(): double                                |
| + dispense(): void                                |
|---------------------------------------------------|

*/