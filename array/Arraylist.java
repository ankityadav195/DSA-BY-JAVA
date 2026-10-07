package array;

import java.util.ArrayList;


public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(45);
        arr.add(25);
        arr.add(35);
        arr.add(65);
        arr.add(25);
        arr.add(15);

        // System.out.print( arr +" ");
        // // System.out.print(arr[2]); // cant return value 
        // System.out.println(arr.get(0)); // access value to use the .get 



        // arr.set(3, 10); // arr[3] = 10 ;
        // System.out.println(arr);

        int n = arr.size() ;// can't be use in arr.length  . its use to size 
        for(int i = 0 ; i < n ;i++){
            System.out.print(arr.get(i)+" ");
        }
        for(int ele : arr)
            System.out.println(ele + " ");

        arr.add(2,100);
        System.out.print(arr );

        // arr.remove(n-1); // thats is use to insalized size
        arr.remove(arr.size()-1); // thats is use to current size 
        System.out.println(arr);

        // reverse
        int i =0 , j = arr.size()-1;

        while (i<j) {
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;

            
        }
       


        // Collections.reverse(arr);  // thats is use to labvaory 

        //   ArrayList<Character> ar = new ArrayList<>();// thats is use to charachter 
    }
    
}
