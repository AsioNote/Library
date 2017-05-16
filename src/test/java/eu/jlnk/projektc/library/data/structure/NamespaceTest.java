package eu.jlnk.projektc.library.data.structure;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import eu.jlnk.projektc.library.error.NamespaceException;

public class NamespaceTest {

	Namespace testSpace;
	@Before
	public void setup() throws NamespaceException {
		testSpace = new Namespace("test.name.space");
	}
	
	@Test
	public void test_toString() throws NamespaceException {		
		String result  = testSpace.toString();
		
		assertEquals("Should be 'test.name.space'", "test.name.space", result);
	}

	@Test
	public void test_Constructor_valide_Namespace_1() throws NamespaceException {
		new Namespace("valide.test.name.space");
	}
	@Test
	public void test_Constructor_valide_Namespace_2() throws NamespaceException {
		new Namespace("valide.test.name-space");
	}
	@Test
	public void test_Constructor_valide_Namespace_3() throws NamespaceException {
		new Namespace("valide.test.name_space");
	}
	// Test alias getter and setter
	@Test
	public void test_Constructor_valide_Namespace_With_Numbers() throws NamespaceException {
		new Namespace("test1.name2.space0.9.999");
	}

	@Test
	public void test_Constructor_inValide_Namespace_1() throws NamespaceException {
		new Namespace("invalide.täst.name?.spac€.oneisok");
	}
	@Test
	public void test_Constructor_inValide_Namespace_2() throws NamespaceException {
		new Namespace("invalide.");
	}
	@Test
	public void test_Constructor_inValide_Namespace_3() throws NamespaceException {
		new Namespace("invalide.abc/");
	}
	@Test
	public void test_Constructor_inValide_Namespace_4() throws NamespaceException {
		
		
		new Namespace("invalide.4+5");
	}


}
