// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

// You must do it in place.
// Example 1:
// Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]]
  
// Example 2:
// Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
// Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

// In short the problem is if the zero is found in matrix then make all zero to curresponding row and column
//Steps - to solve the problem
//1 - crete two boolaen arrays to of length row and column of matrix respectively
//2 - iterate over the matrix if zero is found the make true in boolean array for the current position index
//3 - iterate again the matrix if the boolean array return true for position index then make zero in matrix
import java.util.*;
class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        boolean[] r = new boolean[row];
        boolean[] c = new boolean[col];
        
        // First pass to find all the rows and columns that need to be zeroed
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    r[i] = true;
                    c[j] = true;
                }
            }
        }
          // Second pass to set the zeroes
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (r[i] || c[j]) {
                    matrix[i][j] = 0;
                }
            }
      
        }
    }
}
 
