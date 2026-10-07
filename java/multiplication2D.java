import java .util.Scanner;
class multiplication
{
    int a[][] = new int[3][3];
    int b[][] = new int[3][3];
    int c[][] = new int[3][3];
    void getdata()
    {
    int i ,j ;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a first element number : ");
    for(i = 0 ; i< 3; i++)
    {
    for(j = 0 ; j< 3; j++){

        a[i][j] = sc.nextInt();

    }
    }
    System.out.println("Enter a seccond element number : ");

    for(i = 0 ; i< 3; i++)
    {
    for(j = 0 ; j< 3; j++){

        b[i][j] = sc.nextInt();

    }
}
    }
    
    void putdata()
    {
        int i ,j, k ;
        for(i = 0 ; i< 3; i++){
             for(j = 0 ; j< 3; j++){
        c[i][j]= 0;
        for( k =0 ; k <3 ; k++)
        c[i][j]= c[i][j] + a[i][k] * b [i] [k];
    System.out.print(c[i][j] + " ");
    System.out.println( );
        }
    }
        
    

       

    }
}
 class multiplicatio
 {
    public static void main(String[] args) {
        System.out.println("Result : ");

        
        multiplication aa = new multiplication();
        aa.getdata();
        aa.putdata();

    }
 }


    