package br.com.guizaia.demopersistencia

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ListaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        val sharedPreferences = getSharedPreferences("meuapp", Context.MODE_PRIVATE)

        val usuario = sharedPreferences.getString("USUARIO", "Não informado")
    }
}
