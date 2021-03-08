import java.util.Scanner;

public class Calculator {

    public Calculator()
    {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1,n2;
        int ch;
        Calculator calculator=new Calculator();
        while(true)
        {
            System.out.println("Scientific Calculator");
            System.out.println("Press 1 for Square Root function\n");
            System.out.println("Press 2 for Factorial function\n");
            System.out.println("Press 3 for Natural Logarithm function\n");
            System.out.println("Press 4 for Power function\n");
            System.out.println("Enter your Choice\n");

            ch = scanner.nextInt();

            switch (ch)
            {
                case 1:
                    System.out.println("Enter Your number");
                    n1=scanner.nextInt();
                    System.out.println(calculator.squareroot(n1));
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
            }

        }

    }

    public double squareroot(double n1)
    {
        double ans;

        ans = Math.sqrt(n1);
        return ans;
    }



}
