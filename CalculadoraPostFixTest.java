import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraPostFixTest {

    @Test
    void testSuma() {
        CalculadoraPostFix calc = new CalculadoraPostFixImp();
        assertEquals(3, calc.evaluar("1 2 +"));
    }

    @Test
    void testMultiplicacion() {
        CalculadoraPostFix calc = new CalculadoraPostFixImp();
        assertEquals(12, calc.evaluar("3 4 *"));
    }

    @Test
    void testExpresionCompleta() {
        CalculadoraPostFix calc = new CalculadoraPostFixImp();
        assertEquals(15, calc.evaluar("1 2 + 4 * 3 +"));
    }

    @Test
    void testDivisionPorCero() {
        CalculadoraPostFix calc = new CalculadoraPostFixImp();
        assertThrows(ArithmeticException.class, () -> {
            calc.evaluar("1 0 /");
        });
    }
}
