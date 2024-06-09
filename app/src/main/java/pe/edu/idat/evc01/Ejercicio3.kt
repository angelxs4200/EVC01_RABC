package pe.edu.idat.evc01

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class Ejercicio3 {
    companion object {
        fun debeRenovarDNI(anioNacimiento: Int): Boolean {
            val anioActual = 2024
            val edad = anioActual - anioNacimiento
            return edad >= 18
        }

        @Composable
        fun MostrarResultadoDNI(anioNacimiento: Int) {
            val debeRenovarDNI = debeRenovarDNI(anioNacimiento)
            Column {
                val mensaje = if (debeRenovarDNI) {
                    "Debe renovar el DNI."
                } else {
                    "No es necesario renovar el DNI."
                }
                Text(text = "Ejercicio 3: $mensaje")
            }
        }
    }
}







