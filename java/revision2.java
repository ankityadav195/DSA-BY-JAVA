import java. util.Scanner;
class program 
{
    public static void main(String[] args) {
        demo aa = new demo();
        aa.getdata();
        aa.sumofdigit();
        
    }
}
class demo 
{
    int i ;
void getdata()
{
Scanner sc =  new Scanner(System.in);
System.out.println("Enter a number :");
int i =  sc.nextInt();

}

void sumofdigit()
{
    int sum=0 ;
    while(i !=0)
        {
        sum = sum +  i %10;
        i = i /10;
    }
    System.out.println("sum of digit :" + sum );
}
}