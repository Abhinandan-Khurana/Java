import java.util.*;
class rev_multiply_table
{
    public static void main(System[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        for(i=10;i>=1;i--)
        {
            System.out.println(n+"X"+i+"="+n*i);
        }
    }
}