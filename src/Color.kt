enum class Color {

    BLANCO,NEGRO,GRIS,AZUL,VERDE;

    companion object {
        fun generarColorAleatorio(): Color{
            val colorTaza = Color.entries.random()
            return colorTaza
        }
    }
}