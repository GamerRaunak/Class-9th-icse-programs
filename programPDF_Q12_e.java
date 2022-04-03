import java.util.*;
public class programPDF_Q12_e
 {
        public static void main(String[] args) 
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of terms :");
            int n=sc.nextInt();
            System.out.println("Enter the value of 'a':");
            double a=sc.nextInt();
            //int k=2;
            double sum=0.0;
            for(int i=1;i<=n;i++)
            {
                //k++;
                sum=sum+(Math.pow(i,i))/Math.pow(a,i-1);
            }
            //sum+=1;
            System.out.println("Sum of all the terms = "+sum);
        }
}
