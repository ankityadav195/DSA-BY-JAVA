import java .util.Scanner;
class add
{
     int a , b ;
     void getata ()
        {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter a first number : ");
        a = sc.nextInt();
        System.out.println("Enter a second number: ");
        b = sc.nextInt();
 }
 void putdata()
 {
    System.out.println("addition = " + (a + b ));
 }
 public static void main(String[] args) {
   add aa = new add();
   aa.getata();
   aa.putdata();

 }

     
}