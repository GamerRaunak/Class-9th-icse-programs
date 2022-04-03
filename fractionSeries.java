//import java.util.*;
public class fractionSeries
{
    public static void main(String args[])
    {
        int i;
        double sum=0.0;
        for(i=2;i<=10;i++)
        {
            sum+=(double)1/(double)i;
        }
        System.out.println("sum = "+sum);
    }
}
