package com.denniscode.codderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.denniscode.codderswag.Model.Category
import com.denniscode.codderswag.R
import com.denniscode.codderswag.Services.DataService

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: ReclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val categoryRecyclerView : RecyclerView = findViewById(R.id.categoryReclerView)
        adapter = ReclerAdapter(this, DataService.category)
        categoryRecyclerView.adapter = adapter
        val layoutManager = LinearLayoutManager(this)
        categoryRecyclerView.layoutManager = layoutManager
        //categoryRecyclerView.setHasFixedSize(true)
    }
}