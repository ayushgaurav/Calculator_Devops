import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator()
    {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1,n2;
        int ch,n;
        String s;
        Calculator calculator=new Calculator();
        while(true)
        {
            System.out.println("_____________Scientific Calculator______________");
            System.out.println("Press 1 for Square Root function");
            System.out.println("Press 2 for Factorial function");
            System.out.println("Press 3 for Natural Logarithm function");
            System.out.println("Press 4 for Power function");
            System.out.println("_________________________________________________");
            System.out.println("Enter your Choice");

            ch = scanner.nextInt();

            switch (ch)
            {
                case 1:
                    System.out.println("Enter Your number");
                    n1=scanner.nextDouble();
                    System.out.println("Answer: "+calculator.squareroot(n1));
                    break;
                case 2:
                    System.out.println("Enter your number");
                    n=scanner.nextInt();
                    System.out.println("Answer: "+calculator.factorial(n));
                    break;
                case 3:
                    System.out.println("Enter Your number");
                    n1=scanner.nextDouble();
                    System.out.println("Answer: "+calculator.logirithm(n1));
                    break;
                case 4:
                    System.out.println("Enter Your number");
                    n1 = scanner.nextDouble();
                    System.out.println("Enter power");
                    n2 = scanner.nextDouble();
                    System.out.println("Answer: "+calculator.power(n1,n2));
                    break;
                default:
                    System.out.println("Wrong choice");
            }
            System.out.println("_________________________________________________");


        }

    }

    public double squareroot(double n1)
    {
        logger.info("[Square Root] - " + n1);
        double ans;
        ans = Math.sqrt(n1);
        logger.info("[Result - Square root] - " + ans);
        return ans;
    }

    public int factorial(int n)
    {
        logger.info("[Factorial] - " + n);
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        logger.info("[Result - Factorial] - " + f);
        return f;
    }

    public double logirithm(double n1)
    {
        logger.info("[logrithm] - " + n1);
        double ans;
        ans = Math.log(n1);
        logger.info("[Result - Logrithm] - " + ans);
        return ans;
    }

    public double power(double n1,double n2)
    {
        logger.info("[Power] - " + n1 + " , " + n2);
        double ans;
        ans = Math.pow(n1,n2);
        logger.info("[Result - Power] - " + ans);
        return ans;
    }



}
