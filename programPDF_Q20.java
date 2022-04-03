import java.util.*;
public class programPDF_Q20 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        if((programPDF_Q20.check(num))==true)
        {
            System.out.println("Special 2-digit Number");
        }else{
            System.out.println("Not a special 2-digit Number");
        }
    }
    public static boolean check(int a)
    {
        int z;
        int s=0;
        int m=1;
        int e=a;
        while(a>0)
        {
            z=a%10;
            s=s+z;
            m=m*z;
            a=a/10;
        }
        if((s+m)==e)
        {
            return true;
        }else{
            return false;
        }

    }
        
    
}
