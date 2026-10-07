// import java .util .Scanner;
// class Revers
// {
//     int n;
//     void getdata(int i)
//     {
//         n =  i;

//     }
//  void putdata()
//  {
//     int rev = 0;
//     while(n>0)
//     {
//        rev = (rev*10) +n%10;
//        n = n/10;

        
//     }
//     System.out.println("Revers =" + rev);
//  }
//  public static void main(String[] args) {
//     int m;
//     Revers aa = new Revers();
//     Scanner sc= new Scanner(System.in);
//     System.out.println("Enter a number to find ");
//     m = sc.nextInt();
//     aa.getdata(m);
//     aa.putdata();
//  }
// }



import java.util.Scanner;
class prime
{

   int n ;
   void getdata()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number :");
      n = sc.nextInt();


   }

   void putdata()
   {
      int i ,count =0 ;
      for(i = 1; i <=n ; i++)
      {
         if (n % i ==0) 
            count= count+1;

            
         }
         if (count ==2)
            System.out.println("prime");
         else 
            System.out.println("not prime ");
      }
      public static void main(String[] args) {
         prime aa = new prime();
         aa.getdata();
         aa.putdata();
      }
   }
   

