package prototype

data class Hamburguesa (
    val carne: Carne,
    val size: Size,
    val pan: Pan,
    val extras: List<Extra>
){
    enum class Carne {
        VACUNO, POLLO
    }

    enum class Size {
        MEDIO, GRANDE, EXTRA_GRANDE
    }

    enum class Extra {
        CEBOLLA, QUESO, MAYONESA, PEPINO, HUEVO
    }

    enum class Pan {
        NORMAL, CON_SEMILLAS
    }
}