package SortingAlgorithms;

public class MoveAllZero {
    public static void main(String[] args) {
        int [] arr = {34,0,35,0,74,0,15,452,5,0,30,0,36,246};  
        int n = arr.length;

        for(int i = 0 ; i<n-1; i++){
            for( int j = 0 ; j <n-1 -i;j++){
                if(arr[j]==0){
                    int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;

                }



            }
        }
        for(int ele : arr)
        System.out.print(ele + " ");

    }
    
}
