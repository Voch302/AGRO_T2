package com.example.agro_t2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.agro_t2.databinding.ActivityOrderHistoryBinding

class OrderHistory : AppCompatActivity() {
    lateinit var binding: ActivityOrderHistoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityOrderHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nav.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.orderNavMenu -> {
                    val intent = Intent(this@OrderHistory , orderActivity::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.orderHistoryNavMenu -> {
                    val intent = Intent(this@OrderHistory, OrderHistory::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.ratingNavMenu -> {
                    val intent = Intent(this@OrderHistory, MainRating::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.controllerNavMenu -> {
                    val intent = Intent(this@OrderHistory, Chat_Contoller::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.settingsNavMenu -> {
                    val intent = Intent(this@OrderHistory, settings::class.java)
                    startActivity(intent)
                }
            }
            true
        }






    }
}