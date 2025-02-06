package com.example.di_tema5_ejs

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Picture
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
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
                .padding(50.dp)
                .clickable{
                    Toast.makeText(context, "Tarea completada", Toast.LENGTH_SHORT).show()
                })

        }
    }
}

@Preview
@Composable
fun priviuEj2(){
    ColumnaTareas(LocalContext.current)
}


/*
Ejercicio 3: Cuadrícula de imágenes: Utiliza LazyVerticalGrid para crear una cuadrícula de
imágenes. Cada imagen debe tener un título y al hacer clic en ella, se debe
mostrar una pantalla de detalle.
*/

@Composable
fun VerticalGrilla(context: Context){
    LazyHorizontalGrid(rows = GridCells.Fixed(3), verticalArrangement = Arrangement.Center) {
        items(items = listOf("Pizza", "Pizzita", "Pizzita feliz", "pizza super feliz")){ titulo ->
            Box (
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center

            )
            {
                Image(BitmapFactory.decodeResource(context.resources, R.drawable.pizzafeliz).asImageBitmap(), contentDescription = null,Modifier.padding(20.dp))
                Text(
                    text = titulo,
                    color = Color.Red,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(20.dp).background(Color.White)
                )

            }
        }
    }
}

@Preview
@Composable
fun priviuEj3(){
    VerticalGrilla(LocalContext.current)
}


/*
Ejercicio 4: Recrea esto con las herramientas que quieras vistas anteriormente en
Compose exclusivamente.
*/

@Composable
fun EjercicioInicial(){

}