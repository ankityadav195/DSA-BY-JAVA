package array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 34, 24, 6, 2, 7, 31, 57, 23, 35 };
        int n = arr.length;

        // for(int i = 0 ; i<arr.length ; i ++){
        // swap arr[i] = arr[n-1-i]
        // int temp = arr[i];
        // arr[i] = arr[n -1 -i];
        // arr[n-1-i] = temp;
        // }  

        // int i = 1 ; int j = n -3;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int ele : arr)
            System.out.print(ele + " ");
    }

}
