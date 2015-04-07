import org.junit.Test;

import static org.junit.Assert.*;


public class PlusTest {

    @Test
    public void testExecute() throws Exception {

        Plus tester = new Plus();
        assertEquals(98, tester.execute(43,55), 0);
    }

}