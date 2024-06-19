import java.util.Scanner;
public class Large
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a,b;
        System.out.println("Enter a");
        a = s.nextInt();
        System.out.println("Enter b");
        b = s.nextInt();

        if(a>b)
        {
            System.out.println(a + " is larger");
        }
        else
        {
            System.out.println(b + " is larger");
        }
        s.close();
    }
}