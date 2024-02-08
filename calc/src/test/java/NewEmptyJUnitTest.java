import com.mycompany.calc.calculator;
import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class NewEmptyJUnitTest {

    private int inputNumber;
    private int int2;
    private int expectedResult;
    private calculator c = new calculator();
 
    public NewEmptyJUnitTest(int inputNumber, int int2, int expectedResult) {
        this.inputNumber = inputNumber;
        this.int2 = int2;
        this.expectedResult = expectedResult;
    }

    @BeforeEach
    public void initialize() {
        c = new calculator();
    }

    @ParameterizedTest
    @MethodSource("primeNumbers")
    public void testPrimeNumberChecker() {
        assertEquals(expectedResult, c.add(inputNumber, int2));
    }

    public static Collection<Object[]> primeNumbers() {
        return Arrays.asList(new Object[][]{
            {1, 2, 3},
            {11, 22, 33},
            {22, 22, 44}
        });
    }

    @AfterEach
    public void tearDown() {
        c = null;
    }
}