import org.junit.*;
import static org.junit.Assert.*;

public class StringStackTest{
	private StringStack ss;

	public StringStackTest(){
		ss = new PointerStringStack();
	}

	@Test
	public void testsPush(){
		assertNotNull(ss);
		ss.push("one");
/*		ss.push("two");
		ss.push("three");
		ss.push("four");
		ss.push("five");
		ss.push("six");
		ss.push("seven");
		ss.push("eight");
		ss.push("nine");
		ss.push("ten");
*/	}
	@Test
	public void testsPop(){
/*		expected = "ten";
		output = ss.pop();
		assertEquals(output,expected);
		expected = "nine";
		output = ss.pop();
		assertEquals(output,expected);
		expected = "eight";
		output = ss.pop();
		assertEquals(output,expected);
		expected = "seven";
		output = ss.pop();
		assertEquals(output,expected);
		expected = "six";
		output = ss.pop();
		assertEquals(output,expected);
		expected = "five";
		output = ss.pop();
		assertEquals(output,expected);
		expected = "four";
		output = ss.pop();
		assertEquals(output,expected);
		expected = "three";
		output = ss.pop();
		assertEquals(output,expected);
		expected = "two";
		output = ss.pop();
		assertEquals(output,expected);
*/		//String expected = "one";
		//String output = ss.pop();
		assertEquals(ss.pop(),null);
	//	output = ss.pop();
	//	assertNull(output);
	}
	@Test
	public void testsPeek(){
		String expected = null;
		String output = ss.peek();
		assertEquals(output,expected);
		ss.push("new element");
		expected = "new element";
		output = ss.peek();
		assertEquals(output,expected);
	}
	@Test
	public void testsIsEmpty(){
		boolean isEmpty = ss.isEmpty();
		assertFalse(isEmpty);
		String output = ss.pop();
		isEmpty = ss.isEmpty();
		assertTrue(isEmpty);
	}
}