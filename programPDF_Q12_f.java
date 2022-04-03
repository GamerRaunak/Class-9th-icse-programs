import java.util.*;
public class programPDF_Q12_f
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int n=sc.nextInt();
        System.out.println("Enter the value of 'a':");
        double a=sc.nextInt();
        double sum=0.0;
        for(int i=1,l=1,k=1;i<=n;i++,l+=2,k++)
        {
            sum+=(Math.pow(l,2))/(Math.pow(a,k));
        }
        System.out.println("The sum of the series is: "+sum);
    }
}
