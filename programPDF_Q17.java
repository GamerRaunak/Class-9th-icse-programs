import java.util.*;
public class programPDF_Q17
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 'a' to check for prime number");
        System.out.println("Enter 'b' to check for automorphic number");
        System.out.println("Enter 'c' to Exit");
        System.out.println("Enter choice");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
            int count=0;
            System.out.println("Enter the number: ");
            int p=sc.nextInt();
            for(int i=2;i<p;i++)
            {
                //count=0;
                if(p%i==0)
                count++;
                break;

                //if(count==1)
                  //  break;
            }
            if(count>0)
            System.out.println(p+" is not a prime number.");
            else
            System.out.println(p+" is a prime number.");
            break;

            case 'b':
            System.out.println("Enter the number: ");
            int a=sc.nextInt();
            int sq_a=a*a;
            int temp=a,l=0;
            while(temp>0)//temp>1
            {
                temp=temp/10;
                l++;
            }
            int endDig=sq_a%(int)Math.pow(10,l);
            if(a==endDig)
            System.out.println(a+" is an Automorphic Number.");
            else
            System.out.println(a+" is not an Automorphic Number.");
            break;

            case 'c':
            System.out.println("Program is terminated.");
            System.exit(0);
            break;

            default:
            System.out.println("WRONG CHOICE");
        }
    
    }
}
