import java.util.*;
public class programPDF_Q12_f_duplicate
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int n=sc.nextInt();
        System.out.println("Enter the value of 'a':");
        double a=sc.nextInt();
        double sum=0.0;
        for(int i=1,k=1;i<=n;i++,k+=2)
        {
            sum+=(Math.pow(k,2))/(Math.pow(a,i));
        }
        System.out.println("The sum of the series is: "+sum);
    }
}