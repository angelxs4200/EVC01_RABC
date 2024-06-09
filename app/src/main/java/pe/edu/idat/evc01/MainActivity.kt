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
                    Ejercicio1.MostrarResultadoEstacionamiento()
                    Ejercicio2.MostrarResultadoPromedio()
                    Ejercicio3.MostrarResultadoDNI(2007) // "No"
                    Ejercicio3.MostrarResultadoDNI(1990) // "Sí"
                    Ejercicio4.MostrarNumerosPares()
                }
            }
        }
    }
}
