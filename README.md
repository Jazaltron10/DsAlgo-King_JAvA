# <b>This Repo Contains Java Code </b>
+       The Basics
+       OOP
+       Data Structures
+       Algorithms 
+       GUI
+       Coding Questions
+       Simple Projects

</b>
</b>
</b>

# <b> Data Structures And Algorithms From <i>Cracking the Coding Interview</i> by <b>JAZALTRON</b> </b>
## <b>TIME COMPLEXITY</b>

###  From my own personal experience constant time is best represented by a formula<br>

### For example you can consider the formula for summing up a series of numbers <br> 

### The first option is to create an initial variable with a value of zero and then use a for loop to add a series of numbers to the variable <br>                                                                     

### The second option would be to use a formula that irrespective of the number of items to be added it takes only a constant number of steps to get the result, this is constant time. <br>

### Because of the importance of scalability in modern applications we look and compare the time complexities of algorithms over really large data sets to see how they perform. <br><br>

### If you have a fence that needs to be painted, and this fence is w meters wide and h meters high and also needs p layers of paint, then therefore the time it would take you to completely paint the fence would be O(whp) where big O depicts, the time in the worst case.<br>

## <b>Academic description of Big O, Big theta, Big Omega [In Academia]</b>
>## BIG O
### The Big O describes the upper bound on the time it takes an algorithm to finish execution.  <b>You can think of it as less than or equal to </b>
<br>

### if x is less than 200, then saying x is less than 1000 is technically correct but however not very useful. so if we say the Big O of printing elements in an array is O(n) then it is also technically correct to say that Big O is also O(n^3) as well as any other runtime bigger than the O(n)
<br>


>## BIG Omega
### Big Omega describes the lower bound on the time it takes for an algorithm to be executed. so therfore technically the Big Omega of values in a array is omega(n), as well as omega(log n) and omega(1), this is because at the end of the day the algorithm won't be much faster than these runtimes.
<br>

>## BIG Theta
### In academia the Big theta of an algorithm describes the tight bound in terms of the time of execution of that algorithm.
### So in other words Big Theta kind of combines the upper bound and lower bound of an algorithms runtime in order to produce the tight bound runtime for the algorithm.
### Big theta's description of runtime is what is used in the software engineering industry to describe runtime of algorithms although it is usually referred to as Big O instead.
<br>


# Best Case, Worst Case, and Expected Case
>## As stated in the title of this section, the runtime for algorithms can actually be described in three different ways namely :
+       Best Case
+       Worst Case
+       Expected Case

>## <b>We can look at this from the perspective of the quicksort</b>
>## <i></i>Best Case</i>:
#### in the best case for a quick sort all the elements in the array are equal and because of this on average the sorting algorithm will just traverse through the array once. This gives a runtime of O(n).<br>
#### The best case is rarely ever brought up because its not a very useful concept. this is because we can run any algorithm with special case input to get the best case runtime of O(1).
<br>

>## <i>Worst Case</i>:
#### In the case of a quick sort the worst case would be if the array was sorted in reverse order and the pivot is chosen to be the first element in the subarray.
#### In this case the recursion used will not divide the array in half and recurse on each half of the array. it just shrinks the subarray by one element. This will generate a runtime of O(n^2)
<br>


>## <i>Expected Case</i>:
#### if none of the stated scenario for inputs as stated above in the given array we can expect a runtime of O(n logn)
<br>


>## Relationship between the cases and the runtimes.
    Best, Worst, and Expected cases describe the Big O(or Big theta) time for particular inputs or scenarios.

    Big O, Big omega, and Big theta describes the upper, lower, and tight bounds for the runtime.

<br>
<br>
<br>

## <b>Space Complexity</b>
#### Time is an important factor in any algorithm but so is the amount of memory taken up by the algorithm during its execution.
#### When we talk about space complexity we mean the auxilliary space complexity, this is the amount of space or extra memory an algorithm uses during execution.
#### so for example stack space in recursive calls counts, too. e.g


    int sum(int n){
    if (n < 0) return 0;
    return n + sum(n-1);
    }

