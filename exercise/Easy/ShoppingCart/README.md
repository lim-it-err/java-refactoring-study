## Exercise 1
### Problems
This code covers a typical shopping cart functionality and contains the following issues:

- Use of Raw Types: Generics are missing in List and ArrayList.
- Insufficient validation: The addItem method does not validate the case where the price is negative.
- Missing update of total cost: The removeItem method does not update totalCost after removing an item.
- Inconsistent return type: The getTotalCost method returns a string, but it may need to be processed as a number.
- Inefficient use of data types: The loop uses Object, requiring type casting.
- Less readability and extensibility: There is room for improvement, such as method naming, coding style, etc.
- Less exception handling: It does not handle empty carts, invalid input, etc.

### Exercise task
Write a JUnit test case for this code.
Refactor to solve the issues and improve the readability and extensibility of the code.
Compare the results before and after the refactoring.
