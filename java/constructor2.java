import java.util.Scanner;
 class add2 
 {
    int a, b ;
    add2 (int x , int y)
    {
        a = x; 
        b= y;

    }
    void output()
        {
            int c ;
            c = a * b ; 
            System.out.println("Addition : " + c);

        }
        public static void main(String[] args) {
            int m ,n ;
            Scanner sc = new Scanner(System.in);
              System.out.println("Enter a  first number :");
             m = sc.nextInt();
             System.out.println("Enter a  second number :");
             n = sc.nextInt();
             add2 aa = new add2 (m , n);
             aa.output();
             
             
        }

    
 }