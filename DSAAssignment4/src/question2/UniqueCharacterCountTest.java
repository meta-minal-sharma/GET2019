package question2;
import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueCharacterCountTest {
	 CountCharacter cc = new CountCharacter();
	 @Test
		public void testUniqueCharacter() {
			assertEquals(1, cc.numberOfUniqueCharacter("mmmmmmmmmn"));
			assertEquals(3, cc.numberOfUniqueCharacter("hello"));
			assertEquals(1, cc.numberOfUniqueCharacter("malyalam"));
			assertEquals(8, cc.numberOfUniqueCharacter("asdfgghjkl"));
		}
	
}
