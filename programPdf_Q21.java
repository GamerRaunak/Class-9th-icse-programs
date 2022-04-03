import java.util.*;
public class programPdf_Q21 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. factors");
        System.out.println("2. factorial");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.print("Enter the number ");
            int n=sc.nextInt();
            for(int i=1;i<n;i++)
            {
                if(n%i==0)
                    System.out.print(i+" ");             
            }
            break;

            case 2:
            System.out.println("Enter the number"); 
            int num=sc.nextInt();
            int i=2;
            int mul=1;
            while((num-1)>0)
            {
                
                mul*=i;
                //System.out.print(mul+" "); 
                i++;
                num--;
            }
            System.out.println("factorial = "+mul);
            break;

            case 3:
            System.out.println("Program terminated");
            System.exit(0);
            break;

            default:
            System.out.println("WRONG CHOICE");
        }
    }
}
