const originalArray = [5, 2, 9, 1, 5, 6];

// Use the sort method with a custom comparison function
const sortedArray = originalArray.sort((a, b) => b - a);

console.log(sortedArray);

// output = 
// [ 9, 6, 5, 5, 2, 1 ]