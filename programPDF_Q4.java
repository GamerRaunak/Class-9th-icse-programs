import java.util.*;
public class programPDF_Q4 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        
        for(int i=1;i<=10;i++)
        {
            System.out.println("Please enter number");
            int n=sc.nextInt();
            
            if (n % 5 == 0) 
            {
                if (n % 10 == 5)
                    System.out.println("Number end with the digit 5");
                    
                if (n % 10 == 0)
                    count++;
            }
        }//end of loop
        System.out.println("count of No. ending with 0 = "+count);
    }//end if main()
}//end of class
