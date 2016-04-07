package com.github.sibyllafoekens.hellowworld;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void getMessage() throws Exception {
		App app = new App();
		String name = "Sibylla";
		assertEquals(app.getMessage(name), "Hallo Sibylla!");
	}

}
