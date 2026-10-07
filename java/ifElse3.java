

// question 1


// import java.util.Scanner;

// class max {
//     public static void main(String args[]) {
//         int a, b;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a 1 number;");
//         a = sc.nextInt();
//         System.out.println("Enter a 2 number;");
//         b = sc.nextInt();

//         if (a > b) {
//             System.out.println("its true");
//          } else{ 
//             System.out.println("its not true");

//         }

//     }

// }

// question 2

// import java.util.Scanner;

// class max {
//     public static void main(String args[]) {
//         int a, b , c ;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a 1 number;");
//         a = sc.nextInt();
//         System.out.println("Enter a 2 number;");
//         b = sc.nextInt();
//         System.out.println("Enter a 3 number;");
//         c = sc.nextInt();

//         if (a > b  && a > c) {
//             System.out.println(" Max value is  true of = " +a);

//          } else if (b > a && b > c){
//             System.out.println(" Max value is  true of = " +b);


//          }
//          else if (c > b && c > a)
//          {
//             System.out.println(" Max value is  true of = " +c);


//          }
         
//          else { 
//             System.out.println("its not true");

//         }

//     }

// }

// import java . util. Scanner;
// class check
// {
//     public static void main ( String args []){
//         int a  ;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a First number :");
//         a = sc.nextInt();
        
//         if (a % 2 ==0){
//             System.out.println( " Yess its a even number");
//         } else {
//             System.out.println("this is a not even number");

//         }
//     }
// }

// import java.util.Scanner;
// class checkpostive
// {
//     public static void main( String args []){
//         int a ;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number what  do you want: ");
//         a = sc.nextInt();
//         if(a > 0){
//             System.out.println("Yess it is a positive number ");

//         }
//         else if( a == 0){
//             System.out.println("Yess it is neutral number ");


//         }
//         else if( a < 0){
//             System.out.println("Yess it is negative number ");


//     }
// }
// }

// import java.util.Scanner;
// class calculater
// {
//     public static void main(String args []){
//         int a , b, c ;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a  first number what do you want");
//         a = sc.nextInt();
//         System.out.println("Enter a  second number what do you want");
//         b = sc.nextInt();
//         System.out.println("Enter you choice 1-> add, 2 -> substract, 3-> multipal , 4-> divide \n Enter a number you choice");
//         c= sc.nextInt();
//         if(c==1){
//             System.out.println("Addition = " +(a+b));
//         }
//         else if(c==2){
//             System.out.println("Substract = " +(a-b));
//         }
//         else if(c==3){
//             System.out.println("multipal = " +(a*b));
//         }
//         else if(c==4){
//             System.out.println("divide = " +(a%b));
//         }
//         else{
//             System.out.println("chutiya hai kya?");
//         }

//     }
// }



import java.util.Scanner;
class calculater
{
    public static void main(String args []){
        int a , b, c ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  first number what do you want:");
        a = sc.nextInt();
        System.out.println("Enter a  second number what do you want");
        b = sc.nextInt();
        System.out.println("Enter you choice 1-> add, 2 -> substract, 3-> multipal , 4-> divide \n Enter a number you choice");
        c= sc.nextInt();
        switch(c)
        {
            case 1: 
            System.out.println("Addition = " +(a+b));
            break;

            case  2: 
             System.out.println("Substract = " +(a-b));
             break;
             case 3:
             System.out.println("multipal = " +(a*b));
             break;
             case 4:
              System.out.println("divide = " +(a/b));
              break;
              default:
                System.out.println("chutiya hai kya?");
        }
    }
}  