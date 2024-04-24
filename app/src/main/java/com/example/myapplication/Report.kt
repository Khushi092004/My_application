package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Report : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report)

        // Retrieve selected items and total price from intent extras
        val selectedProcessor = intent.getStringExtra("Processor")
        val selectedGraphicsCard = intent.getStringExtra("GraphicsCard")
        val selectedRAM = intent.getStringExtra("RAM")
        val selectedMotherboard = intent.getStringExtra("Motherboard")
        val selectedSSD = intent.getStringExtra("SSD")
        val selectedPowerSupply = intent.getStringExtra("PowerSupply")
        val selectedCabinet = intent.getStringExtra("Cabinet")
        val totalPrice = intent.getIntExtra("TotalPrice", 0)

        // Display selected items and total price in TextViews
        val processorTextView = findViewById<TextView>(R.id.processorTextView)
        val graphicsCardTextView = findViewById<TextView>(R.id.graphicsCardTextView)
        val ramTextView = findViewById<TextView>(R.id.ramTextView)
        val motherboardTextView = findViewById<TextView>(R.id.motherboardTextView)
        val ssdTextView = findViewById<TextView>(R.id.ssdTextView)
        val powerSupplyTextView = findViewById<TextView>(R.id.powerSupplyTextView)
        val cabinetTextView = findViewById<TextView>(R.id.cabinetTextView)
        val totalPriceTextView = findViewById<TextView>(R.id.totalPriceTextView)
        val homeRedirectTextView = findViewById<TextView>(R.id.HomeRedirect)

        processorTextView.text = "Oak Wood: $selectedProcessor"
        graphicsCardTextView.text = "Teak Wood: $selectedGraphicsCard"
        ramTextView.text = "Pine Wood: $selectedRAM"
        motherboardTextView.text = "Walnut Wood: $selectedMotherboard"
        ssdTextView.text = "RedWood: $selectedSSD"
        powerSupplyTextView.text = "Yew Wood: $selectedPowerSupply"
        cabinetTextView.text = "Ash Wood: $selectedCabinet"
        totalPriceTextView.text = "Total Price: ₹$totalPrice"

        homeRedirectTextView.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Optional: Finish this activity to prevent going back to it when pressing back button
        }
    }
}