class student
{
    int roll;
    String name;
    static String cname ="XUZ COLLEGE";


    student(int x ,String y)
    {
        roll = x;
        name = y;

    }
    void display ()
    {
        System.out.println("Roll = "+ roll);
        System.out.println("name =" + name);
        System.out.println("College name = " + cname);
    }

    
     
        public static void main(String [] args )
         {
            student aa = new student(101, "rohit ");
            aa .display();
            
        }
     }




