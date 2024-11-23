package com.example.agro_t2


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.InputStreamReader


data class User (val login: String, val password: String, val role: String)

class AuthActivity : AppCompatActivity() {

    private lateinit var users: List<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_auth)

        // Инициализация пользователей из JSON
        loadUsersFromJson()

        val loginAuth: EditText = findViewById(R.id.user_login_auth)
        val passAuth: EditText = findViewById(R.id.user_pass_auth)
        val buttonAuth: Button = findViewById(R.id.button)
        val textToReg: TextView = findViewById(R.id.textToReg_auth)

        buttonAuth.setOnClickListener {
            val login = loginAuth.text.toString()
            val pass = passAuth.text.toString()

            if (login.isEmpty() || pass.isEmpty()) {
                Toast.makeText(this, "Заполните все поля", Toast.LENGTH_LONG).show()
            } else {
                val user = authenticateUser(login, pass)
                if (user != null) {
                    Toast.makeText(this, "Успешный вход", Toast.LENGTH_LONG).show()
                    navigateToRoleBasedActivity(user.role)
                } else {
                    Toast.makeText(this, "Неверный логин или пароль", Toast.LENGTH_LONG).show()
                }
            }
        }

        textToReg.setOnClickListener {
            val intent = Intent(this, Registration::class.java)
            startActivity(intent)
        }
    }

    // Метод для загрузки пользователей из JSON
    private fun loadUsersFromJson() {
        try {
            val inputStream = assets.open("users.json")
            val reader = InputStreamReader(inputStream)
            val userType = object : TypeToken<Map<String, List<User>>>() {}.type
            val userMap: Map<String, List<User>> = Gson().fromJson(reader, userType)
            users = userMap["users"] ?: emptyList()
            reader.close()
        } catch (e: Exception) {
            e.printStackTrace()
            users = emptyList()
        }
    }

    // Метод для аутентификации пользователя
    private fun authenticateUser(login: String, password: String): User? {
        return users.find { it.login == login && it.password == password }
    }

    // Метод для навигации в зависимости от роли
    private fun navigateToRoleBasedActivity(role: String) {
        when (role) {
            "driver" -> {
                val intent = Intent(this, orderActivity::class.java)
                startActivity(intent)
            }
            "controller" -> {
                val intent = Intent(this, statistics_controller::class.java)
                startActivity(intent)
            }
            else -> Toast.makeText(this, "Неизвестная роль", Toast.LENGTH_LONG).show()
        }
    }
}
