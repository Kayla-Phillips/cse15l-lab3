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

  @Test
  public void testAverageWithoutLowest(){
    //empty
    double[] input1 = { };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.001);

    //single
    double[] input2 = { 1 };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input2), 0.001);
    //even
    double[] input3 = { 1, 2, 3, 4 };
    assertEquals(4.5, ArrayExamples.averageWithoutLowest(input3), 0.001);

    //odd
    double[] input4 = { 1, 2, 3, 4, 5 };
    assertEquals(7.0, ArrayExamples.averageWithoutLowest(input4), 0.001);
  }
}
