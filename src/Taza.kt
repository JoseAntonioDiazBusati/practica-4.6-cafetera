class Taza {

    val color: Color = Color.BLANCO
    val capacidad: Int = 50
    var cantidad: Int = 0

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