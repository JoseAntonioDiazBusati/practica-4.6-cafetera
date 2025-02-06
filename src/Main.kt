fun main(args: Array<String>) {

    //TODO: Crear 3 cafeteras en la Sala, Cocina y Oficina
    val cafetera1 = Cafetera("Salón")
    val cafetera2 = Cafetera("Cocina", capacidadMaxima = 750)
    val cafetera3 = Cafetera("Oficina", capacidadMaxima = 500 ,cantidad = 200)

    //TODO: Crear una lista de 20 tazas con capacidades aleatorias
    val tazas = mutableListOf<Taza>()
    for (i in 0..30){
        val taza = Taza.nuevaTazaAleatoria()
        tazas.add(taza)
    }

    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras y las tazas.
    println(cafetera1)
    println(cafetera2)
    println(cafetera3)
    println("**********************************************")
    println("Llenar la cafetera1 de café...")
    println("Vaciar la cafetera2...")
    println("Agregar café a la cafetera2 a la mitad de su capacidad...")
    println("Agregar 400 c.c. de café a la cafereta3...")

    //TODO: Llenar la cafetera1 de café.

    cafetera1.llenar()

    //TODO: Vaciar la cafetera2.
    cafetera2.vaciar()

    //TODO: Agregar café a la cafetera2 a la mitad de su capacidad.
    cafetera2.agregarCafe(cafetera2.capacidadMaxima/2)

    //TODO: Agregar 400 c.c. de café a la cafereta3
    cafetera3.agregarCafe(400)

    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras
    println(cafetera1)
    println(cafetera2)
    println(cafetera3)

    println("**********************************************")
    println("Servir café en las tazas...")

    //TODO: Servir café en las tazas... siempre que haya café en la cafetera y en el orden cafetera1, cafetera2 y cafetera3.
    for (taza in tazas){
        cafetera1.servirTaza(taza)
        if (cafetera1.cantidad == 0){
            if (cafetera2.cantidad !=0){
                cafetera2.servirTaza(taza)
            }
            if(cafetera3.cantidad != 0){
                cafetera3.servirTaza(taza)
            }
        }
    }

    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras y las tazas.
    println(cafetera1)
    println(cafetera2)
    println(cafetera3)
    for(taza in tazas){
        println(taza)
    }
}