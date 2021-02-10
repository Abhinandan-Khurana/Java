import java.util.*;
class printing_pattern
{
    public static void main(System[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j,m,n;
        System.out.print("Enter the number of rows:");
        m=sc.nextInt();
        System.out.print("Enter the number of columns:");
        n=sc.nextInt();
        for(i=1;i<=m;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}