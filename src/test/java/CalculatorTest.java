import org.junit.jupiter.api.*;

public class CalculatorTest {
    private static Calculator calculator;
    @BeforeAll
    public static void beforeAllMethod(){
        calculator = new Calculator();
        System.out.println("BeforeAll");
    }
    @BeforeEach
    public void beforeEachMethod() {
        System.out.println("BeforeEach");
    }
    @Test
    public void addTest(){
        //Calculator calculator = new Calculator();
        int result = calculator.add(2,3);
        Assertions.assertEquals(result, 5);
    }

    @Test
    public void diffTest(){
        //Calculator calculator = new Calculator();
        int result = calculator.diff(3,2);
        Assertions.assertEquals(result, 1);
    }

    @Test
    public void prodTest(){
        //Calculator calculator = new Calculator();
        int result = calculator.prod(5,7);
        Assertions.assertEquals(result, 35);
    }

    @Test
    public void divTest(){
        Calculator calculator = new Calculator();
        double result = calculator.div(10,5);
        Assertions.assertEquals(result, 2);
    }

    @AfterEach
    public void afterEachMethod(){
        System.out.println("AfterEach");
    }
    @AfterAll
    public static void afterAllMethod(){
        System.out.println("AfterAll");
    }
    @Test
    public void moduloTest(){
        int result = calculator.modulo(9,2);
        Assertions.assertEquals(1,result);
    }
}
