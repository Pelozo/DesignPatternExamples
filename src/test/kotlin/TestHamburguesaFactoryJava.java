import org.junit.Test;
import prototype.java.Hamburguesa;
import prototype.java.Hamburguesa.Carne;
import prototype.java.Hamburguesa.Extra;
import prototype.java.Hamburguesa.Pan;
import prototype.java.Hamburguesa.Size;
import prototype.java.HamburguesaFactory;

import static org.junit.Assert.*;


public class TestHamburguesaFactoryJava {

	@Test
	public void test_carta() {
		Hamburguesa royal = HamburguesaFactory.royal();

		assertEquals(Carne.VACUNO, royal.getCarne());
		assertEquals(Size.GRANDE, royal.getSize());
		assertEquals(Pan.NORMAL, royal.getPan());
		assertTrue(royal.getExtras().contains(Extra.CEBOLLA));
		assertTrue(royal.getExtras().contains(Extra.QUESO));
		assertFalse(royal.getExtras().contains(Extra.PEPINO));
		assertFalse(royal.getExtras().contains(Extra.MAYONESA));
	}

	@Test
	public void test_royal_si_cebolla() {
		// queremos simplificar pedir esta hamburguesa !!

		/*
		Hamburguesa royaSinCebolla = new HamburguesaFactory()
				                              .setCarne(Carne.VACUNO)
				                              .setSize(Size.GRANDE)
				                              .setPan(Pan.NORMAL)
				                              .addExtra(Extra.QUESO)
				                              .crea();


		 */

		Hamburguesa royaSinCebolla = new HamburguesaFactory()
				.from(HamburguesaFactory.royal())
				.removeExtra(Extra.CEBOLLA)
				.crea();



		System.out.println(royaSinCebolla);



		assertEquals(Carne.VACUNO, royaSinCebolla.getCarne());
		assertEquals(Size.GRANDE, royaSinCebolla.getSize());
		assertEquals(Pan.NORMAL, royaSinCebolla.getPan());
		assertFalse(royaSinCebolla.getExtras().contains(Extra.CEBOLLA));
		assertTrue(royaSinCebolla.getExtras().contains(Extra.QUESO));
		assertFalse(royaSinCebolla.getExtras().contains(Extra.PEPINO));
		assertFalse(royaSinCebolla.getExtras().contains(Extra.MAYONESA));
		
	}
}
