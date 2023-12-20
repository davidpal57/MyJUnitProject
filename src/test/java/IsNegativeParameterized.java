import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class IsNegativeParameterized {
    @ParameterizedTest
    @ValueSource(ints = {-1, -3, -4, -86, -100, Integer.MIN_VALUE})
    public void checkIsNegativeParameterized(int number) {
        IsPositive isNegative = new IsPositive();
        boolean result = isNegative.checkIsPositive(number);
        Assertions.assertFalse(result);
    }
}
