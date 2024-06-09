package pe.edu.idat.evc01

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


class Ejercicio4 {

    companion object {
        fun obtenerNumerosPares(): String {
            val numerosPares = (10..20).reversed().filter { it % 2 == 0 }
            return numerosPares.joinToString(", ")
        }

        @Composable
        fun MostrarNumerosPares() {
            val numerosPares = obtenerNumerosPares()
            Text(text = "Ejercicio 4: Números pares descendientes entre 20 y 10: $numerosPares")
        }
    }

}
