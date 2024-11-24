package com.example.agro_t2

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.agro_t2.databinding.ActivityOpenOrderDriverControllerBinding


class OPENOrderDriverController : AppCompatActivity() {
    lateinit var binding: ActivityOpenOrderDriverControllerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityOpenOrderDriverControllerBinding.inflate(layoutInflater)

        setContentView(binding.root)


        binding.nav.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.OrderListNavMenuController -> {
                    val intent = Intent(this, DriverOrderListController::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.ChatWithDriverNavMenuController -> {
                    val intent = Intent(this, ChatControllerController::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.ratingNavMenuController -> {
                    val intent = Intent(this, RatingForController::class.java)
                    startActivity(intent)
                }
            }

            when (it.itemId) {
                R.id.settingsNavMenuController -> {
                    val intent = Intent(this, SettingsController::class.java)
                    startActivity(intent)
                }
            }

            true
        }




        val name = intent.getStringExtra("name") ?: "Нет данных"
        val street = intent.getStringExtra("street") ?: "Нет данных"
        val place = intent.getStringExtra("place") ?: "Нет данных"
        val mas = intent.getStringExtra("mas") ?: "Нет данных"
        val input = intent.getStringExtra("input") ?: "Нет данных"
        val output = intent.getStringExtra("output") ?: "Нет данных"
        val id = intent.getStringExtra("id") ?: "Нет данных"



        // Привязываем данные к TextView
        findViewById<TextView>(R.id.textView42).text = name
        findViewById<TextView>(R.id.textView52).text = street
        findViewById<TextView>(R.id.textView53).text = place
        findViewById<TextView>(R.id.textView46).text = mas
        findViewById<TextView>(R.id.textView58).text = input
        findViewById<TextView>(R.id.textView59).text = output
        findViewById<TextView>(R.id.textView51).text = id




    }
}