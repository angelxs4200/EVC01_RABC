package pe.edu.idat.evc01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import pe.edu.idat.evc01.ui.theme.EVC01Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EVC01Theme {
                Column(
                    modifier = Modifier.padding(vertical = 25.dp)
                ) {
                    // Ejercicio 1
                    MostrarResultadoEstacionamiento(horas = 3, minutos = 30)
                    MostrarResultadoEstacionamiento(horas = 1, minutos = 45)
                    MostrarResultadoEstacionamiento(horas = 5, minutos = 0)

                    // Ejercicio 2
                    MostrarResultadoPromedio(nota1 = 15.0, nota2 = 18.0, nota3 = 20.0, nota4 = 17.0)
                    MostrarResultadoPromedio(nota1 = 10.0, nota2 = 12.0, nota3 = 14.0, nota4 = 16.0)
                    MostrarResultadoPromedio(nota1 = 8.0, nota2 = 9.0, nota3 = 7.0, nota4 = 10.0)

                    // Ejercicio 3
                    MostrarResultadoDNI(anioNacimiento = 2007)
                    MostrarResultadoDNI(anioNacimiento = 2002)
                    MostrarResultadoDNI(anioNacimiento = 1980)

                    // Ejercicio 4
                    MostrarNumerosPares()
                }
            }
        }
    }
}
