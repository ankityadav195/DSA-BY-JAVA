package String;

// import java .util .Scanner;
// class string {
// public static void main(String[] args) {
//    String str = new String();
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a number : ");
//     str = sc.next();
//     System.out.println("Hello Mr/ Mrs.  " + str);

// }
    
// }

//  import java .util .Scanner;
// class string {
// public static void main(String[] args) {
//    String str = new String();
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a number : ");
//     str = sc.next();
//      System.out.println("Hello Mr/ Mrs.  " + str.charAt(5));  //str.length()

// }
// }


// import java.util.Scanner;
// class string 
// {
//     public static void main(String[] args) {
//         String S = new String();
//         int i, vol = 0,  con = 0 ;
//         Scanner sc = new Scanner(System.in );
//         System.out.println("Enter a string");
//          S = sc.next();
//          S = S.toUpperCase();
//          for ( i = 0; i< S.length() ; i++)
//          {
//             char C = S.charAt (i);
//             if ( C != ' ')
//             {
//                 if (C == 'A' || C == 'E' || C == 'I' || C == 'O'|| C == 'U')
//                     vol++;
//                 else 
//                     con++;
//             }
//          }
//          System.out.println( " vowels = " + vol + " con =" + con);
//          System.out.println( S.length());
//     }

// } 

// import java .util.Scanner;
// class String3
// {
//  public static void main(String[] args) {
//     String Str = new String();
//     int i ,   con = 0  ;
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a sentence   : ");
//     Str = sc.nextLine();
//     for(i = 0 ; i < Str.length(); i++)
//     {
//         char C , D ;
//         C = Str.charAt(i);
//         D = Str.charAt(i+1);
//          if( C ==  ' ' && D!= ' ')
//             con++;

//     }
//     System.out.println( " total word  = " + con);

// }     



//  }


 // equals : check for equality fo stw string but case sensetive 
 // equalaIgnoreCase :  check for equality of two string but the checking is non - case sensetive

 //str1 = "ram "
 //str2 = "ram"
 // not equal of equals to check

 import java.util.Scanner;
 class Demo3
 
 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String S = new String(); 
        String S1 = new String(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first sentense : ");
        S = sc.nextLine();
        System.out.println("Enter a scenod  sentense : ");
        S1 = sc.nextLine();

        if ( S.equals(S1)) // equalIgnoreCase
        {
            System.out.println(" Equal string ");
        }
        else {
          System.out.println("not equal ");
    }
 }
 }

// import java.util.Scanner;
// class Compare 
// {
//     public static void main(String[] args) {
//         String S = new String();
//         String S2 = new String();
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a first string : "); 
//          S = sc.nextLine();
//         System.out.println("Enter a Second string : "); 
//          S2 = sc.nextLine();
//          if(S.compareTo(S2)==0)
//             System.out.println("Equal to String ");
//         else if ( S.compareTo(S2) > 0)
//             System.out.println(" S is greater than S2");
//         else 
//             System.out.println("S2 is a greater than S");



//     }
// }


// string : string class is used to string object for string string value  but these value are immutable these string object value can nit be  changed one declared   
          // where stringbuffer class create an object and  stores vale  in ti  ehich can be change alterned at any point of time string buffer object are  mutable....  
// import java .util .*;
// class StringBuffer
// {
//     public static void main(String[] args) {
        
    
//           StringBuffer S = new StringBuffer ("code it up");
//           S = concat("java ");
//           System.out.println(S);
//     }
// }
          
        