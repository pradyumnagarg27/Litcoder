# Problem Statement
## Merge Two Sorted Linked Lists
Suppose we have two sorted linked lists, represented by the pointers **headA** and **headB**. Our task is to merge these two lists into a single sorted linked list. It's possible for either **headX** or **headY** to be null, indicating that the corresponding list is empty.  
  
For example, consider the following linked lists:  
  
headX refers to 2 -> 4 -> 6 -> 8 -> NULL  
headY refers to 1 -> 3 -> 5 -> NULL  
  
We need to merge these two lists into a new list, where the elements are sorted in ascending order. After merging, the resulting linked list would be:  
  
1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 8 -> NULL
>## Exercise-1
>### Input:
>3  
>1  
>3  
>7  
>2  
>1  
>2  
>  
>Here the first value is the count of the first link node, and the fifth value is the count of the second link node.  
>### Output:
>1  
>1  
>2  
>3  
>7  

>## Exercise-2
>### Input:
>3  
>2  
>3  
>4  
>2  
>1  
>7  
>### Output:
>1  
>2  
>3  
>4  
>7  
