package br.com.rm86065.theclickgame

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import br.com.rm86065.theclickgame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var contador: Contador
    private lateinit var binding: ActivityMainBinding
    private var contadorPontos = 0
    private var contadorCliques = 0
    private val pontosPorClique = 15

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.btRed.setOnClickListener {
            contadorCliques++
            contadorPontos = contadorCliques * pontosPorClique

            binding.tvCliques.text = contadorCliques.toString()
            binding.tvPontos.text = contadorPontos.toString()

        }

        Log.i("Ciclo-de-Vida", "onCreate()")
        contador = Contador()
        contador.iniciar()
    }

    override fun onStart() {
        super.onStart()
        Log.i("Ciclo-de-Vida", "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Ciclo-de-Vida", "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Ciclo-de-Vida", "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Ciclo-de-Vida", "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Ciclo-de-Vida", "onDestroy()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Ciclo-de-Vida", "onRestart()")
    }
}