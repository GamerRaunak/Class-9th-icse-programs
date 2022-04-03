import java.util.*;
public class programPDF_Q19 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 'a' to find Fibonacci series");
        System.out.println("Enter 'b' to find 'Sum of digits of an Integer'");
        System.out.println("Enter 'c' to EXIT");
        System.out.println("Enter choice");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
            int a=0;
            int b=1;
            System.out.print(a+", "+b+", ");
            int c;
            for(int i=1;i<=10;i++)/*SUCESSFUL*/
            {
                c=a+b;
                if(i<10){
                System.out.print(c+", ");
                }else{
                System.out.print(c);
                }
                a=b;//values swapped  **see screenshot
                b=c;
            }
            break;

            case 'b':
            System.out.println("Enter the Number");
            int num=sc.nextInt();
            int rem=0,sum=0;
            while (num>0) 
            {
                rem = num % 10;//num=25; rem=5 ;; num=2
                sum=sum+rem;//0+5=5 ;; 5+2=7
                num=num/10; // 25/10=2 ;;2/10=0...*loop ends here.
            }
            System.out.println("Sum of digits of the number is: "+sum);
            break;

            case 'c':
            System.out.println("Program is terminated.");
            System.exit(0);
            break;

            default:
            System.out.println("WRONG CHOICE ENTERED");
        }//end of switch-case
    }//end of main()
}//end of class
