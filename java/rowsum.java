// // row 

// import java.util.Scanner;
// class row
// { 
//     int a[][] = new int [3][3];
//     int i ,j ;
//     void getdata()
//     {
//         Scanner sc = new Scanner (System.in);
//         for(i =0;i<3;i++)
//         {
//             for(j =0;j<3;j++)
//             {
//                 System.out.println("Enter a first number ");
//                 a[i][j]= sc.nextInt();
//             }
//         }
//     }
//     void putdata ()
//     {
//         int i;
//         for(i =0;i<3;i++){
//              for(j =0;j<3;j++)
//              {
//         System.out.println(a[i][j] + " ");
//     }
//     System.out.println( );
//     }
//     }
//     void add ()
//     {
       
       
//         for(i =0;i<3;i++)
//             {
//               int   sum = 0;

//             for(j =0;j<3;j++)
//             {
//                 sum = sum + a[i][j];


//     }
//     System.out.println(" sum of "+ i + 1 + "row = " + sum);
    
// }
//     }
// }
// class row2
// {
//     public static void main(String[] args) {
//         row aa = new row();
//         aa. getdata();
//         aa.putdata();
//         aa.add();
//     }
// }


// colcum 

import java.util.Scanner;
class colcum
{ 
    int a[][] = new int [3][3];
    int i ,j ;
    void getdata()
    {
        Scanner sc = new Scanner (System.in);
        for(i =0;i<3;i++)
        {
            for(j =0;j<3;j++)
            {
                System.out.println("Enter a first number ");
                a[i][j]= sc.nextInt();
            }
        }
    }
    void putdata ()
    {
        int i;
        for(i =0;i<3;i++){
             for(j =0;j<3;j++)
             {
        System.out.println(a[j][i] + " ");
    }
    System.out.println( );
    }
    }
    void add ()
    {
       
       
        for(i =0;i<3;i++)
            {
              int   sum = 0;

            for(j =0;j<3;j++)
            {
                sum = sum + a[j][i];


    }
    System.out.println(" sum of "+ i + 1 + "colcum = " + sum);
    
}
    }
}
class row2
{
    public static void main(String[] args) {
        colcum aa = new colcum();
        aa. getdata();
        aa.putdata();
        aa.add();
    }
}
