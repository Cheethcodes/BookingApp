package com.example.bookingapplicationas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.login.*
import android.content.Intent
import android.graphics.Color

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        clearFindViewByIdCache()

        btnLogin.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity((intent))
        }
    }
}