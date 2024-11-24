package com.example.agro_t2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.agro_t2.databinding.ActivityOrderBinding
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class orderActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    lateinit var binding: ActivityOrderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)








        binding.nav.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.orderNavMenu -> {
                    val intent = Intent(this@orderActivity , orderActivity::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.orderHistoryNavMenu -> {
                    val intent = Intent(this@orderActivity, OrderHistory::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.ratingNavMenu -> {
                    val intent = Intent(this@orderActivity, MainRating::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.controllerNavMenu -> {
                    val intent = Intent(this@orderActivity, Chat_Contoller::class.java)
                    startActivity(intent)
                }
            }
            when (it.itemId) {
                R.id.settingsNavMenu -> {
                    val intent = Intent(this@orderActivity, settings::class.java)
                    startActivity(intent)
                }
            }
            true
        }

    }
}