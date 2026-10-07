package Recusrion2;

import Revision.pattern.method.returnIsMendatory;

public class array {
    public static void main(String[] args) {
        int arr[] = { 4, 6, 3, 6, 3, 2, 6, 2 };
        int ele = 2;
        System.out.println(printarr(ele, arr, 0));

    }

    public static boolean printarr(int ele, int arr[], int idx) {
        if (idx == arr.length)
            return false;
        if (arr[idx] == ele)
            return true;

        return printarr(ele, arr, idx + 1);

    }

}
