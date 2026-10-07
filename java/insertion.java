import java .util.Scanner;
class interion 
{
    int a[] = new int [10];
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        int i ;
        for(i = 0; i <10 ; i++)
        {
            System.out.println("Enter a number : ");
            a[i] = sc.nextInt();
        }
    }
    void putdata ()
    {
        int i;
        for(i = 0; i <10 ; i++ )
            System.out.println(a[i]);
    }
    void insert()
    {
        int i, val , j;
        for(i = 1; i <10 ; i++)
        {
            val = a[i];
            j=i-1;
            while(val < a[j])
            {
                a[j + 1 ]= a[j];
                j--;
                if (j == -1)
                    break;
            }
            a[j +1 ] = val;
        }

    }
}

class insertion
{
    public static void main(String[] args) {
        interion obj = new interion();
        obj.getdata();
        System.out.println("unsorted arrary ");
        obj.putdata();
        obj.insert();
        System.out.println("sorted array ");
        obj.putdata();
    }
}