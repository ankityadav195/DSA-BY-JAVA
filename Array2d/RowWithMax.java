package Array2d;

public class RowWithMax {
    public static void main(String[] args) {
        int arr[] [] = {{4,0,5,4},{1,14,0,9},{4,6,2,4}};
        int max = Integer.MIN_VALUE;
        int rov = -1;
        for(int i = 0;i<arr.length;i++){
            int sum = 0 ;
            for(int j =0;j<arr[0].length;j++){
                sum = sum+arr[i][j];
                
            }
        //    max = Math.max(max, sum); // this is a labvaory to find the maximum number
        if(sum >max){
            max = sum;
            rov= i; // this is a found in which row is maximum for sum elements
        }
        }
        System.out.println( rov +" " + max);

    
}
    
}
