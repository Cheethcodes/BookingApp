package com.example.bookingapplicationas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.login.*
import android.widget.*
import android.content.Intent
import android.graphics.Paint
import androidx.appcompat.app.AlertDialog

class Login : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        //var networkChecker = verify_network()
        //networkChecker.verifyAvailableNetwork(this)

        clearFindViewByIdCache()

        btnForgetpass.paintFlags = Paint.UNDERLINE_TEXT_FLAG;

        btnLogin.setOnClickListener {
            AuthenticateLogIn()
            /*if (networkChecker.netwok_isAvailable(this))

            else
            {
                builder.setTitle("Network error")
                builder.setMessage("Check your internet connection and try again!")
                builder.setPositiveButton("OK"){_,_ ->
                    Toast.makeText(applicationContext,"You cancelled the dialog.",Toast.LENGTH_SHORT).show()
                }

                var dialog: AlertDialog = builder.create()
                dialog.show()
            }*/
        }
    }

    fun AuthenticateLogIn()
    {
        var builder = AlertDialog.Builder(this@Login)

        if (editTextUsername.text.toString() == "admin" && editTextPassword.text.toString() == "1234")
        {
            builder.setTitle("Authentication success")
            builder.setMessage("Good day, admin! There are currently no updates on the app you are using!")
            builder.setPositiveButton("Continue") {_,_ ->
                Toast.makeText(applicationContext,"Welcome, admin!",Toast.LENGTH_SHORT).show()

                val intent: Intent = Intent(this, MainActivity::class.java)
                startActivity((intent))
            }

            var dialog: AlertDialog = builder.create()
            dialog.show()
        }
        else
        {
            builder.setTitle("Authentication error")
            builder.setMessage("Wrong username and/or password was entered!")
            builder.setPositiveButton("OK"){_,_ ->
                Toast.makeText(applicationContext,"Try again.",Toast.LENGTH_SHORT).show()
            }

            var dialog: AlertDialog = builder.create()
            dialog.show()
        }
    }
}