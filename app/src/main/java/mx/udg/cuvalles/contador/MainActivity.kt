package mx.udg.cuvalles.contador

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var contador = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnIncrementar.setOnClickListener{
            contador++
            tvContador.text = "$contador"
            //comentario nuevo
            //otro comentario
        }

        btnAbrirOtra.setOnClickListener {
            val intent = Intent(this,SegundaActivity::class.java)
            startActivity(intent)
        }


    }
}