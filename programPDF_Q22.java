import java.util.*;
public class programPDF_Q22 
{
    public static boolean check(int a)
    {
        int z;
        int s=0;
        //int m=1;
        int e=a;
        while(a>0)
        {
            z=a%10;
            s=s+z;
            //m=m*z;
            a=a/10;
        }
        if((s%e)==0)
        {
            return true;
        }else{
            return false;
        }

    }
    public static void main(String args[])
    {
    Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        if((programPDF_Q22.check(num))==true)
        {
            System.out.println("Niven Number");
        }else{
            System.out.println("Not a Niven Number");
        }
    }
}
