// import java.util.Scanner;
// class summer
// {
//     public static void main(String[] args) {
//         int i,a,sum =0;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         a = sc.nextInt();
        
//         i = 1;
//         while(i<=a){
//             sum= sum +i;
//         i=i+1;
//         }
//             System.out.println("Sum of natural number is :" + sum );

        
//     }
// }




import java.util.Scanner;
class natural
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,a ,sum=0;
        System.out.print("Enter a number:");
        a = sc.nextInt();
        i = 1;
         while (i<=a){
            sum =  sum + i;
            i = i+1;
            
            
        }
        
        System.out.println("sum number is :"+sum);

    }
}