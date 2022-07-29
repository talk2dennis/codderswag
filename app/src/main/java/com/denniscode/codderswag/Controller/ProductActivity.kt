package com.denniscode.codderswag.Controller

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.denniscode.codderswag.R
import com.denniscode.codderswag.Services.DataService

class ProductActivity : AppCompatActivity() {
    lateinit var productAdapter: ProductAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val categoryType = intent.getStringExtra(EXTRA_VALUE)
        var spanCount = 2
        val screenSize = resources.configuration.screenWidthDp
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }
        if (screenSize > 720) {
            spanCount = 3
        }


        val layoutManager = GridLayoutManager(this, spanCount)
        val productList : RecyclerView = findViewById(R.id.productsRecyclerView)
        productAdapter = ProductAdapter(this, DataService.getProduct(categoryType!!))
        productList.adapter = productAdapter
        productList.layoutManager = layoutManager




    }
}