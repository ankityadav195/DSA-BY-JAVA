package Recusrion2;

public class Existsarray {
    public static void main(String[] args) {
        int [] arr = {23,24,26,2,67,5,25,32,4,2};
        int targert = 1;
        System.out.println(print(arr,targert,0));

    }
    public static boolean print(int[] arr,int targert, int idx){
        if(arr[idx]==arr.length) return false;
        if(arr[idx]==targert) return true;
        return  print(arr, targert, idx+1);

    }
    
}
