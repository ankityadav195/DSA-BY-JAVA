package array;

public class Missing {
    
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 4, 5};
//         int n = arr.length + 1;

//         int totalSum = n * (n + 1) / 2;
//         int arrSum = 0;

//         for (int i = 0; i < arr.length; i++) {
//             arrSum += arr[i];
//         }

//         int missing = totalSum - arrSum;
//         System.out.println("Missing number: " + missing);
//     }
// } 

public static void main(String[] args) {
    int [] arr = { 1,2,3,5};
    int n = arr.length +1;

    int totalSum = n * (n+1)/2;
    int arrSum = 0 ;
    for(int i =0 ; i <arr.length; i++){
        arrSum = arrSum + arr[i];
    }
    int missing = totalSum - arrSum;
    System.out.println( missing);
}

}
    

    
