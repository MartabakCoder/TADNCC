package com.martabak.ta_dncc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.martabak.ta_dncc.databinding.LoginActivityBinding


class LoginActivity : AppCompatActivity() {
    private lateinit var binding: LoginActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.blogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            val nama: String = binding.inama.text.toString()
            val password: String = binding.inama.text.toString()
            if(nama == "user"&& password == "user") {
                intent.putExtra("nama", nama);
                startActivity(intent)
            }else{
                Toast.makeText(this, "Akun anda tidak terdaftar di sistem\nnama: user;\npassword: user;", Toast.LENGTH_SHORT).show()
            }
        }
    }
}