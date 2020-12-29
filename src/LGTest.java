import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LGTest {

//	@Test
//	void testnormalcase() {
//		
//		letterGrade LG = new  letterGrade();
//		
//		assertEquals('A', LG.getScoreLetter(100));
//		assertEquals('A', LG.getScoreLetter(95));
//		assertEquals('A', LG.getScoreLetter(90));
//		assertEquals('B', LG.getScoreLetter(85));
//		assertEquals('B', LG.getScoreLetter(80));
//		assertEquals('C', LG.getScoreLetter(75));
//		assertEquals('C', LG.getScoreLetter(70));
//		assertEquals('D', LG.getScoreLetter(65));
//		assertEquals('D', LG.getScoreLetter(60));
//		assertEquals('F', LG.getScoreLetter(55));
//		assertEquals('F', LG.getScoreLetter(50));
//		assertEquals('F', LG.getScoreLetter(0));
//		assertEquals('X', LG.getScoreLetter(-1));		
//		assertEquals('X', LG.getScoreLetter(101));
//
//	}
	
	@Test
	void testboundarycase() {
		
		letterGrade LG = new  letterGrade();
		
		
		assertEquals('A', LG.getScoreLetter(100));
		assertEquals('A', LG.getScoreLetter(99));
		assertEquals('A', LG.getScoreLetter(90));
		assertEquals('B', LG.getScoreLetter(89));
		assertEquals('B', LG.getScoreLetter(80));
		assertEquals('C', LG.getScoreLetter(79));
		assertEquals('C', LG.getScoreLetter(70));
		assertEquals('D', LG.getScoreLetter(69));
		assertEquals('D', LG.getScoreLetter(60));
		assertEquals('F', LG.getScoreLetter(59));
		assertEquals('F', LG.getScoreLetter(50));
		assertEquals('F', LG.getScoreLetter(0));
		assertEquals('X', LG.getScoreLetter(-1));		
		assertEquals('X', LG.getScoreLetter(101));

	}
	
	

}
