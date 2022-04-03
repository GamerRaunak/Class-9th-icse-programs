import java.util.*;
public class programPDF_Q16 
{
    public static int rev(int n)//xyz=x*100+y*10+z
    {//x%10
        //rev=rev*10+n%10
        //n=n/10;
        int r=0;//r=reverse
        while(n>0){
            //int t1=r*10;
            //int t2=n%10;
            //System.out.println("r*10 = "+t1);
            //System.out.println("n%10 = "+t2);
            r = r * 10 + n % 10;//command for reversing number
            n=n/10;
            //System.out.println("r = "+r);
        }
        return r;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 'a' to check for palindrome number");
        System.out.println("Enter 'b' to check for perfect number");
        System.out.println("Enter 'c' to Exit");
        System.out.println("Enter choice");
        char ch=sc.next().charAt(0);
        switch(ch){
            case 'a':
            System.out.println("Enter the number");
            int num=sc.nextInt();
            if(num==programPDF_Q16.rev(num))
            {
                System.out.println(num+" is a Palindrome number");
            }else{
                System.out.println(num+" is not a Palindrome number");
            }
            break;
            case 'b':
            System.out.println("Enter the number");
            int num1=sc.nextInt();
            int sum=1;// sum will store the sum of proper divisors
            // As 1 is a proper divisor for all numbers
            // initialised sum with 1
            for(int i=2;i<num1;i++)// Looping through the numbers to check if they are
                                    // divisors or not
            {
                if(num1 % i == 0)
                sum=sum+i;
            }// If sum of divisors is equal to
        // n, then n is a perfect number
            if(sum==num1)
                System.out.println("It is a Perfect number");
                else
                System.out.println("It is not a Perfect number");
            break;
            case 'c':
            System.out.println("Program terminated");
            System.exit(0);
        }
    }

    
}