import java.util.*;
public class series1AND2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 'a' to find series1");
        System.out.println("Enter 'b' to find series2");
        System.out.println("Enter 'c' to Exit");
        System.out.println("Enter choice");
        char ch=sc.next().charAt(0);
        switch(ch){
            case 'a':
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
            break;
            case 'b':
            
            double ss=0.0;
            for(int i1=1;i1<20;i1++){
                double a=2.0;
               if(a<=20){
                a=a+1.0;
               }
                ss+=(double)(i1/a);
            }
            System.out.println("Sum of series = "+ss);
            /*for(int a=2;a<=20;a++){
               
            }*/
            break;
            case 'c':
            System.exit(0);
            System.out.println("Program terminated");
        }
    }

    //public static int denominator(int a)
}
