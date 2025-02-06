class Taza(
    val color: Color = Color.BLANCO,
    var capacidad: Int = 50
) {
    var cantidad: Int = 0

    companion object{
        val listaCapacidad = intArrayOf(50,75,100)

        fun nuevaTazaAleatoria(): Taza {
            return Taza(Color.generarColorAleatorio(), listaCapacidad.random())
        }
    }

    fun llenar(){
        cantidad = capacidad
    }

    fun llenar(nuevaCantidad: Int){
        cantidad += nuevaCantidad
    }

    override fun toString(): String {
        return "Taza(color = $color, capacidad = $capacidad c.c, cantidad = $cantidad c.c)"
    }

}