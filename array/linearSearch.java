package array;

public class linearSearch {
    public static void main(String[] args) {
    //     int [] arr = { 234,352,6,2,25,7246,256,244,63,87,324,25,5,2335,6};
    //     int target = 6;
    //     boolean flag = false;
    //     for(int i = 0 ; i<arr.length ; i++){
    //         if(arr[i]== target) {
    //             flag = true;
    //             break;
    //     }
    // }
    // if(flag==true) System.out.println("The element is found in the array");
    // else System.out.println("The target is not found ");
    

     int [] arr = { 234,352,6,2,25,7246,256,244,63,87,324,25,5,2335,6};
      int target = 2;
     int found = -1;
     for(int i = 0; i<arr.length ; i++){
        if(arr[i] == target)
            {
                found = i; 
                break;
              
     }

  
    }
    if(found == -1) System.out.println("The element is found in the array");
     else System.out.println("The target is not found ");
}
}