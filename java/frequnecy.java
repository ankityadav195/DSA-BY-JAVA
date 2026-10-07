import java.util.Scanner;

class frequnecy2
{
    int a[] = new int[10];
    int key;

    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        int i;
        for (i = 0; i < 10; i++)
        {
            System.out.println("Enter a number : ");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter a number to find : ");
        key = sc.nextInt();
    }

    void count()
    {
        int i, count = 0;
        for (i = 0; i < 10; i++)
        {
            if (a[i] == key)
                count++;
        }
        System.out.println("Frequency = " + count);
    }
}

class out
{

    public static void main(String args[])
    {
        frequnecy2 aa = new frequnecy2();
        aa.getdata();
        aa.count();
    }
}
