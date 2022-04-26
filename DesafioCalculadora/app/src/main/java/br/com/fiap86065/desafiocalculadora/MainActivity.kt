package br.com.fiap86065.desafiocalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Fields
        val etValue1: EditText = findViewById(R.id.etValue1)
        val etValue2: EditText = findViewById(R.id.etValue2)
        val tvResult: TextView = findViewById(R.id.tvResult)

        //Botões
        val btAddition: Button = findViewById(R.id.btAddition)
        val btSubtraction: Button = findViewById(R.id.btSubtraction)
        val btMultiplication: Button = findViewById(R.id.btMultiplication)
        val btDivision: Button = findViewById(R.id.btDivision)

        btAddition.setOnClickListener {
            tvResult.text = operation(btAddition.id, Integer.parseInt(etValue1.text.toString()), Integer.parseInt(etValue2.text.toString()))
        }

        btSubtraction.setOnClickListener{
            tvResult.text = operation(btSubtraction.id, Integer.parseInt(etValue1.text.toString()), Integer.parseInt(etValue2.text.toString()))
        }
        btMultiplication.setOnClickListener{
            tvResult.text = operation(btMultiplication.id, Integer.parseInt(etValue1.text.toString()), Integer.parseInt(etValue2.text.toString()))
        }
        btDivision.setOnClickListener{
            tvResult.text = operation(btDivision.id, Integer.parseInt(etValue1.text.toString()), Integer.parseInt(etValue2.text.toString()))
        }
    }

    fun operation(viewId:Int, v1:Int, v2:Int): String {
        if (viewId == R.id.btAddition) {
            return (v1+v2).toString()
        } else if (viewId == R.id.btSubtraction){
            return (v1-v2).toString()
        } else if (viewId == R.id.btMultiplication){
            return (v1*v2).toString()
        } else if(viewId == R.id.btDivision) {
            return (v1/v2).toString()
        }
        return "Erro ao calcular!"
    }

}