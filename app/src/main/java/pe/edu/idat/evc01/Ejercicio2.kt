package pe.edu.idat.evc01

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.idat.evc01.ui.theme.EVC01Theme

@Preview(showBackground = true)
@Composable
fun PreviewEjercicio2() {
    EVC01Theme {
        MostrarResultadoPromedio(nota1 = 15.0, nota2 = 18.0, nota3 = 20.0, nota4 = 17.0)
        MostrarResultadoPromedio(nota1 = 10.0, nota2 = 12.0, nota3 = 14.0, nota4 = 16.0) // 14.2
        MostrarResultadoPromedio(nota1 = 8.0, nota2 = 9.0, nota3 = 7.0, nota4 = 10.0) // 9.5
    }
}


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



