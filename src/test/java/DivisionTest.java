import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest {

    @Test
    public void testExecute() throws Exception {
        Division tester = new Division();
        assertEquals(4, tester.execute(128,32), 0);
    }
}