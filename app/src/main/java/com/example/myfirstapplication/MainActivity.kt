package com.example.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnLogin: Button = findViewById(R.id.btn1)


        val etEmail: EditText = findViewById(R.id.et1)

        val etPassword: EditText = findViewById(R.id.etPassword)

        val tvError: TextView = findViewById(R.id.tvError)

        val sign: TextView = findViewById(R.id.sign)

        btnLogin.setOnClickListener {
            var intent = Intent(this,product::class.java)
            startActivity(intent)
        }


        sign.setOnClickListener{

            val intent = Intent(this, SignUpPage::class.java)
            startActivity(intent)
        }




        btnLogin.setOnClickListener{

            val userEmail: String = etEmail.text.toString()
            val userPassword: String = etPassword.text.toString()



            if(userEmail.equals("aniketvairagade2000@gmail.com") && userPassword.equals("admin123"))
            {
                tvError.text = ""
                Toast.makeText(this,"Login Sucessfully" , Toast.LENGTH_LONG).show()

                var intent = Intent(this,product::class.java)
                startActivity(intent)
            }
            else
            {
                tvError.text = "Someting Went Wrong"
                Toast.makeText(this,"Invalid Input" , Toast.LENGTH_LONG).show()
            }


        }

    }
}