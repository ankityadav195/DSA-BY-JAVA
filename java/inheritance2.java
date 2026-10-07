// when a class is inherited by anthoer class and agin this another class is being inheritance by another class then this is called multilevel inheritance 


// ex :- here class B is a inherit class A and class  C inherit class B.. Multilevel inheritance

import java.util.Scanner;

class A 
{
    int a ;
    
        void input ()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a first number :");
            a = sc.nextInt();
        }
}

class B extends A
{
    int b; 
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a second number :");
            b = sc.nextInt();
            System.out.println("Addition =" + (a + b ));

    }
}

class  C extends B
{
    int c; 
    void output()
    {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a third  number :");
             c = sc.nextInt();
            System.out.println("Addition2 = " + (a +b +c ));
    }

    }


     class demo 
     {
     public static void main(String[] args) {
        C aa = new C ();
        aa.input();
        aa.getdata();
        aa.output();
        
    }
}

