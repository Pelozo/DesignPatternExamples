package prototype

import java.util.ArrayList
import prototype.Hamburguesa.*


class HamburguesaFactory {
    private lateinit var carne: Carne
    private lateinit var size: Size
    private lateinit var pan: Pan
    private var extras: MutableList<Extra> = ArrayList()


    fun crea(): Hamburguesa {
        return Hamburguesa(carne, size, pan, extras.toList())
    }

    fun setCarne(carne: Carne): HamburguesaFactory {
        this.carne = carne
        return this
    }

    fun setSize(size: Size): HamburguesaFactory {
        this.size = size
        return this
    }

    fun setPan(pan: Pan): HamburguesaFactory {
        this.pan = pan
        return this
    }

    fun addExtra(extra: Hamburguesa.Extra): HamburguesaFactory {
        extras.add(extra)
        return this
    }

    fun removeExtra(extra: Hamburguesa.Extra): HamburguesaFactory {
        extras.remove(extra)
        return this
    }

    fun from(hamburguesa: Hamburguesa): HamburguesaFactory {
        carne = hamburguesa.carne
        size = hamburguesa.size
        pan = hamburguesa.pan
        extras = hamburguesa.extras.toMutableList()
        return this
    }

    companion object {
        // -- hamburguesas de la carta
        fun royal(): Hamburguesa {
            return Hamburguesa(
                Hamburguesa.Carne.VACUNO,
                Hamburguesa.Size.GRANDE,
                Hamburguesa.Pan.NORMAL,
                listOf<Extra>(
                    Hamburguesa.Extra.CEBOLLA,
                    Hamburguesa.Extra.QUESO)
            )
        }

        fun king(): Hamburguesa {
            return Hamburguesa(
                Hamburguesa.Carne.VACUNO,
                Hamburguesa.Size.EXTRA_GRANDE,
                Hamburguesa.Pan.NORMAL,
                listOf<Extra>(
                    Hamburguesa.Extra.CEBOLLA,
                    Hamburguesa.Extra.HUEVO),
            )
        }
    }
}
