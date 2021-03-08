import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTesting {
    Calculator calculator = new Calculator();
    private static final double Delta = 1e-15;


    @BeforeClass
    public static void beforeCalculatorTestingClass(){
        System.out.println("Before Calculator CLass Testing");
    }

    @Before
    public void beforeCalculatorTesting(){
        System.out.println("Before Calculator Testing");
    }

    @Test
    public void squarerootPositive(){
        System.out.println("Testing squareroot true Positive");
        assertEquals("Testing squareroot true Positive",10.0,calculator.squareroot(100),Delta);
        assertEquals("Testing squareroot true Positive",4.0,calculator.squareroot(16),Delta);
        assertEquals("Testing squareroot true Positive",11.0,calculator.squareroot(121),Delta);
    }

    @Test
    public void squarerootNegative(){
        System.out.println("Testing squareroot true Negative");
        assertNotEquals("Testing squareroot true Negative",11.0,calculator.squareroot(100),Delta);
        assertNotEquals("Testing squareroot true Negative",5.0,calculator.squareroot(16),Delta);
        assertNotEquals("Testing squareroot true Negative",20.0,calculator.squareroot(121),Delta);
    }

    @Test
    public void factorialPositive(){
        System.out.println("Testing factorial true Positive");
        assertEquals("Testing factorial true Positive",120,calculator.factorial(5),Delta);
        assertEquals("Testing factorial true Positive",720,calculator.factorial(6),Delta);
        assertEquals("Testing factorial true Positive",5040,calculator.factorial(7),Delta);
    }

    @Test
    public void factorialNegative(){
        System.out.println("Testing factorial true Negative");
        assertNotEquals("Testing factorial true Negative",100,calculator.factorial(5),Delta);
        assertNotEquals("Testing factorial true Negative",600,calculator.factorial(6),Delta);
        assertNotEquals("Testing factorial true Negative",800,calculator.factorial(7),Delta);
    }

    @Test
    public void logrithmPositive(){
        System.out.println("Testing logrithm true Positive");
        assertEquals("Testing logrithm true Positive",4.605170185988092,calculator.logirithm(100),Delta);
        assertEquals("Testing logrithm true Positive",6.214608098422191,calculator.logirithm(500),Delta);
        assertEquals("Testing logrithm true Positive",5.0106352940962555,calculator.logirithm(150),Delta);
    }

    @Test
    public void logrithmNegative(){
        System.out.println("Testing logrithm true Negative");
        assertNotEquals("Testing logrithm true Negative",10.605170185988092,calculator.logirithm(100),Delta);
        assertNotEquals("Testing logrithm true Negative",11.214608098422191,calculator.logirithm(500),Delta);
        assertNotEquals("Testing logrithm true Negative",12.0106352940962555,calculator.logirithm(150),Delta);
    }

    @Test
    public void powerPositive(){
        System.out.println("Testing Power true Positive");
        assertEquals("Testing Power true Positive",121,calculator.power(11,2),Delta);
        assertEquals("Testing Power true Positive",10000,calculator.power(10,4),Delta);
        assertEquals("Testing Power true Positive",625,calculator.power(25,2),Delta);
    }

    @Test
    public void powerNegative(){
        System.out.println("Testing Power true Negative");
        assertNotEquals("Testing Power true Negative",100,calculator.power(11,2),Delta);
        assertNotEquals("Testing Power true Negative",1234,calculator.power(10,4),Delta);
        assertNotEquals("Testing Power true Negative",600,calculator.power(25,2),Delta);
    }

    @After
    public void afterCalculatorTesting(){
        System.out.println("Before Calculator Testing");
    }
    @AfterClass
    public static void afterCalculatorTestingClass(){
        System.out.println("After Calculator CLass Testing");
    }
}
