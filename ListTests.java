import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ListTests {

    @Test
    public void testFilter() {
        List<String> input1 = new ArrayList<>(Arrays.asList("apple", "banana", "pineapple"));
        List<String> output1 = new ArrayList<>(Arrays.asList("apple", "pineapple"));
        StringChecker sc = new Checker("app");
        assertEquals(output1, ListExamples.filter(input1, sc));
        
    }

    @Test
    public void testMerge() {
        List<String> input1= Arrays.asList("apple", "banana");
        List<String> input2 = Arrays.asList("orange");

        List<String> result = Arrays.asList("apple", "banana", "orange");
        assertArrayEquals(result.toArray(), ListExamples.merge(input1, input2).toArray());

    }
}
