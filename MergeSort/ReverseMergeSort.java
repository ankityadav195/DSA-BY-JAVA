// class Solution {
//     static int count ;
//     public int reversePairs(int[] nums) {
        
//      count = 0 ;
//         mergesort(nums);
//         return count;
//     }
   
//         // Code Here 1 
//         // int count = 0 ;
//         // for(int i = 0 ; i<arr.length;i++){
//         //     for(int j= i+1; j <arr.length;j++){
//         //         if(arr[i]>arr[j]) count++;
//         //     }
//         // }
//         // return count;
        
//     public static void mergesort(int[] arr) {
//         int n = arr.length;
//         if (n <= 1)
//             return;
//         // step 1 : create 2 new empty arrays of size n/2 each

//         int[] a = new int[n / 2];
//         int[] b = new int[n - n / 2];

//         // step 2 : copy paste arr into a and b

//         int idx = 0;
//         for (int i = 0; i  < a.length; i++)
//             a[i] = arr[idx++];
//         for (int i = 0; i < b.length; i++)
//             b[i] = arr[idx++];

//         // step 3: magic

//         mergesort(a);
//         mergesort(b);

//         // step 4 : marge a and b into arr
//         merge(a, b, arr);

//     }

//     public static void merge(int[] a, int[] b, int[] c) {
//         int i = 0, j = 0, k = 0;
//         while (i < a.length && j < b.length) {
//             if (a[i] <= b[j])
//                 c[k++] = a[i++];
//             else{
//                 if(a[i]>2*b[j]) count = count +(a.length -i);
//                 c[k++] = b[j++];
//             }

//         }
//         while (i < a.length)
//             c[k++] = a[i++];
//         while (j < b.length)
//             c[k++] = b[j++];

//     }
// }