//when there is same name function in box and drived class the when calling this function  the drived class function will be call and not the base class functiom we can sat here what the  derived class function has overifing base class fuction and this is called a method overriding

 class Akk
 {
     
    void message ()
    {
        System.out.println("Welcome to box class ");

    }

 }
class Bgg extends Akk
{
    void message ()
    {
        System.out.println("welcome to drived class ");
    }
}

class overading
{
    public static void main(String[] args) {
        Bgg aa = new Bgg ();
        aa.message();
    }
}

