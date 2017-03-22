package codewarstraining;

import static org.junit.Assert.*;

import com.codewarstraining.PascalsTriangle;
import org.junit.Test;

/**
 * Created by andrei.tihomirov on 22.03.2017.
 */
public class PascalsTriangleTest {

    @Test
    public void test0() {
        assertArrayEquals( "Depth 1 should return [ [1] ]",
                new int[][] { {1} },
                PascalsTriangle.pascal(1));
    }

    @Test
    public void test1() {
        assertArrayEquals("Depth 5 should return [ [1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1] ]",
                new int[][] { {1}, {1,1}, {1,2,1}, {1,3,3,1}, {1,4,6,4,1} },
                PascalsTriangle.pascal(5));
    }

}
