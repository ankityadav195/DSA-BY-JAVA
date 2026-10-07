// 1 .  subString (n) :- return a substring from n index 
// ex : shyam [2] return is yam ( subString )
// ex : shyam [2 ,4 ] return is ya ( subString )

// 2 .  concat :  concatenate string 
// str 1= "ram "
// str 2= " shyam"
// str 3 = str.concat(str3)
// return is : ramshyam

//3 . indexOf = return the index of given character in a string 
//  str1 = "ram kumar ";
//  sop ( str.indexof('a'));
//  return :  1 
//  str1 = "ram kumar ";
//  sop ( str.indexof('a' ,2));
//  return :  7

// import java.util.Scanner;
//  class function 
//  {
//     public static void main(String[] args) {
//         String str1 = new String();
//         String str2 = new String();
//         Scanner sc = new Scanner(System.in );
//         System.out.println("Enter a first  string :");
//         str1 = sc.nextLine();
//         System.out.println("Enter a second  string :");
//         str2 = sc.nextLine();
//          String str3 = new String();
//          str3 = str1.concat(str2);
//          System.out.println( " concatenated = " + str3);
//          System.out.println( str1.substring(3));
//          System.out.println( str1.substring(3 , 5));
//          System.out.println(str1.indexOf('k'));
//          System.out.println(str1.indexOf('k', 't'));

//     }
//  }

// import java.util.Scanner;



// class Shortname {
//     /**
//      * @param args
//      */
//     public static void main(String[] args) {
//         String Str = new String();
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a name : ");
//         Str = sc.nextLine();
//         int i ,j ; char c,d ;
//         i = Str.length()-1;
//         while ( Str.charAt(i)!=' ')
//             i--; 
//         j = 0;
//         if (j<i) 
//         {
//             System.out.println(Str.charAt(j) + ".");}
//         else 
//         {
//             c= Str.charAt(j);
//             d = Str.charAt(j+1);
//             if( c == ' ' && d != ' ')
//                 System.out.println(d + " . " );

//         }
//             j ++;

        

    
//     System.out.println( Str.substring(i));
// }
// }

//  import java.util.Scanner;
//  class StringName
//  {
//     public static void main(String[] args) {
//         String Str = new String();
//         Scanner sc = new Scanner(System.in);
//         System.out.print(" Enter a string :");
//         Str = sc.nextLine();
//         int i , j ,k ;  
//         i = Str.length()-1;
//         while (i>= 0)
//         {
//             j = i ;
//             while (Str.charAt(j) != ' ' && j >0) 
//                 j--;
//                 if (j == 0)
//                     k = 0;
//                 else 
//                     k = j+ 1;
//                 System.out.print( Str.substring(k,i +1 ) + " ");
//                 i = j-1 ;
                
            
//         }

//     }
//  }


//1. stringBuffer

// string in can`t change .its is a immutable 
//stringbuffer is a change .its not a immutable 
//  SetCharAt ( n , character ) : this function replace n index character with given character 
//   SetCharAt(3,a)



//2. Append 
// append () : append the second string in first string

// stringbuffer S = new stringBuffer(" code it up ");
// stringbuffer S1 = new stringBuffer("java ");
// S.append (S1);
// sop (S);

//3.  insert : str1.insert(n , str1)

// StringBuffer str1 = new Stringbuffer("code it up ");
// StringBuffer str2 = new Stringbuffer("java ");
// Str1.insert(4,str2);

// 4. SetLenght()
// stringbuffer S = new stringBuffer("codeitup");


class StringBufferDemo {
    public static void main(String[] args) {

        // Create StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // append() function
        sb.append(" World");
        System.out.println("After append: " + sb);

        // insert() function
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // setLength() function
        sb.setLength(5);
        System.out.println("After setLength: " + sb);
    }
}
