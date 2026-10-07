// import java.util.Scanner;

// class selection
// {
//     int a[] = new int[10];

//     void getdata()
//     {
//         Scanner sc = new Scanner(System.in);
//         int i;
//         for (i = 0; i < 10; i++)
//         {
//             System.out.println("Enter a number : ");
//             a[i] = sc.nextInt();
//         }
//     }

//     void putdata()
//     {
//         int i;
//         for (i = 0; i < 10; i++)
//             System.out.println(a[i]);
//     }

//     void sort()
//     {
//         int i, j, t;
//         for (i = 0; i < 9; i++)
//         {
//             for (j = i + 1; j < 10; j++)
//             {
//                 if (a[i] > a[j])
//                 {
//                     t = a[i];
//                     a[i] = a[j];
//                     a[j] = t;
//                 }
//             }
//         }
//     }
// }

// class selectionsort
// {
//     public static void main(String[] args)
//     {
//         selection aa = new selection();

//         aa.getdata();

//         System.out.print("Unsorted array:");
//         aa.putdata();

//         aa.sort();

//         System.out.print("Sorted array:");
//         aa.putdata();
//     }
// }



import java.util.Scanner;
class selection
{
    int a[] = new int[10];
    void getdata ()
    {
        Scanner sc = new Scanner(System.in);
        int i ;
        for (i = 0; i <10 ; i++)
      {  System.out.println("Enter a number : "); 
        a[i] = sc.nextInt();
}


    }
    void putdata ()
    {
        int i ;
        for ( i = 0 ; i<10 ; i ++)
            System.out.println(a[i]);
    }
    void output ()
    {
        int i , j, t ;
        for ( i = 0 ; i <9 ; i ++)
        {
            for ( j = i +1 ; j <10 ; j ++)
            {
                if ( a[i]>a[j]){
                    t = a[i];
                    a[i]= a[j];
                    a[j]= t;
                }

            }
        }
    }
}
 class selectionshort2 {
    public static void main(String[] args) {
        selection obj = new selection();
        obj.getdata();
         System.out.print("Unsorted array:");
        obj.putdata();
        obj.output();
        System.out.print("Sorted array:");
               obj.putdata();
    }

    
}