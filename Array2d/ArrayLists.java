package Array2d;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);   a.add(345);   a.add(12);   a.add(324);

    //     for(int i=0;i<arr.size();i++){
    //         for(int j=0;j<arr.get(i).size();j++);
            //   System.out.println(arr.get(i).get(j)+ " ");
    //     }
    //    System.out.println();
    // }
        ArrayList<Integer> b= new ArrayList<>();
         b.add(23);   b.add(3345);   b.add(132);   b.add(24);


        ArrayList<Integer> c= new ArrayList<>();
         c.add(23);   c.add(3345);   c.add(132);   c.add(24);



        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a);arr.add(b);arr.add(c);


        // System.out.println(arr );
        for(ArrayList<Integer> list :arr){
            for(int ele: list){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
    
}

