import java.util.*;
class factorial
{
    public static void main(System[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,f=1,n;
        n=sc.nextInt();
        for (i=1;i<=n;i++)
        {
            f*=i;
        }
        System.out.println(f);
    }
}