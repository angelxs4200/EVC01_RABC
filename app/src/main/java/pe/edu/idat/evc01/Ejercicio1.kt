package pe.edu.idat.evc01

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.idat.evc01.ui.theme.EVC01Theme

class Ejercicio1 {
    companion object {
        fun calcularCostoEstacionamiento(horas: Int, minutos: Int): Int {
            val horasDecimales = horas + (minutos.toDouble() / 60)
            return (horasDecimales * 1500).toInt()
        }

        @Composable
        fun MostrarResultadoEstacionamiento(horas: Int = 3, minutos: Int = 30) {
            val costoEstacionamiento = calcularCostoEstacionamiento(horas, minutos)
            Column {
                Text(text = "Ejercicio 1: Costo de estacionamiento = $$costoEstacionamiento")
            }
        }

        @Preview(showBackground = true)
        @Composable
        fun Preview() {
            EVC01Theme {
                MostrarResultadoEstacionamiento()
            }
        }
    }
}


