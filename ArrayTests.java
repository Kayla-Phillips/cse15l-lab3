import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    //single
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    //even
    int[] input2 = { 3, 4 };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 4, 3 }, input2);

    //odd
    int[] input3 = { 3, 4, 5 };
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{ 5, 4, 3 }, input3);

    //empty
    int[] input4 = {  };
    ArrayExamples.reverseInPlace(input4);
    assertArrayEquals(new int[]{  }, input4);

	}


  @Test
  public void testReversed() {
    //empty
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    //even
    int[] input2 = { 1,2 };
    assertArrayEquals(new int[]{ 2,1 }, ArrayExamples.reversed(input2));

    //odd
    int[] input3 = { 1,2,3 };
    assertArrayEquals(new int[]{ 3,2,1 }, ArrayExamples.reversed(input3));

    //single
    int[] input4 = { 1 };
    assertArrayEquals(new int[]{ 1 }, ArrayExamples.reversed(input4));
  }
}
