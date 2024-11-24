package com.example.agro_t2

import android.os.Bundle
import android.widget.TableRow
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.agro_t2.databinding.ActivityOrderBinding
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.BufferedReader
import android.view.Gravity

data class Order(
    val id: Int,
    val userName: String,
    val userQuality: Double,
    val orderStatus: String,
    val address: String,
    val sector: String,
    val dispatchTime: String,
    val unloadingTime: String,
    val items: List<OrderItem>
)

data class OrderItem(
    val weight: String,
    val sort: String,
    val storage: String,
    val name: String
)

class orderActivity : AppCompatActivity() {
    lateinit var binding: ActivityOrderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Загружаем заказы из JSON файла
        val orders = loadOrders()
        if (orders.isNotEmpty()) {
            val currentOrder = orders[0] // Берем первый заказ (можно изменить логику по выбору)

            // Заполняем поля данных
            binding.userName.text = currentOrder.userName
            binding.userQuality.text = "Качество ${currentOrder.userQuality}"
            binding.textView145.text = currentOrder.orderStatus
            binding.textView144.text = currentOrder.address
            binding.textView141.text = currentOrder.sector
            binding.textView147.text = currentOrder.dispatchTime
            binding.textView149.text = currentOrder.unloadingTime

            // Добавляем элементы в таблицу
            currentOrder.items.forEach { item ->
                val tableRow = TableRow(this).apply {
                    addView(createTextView(item.weight))
                    addView(createTextView(item.sort))
                    addView(createTextView(item.storage))
                    addView(createTextView(item.name))
                }
                binding.dataTable.addView(tableRow)
            }
        } else {
            // Если заказы не загружены
            Toast.makeText(this, "Нет данных о заказах", Toast.LENGTH_SHORT).show()
        }
    }

    // Метод для загрузки данных из JSON файла
    private fun loadOrders(): List<Order> {
        return try {
            val jsonString = assets.open("orders.json").bufferedReader().use(BufferedReader::readText)
            val listType = object : TypeToken<List<Order>>() {}.type
            Gson().fromJson(jsonString, listType)
        } catch (e: Exception) {
            e.printStackTrace()
            emptyList()
        }
    }

    // Утилита для создания TextView
    private fun createTextView(text: String): TextView {
        return TextView(this).apply {
            this.text = text
            this.gravity = Gravity.CENTER
            this.setPadding(8, 8, 8, 8)
        }
    }
}
