import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VectorStackTest {

    private VectorStack<Integer> stack;

    @BeforeEach
    void setUp() {
        stack = new VectorStack<>();
    }

    @Test
    void testPushAndPop() {
        stack.push(10);
        assertEquals(10, stack.pop());
    }

    @Test
    void testSize() {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.size());
    }

    @Test
    void testPeek() {
        stack.push(5);
        assertEquals(5, stack.peek());
    }

    @Test
    void testEmptyPopThrowsException() {
        assertThrows(Exception.class, () -> stack.pop());
    }
}
