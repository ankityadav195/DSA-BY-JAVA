// package Array2d;

// public class spiralTraversing {
//     public static void main(String[] args){}
    
// }
//    public ArrayList<Integer> arr= new ArrayList<>();
// class Solution {
//     public ArrayList<Integer> spirallyTraverse(int[][] arr) {
//         ArrayList<Integer> ans = new ArrayList<>();
        
//         int m = arr.length, n = arr[0].length;
//         int firstrow = 0, lastrow = m - 1;
//         int firstcol = 0, lastcol = n - 1;

//         while (firstrow <= lastrow && firstcol <= lastcol) {

//             // right
//             for (int j = firstcol; j <= lastcol; j++)
//                 ans.add(arr[firstrow][j]);
//             firstrow++;

//             // down
//             for (int i = firstrow; i <= lastrow; i++)
//                 ans.add(arr[i][lastcol]);
//             lastcol--;

//             // left
//             if (firstrow <= lastrow) {
//                 for (int j = lastcol; j >= firstcol; j--)
//                     ans.add(arr[lastrow][j]);
//                 lastrow--;
//             }

//             // up
//             if (firstcol <= lastcol) {
//                 for (int i = lastrow; i >= firstrow; i--)
//                     ans.add(arr[i][firstcol]);
//                 firstcol++;
//             }
//         }
//         return ans;
//     }
// }
