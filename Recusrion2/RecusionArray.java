package Recusrion2;

public class RecusionArray {
    public static void main(String[] args) {
        int [] arr = {12,23,14,2,6,24,62,};
        print(arr,0);


    }
    public static void print(int [] arr,int idex ) {
        int n = arr.length;
        if(idex == n ) return;
        print(arr,idex+1);
        System.out.print(arr[idex]+" ");
        
    }
    
}
