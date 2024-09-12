package dad.codesignal.thejourneybegins;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTest {

    private Add add;

    @Before
    public void setup(){
        add = new Add();
    }

    @Test
    public void test1() {
        assertEquals(3, add.solution(1, 2));
    }

    @Test
    public void test2() {
        assertEquals(10, add.solution(3, 7));
    }
    @Test
    public void test3(){
        assertEquals(10000, add.solution(200, 9800));
    }
    @Test
    public void test4(){
        assertEquals(-50, add.solution(-48, -2));
    }
}
