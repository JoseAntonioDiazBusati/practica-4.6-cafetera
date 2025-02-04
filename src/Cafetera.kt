class Cafetera (val ubicacion: String) {

    var capacidadMaxima: Int = 1000
    var cantidad: Int = 0

    constructor(ubicacion: String,capacidadMaxima: Int):this(ubicacion){
        this.capacidadMaxima = capacidadMaxima
        this.cantidad = capacidadMaxima
    }

    constructor(ubicacion: String,capacidadMaxima: Int,cantidad: Int):this(ubicacion,capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima
        this.cantidad = if (cantidad > capacidadMaxima)
            capacidadMaxima
        else
            cantidad

    }

    fun llenar(){
        cantidad = capacidadMaxima
    }

    fun servirTaza(taza: Taza){
        if (cantidad > 0){
            if (taza.capacidad > cantidad){
                taza.llenar(cantidad)
            }
            taza.llenar()
        }
    }

    fun vaciar(){
        cantidad = 0
    }

    fun agregarCafe(cantidadDeseada:Int){
        if (cantidadDeseada > capacidadMaxima){
            cantidad = capacidadMaxima
        }
        cantidad += cantidadDeseada
    }

    override fun toString(): String {
        return "Cafetera(ubicación = $ubicacion, capacidad = $capacidadMaxima c.c., cantidad = $cantidad c.c.)"
    }
}