// Step 1

// Big O Notation is a mathematical notation used to describe the upper bound of an 
// algorithm's time or space complexity.It focuses on the growth rate of the algorithm's 
// running time or space requirements as the input size increases.
// Common Big O notations include :
// O(1) : Constant time
// O(log n) : Logarithmic time
// O(n): Linear time
// O(n^2): Quadratic time
// O(2^n): Exponential time
// O(n!): Factorial time

// Best Case 
// The scenario where the algorithm performs the minimum number of steps.
// Example : In linear search, finding the target at the first position, resulting in O(1) 
// time complexity.

// Average Case
// The scenario where the algorithm performs an average number of steps.
// Example : In linear search, the target is expected to be in the middle of the list, 
// resulting in O(n/2) time complexity, simplified to O(n).

// Worst Case
// The scenario where the algorithm performs the maximum number of steps.
// Example : In linear search, the target is at the last position or not present at all,
// resulting in O(n) time complexity.

// Step 2

public class Product
{
	int productId;
	String productName;
	String category;
}
