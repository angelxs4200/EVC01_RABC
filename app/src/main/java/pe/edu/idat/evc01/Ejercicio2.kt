package pe.edu.idat.evc01

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.idat.evc01.ui.theme.EVC01Theme

class Ejercicio2 {
    companion object {
        fun calcularPromedio(nota1: Double, nota2: Double, nota3: Double, nota4: Double): Double {
            val notas = listOf(nota1, nota2, nota3, nota4).sorted()
            val notasRestantes = notas.drop(1)
            return (notasRestantes[0] * 0.2 + notasRestantes[1] * 0.3 + notasRestantes[2] * 0.5)
        }

        @Composable
        fun MostrarResultadoPromedio(nota1: Double = 15.0, nota2: Double = 18.0, nota3: Double = 20.0, nota4: Double = 17.0) {
            val promedio = calcularPromedio(nota1, nota2, nota3, nota4)
            Column {
                Text(text = "Ejercicio 2: Promedio = $promedio")
            }
        }

        @Preview(showBackground = true)
        @Composable
        fun Preview() {
            EVC01Theme {
                MostrarResultadoPromedio()
            }
        }
    }
}

