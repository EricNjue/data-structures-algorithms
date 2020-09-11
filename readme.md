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
| --- | --- | --- |
| Look Up By Index |  O(1) | O(n) |
| Look Up By Value |  O(n) | O(n) |
| Insert Beginning/End  | O(n) | O(1) |
| Insert Middle |  O(n) | O(n) |
| Delete Beginning|  O(n) |  O(1) |
| Delete Middle |  O(n) |  O(n) |
| Delete End |  O(n) |  O(n) |


