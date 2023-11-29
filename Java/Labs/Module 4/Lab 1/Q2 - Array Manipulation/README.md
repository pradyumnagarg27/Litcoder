# Problem Statement
## Mix The Array
Given a 1-indexed array initially filled with zeros and a list of operations, perform each operation by adding a value to each element of the array between two given indices (inclusive). After performing all operations, find and return the maximum value in the array.

For example, let's consider the following scenario:  

q = {[2,4,5],[3,6,3],[1,7,10]}  

Initial Array Size = 7  

Array: [0, 0, 0, 0, 0, 0, 0]  

**Operations:**  

* Add 5 between indices 2 and 4: [0, 5, 5, 5, 0, 0, 0]
* Add 3 between indices 3 and 6: [0, 5, 8, 8, 3, 3, 0]
* Add 10 between indices 1 and 7: [10, 15, 18, 18, 13, 13, 10]

In this scenario, the maximum value in the array is 18.  

>## Exercise-1
>### Input:
>5  
>3  
>2 4 3  
>4 5 9  
>3 3 11  
>  
>Note:  
>Line -1 : array size  
>Line -2 : query count  
>### Output:
>14
>## Exercise-2
>### Input:
>10  
>3  
>3 10 3  
>4 5 9  
>2 9 11  
>### Output:
>23
