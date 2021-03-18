package com.example.firebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
    }
    fun changeEmail_btn (view: View){
        startActivity(Intent(this@TestActivity, changeEmail :: class.java))
    }
    fun Profile (view: View){
        startActivity(Intent(this@TestActivity, profile_activity :: class.java))
    }
}