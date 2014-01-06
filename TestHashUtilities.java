import org.junit.*;
import static org.junit.Assert.*;

public class TestHashUtilities {
	@Test
	public void testsHash(){
		HashUtilities h = new HashUtilities();
		for(int i=0;i<2000;i++){
			int input = i*47;
			int output = h.shortHash(input);
			System.out.println("Input: " + String.valueOf(input) + "Output: " + String.valueOf(output));
			assertTrue(output <= 1000 && output >= 0);
		}
		//testing border cases
		int input = 0;
		int output = h.shortHash(input);
		System.out.println("Input: " + String.valueOf(input) + "Output: " + String.valueOf(output));
		assertTrue(output <= 1000 && output >= 0);
		input = 1000;
		output = h.shortHash(input);
		System.out.println("Input: " + String.valueOf(input) + "Output: " + String.valueOf(output));
		assertTrue(output <= 1000 && output >= 0);
	}
}