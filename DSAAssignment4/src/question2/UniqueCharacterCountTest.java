package question2;
import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueCharacterCountTest {
	 CountCharacter cc = new CountCharacter();
	@Test
	public void uniqueCharTest1() {
		assertEquals(4,cc.countChar("anurag"));	
		assertEquals(6,cc.countChar("jianurag"));
		assertEquals(1,cc.countChar("maa"));
		assertEquals(1,cc.countChar("maa"));
		assertEquals(9,cc.countChar("jianuragklmaa"));
		assertEquals(12,cc.countChar("prejianuragklmaa"));
		assertEquals(6,cc.countChar("anuragji"));
	}
	
}
