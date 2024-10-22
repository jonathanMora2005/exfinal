package com.dam2024m8uf1_tfinal.jmora

import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.CalendarView
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import mySingleton
import java.time.LocalDate

class Guarda : AppCompatActivity() {
    private lateinit var nom: TextView
    private lateinit var nom2: TextView
    private lateinit var planeta: TextView
    private lateinit var alient2: CheckBox
    private lateinit var adaptacio: CheckBox
    private lateinit var p: TextView
    private lateinit var e: TextView
    private lateinit var c: TextView
    private lateinit var nc: TextView
    private lateinit var uc: TextView
    private lateinit var y: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_guarda)
        nom = findViewById(R.id.nombreSupereroe)
        nom2 = findViewById(R.id.nombreReal)
        planeta = findViewById(R.id.planeta)
        alient2 = findViewById(R.id.alient)
        p = findViewById(R.id.poder)
        e = findViewById(R.id.editorial)
        c = findViewById(R.id.creador)
        nc = findViewById(R.id.nc)
        uc = findViewById(R.id.uc)
        y = findViewById(R.id.year)
        adaptacio = findViewById(R.id.adapatacion)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun guarda(view: View){
        var nombreSupereroe:String = nom.text.toString()
        var nombreReal:String = nom2.text.toString()
        var planataNatal:String = planeta.text.toString()
        var poder:String = p.text.toString()
        val alient: Boolean = alient2.isChecked
        var editorial:String = e.text.toString()
        var creador:String = c.text.toString()
        var NumeroComic:String = nc.text.toString()
        var univers:String = uc.text.toString()
        var year:String = y.text.toString()
        val adaptacioCine: Boolean = adaptacio.isChecked
        var s = mySingleton.getInstance();
        var heroe:Superheroe = Superheroe(
            name = nombreSupereroe,
            realName = nombreReal,
            age = year.toInt(),
            debutYear = LocalDate.of(1962, 8, 1),
            homePlanet = planataNatal,
            urlImage = "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg",
            isAlien = alient,
            power = poder.toDouble(),
            publisher = editorial,
            creator = creador,
            numberOfComicsAppeared = NumeroComic.toInt(),
            cinematicUniverse = univers,
            hasMovieAdaptation = adaptacioCine
        )
        s.afaixisuper(heroe)


    }
}