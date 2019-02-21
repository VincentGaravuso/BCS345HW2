# BCS345HW2
Tasks:
Create a Java project called BCS345hw2 and use the default package for it. In the BCS345hw2.java,
write statements to complete the following two tasks.

Task 1
Write code to simulate rolling a six-sided die. A six-sided die has the values 1-6 on its faces. The
program first asks user for the number of rolls and then rolls the die for the specified times. The program
displays the face values, the number of occurrences of each value, and the frequency of each value in a
neat tabular format. Use an int array to store the number of occurrences of 6 values and a double
array to store the frequency of 6 values. Display 5 decimal places for floating-point values.

Task 2
Use a two-dimensional array to solve the following application problem: A company has four
salespeople (1 to 4) who sell five different products (1 to 5). The data file hw2data.txt contains all
salespeople’s sales information for five products for last month. Each row represents a particular product
and each column represents a salesperson. Write an application that will read all this information from
the file, display the raw data on the screen, process the data, and summarize the following information:

1) The total sales by product.
2) The total sales by salesperson.
3) The highest sales by product.
4) The highest sales by salesperson.
5) The total sales by all salesperson for last month.

After processing all the information, display the results in a neat tabular format, with each column
representing a salesperson and each row representing a particular product. Display the total sales by 
product and the highest sales by product to the right of the rows and display the total sales by
salesperson and the highest sales by salesperson to the bottom of the columns.
You must write the following six methods and call them in Task 2.

1. printArray. This method should accept a two-dimensional array as its argument and display the
contents of the array on the screen. The header of the method is:
public static void printArray(double[][] array)

2. getTotal. This method should accept a two-dimensional array as its argument and return the
total of all the values in the array. The header of the method is:
public static double getTotal(double[][] array)

3. getRowTotal. This method should accept a two-dimensional array as its first argument and an
integer as its second argument. The second argument is the subscript of a row in the array. The
method should return the total of the values in the specified row of the array. The header of the
method is:
public static double getRowTotal(double[][] array, int row)

4. getColumnTotal. This method should accept a two-dimensional array as its first argument and
an integer as its second argument. The second argument is the subscript of a column in the array.
The method should return the total of the values in the specified column. The header of the method
is:
public static double getColumnTotal(double[][] array, int col)

5. getHighestInRow. This method should accept a two-dimensional array as its first argument and
an integer as its second argument. The second argument is the subscript of a row in the array. The
method should return the highest value in the specified row of the array.

6. getHighestInColumn. This method should accept a two-dimensional array as its first
argument and an integer as its second argument. The second argument is the subscript of a column
in the array. The method should return the highest value in the specified column of the array.
Consider using 4 double arrays to store total sales for each person, total sales for each product, the
highest sales for each person, and the highest sales for each product. 

----------------------------------------------------------------------------------------------------------
Copy and paste the following data into hw2data.txt and save the file:
1634.5 3246.85 2236.7 1735.8
1435.2 4327.34 3427.2 3212.4
3212.5 3472.4 1243.5 2384.3
2892.5 3428.2 3727.5 3271.5
1243.0 3298.8 3482.6 2345.5 
