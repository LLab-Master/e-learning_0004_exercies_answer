package exercise4;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMyStr {

	@Test
	void 成功するはずのテスト１() {
		MyStr ms = new MyStr();
		String str1 = ms.cat("AA", "BB");
		assertEquals("AABB", str1);
	}
	
	@Test
	void test_success2() {
		MyStr ms = new MyStr();
		assertEquals("AB", ms.cat("A", "B"));
	}
	
	@Test
	void test_fail1() {
		MyStr ms = new MyStr();
		assertEquals("AABBAA", ms.cat("AA", "BB"));
	}

}
