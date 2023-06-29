Autoria própria
<h2>Algumas soluções para o livro Algorithms, de Robert Sedgewick, 4º edição.. </h2>

<h3>Capítulo 1</h3>

|Problema  | Classe                                      | Enunciado                          |
|----------------|--------------------------------------------|-------------------------------------------|
|1.1.13|[ArrayTransposition.java](1/src/s1_1/ArrayTransposition.java) |Write a code fragment to print the transposition (rows and columns changed)
|1.1.14 |[lgApproximation.java](1/src/s1_1/lgApproximation.java) |Write a static method lg() that takes an int value N as argument and returns the largest int not larger than the base-2 logarithm of N. Do not use Math. |
|1.1.15 |[HistogramArray.java](1/src/s1_1/HistogramArray.java) | Write a static method histogram() that takes an array a[] of int values and an integer M as arguments and returns an array of length M whose ith entry is the number of times the integer i appeared in the argument array. If the values in a[] are all between 0 and M–1 the sum of the values in the returned array should be equal to a.length.|
|1.1.19 (versão 1)| [Doubling_Fibonacci.java](1/src/s1_1/Better_Fibonaccis/Doubling_Fibonacci.java)|Develop a better implementation of F(N) that saves computed values in an array. |
|1.1.19 (versão 2)| [Matrix_Fibonacci.java](1/src/s1_1/Better_Fibonaccis/Matrix_Fibonacci.java)|Develop a better implementation of F(N) that saves computed values in an array.|
|1.1.19 (versão 3)| [Stored_Array_Recursive_Fibonacci.java](1/src/s1_1/Better_Fibonaccis/Stored_Array_Recursive_Fibonacci.java)|Develop a better implementation of  (N) that saves computed values in an array.|
|1.1.20|[ln_n_factorial.java](1/src/s1_1/ln_n_factorial.java)| Write a recursive static method that computes the value of ln (N !)|
|1.1.21|[TableInput.java](1/src/s1_1/TableInput.java)| Write a program that reads in lines from standard input with each line containing a name and two integers and then uses printf() to print a table with a column of the names, the integers, and the result of dividing the first by the second, accurate to three decimal places. You could use a program like this to tabulate batting averages for baseball players or grades for students.|
|1.1.22 |[IndentedBinarySearch.java](1/src/s1_1/IndentedBinarySearch.java) |Write a version of BinarySearch that uses the recursive rank() given on page 25 and traces the method calls. Each time the recursive method is called, print the argu- ment values lo and hi, indented by the depth of the recursion. Hint: Add an argument to the recursive method that keeps track of the depth |
