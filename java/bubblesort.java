// import java.util.Scanner;
// class  bubble
// {
//     int a[]= new int[10];
//     void getdata()
//     {
//         Scanner sc = new Scanner(System.in);
//         int i ;
//         for(i=0; i <10 ; i++)
//         {
//             System.out.println("Enter a number :");
//             a[i] = sc.nextInt();

//         }
//     }
//     void putdata()
//     {
//         int i ;
//         for( i = 0 ; i <10 ; i++)
//         {
//            System.out.println(a[i]); 

//         }
//     }
//     void sort ()
//     {
//         int i , j , t ;
//         for ( i = 0;  i < 9 ; i ++ ) 
//         {
//             for ( j = 0 ; j < 9 -i  ; j++)
//            {
//             if ( a[j] > a [j+ 1]){
//                 t = a[i];
//                 a[j] = a[j+1 ];
//                 a[j+ 1]= t;
//             }

//             }
//         }

//     }
// }
// class bubblesort 
// {
//     public static void main(String[] args) {
//         bubble obj = new bubble();
//         obj.getdata();
//         System.out.println("unsort array ");
//         obj.putdata();
//         System.out.println("sort array ");
//         obj.sort();
//         obj.putdata();
//     }
// }

import java.util.Scanner;
class bubble
{
    int a[]= new int[10];
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        int i ;
        for (i =0; i < 10; i++)
        {
            System.out.println("Enter a number :");
            a[i] = sc.nextInt();
        }
    }
    void putdata ()
    {
        int i ;
        for(i =0; i < 10; i++)
        System.out.println(a[i]);

    }
    void sort ()
    {
        int i , j,t ;
    for ( i = 0 ; i<9 ; i++)
     { for ( j = 0; j < 9-i ; j++)
     {
        if ( a[j] > a [j+1])
        {
            t= a[i];
            a[j] = a[j+1];
            a[j+1] = t;
        }

     }

    }
    }
}
class bubblesort
{
    public static void main(String[] args) {
        bubble obj = new bubble();
        obj.getdata();
        System.out.println("unsort arry");
        obj.putdata();
        System.out.println("sort array");
        obj.sort();
        obj.putdata();
    }
}
