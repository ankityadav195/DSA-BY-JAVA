import java.util.Scanner;

class demons
{
public static void main(String args[])
{
int len, br,area, per;

Scanner sc = new Scanner(System.in);

System.out.println("Enter Length:");


len =sc.nextInt();

System.out.println("Enter Breadth:");

br=sc.nextInt();

area=len*br;

per=2*(len+br);
System.out.println("Area of Rectangle="+ area ); 

}
} 