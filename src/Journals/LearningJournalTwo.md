# <b> Data Structures And Algorithms From <i>Cracking the Coding Interview</i> by <b>JAZALTRON</b> </b>
>## <b>Amortized Time</b>
<!-- <i> -->
    Amortized time is the way to express the time complexity when an algorithm has the very bad time complexity only once in while besides the time complexity that happens most of the time.
    A good example would be an ArrayList which is a data structure that contains an array and can be extended.
<!-- </i> -->



>## <b>Log N Runtimes</b>
>### CASE STUDY: Binary Search
>If given a sorted array of N-elements to find element x. We first compare x to the midpoint of the array. 
+ if x == middle, then we return.
+ if x < middle, then we search on the left side of the array. 
+ if x >  middle, then we search on the right side of the array. 


        search 9 within {1,5,8,9,11,13,15,19,21}
            compare 9 to 11 -> smaller.
            search 9 within {1,5,8,9,11}
                compare 9 to 8 -> bigger.
                search 9 within {9,11}
                    compare 9 to 9.
                    return.

Code Breakdown:<br>
 When we start out in the binary search algorithm with an array containing N number of elements, after every single step, we are left with half of the number of elements in the array<br>
 <b>(i.e {Step 1 -> N/2},
 {Step 2 -> N/4}). </b><br>
 We stop when we either find the value or we're down to just one element. <br>


 The total runtime is then a matter of how many steps
 (dividing N by 2 each time) we can take until N becomes 1. 

    N = 16
    N = 8           /*divide by 2*/       
    N = 4           /*divide by 2*/
    N = 2           /*divide by 2*/
    N = 1           /*divide by 2*/

<br>

We could look at this in reverse(going from 1 to 16 instead of 16 to 1). How many times we can multiply 1 by 2 until we get N?

    N = 1 
    N = 2          /*multiply by 2*/       
    N = 4          /*multiply by 2*/
    N = 8          /*multiply by 2*/
    N = 16         /*multiply by 2*/


>## <b> Summary </b>:
<b>In a problem, Whenever the number of elements in the problem space gets halved each time, the runtime will likely be O(log N)</b> 

    This is the same reason why finding an element in a balanced binary search tree is O(log N). With each comparison, we go either left or right. Half the nodes are on each side, so we cut the problem space in half each time. 
<br>
<br>
<b>expression 2^k = N is exactly what log expresses.</b>
<br>
<b>2^4 = 16 ->  log 16 = 4</b>
<br>
<b>log(2)N = k -> 2^k = N</b>
<br>
<br>

    What this simply means is that given an array of 16 or N elements, the number of steps that would be needed to get to 1 by dividing N by 2 would be K or 4. 
<br>

    In binary search terms it means in the worst case you would only need 4(k) steps in order to find the value you are searching for in an array with 16(N) elements. 




>## <b>Recursive Runtimes</b>
                                                fib(4)  
                                               /     \   
                            fib(3)                                    fib(3)
                           /      \                                  /      \
                fib(2)              fib(2)                fib(2)                  fib(2)
                /   \               /    \                /    \                  /    \  
           fib(1)   fib(1)     fib(1)    fib(1)      fib(1)    fib(1)        fib(1)    fib(1)
                

<br>

>### **BreakDown** 
Suppose we call f(4). This calls f(3) ***twice***. Each of those calls f(2), until we get down to f(1).
<br>

We can visualize this recursive fibonacci function as a tree. Each subsequent call in its call stack is the node on this tree. The tree will have a height of N. Each node(i.e., function call) has two children. Therefore, each level will have twice as many calls as the one above it.


|Level|Node |Also Expressed as                  |Or       |
| :---| :--:| :--------------------------------:| -------:|
| 0   | 1   |                                   | 2 ^  0  |
| 1   | 2   |2 * previous level = 2             | 2 ^  1  |
| 2   | 4   |2 * previous level = 2 * 2^1 = 2^2 | 2 ^  2  |
| 3   | 8   |2 * previous level = 2 * 2^2 = 2^3 | 2 ^  3  |
| 4   | 16  |2 * previous level = 2 * 2^3 = 2^4 | 2 ^  4  |


    When presented with a recursive function that makes multiple calls, the runtime will often(but not always) look like O(branches^height), where branches is the number of times each recursive call branches. In this case, this gives us O(2^N).
<br>
    
    Its space complexity will be O(N). Although we have O(2^N) nodes in the tree total, only O(N) exist at any given time. Therefore, we would only need to have O(N) memory available.


***Personal Breakdown***
    
    A level is just a collection of nodes that are the same distance from the root node.


    if we have a recursive function that takes in an integer N and makes multiple calls(branches) lets say two calls in its initial call(root node).
    
    Its call stack exist in levels and anytime we go down a level starting from the root node(first function call), the total amount of nodes or branches or function calls on subsequent levels doubles.


    if lets say the first level that contains the first call is 
    f(N) -> level 0, this makes two function calls 
    f(N)+f(N) -> level 1, each of these function calls makes two function calls, and this continues until we reach the base case.


    So in summary we know that whenever we call the top level function(or root node) for the recursive function, we know that we'll have just one node at the top level(i.e. level 0), and to get the amount of nodes for the next level, we'll just multiply by the number of branches the root node has, and to get the amount of nodes on the next level(i.e level 2) we'll multiply the total amount of nodes on the previous level by 2 again and this goes on for N number of times, this is because the number of levels(height) in the tree is N.


    To get the total number of nodes or the total number of calls a recursive function would make, we'll just take the number of nodes(or function calls) on the top level function(In this case and most cases, it is 2) and multiply it by itself, about N number of times.


    therefore if lets say N is 5 and there are 2 recursive function calls in the top level function, then the time complexity, would be 
    1*2*2*2*2 -> 2^5
    this simply translates to (2^0)+(2^1)+(2^2)+(2^3)+(2^4)+....+(2^N)
    (which is 2^N+1 -1)
    In summary the 5th fibonacci number would take this recursive algorithm 2^5 number of steps to complete the evaluation and return the result





