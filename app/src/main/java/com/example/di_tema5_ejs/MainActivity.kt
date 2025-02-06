package com.example.di_tema5_ejs

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.di_tema5_ejs.ui.theme.Di_tema5_ejsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Di_tema5_ejsTheme {
                HolaMundo()
            }
        }
    }
}

/*
Ejercicio 1: Hola, Mundo! con modificadores: Crea un simple composable que muestre el
texto "Hola, Mundo!" con un fondo de color y un padding personalizado.
*/

@Composable
fun HolaMundo(){
    Text("Hola, Mundo!", Modifier.padding(20.dp).background(Color.Cyan))
}

@Preview
@Composable
fun priviuEj1(){
   HolaMundo()
}


/*
Ejercicio 2: Lista de tareas: Crea una lista vertical de tareas utilizando LazyColumn. Cada
tarea debe ser un elemento clickable que al ser presionado muestre un
mensaje de "Tarea completada".
*/

@Composable
fun ColumnaTareas(context : Context){

    LazyColumn {
        items(items = listOf("Tarea 1", "Tarea 2", "Tarea 3")) { item ->
            Text(text = item, Modifier
                .clickable{
                    Toast.makeText(context, "Tarea completada", Toast.LENGTH_SHORT)
                })

        }
    }
}

@Preview
@Composable
fun priviuEj2(){
    ColumnaTareas(LocalContext.current)
}