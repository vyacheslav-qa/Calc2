import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTest {

    @Test
    public void testExecute() throws Exception {
        Multiplication tester = new Multiplication();
        assertEquals(56, tester.execute(8,7), 0);
    }
}