package com.example.agro_t2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.agro_t2.User

class Registration : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registration)


        val fullNameAfterRegistration: TextView = findViewById(R.id.full_name)
        val borDayAfterRegistration: TextView= findViewById(R.id.Bornday)
        val phoneNumberAfterRegistration: TextView= findViewById(R.id.Phone_number)
        val emailAfterRegistration: TextView= findViewById(R.id.mail_address)










    }




}