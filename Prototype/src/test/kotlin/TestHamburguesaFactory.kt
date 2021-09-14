import org.junit.Assert
import org.junit.Test
import prototype.Hamburguesa
import prototype.HamburguesaFactory

class TestHamburguesaFactory {

    @Test
    fun test_carta() {
        val royal = HamburguesaFactory.royal()
        Assert.assertEquals(Hamburguesa.Carne.VACUNO, royal.carne)
        Assert.assertEquals(Hamburguesa.Size.GRANDE, royal.size)
        Assert.assertEquals(Hamburguesa.Pan.NORMAL, royal.pan)
        Assert.assertTrue(royal.extras.contains(Hamburguesa.Extra.CEBOLLA))
        Assert.assertTrue(royal.extras.contains(Hamburguesa.Extra.QUESO))
        Assert.assertFalse(royal.extras.contains(Hamburguesa.Extra.PEPINO))
        Assert.assertFalse(royal.extras.contains(Hamburguesa.Extra.MAYONESA))
    }

    @Test
    fun test_royal_si_cebolla() {
        val royal = HamburguesaFactory.royal()

        val royalSinCebolla = HamburguesaFactory()
            .from(royal)
            .removeExtra(Hamburguesa.Extra.CEBOLLA)
            .crea()


        Assert.assertEquals(Hamburguesa.Carne.VACUNO, royalSinCebolla.carne)
        Assert.assertEquals(Hamburguesa.Size.GRANDE, royalSinCebolla.size)
        Assert.assertEquals(Hamburguesa.Pan.NORMAL, royalSinCebolla.pan)
        Assert.assertFalse(royalSinCebolla.extras.contains(Hamburguesa.Extra.CEBOLLA))
        Assert.assertTrue(royalSinCebolla.extras.contains(Hamburguesa.Extra.QUESO))
        Assert.assertFalse(royalSinCebolla.extras.contains(Hamburguesa.Extra.PEPINO))
        Assert.assertFalse(royalSinCebolla.extras.contains(Hamburguesa.Extra.MAYONESA))
    }

}


