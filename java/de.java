import java.util.Scanner;
class A 
{
    int a , b;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        a = sc.nextInt();
        System.out.println("Enter a second number :");
        b = sc.nextInt();


    }

}
class B extends A
{

    void add ()
    {
        System.out.println("Addtion : " + (a + b));
    }
}


class C extends B
{
    void sub()
    {
       System.out.println("Subtraction " + ( a - b )); 
    }
}

 class de
{
    public static void main(String[] args) {
        C aa = new C ();
        
        aa.input();
        aa.add();
        aa.sub();
      


       
    }
}

