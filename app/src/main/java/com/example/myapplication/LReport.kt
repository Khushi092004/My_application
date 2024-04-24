package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LReport : AppCompatActivity() {
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

        processorTextView.text = "Matte-Finish: $selectedProcessor"
        graphicsCardTextView.text = "Gloss-finish $selectedGraphicsCard"
        ramTextView.text = "Textured: $selectedRAM"
        motherboardTextView.text = "Metallic: $selectedMotherboard"
        ssdTextView.text = "PVC-Finish: $selectedSSD"
        powerSupplyTextView.text = "Acrylic-finish: $selectedPowerSupply"
        cabinetTextView.text = "Anti-bacterial: $selectedCabinet"
        totalPriceTextView.text = "Total Price: ₹$totalPrice"

        homeRedirectTextView.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Optional: Finish this activity to prevent going back to it when pressing back button
        }
    }
}