/*
 * Copyright 2015-2023 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Test all the methodes of the calculator class
public class CalculatorTests {

	@Test
	@DisplayName("Test addition")
	public void testAdd() {
		Calculator calculator = new Calculator();
		assertEquals(5, calculator.add(2, 3));
	}

}