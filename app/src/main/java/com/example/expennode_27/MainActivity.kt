package com.example.expennode_27

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //ประกาศตัวแปร
    private lateinit var etPrice: EditText
    private lateinit var etNote: EditText
    private lateinit var btnAdd: Button
    private lateinit var btnClear: Button
    private lateinit var tvLastItem: TextView
    private lateinit var tvTotal: TextView

    private var total: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        etPrice = findViewById<EditText>(R.id.etPrice)
        etNote = findViewById<EditText>(R.id.etNote)
        btnAdd = findViewById<Button>(R.id.btnAdd)
        btnClear = findViewById<Button>(R.id.btnClear)
        tvLastItem = findViewById<TextView>(R.id.tvLatestItem)
        tvTotal = findViewById<TextView>(R.id.tvTotal)

        btnAdd.setOnClickListener{
            val amountText = etPrice.text.toString().trim()
            val noteText = etNote.text.toString().trim()

            if (amountText.isNotEmpty()){
                Toast.makeText(this, "กรอกจำนวนเงิน", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val amount = amountText.toDoubleOrNull()
            if (amount == null ){
                Toast.makeText(this, "กรอกจำนวนเงิน", Toast.LENGTH_SHORT).show()
                return@setOnClickListener

            }



        }

    }

}
