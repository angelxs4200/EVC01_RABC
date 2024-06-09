package pe.edu.idat.evc01

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


class Ejercicio2 {

    companion object {
        fun calcularPromedio(nota1: Double, nota2: Double, nota3: Double, nota4: Double): Double {
            val notas = listOf(nota1, nota2, nota3, nota4).sorted()
            val notaMinima = notas.first()
            val notasRestantes = notas.drop(1)
            val suma = notasRestantes.reduce { acc, nota -> acc + nota }
            return (notasRestantes[0] * 0.2 + notasRestantes[1] * 0.3 + notasRestantes[2] * 0.5)
        }

        @Composable
        fun MostrarResultadoPromedio(nota1: Double, nota2: Double, nota3: Double, nota4: Double) {
            val promedio = calcularPromedio(nota1, nota2, nota3, nota4)
            Text(text = "Ejercicio 2: Promedio = $promedio")
        }
    }


}
