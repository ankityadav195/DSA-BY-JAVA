package Array2d;

public class ColumnWisePrint {
    public static void main(String[] args) {
        int arr[] [] = {{4,0,5,4},{1,4,0,9},{4,6,2,4}};
        for(int i = 0 ; i <arr.length;i++){
                for(int j = 0 ; j <arr[0].length;j++){ 
            //      for(int ele: arr[i]){
            // System.out.print(arr[i] +" ");
            System.out.print(arr[i] [j] +" ");
        }
        System.out.println();
    }
       
    }
    
}
