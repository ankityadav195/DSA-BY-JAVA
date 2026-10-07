// linear search


// import java.util.Scanner;

// class linear 
// {
//     int a [] = new int [6] ; int key ;
//     void getdata()
//     {
//        Scanner sc = new Scanner(System.in);
//        int i ;
//        for(i = 0; i < 6; i ++)
//        {
//         System.out.print( " Enter a number : ");
//         a [i] = sc.nextInt();
//        }
//        System.out.println("Enter no to seach ");
//        key = sc.nextInt();


        
//     }
//     void search ()
//         {
//             int i , flag =0, pos= 0;
//             for ( i = 0; i < 6 && flag ==0; i++)
//             {
//                 if ( a [i] == key )
//                 {
//                     flag =1 ; 
//                     pos = i +1 ;

//                 }
//             }
//             if ( flag  == 1)
//                 System.out.println(" number found "+ pos);
//             else 
//                 System.out.println("no not found");


//         }
    


// }
//  class search 
//  {
//     public static void main(String[] args) {
//         linear aa = new linear();
//         aa.getdata();
//         aa.search();
//     }
//  }

// binary search 

  
// import java.util.Scanner;

// class binary

// {
//     int a [] = new int [10];
//     int key ;
//     void getdata()
//     {
//         Scanner sc = new Scanner(System.in);
//         int i ;
//         for ( i = 0 ; i < 10 ; i ++ )
//         {
//         System.out.println("Enter a number : ");
//         a [i] = sc.nextInt();

//     }
//     System.out.println("Enter number to find ");
//     key = sc.nextInt();

// } 

// }

// void search ()
// {
//     int i, j , mid , flog , pos ;
//     i = 0 ;
//     j = 9 ; 
//     flog = 0;
//     while ( i <= j && flog == 0)
//     {
//         mid = (i +j )/2;
//         if ( a[mid] == key ) 
//         {
//             flog = 1; 
//             pos = mid +1 ;
//         }
//         else if ( a[mid] > key )
//             j = mid -1 ;

//         if ( a[mid] < key )
//             i = mid +1 ;

//     }
//     if ( flog ==0 )
//         System.out.println("not found ");
//     else
//     System.out.println("no found at " + pos );
// }


// class search2
// {
//     public static void main(String[] args) {
//         binary aa = new binary();
      
//         aa.getdata();
//         aa.search();

        
//     }
// }



import java.util.Scanner;

class BinarySearch
{
    int a[] = new int[10];
    int key;

    void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 sorted numbers:");

        for (int i = 0; i < 10; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter number to search:");
        key = sc.nextInt();
    }

    void search()
    {
        int low = 0;
        int high = 9;
        int mid;
        int flag = 0;

        while (low <= high)
        {
            mid = (low + high) / 2;

            if (a[mid] == key)
            {
                System.out.println("Number found at position " + (mid + 1));
                flag = 1;
                break;
            }
            else if (key < a[mid])
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        if (flag == 0)
        {
            System.out.println("Number not found");
        }
    }

    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        ob.getData();
        ob.search();
    }
}
