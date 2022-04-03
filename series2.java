import java.util.*;
public class series2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int no=sc.nextInt();
        int i;
        double sum=0.0;
        //double n=19/20;
        for(i=1;i<=no;i++)
        {
            sum+=(i*1.0)/(i+1.0);
        }
        System.out.println("sum = "+sum);
    }
}
