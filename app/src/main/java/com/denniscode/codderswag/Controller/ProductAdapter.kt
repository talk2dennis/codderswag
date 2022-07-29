package com.denniscode.codderswag.Controller

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.denniscode.codderswag.Model.Product
import com.denniscode.codderswag.R

class ProductAdapter (val context: Context, val product: List<Product>): RecyclerView.Adapter<ProductAdapter.ProductHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_view, parent, false)
        return ProductHolder(view)
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.bindView(product[position], context)
    }

    override fun getItemCount(): Int {
        return product.count()
    }
    inner class ProductHolder (itemView: View?): RecyclerView.ViewHolder(itemView!!) {
        val productImage = itemView?.findViewById<ImageView>(R.id.productImage)
        val productTitle = itemView?.findViewById<TextView>(R.id.productTitle)
        val productPrice = itemView?.findViewById<TextView>(R.id.productPrice)

        fun bindView (product: Product, context: Context) {
            val imageResourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage?.setImageResource(imageResourceId)
            productTitle?.text = product.title
            productPrice?.text = product.price
        }
    }

}