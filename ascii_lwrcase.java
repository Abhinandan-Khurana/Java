import java.util.*;
class ascii_lwrcase
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i;
        char ch='a';
        for(i='a';i<='z';i++)
        {
            System.out.println(ch+"-->"+i);
            ch++;
        }
    }
}