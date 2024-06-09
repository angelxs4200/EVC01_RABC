package pe.edu.idat.evc01

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
            Text(text = "Ejercicio 3: ¿Debe renovar DNI? ${if (debeRenovarDNI) "Sí" else "No"}")
        }
    }

}
