import java.util.*;
public class programPDF_Q18 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Series1");
        System.out.println("2. summesionSeries2");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
            System.out.print("Enter the number of terms: ");
            int n = sc.nextInt();
            //int y;
            for(int i=1;i<=n;i++)
            {
               System.out.print((i*i)-1+" "); 
            }
            break;

            case 2:
            //double s=0.0;
            //for(int i=1;i<=19;i++){
            //s+=(i/(double)(i++));
            //}
            //System.out.println("sum = "+s);
            double a=1.0,b=2.0;
            double s=0.0,s1=0.0;
            System.out.println("the terms are");
            for(int i=1;i<=10;i++)
            {
                s1=(a/b);
                //System.out.println(s1);
                s=s+s1;
                a+=2;
                b+=2;
            }

       //System.out.println("");
       System.out.println("the sum is "+s);
            break;

            case 3:
            System.out.println("Program terminated");
            System.exit(0);
            break;

            default:
            System.out.println("Wrong Choice Entered");
        }
    }
}
