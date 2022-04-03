import java.util.*;
public class programPDF_Q2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int pCount=0,nCount=0;
        int pSum=0,nSum=0;
        System.out.println("Enter 10 numbers : ");
        for(int i=1;i<=10;i++)//taking only 10 numbers input as taking 50 numbers
        {                      //will take long time.
            int n=sc.nextInt();
            if(n>0)
            {
                pSum += n;
                pCount++;
            }else{
                nSum += n;
                nCount++;
            }
        }
        System.out.println("Total positive integers count = "+pCount);
        System.out.println("Total positive integers sum = "+pSum);
        System.out.println("Total negative integers count = "+nCount);
        System.out.println("Total negative integers count = "+nSum);
    }
}
