package pe.edu.idat.evc01

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.idat.evc01.ui.theme.EVC01Theme


// Función Composable para previsualizar la UI
@Preview(showBackground = true)
@Composable
fun PreviewEjercicio3() {
    EVC01Theme {
        MostrarResultadoDNI(anioNacimiento = 2007) // No es necesario renovar el DNI.
        MostrarResultadoDNI(anioNacimiento = 2002) // Debe renovar el DNI.
        MostrarResultadoDNI(anioNacimiento = 1980) // Debe renovar el DNI.
    }
}


// Función para calcular si debe renovar DNI
fun debeRenovarDNI(anioNacimiento: Int): Boolean {
    val anioActual = 2024
    val edad = anioActual - anioNacimiento
    return edad >= 18
}

// Función Composable para mostrar el resultado de la renovación del DNI
@Composable
fun MostrarResultadoDNI(anioNacimiento: Int = 2000) {
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









