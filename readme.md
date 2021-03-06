## Data Structures & Algorithms Hints & Tips :-)

# Arrays
* Static arrays have a fixed size
* Dynamic arrays grow by 50-100% which may end up wasting memory
* Best used when you know ahead of time the number of items to be stored.

# Linked Lists

Types of Linked Lists
* Singly :- only holds a pointer to the next node
* Doubly :- it holds a pointer to both the previous and the next node. 

Note: Linked Lists in java are an implementation of Doubly Linked Lists.

Did you know the following about linked lists?

* They don't waste memory. i.e They take just as much memory as they need.
* They take/consume some extra memory since each node must store its value and a pointer to the next node. 
* Best used when you don't know ahead of time the number of items to be stored.

| Operation | Arrays | Linked Lists |
| ----- | --- | --- |
| Look Up By Index |  O(1) | O(n) |
| Look Up By Value |  O(n) | O(n) |
| Insert Beginning/End  | O(n) | O(1) |
| Insert Middle |  O(n) | O(n) |
| Delete Beginning|  O(n) |  O(1) |
| Delete Middle |  O(n) |  O(n) |
| Delete End |  O(n) |  O(n) in singly linked list & O(1) in doubly linked list|


# Stacks

Stacks use the Last In First Out (LIFO) Principle

Stacks use cases include :-
* Implementing the undo feature
* Build compilers (e.g syntax checking)
* Evaluate expressions (e.g 1 + 2 * 3)
* Build navigation (e.g forward/back)

Stack supported operations are :-
* Push(item) :- adds an item at the top of the stack
* Pop :- removes the top most item from the stack
* Peek :- checks the item at the top of the stack without deleting it.
* IsEmpty :- checks whether the stack is empty or not :-)

All stack operations have a run time complexity of O(1)

# Queues

Queues use the First In First Out (FIFO) principle.

Its implementations scenarios include :-
* Printers printing jobs
* Web servers processing incoming requests

Queues supported operations include :-
* Dequeue :- removing an item from the queue
* Enqueue :- adding an item to the queue
* IsEmpty :- checks whether the queue is empty
* Peek :- checks the item at the top of the queue without deleting it.

All queue operations also have a run time complexity of O(1)

# Hash Tables

They're basically dictionaries.
They've super fast look up methods. :-)
In java, hash table implementation is via HashMap

Their use case scenarios include :-
* Spell Checkers
* Dictionaries
* Compilers
* Code Editors

Operations supported by hash tables are :-
* Insert O(1)
* Look Up O(1)
* Delete O(1)

# Trees

Trees implementation scenarios include :-
* Represent hierarchical data
* Databases
* Autocompletion
* Compilers
* Compression (JPEG, MP3)

Binary Search Tree (BST)
- In a BST, the value of any node is greater than the value in the left child and less than the value in the right child. i.e
left < node < right
- Looking up data in a BST involves logarithmic time. i.e in every look up we throw out half of the elements.

Trees supported operations are :-

* LookUp O(log n)
* Insert O(log n)
* Delete O(log n)

To traverse a BST, you can use either of the following :-
* Breadth First (Level Order) :-  it involves traversing the BST on a level basis. 
                            i.e visit all the nodes at the same level before going to the other levels
* Depth First :- here we have three ways in which we can traverse the BST :-
    * Pre-Order :- We visit the root, then the left subtree then the right subtree. i.e root, left, right
    * In-Order :- We visit the left subtree, then the root then the right subtree. i.e left, root, right . 
                The values will be traversed in ascending order.
    * Post-Order :- We visit the left subtree, then the right subtree then the root. i.e left, right, root.


