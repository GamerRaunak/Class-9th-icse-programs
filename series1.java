//import java.util.Scanner;
import java.util.*;
public class series1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=sc.nextInt();
        int i;
        for(i=1;i<=n;i++)
        {
            int j=i*i;
            //System.out.println(j);
            if(i!=n)
            System.out.print(j+",");
            else
            System.out.print(j);
        }
    }
}

