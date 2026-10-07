import java.util.Scanner;
class Palind
{
    public static void main(String[] args) {
        String S = new String();
        Scanner sc = new Scanner(System.in);
        int i , j , flag ;
        System.out.println(" Enter a string to check : ");
        S = sc.nextLine();
        i = 0 ; 
        j = S.length()- 1;
        flag = 0 ;
        while (i < j  && flag==0)
            {
                if ( S .charAt(i)!= S.charAt(j ))
                flag = 1; 
            i = i + 1 ;
            j = j - 1;



            }
            if( flag ==0 )
                System.out.println("palin ");
            else 
                System.out.println("not palin");
        
    }
}