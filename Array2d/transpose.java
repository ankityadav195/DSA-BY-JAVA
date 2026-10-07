package Array2d;

public class transpose {
   
    public static void main(String[] args) {

        int[][] arr = { {1,2,3},{4,5,6},{7,8,9}};

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        print(arr);
    }

    static void print(int[][] arr){
        for(int[] a : arr){
            for(int ele : a){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}



    

