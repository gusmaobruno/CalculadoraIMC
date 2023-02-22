package com.example.meuprimeiroprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import org.w3c.dom.Text

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val tvresult = findViewById<TextView>(R.id.textview_result)
        val tvclassificacao = findViewById<TextView>(R.id.textview_classificacao)
        val result = intent.getFloatExtra("Extra_Result", 0.1f)

        tvresult.text = result.toString()

        var classificacao = "Classificação: "
        if (result < 18.5f) {
            classificacao += "ABAIXO DO PESO"
        } else if (result >= 18.5f && result <= 24.9f) {
            classificacao += "NORMAL"
        } else if (result >= 25f && result <= 29.9f) {
            classificacao += "SOBREPESO"
        } else if (result >= 30f && result <= 39.9f){
            classificacao += "OBESIDADE"
        } else {
            classificacao += "OBESIDADE GRAVE"
        }

        tvclassificacao.text = classificacao

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
}