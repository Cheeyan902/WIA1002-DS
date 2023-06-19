/*
package t11qa;

Q1:
What is a binary search tree (BST)?

Ans:
A binary search tree (BST) is a way to organize a bunch of data where each item has a value, and the tree helps you quickly find a specific item by comparing its value to the values of the items in the tree.

BST is called "binary" because each item can have at most two child items.
BST is organized so that each item's value is greater than the value of its left child, and less than the value of its right child.
This makes it easy to narrow down your search for a specific item as you move through the tree.

Q2:
Build a BST based on the input 50, 30, 25, 71, 80, 99, 40, 1, 7, 5. Draw the final tree.

Ans:

                50
               /  \
             30    71
            /  \     \
          25    40    80
         / \           \
         1   7          99
             /
            5

Q3:
What is the height of the tree built in Question 2?

Ans: 5

Q4:
Given the following BST, list the items in the order of:

a.)Pre-Order traversal
b.)In-Order traversal
c.)Post-order traversal

Ans:
a.) 0100, 0050, 0025, 0001, 0030, 0070, 0065, 0085, 0150, 0135, 0169, 0180
b.) 0001, 0025, 0030, 0050, 0065, 0070, 0085, 0100, 0135, 0150, 0169, 0180
c.) 0001, 0030, 0025, 0065, 0085, 0070, 0050, 0135, 0180, 0169, 0150, 0100

Q5:
Using the same BST in Question 4, delete the element 0030. Draw the resulting tree.

                 0100
               /      \
             0050     0150
            /   \     /    \
         0025  0070  0135   0169
         /     /   \         \
       0001  0065  0085      0180

Q6:
Again, using the same BST in Question 4 (i.e., ignoring the deletion of 0030 in Question 5), delete the element 0050. Draw the resulting tree.

Ans:
                 0100
               /      \
             0030     0150
            /   \     /    \
         0025  0070  0135  0169
         /     /   \         \
       0001  0065  0085      0180
*/
