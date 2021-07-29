package com.samples.training;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BrownyTest {
	Browny pet1;
	
	@Before
	public void setUp() throws Exception {
		pet1 = new Browny("Browny", "Bulldog");
	}

	@Test
	public void test() {
		assertNotNull(pet1);
	}

}
