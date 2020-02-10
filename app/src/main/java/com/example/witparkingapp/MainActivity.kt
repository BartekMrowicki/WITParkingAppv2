package com.example.witparkingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

          button_reg.setOnClickListener {
              val email = email_edittext_reg.text.toString()
              val password = password_edittext_reg.text.toString()

              Log.d("Mainactivity","email is: " + email)
              Log.d("Mainactivity","Password is:$password " )

          }

        textView_register.setOnClickListener{
            Log.d("MainActivity", "Try to show login activity")

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }

    }

}
