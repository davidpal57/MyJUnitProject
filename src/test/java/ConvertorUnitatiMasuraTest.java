import org.junit.jupiter.api.*;

public class ConvertorUnitatiMasuraTest {
    private static ConvertorUnitatiMasura convertorUnitatiMasura;
    @BeforeAll
    public static void beforeAll(){
        convertorUnitatiMasura = new ConvertorUnitatiMasura();
        System.out.println("BeforeAll");
    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("Executing Before Each Method");
    }
    @Disabled("Ignoring this test")
    @Test
    public void testFahrenheitToCelsius(){
        double result = convertorUnitatiMasura.fahrenheitToCelsius(35);
        Assertions.assertEquals(1.67, result, "Valorile nu sunt egale");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("Executing After Each Method");
    }
}
