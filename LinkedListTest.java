import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTest{
    @Test(timeout = 1000)
    public void testPrepend(){
        LinkedList a = new LinkedList();
        a.append(2);
        a.append(4);
        a.append(6);
        assertEquals("2 4 6 ", a.toString());
    }
}