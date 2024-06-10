package pe.edu.idat.evc01

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.idat.evc01.ui.theme.EVC01Theme

@Preview(showBackground = true)
@Composable
fun PreviewEjercicio1() {
    EVC01Theme {
        MostrarResultadoEstacionamiento(horas = 3, minutos = 30) // 5250
        MostrarResultadoEstacionamiento(horas = 1, minutos = 45) // 2625
        MostrarResultadoEstacionamiento(horas = 5, minutos = 0) // 7500
    }
}


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




