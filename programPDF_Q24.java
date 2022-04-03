import java.util.*;
public class programPDF_Q24 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Sum of the series");
        System.out.println("2. Display series");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
            int x=2,sum=0;
            int sign=-1;
            for(int i=1;i<=20;i++)
            {
                sign*=-1;
                sum+=(sign*((int)Math.pow(x,i)));
            }
            System.out.println("sum = "+sum);
            break;

            case 2:
            int term=1;
            for(int i=1;i<=5;i++){
            System.out.print(term+" ");
            term=term*10+1;
            }
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
