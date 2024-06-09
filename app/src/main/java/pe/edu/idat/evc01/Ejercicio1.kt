package pe.edu.idat.evc01

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class Ejercicio1 {
    companion object {
        fun calcularCostoEstacionamiento(horas: Int, minutos: Int): Int {
            val horasDecimales = horas + (minutos.toDouble() / 60)
            return (horasDecimales * 1500).toInt()
        }

        @Composable
        fun MostrarResultadoEstacionamiento(horas: Int, minutos: Int) {
            val costoEstacionamiento = calcularCostoEstacionamiento(horas, minutos)
            Text(text = "Ejercicio 1: Costo de estacionamiento = $/${costoEstacionamiento}")
        }
    }
}