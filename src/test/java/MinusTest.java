import org.junit.Test;

import static org.junit.Assert.*;

public class MinusTest {

    @Test
    public void testExecute() throws Exception {

        Minus tester = new Minus();
        assertEquals(1, tester.execute(55, 54), 0);


    }
}