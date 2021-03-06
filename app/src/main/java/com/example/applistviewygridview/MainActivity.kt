package com.example.applistviewygridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var frutas: ArrayList<Fruta> = ArrayList()
        frutas.add(Fruta("Manzana",R.drawable.manzana))
        frutas.add(Fruta("Durazno",R.drawable.durazno))
        frutas.add(Fruta("Platano",R.drawable.platano))
        frutas.add(Fruta("Sandia",R.drawable.sandia))

        val  lista = findViewById<ListView>(R.id.Lista)
         val adaptador = AdaptadorCustom(this,frutas)

        lista.adapter= adaptador

        lista.onItemClickListener= AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,frutas.get(position).nombre,Toast.LENGTH_LONG).show()

        }
    }
}