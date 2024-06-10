package pe.edu.idat.evc01

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.idat.evc01.ui.theme.EVC01Theme

@Preview(showBackground = true)
@Composable
fun PreviewEjercicio4() {
    EVC01Theme {
        MostrarNumerosPares()
    }
}

fun obtenerNumerosPares(): String {
    val numerosPares = (10..20).filter { it % 2 == 0 }
    return numerosPares.joinToString(", ")
}

@Composable
fun MostrarNumerosPares() {
    val numerosPares = obtenerNumerosPares()
    Column {
        Text(text = "Ejercicio 4: Números pares entre 10 y 20: $numerosPares")
    }
}



