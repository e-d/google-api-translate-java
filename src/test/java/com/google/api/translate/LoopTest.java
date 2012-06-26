/**
 * LoopTest.java
 *
 * Copyright (C) 2010,  Richard Midwinter
 *
 * This file is part of google-api-translate-java.
 *
 * google-api-translate-java is free software: you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * google-api-translate-java is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with google-api-translate-java. If not, see <http://www.gnu.org/licenses/>.
 */
package com.google.api.translate;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * @author Richard Midwinter
 *
 */
public class LoopTest extends TestCase {
	@Test
	public void testDummy() {
		System.out.println("Dummy LoopTest");
	}

//	private Translate translate;
//	
//	@Override
//	protected void setUp() throws Exception {
//		translate = Translate.DEFAULT;
//	}
//
//	@Test
//	public void testTranslate() throws Exception {
//		System.out.println("testTranslate");
//		
//		GoogleAPI.setHttpReferrer("http://code.google.com/p/google-api-translate-java/");
//		
//		for (int i = 0; i<30; i++) {
//			System.out.println("Loop: " +i);
//			assertEquals("مرحبا العالم", translate.execute("Hello world", Language.ENGLISH, Language.ARABIC));
//		}
//	}
}