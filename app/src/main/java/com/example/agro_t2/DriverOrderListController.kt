package com.example.agro_t2

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.agro_t2.databinding.ActivityDriverOrderListControllerBinding


class DriverOrderListController : AppCompatActivity() {
    lateinit var binding: ActivityDriverOrderListControllerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDriverOrderListControllerBinding.inflate(layoutInflater)

        setContentView(binding.root)



        val order1:LinearLayout = findViewById(R.id.Order1)
        val order2:LinearLayout = findViewById(R.id.Order2)
        val order3:LinearLayout = findViewById(R.id.Order3)
        val order4:LinearLayout = findViewById(R.id.Order4)
        val order5:LinearLayout = findViewById(R.id.Order5)
        val order6:LinearLayout = findViewById(R.id.Order6)
        val order7:LinearLayout = findViewById(R.id.Order7)



        order1.setOnClickListener{
            val name = findViewById<TextView>(R.id.textView40).text.toString()
            val street = findViewById<TextView>(R.id.textView45n).text.toString()
            val place = findViewById<TextView>(R.id.textView60n).text.toString()
            val mas = findViewById<TextView>(R.id.textView62n).text.toString()
            val input = findViewById<TextView>(R.id.textView117f).text.toString()
            val output = findViewById<TextView>(R.id.textView127d).text.toString()
            val id = findViewById<TextView>(R.id.id123).text.toString()

            // Передаём данные в следующую активность через Intent
            val intent = Intent(this, OPENOrderDriverController::class.java).apply {
                putExtra("name", name)
                putExtra("street", street)
                putExtra("place", place)
                putExtra("mas", mas)
                putExtra("input", input)
                putExtra("output", output)
                putExtra("id", id)
            }
            startActivity(intent)
        }

        order2.setOnClickListener{
            val name = findViewById<TextView>(R.id.textView40).text.toString()
            val street = findViewById<TextView>(R.id.textView45f).text.toString()
            val place = findViewById<TextView>(R.id.textView60j).text.toString()
            val mas = findViewById<TextView>(R.id.textView62d).text.toString()
            val input = findViewById<TextView>(R.id.textView117ff1).text.toString()
            val output = findViewById<TextView>(R.id.textView127z).text.toString()
            val id = findViewById<TextView>(R.id.id2).text.toString()

            // Передаём данные в следующую активность через Intent
            val intent = Intent(this, OPENOrderDriverController::class.java).apply {
                putExtra("name", name)
                putExtra("street", street)
                putExtra("place", place)
                putExtra("mas", mas)
                putExtra("input", input)
                putExtra("output", output)
                putExtra("id", id)
            }
            startActivity(intent)
        }

        order3.setOnClickListener{
            val name = findViewById<TextView>(R.id.textView40c).text.toString()
            val street = findViewById<TextView>(R.id.textView45v).text.toString()
            val place = findViewById<TextView>(R.id.textView60a).text.toString()
            val mas = findViewById<TextView>(R.id.textView62dqwe).text.toString()
            val input = findViewById<TextView>(R.id.textView117a).text.toString()
            val output = findViewById<TextView>(R.id.textView127qw).text.toString()
            val id = findViewById<TextView>(R.id.id3).text.toString()

            // Передаём данные в следующую активность через Intent
            val intent = Intent(this, OPENOrderDriverController::class.java).apply {
                putExtra("name", name)
                putExtra("street", street)
                putExtra("place", place)
                putExtra("mas", mas)
                putExtra("input", input)
                putExtra("output", output)
                putExtra("id", id)
            }
            startActivity(intent)
        }

        order4.setOnClickListener{
            val name = findViewById<TextView>(R.id.textView40ss).text.toString()
            val street = findViewById<TextView>(R.id.textView45ass).text.toString()
            val place = findViewById<TextView>(R.id.textView60ss).text.toString()
            val mas = findViewById<TextView>(R.id.textView62aas).text.toString()
            val input = findViewById<TextView>(R.id.textView117qwd).text.toString()
            val output = findViewById<TextView>(R.id.textView127zxc).text.toString()
            val id = findViewById<TextView>(R.id.id4).text.toString()

            // Передаём данные в следующую активность через Intent
            val intent = Intent(this, OPENOrderDriverController::class.java).apply {
                putExtra("name", name)
                putExtra("street", street)
                putExtra("place", place)
                putExtra("mas", mas)
                putExtra("input", input)
                putExtra("output", output)
                putExtra("id", id)
            }
            startActivity(intent)
        }

        order5.setOnClickListener {
            val name = findViewById<TextView>(R.id.textView40zxc).text.toString()
            val street = findViewById<TextView>(R.id.textView45zxc).text.toString()
            val place = findViewById<TextView>(R.id.textView60zxc).text.toString()
            val mas = findViewById<TextView>(R.id.textView62zxc).text.toString()
            val input = findViewById<TextView>(R.id.textView117zxcc).text.toString()
            val output = findViewById<TextView>(R.id.textView127zxcc).text.toString()
            val id = findViewById<TextView>(R.id.id5).text.toString()

            // Передаём данные в следующую активность через Intent
            val intent = Intent(this, OPENOrderDriverController::class.java).apply {
                putExtra("name", name)
                putExtra("street", street)
                putExtra("place", place)
                putExtra("mas", mas)
                putExtra("input", input)
                putExtra("output", output)
                putExtra("id", id)
            }
            startActivity(intent)
        }

            order6.setOnClickListener {
                val name = findViewById<TextView>(R.id.textView40333).text.toString()
                val street = findViewById<TextView>(R.id.textView45qwe).text.toString()
                val place = findViewById<TextView>(R.id.textView60qwe).text.toString()
                val mas = findViewById<TextView>(R.id.textView62qwe).text.toString()
                val input = findViewById<TextView>(R.id.textView117qwe).text.toString()
                val output = findViewById<TextView>(R.id.textView127qwe).text.toString()
                val id = findViewById<TextView>(R.id.id6).text.toString()

                // Передаём данные в следующую активность через Intent
                val intent = Intent(this, OPENOrderDriverController::class.java).apply {
                    putExtra("name", name)
                    putExtra("street", street)
                    putExtra("place", place)
                    putExtra("mas", mas)
                    putExtra("input", input)
                    putExtra("output", output)
                    putExtra("id", id)
                }
                startActivity(intent)

            }

            order7.setOnClickListener {
                val name = findViewById<TextView>(R.id.textView40qwer).text.toString()
                val street = findViewById<TextView>(R.id.textView45qwer).text.toString()
                val place = findViewById<TextView>(R.id.textView60qwer).text.toString()
                val mas = findViewById<TextView>(R.id.textView62qwer).text.toString()
                val input = findViewById<TextView>(R.id.textView117qwer).text.toString()
                val output = findViewById<TextView>(R.id.textView127qwer).text.toString()
                val id = findViewById<TextView>(R.id.id7).text.toString()

                // Передаём данные в следующую активность через Intent
                val intent = Intent(this, OPENOrderDriverController::class.java).apply {
                    putExtra("name", name)
                    putExtra("street", street)
                    putExtra("place", place)
                    putExtra("mas", mas)
                    putExtra("input", input)
                    putExtra("output", output)
                    putExtra("id", id)
                }
                startActivity(intent)

            }














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



    }
}