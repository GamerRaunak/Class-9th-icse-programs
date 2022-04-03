import java.util.*;
public class programPDF_Q12_a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of 'a':");
        double a=sc.nextInt();
        //double n=(Math.pow(a,2))/10;
        double sum=0;
        for(int i=2;i<=10;i++){
            sum=sum+(Math.pow(a,2))/i;
        }
        sum+=Math.pow(a,2);
        System.out.println("Sum of series = "+sum);
    }
}
