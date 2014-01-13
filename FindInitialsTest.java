import org.junit.*;
import static org.junit.Assert.*;

public class FindInitialsTest{
	@Test
	public void testsNormalName() {
		FindInitials p = new FindInitials();
		String input = "Dereck Robert Yssirt";
		String output = p.getInitials(input);
		String expected = "DRY";
		assertEquals(output, expected);
	}
	@Test
	public void testsTwoSpaces(){
		FindInitials p = new FindInitials();
		String input = "Andrew  Ho";
		String output = p.getInitials(input);
		String expected = "AH";
		assertEquals(output, expected);
	}
}