#### Each corresponding call adds a level to the call stack
    sum(4)
        -> sum(3)
            -> sum(2)
                -> sum(1)
                    -> sum(0)


#### You can think of the space complexity of an algorithm like this:
    An algorithm is a step by step process used to accomplish a given task on a data set. Now the space complexity of an algorithm 
    attempts to keep track of the amount of memory required by the algorithm to be fully executed.


    Take for example a recursive algorithm used to sum up a series of number, each subsequent call to the function takes up space in the memory.
    These recursive calls to the function, just simply means that for each call to the function a new space in memory is allocated for computation. so therefore the space complexity for this algorithm is O(n)
<br>

    However this isn't always the case, just because there are n calls total doesn't mean it takes O(n) space. 
    So consider the function below, which adds adjacent elements between 0 and n.

    static int pairSumSequence(int n){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += pairSum(i, i+1);
            System.out.printf("%d\n", sum);
        }
        return sum;
    }
    static int pairSum(int a , int b){
        return a + b;
    }
<br>

    Since the conditional upper boundof the loop is n, it just means that there will be roughly n number of calls to the function pairSum.

    But as you can see each subsequent resulting call to the function is stored in the variables sum, and what this means is that these calls do not exist simultaneously on the call stack, so we'll only need O(1)space.
    
    We can also observe that the execution of this algorithm does not take up any extra memory during excution.

#### <b>Further Breakdown</b>
    When the algorithm starts getting executed there are already predefined variables which take up memory already.

    In the for loop the value of the variable sum is constantly being overwritten each time through the loop by adding the result gotten from calls to the pairSum function.
    
    Because the call to the pairSum function only exist one at a time and not all at once no new or extra memory is used up during the entire execution of this algorithm and this is why it has a space complexity of O(1).

<br>

>## <b>Drop The Constants</b>
#### it is very possible for O(n) code to run faster than O(1) code for specific inputs. As stated earlier, Big O only attempts to describe the runtime of an algorithm as the inputs scale, it just describes the rate of increase.

#### For this reason an algorithm that one might have described as O(2n) is actually O(n), this is why we drop the constants in runtime.
<br>

#### <b>Big O just allows us to express how the runtime scales, therefore we just need to accept that it doesn't mean that O(n) is always better than O(n^2).</b>
<br>

#### So we drop the constants because as an algorithm scales to handle larger inputs or data sets the impact made on the algorithm by constants is basically insignificant at scale or negligible, this is because at the end of the day the runtime still remains the same and is not changed to a much worse or much better runtime.
<br>

>## <b>Drop The Non-Dominant Terms</b>
#### In most cases when we dealing with Big O we are trying to describe the runtime for either the worst case or expected case given the input values, and for this reason an algorithm that has a runtime of O(n^2+n) is simply O(n^2).
#### We've already established the fact that it is recommended that you drop the constants when describing the runtime of an algorithm, you also have to drop the non-dominant terms when describing the algorithm, this is because we are much more interested in finding the upper bound(worst case) of an algorithm given a certain input size or data set.

+         O(n^2 + n) becomes O(n^2)    
+         O(n + log n) becomes O(n)    
+         O(5*2^n + 1000n^100) becomes O(2^n)    

>## NOTE
#### We might still have a sum in a runtime. For example, the expression O(B^2 + A) cannot be reduced (without some special Knowledge of And B).



>## <b>Multi-Part Algorithns: Add vs Multiply</b>

            Add the Runtimes: O(A + B)   |    Multiply the Runtimes:O(A*B)
            for (int a: arrA){           |    for(int a : arrA){      
                print(a);                |      for(int b : arr B){
            }                            |           print(a+","+b);
                                         |      }                       
            for(int b : arrB){           |    }
                print(b);                |   
            }                            |   

#### In the example on the left, we do A chunks of work then B chunks of work. Therefore, the total amount of work is O(A+B).
<br>

#### In the example on the right, we do B chunks of work for each element in A. Therefore, the total amount of work is O(A*B).

### In Other words: 
+       If your algorithm is in the form "do this, then, when you're all done, do that" then you add the runtimes.
<br>

+       if your algorithm is the form "do this, for each time you do that" then you multiply the runtimes.


















































