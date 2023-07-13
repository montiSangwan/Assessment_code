package org;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import day7.GameService;

class UnitTest {

	@Test
	void test() {
		GameService gs1 = new GameService();
		assertNotNull(gs1.viewAll());
	}
	
	@ParameterizedTest
	@MethodSource("data")
	void test2(String result, String input) {
		GameService gs2 = new GameService();
		assertEquals(result, gs2.authorSearch(input));
	}
	
	public static Collection data() {
		return Arrays.asList(new Object[][] {
			{"SnowBird","Danny"},{"FreshFood","Ram"},{"Batsman","Kate"},{"Pokiman","Steeve"},{"YammyTommy","Narayan"}
		});
	}

}