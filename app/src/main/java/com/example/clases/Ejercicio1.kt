package com.example.clases

class Planeta {
    var nombre: String
    var tipo: String
    var masa: Double

    constructor(nombre: String, tipo: String, masa: Double) {
        this.nombre = nombre
        this.tipo = tipo
        this.masa = masa
    }

    fun orbitar() {
        println("$nombre está orbitando ")
    }

    fun rotar() {
        println("$nombre está rotando ")
    }

    fun obtenerGravedad(superficie: Double): Double {
        val gravedad = masa * 9.81 / (superficie * superficie)
        return gravedad
    }
}

fun main() {
    val tierra = Planeta("Tierra", "Terrestre", 5.972e24)
    val marte = Planeta("Marte", "Terrestre", 6.39e23)

    tierra.orbitar()
    tierra.rotar()
    val gravedadEnTierra = tierra.obtenerGravedad(6371.0)
    println("La gravedad en la Tierra es $gravedadEnTierra m/s²")

    marte.orbitar()
    marte.rotar()
    val gravedadEnMarte = marte.obtenerGravedad(3389.5)
    println("La gravedad en Marte es $gravedadEnMarte m/s²")
}