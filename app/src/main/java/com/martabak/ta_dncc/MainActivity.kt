package com.martabak.ta_dncc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.martabak.ta_dncc.databinding.ActivityMainBinding
import android.content.Intent
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var message = intent.getStringExtra("nama")
        val textView = findViewById<TextView>(R.id.thellonama).apply {
            text = "Hai ${message},"
        }
        val animeList = Datasource(this).getAnimeList()
        val animeDesc = Datasource(this).getAnimeDesc()
        val animeImg = Datasource(this).getAnimeImage()
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = AnimeAdapter(animeList,animeDesc,animeImg)
    }
}