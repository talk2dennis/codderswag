package com.denniscode.codderswag.Services

import com.denniscode.codderswag.Model.Category
import com.denniscode.codderswag.Model.Product

object DataService {
    var category = listOf(
        Category("HAT", "hat01"),
        Category("HOODIE", "hoodie01"),
        Category("DIGITAL", "digital"),
        Category("HAT", "hat01"),
        Category("HOODIE", "hoodie01"),
        Category("DIGITAL", "digital"),
        Category("HAT", "hat01"),
        Category("HOODIE", "hoodie01"),
        Category("DIGITAL", "digital"),
        Category("HAT", "hat01"),
        Category("HOODIE", "hoodie01"),
        Category("DIGITAL", "digital"),
        Category("HAT", "hat01"),
        Category("HOODIE", "hoodie01"),
        Category("DIGITAL", "digital")

    )
    var hats = listOf(
        Product("Black Hat", "$12.2", "hat01"),
        Product("White Hat", "$15.2", "hat01"),
        Product("Fab Hat", "$10.4", "hat01"),
        Product("Exact Hat", "$22.0", "hat01"),
        Product("Black Hat", "$12.2", "hat01"),
        Product("White Hat", "$15.2", "hat01"),
        Product("Fab Hat", "$10.4", "hat01"),
        Product("Exact Hat", "$22.0", "hat01"),
        Product("Black Hat", "$12.2", "hat01"),
        Product("White Hat", "$15.2", "hat01"),
        Product("Fab Hat", "$10.4", "hat01"),
        Product("Exact Hat", "$22.0", "hat01"),
        Product("Black Hat", "$12.2", "hat01"),
        Product("White Hat", "$15.2", "hat01"),
        Product("Fab Hat", "$10.4", "hat01"),
        Product("Exact Hat", "$22.0", "hat01")
    )


    var digital = listOf(
        Product("Camera", "$112.2", "digital"),
        Product("Video", "$125.2", "digital"),
        Product("Digital Cam", "$143.6", "digital"),
        Product("Camera", "$112.2", "digital"),
        Product("Video", "$125.2", "digital"),
        Product("Digital Cam", "$143.6", "digital"),
        Product("Camera", "$112.2", "digital"),
        Product("Video", "$125.2", "digital"),
        Product("Digital Cam", "$143.6", "digital"),
        Product("Camera", "$112.2", "digital"),
        Product("Video", "$125.2", "digital"),
        Product("Digital Cam", "$143.6", "digital")
    )

    var hoodie = listOf(
        Product("Black Hoodie", "$18.2", "hoodie01"),
        Product("White Hood", "$12.2", "hoodie03"),
        Product("Hoodie", "$12.2", "hoodie02"),
        Product("Fab Hoodie", "$12.2", "hoodie03"),
        Product("Black Hat", "$12.2", "hoodie01"),
        Product("Black Hoodie", "$18.2", "hoodie01"),
        Product("White Hood", "$12.2", "hoodie03"),
        Product("Hoodie", "$12.2", "hoodie02"),
        Product("Fab Hoodie", "$12.2", "hoodie03"),
        Product("Black Hat", "$12.2", "hoodie01"),
        Product("Black Hoodie", "$18.2", "hoodie01"),
        Product("White Hood", "$12.2", "hoodie03"),
        Product("Hoodie", "$12.2", "hoodie02"),
        Product("Fab Hoodie", "$12.2", "hoodie03"),
        Product("Black Hat", "$12.2", "hoodie01")
    )


    fun getProduct (productName: String): List<Product> {
        return when (productName) {
            "HAT" -> hats
            "HOODIE" -> hoodie
            else -> digital
        }
    }
}