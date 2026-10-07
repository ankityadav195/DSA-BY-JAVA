package Array2d;

public class ForEachLoop {
    public static void main(String[] args) {
       int arr[] [] = {{4,0,5,4},{1,4,0,9},{4,6,2,4}};

       for(int  [] a : arr){
        for(int ele : a){
            System.out.print(ele +" ");
        }
        System.out.println();
       }
    //    for(int  i = 0 ; i<arr.length;i++){
    //     for(int ele : arr[i]){
    //         System.out.print(ele +" ");
    //     }
    //     System.out.println();

    //    }
    
}
}
