import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class IsMoon implements StringChecker {
  public boolean checkString(String s) {
    return s.equalsIgnoreCase("moon");
  }
}

public class TestListExamples {
  @Test(timeout = 500)
  public void testMergeRightEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }
  @Test
  public void testFilter() {
      StringChecker longerThan3 = new LongerThan3();
      List<String> input = new ArrayList<>();
      input.add("cat");
      input.add("giraffe");
      input.add("dog");
      input.add("turtle");
      List<String> output = new ArrayList<>();
      output.add("giraffe");
      output.add("turtle");
      List<String> inputFiltered = ListExamples.filter(input, longerThan3);
      assertArrayEquals(output.toArray(), inputFiltered.toArray());
  }
}

class LongerThan3 implements StringChecker {
  public boolean checkString(String s) {
      return s.length() > 3;
  }
}
