import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();//1<=4
        int count=0;
        for(int i=2;i<=n;i++)//1<=4
        {
            if(n%i==0)//
            {
                count=count+1;
            }
        }
        if(count>1)
        {
            System.out.println("not prime");
        }
        else
        {
            System.out.println("prime");
        }
        sc.close();
    }
}