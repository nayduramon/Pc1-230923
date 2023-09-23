package com.example.pc1_230923

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
class MainActivity : AppCompatActivity() {
    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            // Vincular elementos de la interfaz de usuario a las variables
            val editTextScore = findViewById<EditText>(R.id.numero)
            val buttonCalculate = findViewById<Button>(R.id.numero2)
            val textViewResult = findViewById<TextView>(R.id.btnCálcular)

            buttonCalculate.setOnClickListener {
                // Obtener la puntuación ingresada por el usuario como texto
                val scoreText = editTextScore.text.toString()

                try {
                    // Convertir el texto a un número decimal
                    val score = scoreText.toDouble()

                    // Realizar el cálculo de la nota (aquí puedes personalizar tu lógica)
                    val nota = calcularNota(score)

                    // Mostrar el resultado en el TextView
                    textViewResult.text = "Resultado: $nota"
                } catch (e: NumberFormatException) {
                    // Manejar errores de entrada inválida
                    textViewResult.text = "Ingrese una puntuación válida"
                }
            }
        }

        private fun calcularNota(puntuacion: Double): Double {
            // Aquí puedes implementar tu lógica para calcular la nota
            // Por ejemplo, puedes usar una fórmula específica o condiciones if-else.

            // En este ejemplo simple, simplemente redondeamos la puntuación a dos decimales
            return Math.round(puntuacion * 100.0) / 100.0
        }
    }
}