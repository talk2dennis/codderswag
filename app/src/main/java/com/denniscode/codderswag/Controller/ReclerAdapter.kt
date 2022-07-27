package com.denniscode.codderswag.Controller

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.denniscode.codderswag.Model.Category
import com.denniscode.codderswag.R

class ReclerAdapter (private val context: Context, private val categories: List<Category>) : RecyclerView.Adapter<ReclerAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.list_view, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.categoryBind(context, categories[position])
    }

    override fun getItemCount(): Int {
        return categories.count()
    }
    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        private val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        private val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)

        fun categoryBind (context: Context, category: Category) {
            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text = category.title
        }
    }

}