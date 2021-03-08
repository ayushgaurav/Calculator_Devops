import java.util.Scanner;

public class Calculator {

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
            System.out.println("Scientific Calculator");
            System.out.println("Press 1 for Square Root function");
            System.out.println("Press 2 for Factorial function");
            System.out.println("Press 3 for Natural Logarithm function");
            System.out.println("Press 4 for Power function");
            System.out.println("Enter your Choice");

            ch = scanner.nextInt();

            switch (ch)
            {
                case 1:
                    System.out.println("Enter Your number");
                    n1=scanner.nextDouble();
                    System.out.println(calculator.squareroot(n1));
                    break;
                case 2:
                    System.out.println("Enter your number");
                    n=scanner.nextInt();
                    System.out.println(calculator.factorial(n));
                    break;
                case 3:
                    System.out.println("Enter Your number");
                    n1=scanner.nextDouble();
                    System.out.println(calculator.logirithm(n1));
                    break;
                case 4:
                    System.out.println("Enter Your number");
                    n1 = scanner.nextDouble();
                    System.out.println("Enter power");
                    n2 = scanner.nextDouble();
                    System.out.println(calculator.power(n1,n2));
                    break;
                default:
                    System.out.println("Wrong choice");
            }
            System.out.println("*************************************");


        }

    }

    public double squareroot(double n1)
    {
        double ans;
        ans = Math.sqrt(n1);
        return ans;
    }

    public int factorial(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }

    public double logirithm(double n1)
    {
        double ans;
        ans = Math.log(n1);
        return ans;
    }

    public double power(double n1,double n2)
    {
        double ans;
        ans = Math.pow(n1,n2);
        return ans;
    }



}
